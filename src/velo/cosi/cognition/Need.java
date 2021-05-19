package velo.cosi.cognition;

public class Need {
	private NeedStatus[] types = NeedStatus.values();
	private int statusIndex = 1;
	private NeedStatus status = types[statusIndex];
	private String name;
	public Need(String name) {
		this.name = name;
	}
	public NeedStatus getStatus() {
		return this.status;
	}
	public void boostStatus() {
		statusIndex+=1;
	}
	public void decreaseStatus() {
		statusIndex-=1;
	}
}
