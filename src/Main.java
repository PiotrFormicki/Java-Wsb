import Creatures.Animal;
import Devices.Car;

public class Main {
    public static void main(String[] args) {
//        Devices.Phone nokia = new Devices.Phone();
//        nokia.id = 1;
//        nokia.producer = "nokia";
//        nokia.model = "33.10";
//        nokia.screenSize = 1.2;
//        nokia.isAndroid = false;
//
//        Devices.Phone iphone = new Devices.Phone();
//        iphone.producer = "apple";
//        iphone.model = "6s";
//        iphone.screenSize = 5.4;
//        iphone.isAndroid = false;
        // System.out.println("Moje telefony:");
        // System.out.println("Producent:" + nokia.producer);
        // System.out.println("Model:" + nokia.model);
        //System.out.println("Producent:" + iphone.producer);
        // System.out.println("Model:" + iphone.model);

        Animal dog = new Animal("canis");
        //dog.species = "canis";
//        dog.weight = 4.3;
        // dog.isAlive = true;
        dog.name = "Szarik";

        Animal cat = new Animal("felis", 3.0);
        System.out.println(cat.species);
        System.out.println(cat.getWeight());
        System.out.println(cat.getWeight());
        // System.out.println("Imię psa:" + dog.name);


        Animal eli = new Animal("spaniel", 5.0);
        System.out.println(eli.getAlive());


//        dog.takeForWalk();
//        dog.takeForWalk();
//        dog.takeForWalk();
//        dog.takeForWalk();
//        dog.takeForWalk();
//        dog.takeForWalk();
//        dog.takeForWalk();
//        dog.takeForWalk();
//        dog.takeForWalk();
//        dog.takeForWalk();
//        dog.takeForWalk();
//        dog.takeForWalk();
//        dog.feed();


//        Creatures.Human piotr= new Creatures.Human();
//        piotr.firstName="Kacper";
//        piotr.lastName="Kowalski";
//        piotr.pet=dog;
//
//        Devices.Car car=new Devices.Car();
//        car.model="M5";
//        car.producer="BMW";
//car.horsePower=525.5;
//
//        System.out.println(car.horsePower)
//        ;
//    }
//
//}
//        dog.takeForWalk(5.0);
//        System.out.println(dog.getWeight());
//        dog.feed(1.0);
//        System.out.println(dog.getWeight());
        Car fiat=new Car(17, "fiat","bravo", "diesel");




    }}