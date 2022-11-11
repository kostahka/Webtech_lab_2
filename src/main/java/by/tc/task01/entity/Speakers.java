package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class Speakers extends Appliance{
    private Map<SearchCriteria.Speakers, Object> speakerParams;

    public Speakers(Map<SearchCriteria.Appliance, Object> applianceParams,
                Map<SearchCriteria.Speakers, Object> speakerParams) {
        super(applianceParams);
        this.speakerParams = speakerParams;
    }

    public Object getSpeakerParam(SearchCriteria.Speakers paramName) {
        return speakerParams.get(paramName);
    }

    public void setSpeakerParams(SearchCriteria.Speakers paramName, Object value) {
        if(speakerParams.containsKey(paramName))
            this.speakerParams.replace(paramName, value);
        else
            speakerParams.put(paramName, value);
    }
}
