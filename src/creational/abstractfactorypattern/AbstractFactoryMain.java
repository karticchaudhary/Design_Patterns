package creational.abstractfactorypattern;

import creational.abstractfactorypattern.CarExample.CarFactory;
import creational.abstractfactorypattern.CarExample.CarTypes;
import creational.abstractfactorypattern.CarExample.Location;
import creational.abstractfactorypattern.ComputerExample.ComputerFactory;
import creational.abstractfactorypattern.ComputerExample.Computers;
import creational.abstractfactorypattern.ComputerExample.PCFactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        System.out.println(CarFactory.buildCar(CarTypes.SMALL, Location.USA));

        Computers pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));

    }

}
