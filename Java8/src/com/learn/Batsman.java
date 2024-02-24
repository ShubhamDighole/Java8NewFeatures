package com.learn;

public class Batsman {
	
	private int id;
	private String name;
	private int rank;
	private float average;
	@Override
	public String toString() {
		return "Batsman [" + id + " : " + name + " : " + rank + " : " + average + "]";
	}
	public int getId() {
		return id;
	}
	public Batsman(int id, String name, int rank, float average) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.average = average;
	}
	public Batsman() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	
	/*
	 * @Override public boolean equals(Object object) {
	 * 
	 * Batsman batsman= (Batsman) object;
	 * 
	 * if((id==batsman.id) && (average==batsman.average) &&
	 * (name.equals(batsman.name)) && (rank== batsman.rank)) { return true; } return
	 * false; }
	 */
	
	
	
	
	@Override
	public boolean equals(Object object) {
		
		Batsman batter= new Batsman();
		if(batter.id==id &&
		   batter.name==name) {
			
			return true;
			
		}
		
		return false;
	}
	
	
}
