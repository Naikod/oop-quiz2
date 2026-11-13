package id.ac.polinema.quiz2;

public class BikeRide extends Ride {
    public static final double RATE_PER_KM = 2500;

    public BikeRide(String rideId, Passenger passanger, double distanceKm){
        super(rideId, passanger, distanceKm);
    }

    @Override 
    public double calculateFare(){
        return getDistanceKm() * RATE_PER_KM;
    }
}
