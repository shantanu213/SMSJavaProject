package com.pack.PracticeHiber;

import javax.persistence.Embeddable;

@Embeddable
public class Trainig {
	private String software;
	private String duration;

	public Trainig(String software, String duration) {
		super();
		this.software = software;
		this.duration = duration;
	}

	public Trainig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSoftware() {
		return software;
	}

	public void setSoftware(String software) {
		this.software = software;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
