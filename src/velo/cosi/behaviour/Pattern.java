package velo.cosi.behaviour;

import velo.cosi.actions.Action;
import velo.cosi.cognition.Need;

public class Pattern {
	private Need need;
	private Action action;
	public Pattern(Need n, Action a) {
		this.need = n;
		this.action = a;
	}
	public Need getNeed() {
		return need;
	}
	public void setNeed(Need need) {
		this.need = need;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	
}
