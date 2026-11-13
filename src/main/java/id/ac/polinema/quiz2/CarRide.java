package id.ac.polinema.quiz2;

public class CarRide extends Ride implements Insurable {
    public static final double RATE_PER_KM = 4000;

    public CarRide(String rideId, Passenger passanger, double distanceKm){
        super(rideId, passanger, distanceKm);
    }

    @Override 
    public double calculateFare(){
        return getDistanceKm() * RATE_PER_KM;
    }

    @Override 
    public double insuranceFee(){
        return 3000;
    }
}
