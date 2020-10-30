package creational.prototypepattern;

public interface PrototypeCapable extends Cloneable {

    PrototypeCapable clone() throws CloneNotSupportedException;

}
