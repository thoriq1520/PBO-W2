package W11;

//20.8
public class EconomyFlight extends Flight{
	public EconomyFlight(String id) {
		super(id);
	}
	@Override
	public boolean addPassenger(Passenger passenger) {
		return passengers.add(passenger);
	}
	@Override
	public boolean removePassenger(Passenger passenger) {
		if (!passenger.isVip()) {
			return passengers.remove(passenger);
		}
		return false;
	}
}
