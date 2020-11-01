package structural.proxypattern;

public class ClientMain {

    public static void main(String[] args) {
        RealObject realObject = new RealObjectProxy();
        realObject.doSomething();
    }

}
