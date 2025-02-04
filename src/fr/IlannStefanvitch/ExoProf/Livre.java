package fr.IlannStefanvitch.ExoProf;

public class Livre {
	
	private String name;
	private double price;
	private int quatite;
	
	public Livre () {
		name = "Jean";
		price = 10 ;
		quatite = 50;
	}
	public Livre (String name , float price , int quatite) {
		this.name = name;
		this.price = price ;
		this.quatite = quatite;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuatite() {
		return quatite;
	}
	public void setQuatite(int quatite) {
		this.quatite = quatite;
	}
	
	public String toString() {
		return " Titre : " + name + " Pirx :" + price + " Qtt " + quatite;
	}

	
}
