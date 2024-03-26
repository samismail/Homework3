package Exercise1;

public class Cow extends Chicken{

    public Cow(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age, "Cock-a-Doodle-doo");
    }

    @Override
    public String feedLoadingSchedule() {
        return getName() + ": 6am-4pm";
    }

    @Override
    public String toString() {
        return "Cow " + getSound() + " [" +
                "name=" + getName() +
                ", gender=" + getGender() +
                ", weight=" + getWeight() +
                ", age=" + getAge() +
                ']';
    }
}
