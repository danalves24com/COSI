package velo.cosi.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import velo.cosi.elements.CoreElement;
import velo.cosi.elements.EnergySource;
import velo.cosi.models.Lambda0;
import velo.cosi.world.World;

class WorldTest {
	@Test
	void test() {
		World world = new World(5, 5);
		EnergySource source = new EnergySource("energySource", "provides energy");
		Lambda0 lambda0 = new Lambda0();
		CoreElement[] elements = new CoreElement[] {source, lambda0};
		for(CoreElement el : elements) {
			world.populate(el);
		}
		world.tick();
		world.display();		
	}
}
