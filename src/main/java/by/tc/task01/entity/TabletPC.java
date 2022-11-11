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
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(TabletPC.class.getSimpleName() + ": \n");
        str.append(super.toString());
        for (Map.Entry<SearchCriteria.TabletPC, Object> entry:
                tabletPCParams.entrySet()) {
            str.append(entry.getKey().toString() + ": " + entry.getValue().toString() + "\n");
        }
        return str.toString();
    }
}
