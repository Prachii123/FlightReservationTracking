public class CargoFlight extends Flight {
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;
    int seats = 12;

    @Override
    public int getSeats() {
        return seats;
    }
    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void add1package(float h, float w, float d) {
        double size = h * w * d;
        if(hasCargoSpace(size))
            usedCargoSpace += size;
        else
            handleNoSpace();
    }

    @Override
    public String getType() { return "CargoFlight"; }

    private boolean hasCargoSpace(double size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace() {
        System.out.println("Not enough space");
    }

}
