package com.yedam.spring.xml;

public class Restaurant {
	
	private Chef chef;
	
	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void run() {
		chef.cooking();
	}
}
