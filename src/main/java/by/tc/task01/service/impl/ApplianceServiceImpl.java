package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.util.Comparator;
import java.util.List;

/**
 * @author Max
 * Service of application with basic logic to get appliances
 */
public class ApplianceServiceImpl implements ApplianceService{
	/**
	 * Find all appliances satisfying criteria
	 * @param criteria criteria for searching. Can be null to  get all appliance
	 * @return List of appliances that was found satisfying criteria
	 */
	//@Override
	public List<Appliance> find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		List<Appliance> appliance = applianceDAO.find(criteria);

		return appliance;
	}

	/**
	 * Find the cheapest appliance
	 * @return The cheapest appliance
	 */
	public Appliance findCheapest(){
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliances= applianceDAO.getAll();

		Comparator<Appliance> comparator = new Comparator<Appliance>() {
			@Override
			public int compare(Appliance o1, Appliance o2) {
				int x= Integer.parseInt(o1.getApplianceParams(SearchCriteria.Appliance.COST).toString());
				int y=Integer.parseInt(o2.getApplianceParams(SearchCriteria.Appliance.COST).toString());
				return x-y;
			}
		};
		appliances.sort(comparator);

		return appliances.get(0);
	}

}
