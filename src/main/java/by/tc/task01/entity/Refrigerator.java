package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class Refrigerator extends Appliance{

    private Map<SearchCriteria.Refrigerator, Object> refrigeratorParams;
    public Refrigerator(Map<SearchCriteria.Appliance, Object> applianceParams,
                        Map<SearchCriteria.Refrigerator, Object> refrigeratorParams) {
        super(applianceParams);
        this.refrigeratorParams = refrigeratorParams;
    }

    public Object getRefrigeratorParam(SearchCriteria.Refrigerator paramName) {
        return refrigeratorParams.get(paramName);
    }

    public void setRefrigeratorParams(SearchCriteria.Refrigerator paramName, Object value) {
        if(refrigeratorParams.containsKey(paramName))
            this.refrigeratorParams.replace(paramName, value);
        else
            refrigeratorParams.put(paramName, value);
    }
}
