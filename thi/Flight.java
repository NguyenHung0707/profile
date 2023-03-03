package thithuchanh;

public class Flight {
    private int number;
    private String destination;

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void display(){
        System.out.println(this.getNumber() + "," +this.getDestination());
    }
}
