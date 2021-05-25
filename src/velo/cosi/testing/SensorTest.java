package velo.cosi.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import velo.cosi.elements.EnergySource;
import velo.cosi.models.Lambda0;
import velo.cosi.sensors.LMBDx0;
import velo.cosi.world.World;

class SensorTest {

	@Test
	void test() {
		World world = new World(10, 10);		
		Lambda0 lambda0 = new Lambda0();
		world.populate(lambda0);
		world.display();
		LMBDx0 sensorx0 = new LMBDx0(2);
		sensorx0.read(lambda0);
	}

}
