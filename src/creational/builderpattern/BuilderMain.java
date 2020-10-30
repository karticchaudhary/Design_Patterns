package creational.builderpattern;

public class BuilderMain {

    public static void main(String[] args) {
        Users factory1 = new Users.UserBuilder("lenovo", "legion").build();

        Computer computer1 = new Computer.ComputerBuilder("200GB", "16GB").build();
    }
}
