package by.tc.task01.entity;

public class Refrigerator extends Appliance{
    private float powerConsumption;

    private float weight;

    private float freezerCapacity;

    private float overallCapacity;

    private float width;
    public Refrigerator(float cost, float powerConsumption, float weight, float freezerCapacity,
                        float overallCapacity, float width) {
        super(cost);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.width = width;
    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(float freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public float getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(float overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
