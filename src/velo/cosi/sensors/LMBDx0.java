package velo.cosi.sensors;

import velo.cosi.elements.CoreElement;
import velo.cosi.elements.Interactor;
import velo.cosi.world.World;

public class LMBDx0 extends Sensor {
	int xRead = 2, yRead = 2;

	public LMBDx0(int range) {
		xRead = range;
		yRead = range;
	}
	public void read(Interactor pov) {
		CoreElement queryElement = (CoreElement) pov;
		CoreElement[][] mesh = World.mesh;
		int x = 0, y = 0;
		boolean found = false;
		for (x = 0; x < mesh.length && !found; x += 1) {
			for (y = 0; y < mesh[0].length && !found; y += 1) {
				if (mesh[x][y]!=null&&mesh[x][y].equals(queryElement)) {
					found = true;
				}
			}
		}
		int tlx = x - xRead, tly = y - yRead, brx = x + xRead, bry = y + yRead;
		int[] pos = new int[] {tlx, tly, brx, bry};
		int i = 0;
		for(int p : pos) {
			pos[i] = p<0?0:p;
			i+=1;
		}
		
		if (tlx >= 0 && tly >= 0 && brx < mesh.length && bry < mesh[0].length) {
			System.out.println("can look");
			
		}
	}
}
