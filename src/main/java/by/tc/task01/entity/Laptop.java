package by.tc.task01.entity;

public class Laptop extends Appliance{
    private float batteryCapacity;

    private String OS;

    private int memoryROM;

    private int systemMemory;

    private String CPU;

    private float displayInches;
    public Laptop(float cost, float batteryCapacity, String os, int memoryROM, int systemMemory,
                  String cpu, float displayInches) {
        super(cost);
        this.batteryCapacity = batteryCapacity;

        OS = os;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        CPU = cpu;
        this.displayInches = displayInches;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public float getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(float displayInches) {
        this.displayInches = displayInches;
    }
}
