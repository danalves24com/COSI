package velo.cosi.world;

import velo.cosi.elements.CoreElement;

public class World {
	
	public static CoreElement[][] mesh;
	private int xDim, yDim;
	public World(int xdim, int ydim) {
		this.mesh = new CoreElement[xdim][ydim];
		this.xDim = xdim;
		this.yDim = ydim;
	}
	/**
	 * Precondition: dims greater than current mesh
	 * @param x
	 * @param y
	 */
	public void modifyDimensions(int x, int y) {
		CoreElement[][] newMesh = new CoreElement[x][y];
		for(int i = 0 ; i < this.mesh.length ; i +=1 ) {
			for(int ii = 0 ; ii < this.mesh[0].length ; ii+=1) {
				newMesh[i][ii] = this.mesh[i][ii];
			}
		}
		this.mesh = newMesh;
	}
	public void display() {
		for(CoreElement[] elList : mesh) {
			String row = "";
			for(CoreElement element : elList) {
				row+=element+"\t";
			}
			System.out.println(row);
		}		
	}
	public void populate(CoreElement el) {
		int xPos = (int) (Math.random() * xDim), yPos = (int) (Math.random() * xDim);
		mesh[xPos][yPos] = el;
	}
	public static void tick() {
		for(int i = 0 ; i < mesh.length ; i +=1 ) {
			for(int ii = 0 ; ii < mesh[0].length ; ii+=1) {
				if(mesh[i][ii]!=null) {
					mesh[i][ii].tick();	
				}				
			}
		}
	}
}
