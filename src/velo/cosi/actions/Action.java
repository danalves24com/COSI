package velo.cosi.actions;

import velo.cosi.elements.Interactor;

public class Action {
	private Interactor in;
	public Action(Interactor in) {
		this.in = in;
	}
	public Interactor getInteractor() {
		return in;
	}
	public void execute() {
		
	}
}
