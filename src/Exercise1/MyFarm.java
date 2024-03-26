package Exercise1;
import java.util.ArrayList;
/*
Chicken Cock-a-Doodle-doo [name=Albert, gender=male, weight=1.6, age=2]
Chicken Cluck Cluck [name=Amelia, gender=female, weight=1.8, age=4]
Chicken Cluck Cluck [name=Dixie, gender=female, weight=1.7, age=4]
 */

import java.lang.reflect.Array;

public class MyFarm {
    public static void main(String[] args){
        Duck duck1 = new Duck("Donald", "male", 3.2,5,"Quack Quack");
        Duck duck2 = new Duck("Cheese","female",3.6,5,"Quack Quack");
        Cow cow1 = new Cow("Molly", "female", 1600,3,"Moo Moo");
        Chicken chicken1 = new Chicken("Albert", "male",1.6,2,"Cock-a-Doodle-doo");
        Chicken chicken2 = new Chicken("Amelia", "female",1.8,4, "Cluck Cluck");
        Chicken chicken3 = new Chicken("Dixie", "female",1.7,4, "Cluck Cluck");

        System.out.println(duck1);
        System.out.println(duck2);
        System.out.println(cow1);
        System.out.println(chicken1);
        System.out.println(chicken2);
        System.out.println(chicken3);

        System.out.println(duck1.feedLoadingSchedule());
        System.out.println(duck2.feedLoadingSchedule());
        System.out.println(cow1.feedLoadingSchedule());
        System.out.println(chicken1.feedLoadingSchedule());
        System.out.println(chicken2.feedLoadingSchedule());
        System.out.println(chicken3.feedLoadingSchedule());
    }
}
