package creational.singletonpattern;
/**
Let’s say your application is distributed and it frequently serializes objects into the file system,
only to read them later when required. Please note that de-serialization always creates a new instance.
**/

public class SerializationSingleton {
    private static final long serialVersionUID  = 1; // This is required in cases where your class structure changes between serialization and deserialization.

    private SerializationSingleton(){

    }

    private static class LazyHolderClass {
        public static final SerializationSingleton INSTANCE = new SerializationSingleton();
    }

    public static SerializationSingleton getInstance() {
        return LazyHolderClass.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

}
