package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class Appliance {
    private Map<SearchCriteria.Appliance, Object> applianceParams;

    public Appliance(Map<SearchCriteria.Appliance, Object> applianceParams) {
        this.applianceParams = applianceParams;
    }

    public Object getApplianceParams(SearchCriteria.Appliance paramName) {
        return applianceParams.get(paramName);
    }

    public void setApplianceParams(SearchCriteria.Appliance paramName, Object value) {
        if(applianceParams.containsKey(paramName))
            this.applianceParams.replace(paramName, value);
        else
            applianceParams.put(paramName, value);
    }
}
