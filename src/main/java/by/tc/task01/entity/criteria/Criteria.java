package by.tc.task01.entity.criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Criteria class with specific criteria of searching
 * @author Max
 */
public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();
	/**
	 *	Constructor that get name of appliance
	 * @param groupSearchName name of appliance
	 */
	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	/**
	 * Get name of appliance needed to find
	 * @return name of appliance
	 */
	public String getGroupSearchName() {
		return groupSearchName;
	}

	/**
	 * Add search criteria
	 * @param searchCriteria name of parameter
	 * @param value value of parameter
	 */
	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	/**
	 * Get all criteria
	 * @return criteria
	 */
	public Map<String, Object> getCriteria() {
		return criteria;
	}
}
