public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public void printCar() {
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Is Electric: " + electric);
        System.out.println("Is Discounted: " + discountApplied);
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public boolean dropOffPassengers(int numOut) {
        if (numOut >= getPassengers()) {
            return false;
        }   else   {
            setPassengers(getPassengers() - numOut);
            return true;
        }
    }

    public void applyDiscount() {
        if (!discountApplied && electric) {
            discountTollFee();
            discountApplied = true;
        }
    }

    public void updateDiscount() {
        discountApplied = true;
    }
}