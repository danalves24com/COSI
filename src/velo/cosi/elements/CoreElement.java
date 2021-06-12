package velo.cosi.elements;

public class CoreElement {
	private String name, description;
	private int positionX, positionY;
	public CoreElement(String name, String description, int positionX, int positionY) {
		this.name = name;
		this.description = description;
		this.positionX = positionX;
		this.positionX = positionY;
	}
	public void tick() {

	}
	public void setPosition(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionX = positionY;
	}
	public String toString() {
		return this.name;
	}

	public void interact(Interactor interactor) {
		// do something for interactor
	}
	
}
