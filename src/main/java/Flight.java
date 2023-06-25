import java.util.ArrayList;

public class Flight {

    Pilot pilot;
    private ArrayList<CrewMember> crewMembers;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private double totalWeightAllowance;
    private int seatCapacity;

    public Flight(Pilot pilot, ArrayList<CrewMember> crewMembers, String flightNumber, String destination, String departureAirport, String departureTime, double totalWeightAllowance, int seatCapacity) {
        this.pilot = pilot;
        this.crewMembers = crewMembers;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.totalWeightAllowance = totalWeightAllowance;
        this.passengers = new ArrayList<>();
        this.seatCapacity = seatCapacity;
    }

    public int getAvailableSeats() {
        return seatCapacity - currentOccupancy();
    }

//    public int getPassengers() {
//        return passengers.size();
//    }

    public int currentOccupancy() {
        int pilot = 1;
        return pilot + crewMembers.size() + passengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        if(getAvailableSeats() > 0) {
            passengers.add(passenger);
        }
    }

}
