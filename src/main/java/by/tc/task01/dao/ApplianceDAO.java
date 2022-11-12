package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

/**
 * interface for appliance DAO
 */
public interface ApplianceDAO {
	/**
	 * Find appliances satisfying criteria
	 * @param criteria criteria. Can be null to find all appliances
	 * @return List of appliances that was found satisfying criteria
	 */
	List<Appliance> find(Criteria criteria);
	List<Appliance> getAll();
}
