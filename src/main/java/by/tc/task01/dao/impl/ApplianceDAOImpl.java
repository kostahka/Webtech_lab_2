package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import by.tc.task01.entity.criteria.SearchCriteria;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class ApplianceDAOImpl implements ApplianceDAO{
	private static String dataFile = "data.xml";
	private static ArrayList<Appliance> appliances = new ArrayList<Appliance>();
	private static class XMLApplianceHandler extends DefaultHandler{

		private Criteria criteria;

		private XMLApplianceHandler(Criteria criteria) {
			super();
			this.criteria = criteria;
		}

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			boolean fAdd = false;
			if(criteria != null){
				if(qName.equals(criteria.getGroupSearchName())){
					for(Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()){
						String value = attributes.getValue(entry.getKey());
						if(!value.equals(entry.getValue().toString())){
							fAdd = false;
							break;
						}
					}
				}
				else {
					fAdd = false;
				}
			}

			if(fAdd){

				Appliance appliance = null;
				Map<SearchCriteria.Appliance, Object> applianceParams =
						new HashMap<SearchCriteria.Appliance, Object>();
				for (SearchCriteria.Appliance param:
						SearchCriteria.Appliance.values()) {
					applianceParams.put(param, attributes.getValue(param.toString()));
				}

				if(qName.equals(SearchCriteria.Oven.class.getName())){
					Map<SearchCriteria.Oven, Object> ovenParams =
							new HashMap<SearchCriteria.Oven, Object>();
					for (SearchCriteria.Oven param:
							SearchCriteria.Oven.values()) {
						ovenParams.put(param, attributes.getValue(param.toString()));
					}
					appliance = new Oven(applianceParams, ovenParams);
				}
				else if(qName.equals(SearchCriteria.Laptop.class.getName())){
					Map<SearchCriteria.Laptop, Object> laptopParams =
							new HashMap<SearchCriteria.Laptop, Object>();
					for (SearchCriteria.Laptop param:
							SearchCriteria.Laptop.values()) {
						laptopParams.put(param, attributes.getValue(param.toString()));
					}
					appliance = new Laptop(applianceParams, laptopParams);
				}
				else if(qName.equals(SearchCriteria.Refrigerator.class.getName())){
					Map<SearchCriteria.Refrigerator, Object> refrigeratorParams =
							new HashMap<SearchCriteria.Refrigerator, Object>();
					for (SearchCriteria.Refrigerator param:
							SearchCriteria.Refrigerator.values()) {
						refrigeratorParams.put(param, attributes.getValue(param.toString()));
					}
					appliance = new Refrigerator(applianceParams, refrigeratorParams);
				}
				else if(qName.equals(SearchCriteria.Speakers.class.getName())){
					Map<SearchCriteria.Speakers, Object> speakersParams =
							new HashMap<SearchCriteria.Speakers, Object>();
					for (SearchCriteria.Speakers param:
							SearchCriteria.Speakers.values()) {
						speakersParams.put(param, attributes.getValue(param.toString()));
					}
					appliance = new Speakers(applianceParams, speakersParams);
				}
				else if(qName.equals(SearchCriteria.TabletPC.class.getName())){
					Map<SearchCriteria.TabletPC, Object> tabletPCParams =
							new HashMap<SearchCriteria.TabletPC, Object>();
					for (SearchCriteria.TabletPC param:
							SearchCriteria.TabletPC.values()) {
						tabletPCParams.put(param, attributes.getValue(param.toString()));
					}
					appliance = new TabletPC(applianceParams, tabletPCParams);
				}
				else if(qName.equals(SearchCriteria.VacuumCleaner.class.getName())){
					Map<SearchCriteria.VacuumCleaner, Object> vacuumCleanerParams =
							new HashMap<SearchCriteria.VacuumCleaner, Object>();
					for (SearchCriteria.VacuumCleaner param:
							SearchCriteria.VacuumCleaner.values()) {
						vacuumCleanerParams.put(param, attributes.getValue(param.toString()));
					}
					appliance = new VacuumCleaner(applianceParams, vacuumCleanerParams);
				}

				if(appliance != null){
					appliances.add(appliance);
				}
			}
		}
	}

	public List<Appliance> getAll() {

		try {
			appliances = new ArrayList<>();

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();

			XMLApplianceHandler handler = new XMLApplianceHandler(null);
			parser.parse(new File(dataFile), handler);

		}
		catch (ParserConfigurationException | SAXException | IOException e){}
		return appliances;
	}
	//@Override
	public List<Appliance> find(Criteria criteria) {
		try {
			appliances = new ArrayList<>();

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();

			XMLApplianceHandler handler = new XMLApplianceHandler(criteria);
			parser.parse(new File(dataFile), handler);

		}
		catch (ParserConfigurationException | SAXException | IOException e){}
		return appliances;
	}
}