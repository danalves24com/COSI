package velo.cosi.behaviour;

import java.util.ArrayList;
import java.util.List;

import velo.cosi.actions.Action;
import velo.cosi.cognition.Need;

public class Lambda0Behaviour {
	private List<Pattern> patterns;
	public Lambda0Behaviour(Pattern[] list) {
		patterns = new ArrayList<Pattern>();
		for(Pattern p : list) {
			this.patterns.add(p);
		}
	}
	public Action decide(Need need) {
		for(Pattern p : this.patterns) {
			if(need.equals(p.getNeed())){
				return p.getAction();
			}
		}
		return null;
	}
	
}
