package velo.cosi.elements;

public class CoreElement {
	private String name, description;
	public CoreElement(String name, String description) {
		this.name = name;
		this.description = description;
	}
	public void tick() {

	}

	public String toString() {
		return this.name;
	}

	public void interact(Interactor interactor) {
		// do something for interactor
	}
	
}
