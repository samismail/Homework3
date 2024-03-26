package Exercise1;

public class Duck extends Chicken{
    public Duck(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age, "Quack Quack");
    }

    @Override
    public String feedLoadingSchedule() {
        return getName() + ": 8am-12pm-6pm";
    }

    @Override
    public String toString() {
        return "Duck " + getSound() + " [" +
                "name=" + getName() +
                ", gender=" + getGender() +
                ", weight=" + getWeight() +
                ", age=" + getAge() +
                ']';
    }
}
