package velo.cosi.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import velo.cosi.elements.CoreElement;
import velo.cosi.elements.EnergySource;
import velo.cosi.world.World;

class WorldTest {

	@Test
	void test() {
		World world = new World(5, 5);
		EnergySource source = new EnergySource("energySource", "provides energy");
		world.populate(source);
		world.display();
	}

}
