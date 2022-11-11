package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

import by.tc.task01.entity.criteria.SearchCriteria.Oven.*;
public class Oven extends Appliance{
    private Map<SearchCriteria.Oven, Object> ovenParams;

    public Oven(Map<SearchCriteria.Appliance, Object> applianceParams,
                Map<SearchCriteria.Oven, Object> ovenParams) {
        super(applianceParams);
        this.ovenParams = ovenParams;
    }


    public Object getOvenParam(SearchCriteria.Oven paramName) {
        return ovenParams.get(paramName);
    }

    public void setOvenParams(SearchCriteria.Oven paramName, Object value) {
        if(ovenParams.containsKey(paramName))
            this.ovenParams.replace(paramName, value);
        else
            ovenParams.put(paramName, value);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(Oven.class.getSimpleName() + ": \n");
        str.append(super.toString());
        for (Map.Entry<SearchCriteria.Oven, Object> entry:
                ovenParams.entrySet()) {
            str.append(entry.getKey().toString() + ": " + entry.getValue().toString() + "\n");
        }
        return str.toString();
    }
}
