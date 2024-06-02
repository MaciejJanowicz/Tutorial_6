public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Lincoln", "Navigatr", 2023, 519, 25);
        System.out.println("Efektywność paliwowa samochodu: " + car.calculateFuelEfficiency() + " mil na galon");

        Vehicle truck = new Truck("Ford", "F-150", 2019, 320, 30, 2); // 2 tony ładunku
        System.out.println("Efektywność paliwowa ciężarówki: " + truck.calculateFuelEfficiency() + " mil na galon");
    }
}