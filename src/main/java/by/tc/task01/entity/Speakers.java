package by.tc.task01.entity;

public class Speakers extends Appliance{
    private float powerConsumption;

    private int numOfSpeakers;

    private float[] frequencyRange;

    private float cordLength;
    public Speakers(float cost, float powerConsumption, int numOfSpeakers, float[] frequencyRange,
                    float cordLength) {
        super(cost);
        this.powerConsumption = powerConsumption;
        this.numOfSpeakers = numOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumOfSpeakers() {
        return numOfSpeakers;
    }

    public void setNumOfSpeakers(int numOfSpeakers) {
        this.numOfSpeakers = numOfSpeakers;
    }

    public float[] getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(float[] frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public float getCordLength() {
        return cordLength;
    }

    public void setCordLength(float cordLength) {
        this.cordLength = cordLength;
    }
}
