package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliances) {
		for (Appliance a:appliances) {
			System.out.println(a);
		}
	}
	public static void print(Appliance appliance) {
		System.out.println(appliance);
	}
}
