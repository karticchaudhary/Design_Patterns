package structural.adapterpattern;

public class AdapterMain {

    public static void main(String[] args) {
        RussianAdaptee radaptee = new RussianAdaptee();
        TranslationAdapter adapter = new TranslationAdapter(radaptee);
        String words = "Japanses Words";
        String russianWords = adapter.translate(adapter.readDescription(words));
        radaptee.performInstructions(russianWords);
    }
}
