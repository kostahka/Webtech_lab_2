package by.tc.task01.entity;

public class Oven extends Appliance{
    private float powerConsumption;

    private float weight;

    private float capacity;

    private float depth;

    private float width;

    public Oven(float cost, float powerConsumption, float weight, float capacity, float depth,
                float width, float height) {
        super(cost);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.width = width;
        this.height = height;
    }

    private float height;
    public Oven(float cost) {
        super(cost);
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

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
