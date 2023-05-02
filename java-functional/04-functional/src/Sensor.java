public class Sensor {
    public int externalTemp;
    public int internalTemp;
    public Sensor(int externalTemp, int internalTemp) {
        this.externalTemp = externalTemp;
        this.internalTemp = internalTemp;
    }
    public int getExternalTemp() {
        return externalTemp;
    }
    public int getInternalTemp() {
        return internalTemp;
    }
    public void setExternalTemp(int externalTemp) {
        this.externalTemp = externalTemp;
    }
    public void setInternalTemp(int internalTemp) {
        this.internalTemp = internalTemp;
    }
}
