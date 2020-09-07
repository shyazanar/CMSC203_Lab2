import java.util.Scanner; 

public class SphereVolume {

	public static void main(String[] args) {
		// Create a Scanner object here 
		Scanner sc = new Scanner(System.in); 
		// Print the purpose of the program 
		System.out.println("This program calculates the volume of a sphere given an inpout diameter");
		// Print a prompt asking for the diameter of a sphere 
		System.out.print("Enter diameter of sphere: ");
		// Read the diameter 
		double diam = sc.nextDouble();
		// Calculate the radius as diameter divided by 2 
		double radius = diam / 2;
		// Calculate volume of the sphere using the formula 
		double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		// Print the volume 
		System.out.println("Volume of sphere is: " + volume);
	}

}
