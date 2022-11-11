package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class TabletPC extends Appliance{
    private Map<SearchCriteria.TabletPC, Object> tabletPCParams;

    public TabletPC(Map<SearchCriteria.Appliance, Object> applianceParams,
                Map<SearchCriteria.TabletPC, Object> tabletPCParams) {
        super(applianceParams);
        this.tabletPCParams = tabletPCParams;
    }


    public Object getTabletPCParam(SearchCriteria.TabletPC paramName) {
        return tabletPCParams.get(paramName);
    }

    public void setTabletPCParams(SearchCriteria.TabletPC paramName, Object value) {
        if(tabletPCParams.containsKey(paramName))
            this.tabletPCParams.replace(paramName, value);
        else
            tabletPCParams.put(paramName, value);
    }
}
