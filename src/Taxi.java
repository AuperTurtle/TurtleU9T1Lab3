public class Taxi extends Car {

    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
        super(licensePlate, tollFee, passengers, isElectric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi() {
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Is Electric: " + isElectric());
        System.out.println("Is Discounted: " + isDiscountApplied());
        System.out.println("Fare Collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += farePerRider * numRiders;
        if (!isDiscountApplied() && getPassengers() >= 4) {
            discountTollFee();
            updateDiscount();
        }
    }

    public double getFareCollected() {
        return fareCollected;
    }
}
