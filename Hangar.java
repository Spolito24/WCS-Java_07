public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Formule 1", 15000);
        System.out.println(car.doStuff());
        
        Boat boat = new Boat("Zodiac", 20000);
        System.out.println(boat.doStuff());
    }
}
