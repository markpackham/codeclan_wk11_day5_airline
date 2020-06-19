import java.util.ArrayList;

public class Flight {
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private Plane plane;
    private ArrayList<Passenger> passengers;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime, Plane plane) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public Plane getPlane() {
        return plane;
    }

}