package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

/**
 * @author Max
 * Class with implementation of printing appliance info
 */
public class PrintApplianceInfo {
	/**
	 * Print info about all appliances in list
	 * @param appliances list of appliances
	 */
	public static void print(List<Appliance> appliances) {
		for (Appliance a:appliances) {
			System.out.println(a);
		}
	}

	/**
	 * Print info about one appliance
	 * @param appliance - appliance needed to be print
	 */
	public static void print(Appliance appliance) {
		System.out.println(appliance);
	}
}
