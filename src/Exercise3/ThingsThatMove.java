package Exercise3;

public class ThingsThatMove {
    public static void main(String[] args){
        Airplane boeing = new Airplane("Boeing 747", 2016);
        System.out.println(boeing);
        boeing.fly();
        boeing.walk();
        boeing.jump();
        Bird eagle = new Bird("Eagle");
        System.out.print(eagle);
        eagle.fly();
        eagle.walk();
        eagle.jump();
        Bird hummingbird = new Bird("Hummingbird");
        System.out.println(hummingbird);
        hummingbird.fly();
        hummingbird.walk();
        hummingbird.jump();

    }
}
