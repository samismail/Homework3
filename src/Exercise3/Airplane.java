package Exercise3;

public class Airplane implements Movement{
    private String model;
    private int year;

    public Airplane(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void fly() {
        System.out.println("I'm an airplane that relies on an engine to fly.");
    }

    @Override
    public void walk() {
        System.out.println("I tax on my wheels.");
    }

    @Override
    public void jump() {
        System.out.println("I cannot jump.");
    }

    @Override
    public String toString() {
        return "Airplane [model=" + model + ", year=" + year + "]: ";
    }
}
