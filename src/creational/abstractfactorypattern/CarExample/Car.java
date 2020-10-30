package creational.abstractfactorypattern.CarExample;

public abstract class Car {

    private CarTypes model = null;
    private Location location = null;

    public Car(CarTypes model, Location location) {
        this.model = model;
        this.location = location;
    }

    protected abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", location=" + location +
                '}';
    }

}
