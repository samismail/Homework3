package Exercise2;

public class Flyers {
    public static void main(String[] args){
        Airplane boeing = new Airplane("Boeing 747", 2016);
        System.out.println(boeing);
        boeing.fly();
        Bird eagle = new Bird("Eagle");
        System.out.print(eagle);
        eagle.fly();
        Bird hummingbird = new Bird("Hummingbird");
        System.out.println(hummingbird);
        hummingbird.fly();

    }
}
