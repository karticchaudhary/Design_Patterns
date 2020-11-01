package structural.adapterpattern;

public class TranslationAdapter implements JapaneseTarget {

    RussianAdaptee russianAdaptee;

    // Constructor contains the reference to Adaptee instance
    public TranslationAdapter(RussianAdaptee russianAdaptee) {
        this.russianAdaptee = russianAdaptee;
    }

    String translate(String japaneseWords) {
        System.out.println("Translating Japanese Words.........");
        japaneseWords = japaneseWords + "  arigatho gosaymas";
        System.out.println(japaneseWords);
        return japaneseWords;
    }

    @Override
    public String readDescription(String words) {
        System.out.println("Reading Japanese Words.........");
        System.out.println(words);
        return words;
    }

    @Override
    public void showPictures() {

    }

}
