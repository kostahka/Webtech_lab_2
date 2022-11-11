package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class Laptop extends Appliance{
    private Map<SearchCriteria.Laptop, Object> laptopParams;

    public Laptop(Map<SearchCriteria.Appliance, Object> applianceParams,
                  Map<SearchCriteria.Laptop, Object> laptopParams) {
        super(applianceParams);
        this.laptopParams = laptopParams;
    }


    public  Object getLaptopParam(SearchCriteria.Laptop paramName) {
        return laptopParams.get(paramName);
    }

    public void setLaptopParams(SearchCriteria.Laptop paramName, Object value) {
        if(laptopParams.containsKey(paramName))
            this.laptopParams.replace(paramName, value);
        else
            laptopParams.put(paramName, value);
    }
}
