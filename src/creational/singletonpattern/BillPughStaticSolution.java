package creational.singletonpattern;

public class BillPughStaticSolution {

    private BillPughStaticSolution() {
    }

    private static class LazyHolder {
        private static final BillPughStaticSolution instance = new BillPughStaticSolution();
    }

    public static BillPughStaticSolution getInstance() {
        return LazyHolder.instance;
    }

}
