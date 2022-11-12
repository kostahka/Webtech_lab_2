package by.tc.task01.entity.criteria;

import by.tc.task01.entity.Appliance;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Max
 * Contains enums of parameters to each appliance
 */
public final class SearchCriteria {
	/**
	 * Enum of parameters for every appliance
	 */
	public static enum Appliance{
		COST
	}

	/**
	 * Enum of parameters for oven
	 */
	public static enum Oven{
		POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
	}
	/**
	 * Enum of parameters for laptop
	 */
	public static enum Laptop{
		BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS
	}
	/**
	 * Enum of parameters for refrigerator
	 */
	public static enum Refrigerator{
		POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
	}
	/**
	 * Enum of parameters for vacuum cleaner
	 */
	public static enum VacuumCleaner{
		POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
	}
	/**
	 * Enum of parameters for tablet PC
	 */
	public static enum TabletPC{
		BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR		
	}
	/**
	 * Enum of parameters for speakers
	 */
	public static enum Speakers{
		POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH
	}
	
	private SearchCriteria() {}
}

