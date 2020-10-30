package creational.singletonpattern;

public class SingletonMain {


    public static void main(String[] args) {

        LazyInitialization initialization = LazyInitialization.getInstance();

        LazyInitialization initialization1 = LazyInitialization.getInstance();

        System.out.println(initialization); //LazyInitialization@6d03e736
        System.out.println(initialization1);  //LazyInitialization@6d03e736


    }


}
