
public class Patient {
	
	//instance variables
	private String name;
	private double height;
	private double weight;
	
	public Patient(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	//BMI --calculate bmi based on weight & height
	public double calculateBMI() {
		double bmi;
		bmi = weight /(height*height);
		return bmi;
	}
	
	//Print object info when called by System.out.println
	public String toString() {
		return ("Name: \t" + name + "\nHeight: \t" + height +
				"\nWeight: \t" + weight + "\nBMI: \t" + calculateBMI());
	}
}
