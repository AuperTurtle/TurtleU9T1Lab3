public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public void printTruck() {
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Axles: " + axles);
        System.out.println("Has Trailer: " + hasTrailer);
    }

    public boolean validateLicensePlate() {
        if (!hasTrailer) {
            return true;
        }
        String tempString = getLicensePlate().substring(getLicensePlate().length() - 2);
        if (tempString.equals("MX")) {
            if (axles > 4) {
                return true;
            }
        }   else   {
            if (tempString.equals("LX")) {
                if (axles <= 4) {
                    return true;
                }
            }
        }
        return false;
    }
}