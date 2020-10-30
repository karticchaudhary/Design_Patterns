package creational.factorypattern;


import creational.factorypattern.CarFactoryExample.Car;
import creational.factorypattern.CarFactoryExample.CarFactory;
import creational.factorypattern.CarFactoryExample.CarType;
import creational.factorypattern.ComputerFactoryExample.Computer;
import creational.factorypattern.ComputerFactoryExample.ComputerFactory;

public class FactoryMain {

    public static void main(String[] args) {

        Car smallCar = CarFactory.buildCar(CarType.SMALL);
        System.out.println("Car Config::" + smallCar);

        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        System.out.println("Factory PC Config::" + pc);

    }

}