package creational.abstractfactorypattern.ComputerExample;

public class ComputerFactory {

    public static Computers getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }

}
