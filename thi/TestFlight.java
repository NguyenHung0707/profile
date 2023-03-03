package thithuchanh;

public class TestFlight {
    public static void main(String[] args) {
        Flight f1 = new Flight(857,"Toronto");
        System.out.println(f1.getNumber());
        System.out.println(f1.getDestination());
        f1.display();
    }
}
