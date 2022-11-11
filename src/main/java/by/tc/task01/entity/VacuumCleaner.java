package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class VacuumCleaner extends Appliance{
    private Map<SearchCriteria.VacuumCleaner, Object> vacuumCleanerParams;

    public VacuumCleaner(Map<SearchCriteria.Appliance, Object> applianceParams,
                Map<SearchCriteria.VacuumCleaner, Object> vacuumCleanerParams) {
        super(applianceParams);
        this.vacuumCleanerParams = vacuumCleanerParams;
    }


    public Object getVacuumCleanerParam(SearchCriteria.VacuumCleaner paramName) {
        return vacuumCleanerParams.get(paramName);
    }

    public void setVacuumCleanerParams(SearchCriteria.VacuumCleaner paramName, Object value) {
        if(vacuumCleanerParams.containsKey(paramName))
            this.vacuumCleanerParams.replace(paramName, value);
        else
            vacuumCleanerParams.put(paramName, value);
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(VacuumCleaner.class.getSimpleName() + ": \n");
        str.append(super.toString());
        for (Map.Entry<SearchCriteria.VacuumCleaner, Object> entry:
                vacuumCleanerParams.entrySet()) {
            str.append(entry.getKey().toString() + ": " + entry.getValue().toString() + "\n");
        }
        return str.toString();
    }
}
