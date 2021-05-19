package velo.cosi.models;

import java.util.ArrayList;
import java.util.List;

import velo.cosi.cognition.Need;
import velo.cosi.elements.Interactor;
import velo.cosi.sensors.LMBDx0;
import velo.cosi.sensors.Sensor;

public class Lambda0 extends Interactor{
	final static String name = "Lambda0", description = "the lambda 0 model"; 
	private List<Sensor> sensorArray = new ArrayList<Sensor>();
	private List<Need> needsArray = new ArrayList<Need>();
	public void addSensor(Sensor s) {
		this.sensorArray.add(s);
	}	
	public Lambda0() {
		super(name, description);
		Sensor[] sensors = new Sensor[] {new LMBDx0(2)};
		for(Sensor s : sensors) {
			this.sensorArray.add(s);
		}
	}
	public void tick() {
		for(Sensor s : this.sensorArray) {
			s.read(this);
		}
	}
	
}
