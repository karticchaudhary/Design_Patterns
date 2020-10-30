package creational.singletonpattern;

public class StaticBlockMethod {

    private static final StaticBlockMethod INSTANCE;

    static {
        INSTANCE = new StaticBlockMethod();
    }

    private StaticBlockMethod() {
    }


    public static StaticBlockMethod getInstance() {
        return INSTANCE;
    }

}
