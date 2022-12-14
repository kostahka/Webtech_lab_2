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
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(Laptop.class.getSimpleName() + ": \n");
        str.append(super.toString());
        for (Map.Entry<SearchCriteria.Laptop, Object> entry:
                laptopParams.entrySet()) {
            str.append(entry.getKey().toString() + ": " + entry.getValue().toString() + "\n");
        }
        return str.toString();
    }
}
