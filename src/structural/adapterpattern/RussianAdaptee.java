package structural.adapterpattern;

import java.util.stream.IntStream;

public class RussianAdaptee {

    public void retrieveDescription(String inRussian) {
        IntStream description = inRussian.chars();
        System.out.println("Retrieving Description from Adapter...");
        System.out.println(description);
    }

    public void performInstructions(String descriptions) {
        System.out.println("Executing Instructions...");
        System.out.println(descriptions);
    }

}