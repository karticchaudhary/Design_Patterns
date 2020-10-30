package creational.prototypepattern;

import creational.prototypepattern.PrototypeFactory.*;

public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        Movie moviePrototype = (Movie) PrototypeFactory.getInstance(ModelType.MOVIE);
        System.out.println(moviePrototype.toString());

        Album albumPrototype = (Album) PrototypeFactory.getInstance(ModelType.ALBUM);
        System.out.println(albumPrototype.toString());

        Show showPrototype = (Show) PrototypeFactory.getInstance(ModelType.SHOW);
        System.out.println(showPrototype.toString());

    }
}
