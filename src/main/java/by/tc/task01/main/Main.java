package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////
		System.out.println("All ovens: ");

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"

		appliances = service.find(criteriaOven);

		PrintApplianceInfo.print(appliances);

		System.out.println("////////////////////////////////////////////////////////////");
		//////////////////////////////////////////////////////////////////
		System.out.println("Ovens(Height = 200, Depth = 300): ");

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 200);
		criteriaOven.add(Oven.DEPTH.toString(), 300);

		appliances = service.find(criteriaOven);

		PrintApplianceInfo.print(appliances);

		System.out.println("////////////////////////////////////////////////////////////");
		//////////////////////////////////////////////////////////////////
		System.out.println("TabletPCs(Color = Blue, Display inches = 14, Memory ROM = 4): ");

		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);

		appliances = service.find(criteriaOven);// find(Object...obj)

		PrintApplianceInfo.print(appliances);

		System.out.println("////////////////////////////////////////////////////////////");
		//////////////////////////////////////////////////////////////////
		System.out.println("All products: ");

		appliances = service.find(null);

		PrintApplianceInfo.print(appliances);

		System.out.println("////////////////////////////////////////////////////////////");
		//////////////////////////////////////////////////////////////////
		System.out.println("Cheapest: ");

		Appliance appliance = service.findCheapest();

		PrintApplianceInfo.print(appliance);

	}

}
