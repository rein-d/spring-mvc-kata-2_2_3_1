package web.model;

public class Car {
    private final String modelName;
    private final String colour;
    private final int serialNumber;

    public Car(String modelName, String colour, int serialNumber) {
        this.modelName = modelName;
        this.colour = colour;
        this.serialNumber = serialNumber;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColour() {
        return colour;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", colour='" + colour + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
