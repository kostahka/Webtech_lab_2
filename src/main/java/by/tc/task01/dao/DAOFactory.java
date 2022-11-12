package by.tc.task01.dao;

import by.tc.task01.dao.impl.ApplianceDAOImpl;

/**
 * DAO factory to create a singleton DAO
 */
public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();
	
	private DAOFactory() {}

	/**
	 * Get appliance DAO
	 * @return appliance DAO
	 */
	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}

	/**
	 * Get DAO factory
	 * @return DAO factory
	 */
	public static DAOFactory getInstance() {
		return instance;
	}
}
