package homeWork.test10;

public class Bus {
    private int seats;
    private Person[] passenger;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Person[] getPassenger() {
        return passenger;
    }

    public void addPassenger(Person person) {
        seats = 20;
        for (int i = 0; i < 20; i++) {
            seats--;
        }

    }
}
