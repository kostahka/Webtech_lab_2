package by.tc.task01.entity;

public class TabletPC extends Appliance{
    private float batteryCapacity;

    private float displayInches;

    private int memoryROM;

    private int flashMemoryCapacity;

    private String Color;

    public TabletPC(float cost, float batteryCapacity, float displayInches, int memoryROM,
                    int flashMemoryCapacity, String color) {
        super(cost);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.flashMemoryCapacity = flashMemoryCapacity;
        Color = color;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public float getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(float displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
