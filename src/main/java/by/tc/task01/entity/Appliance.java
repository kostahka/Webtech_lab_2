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

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Map.Entry<SearchCriteria.Appliance, Object> entry:
                applianceParams.entrySet()) {
            str.append(entry.getKey().toString() + ": " + entry.getValue().toString() + "\n");
        }
        return str.toString();
    }
}
