package web.model;

public class Car {

    private String model;
    private int yearOfRelease;
    private String colour;

    public Car(){}

    public Car(String model, int yearOfRelease, String colour){
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", colour='" + colour + '\'' +
                '}';
    }
}
