package actuator;

public class Thermostat extends Actuator{

	private double temperature;

	public void setTemperature(double temperature){
		this.temperature = temperature;
	}

	@Override
	public void setStatus(boolean newStatus) {
	}

}
