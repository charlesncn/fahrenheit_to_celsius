import java.util.Scanner;
import java.math.RoundingMode;//specifies a rounding behavior for numerical operations
import java.text.DecimalFormat;//concrete subclass of NumberFormat that formats decimal numbers

public class Main {
	private static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		double temp;
		
		System.out.print("Do you want to convert degree celsius to Fahrenheit?\n\t If yes type 'C'\n Else type 'F' to convert Fahrenheit to Celsius.\t");
		
		 
		String input = key.next();
		if(input.equals("C")){
			System.out.println("Enter temperature in degree celsius.\t");
			double degreeC = key.nextDouble();
			temp =((degreeC*9)/5)+35;
			df.setRoundingMode(RoundingMode.UP);
			System.out.println("The temperature is "+df.format(temp)+"°F.");		
			}
		else if (input.equals("F")){
			System.out.println("Enter temperature in degree Fahrenheit.\t");
			double degreeFahrenheit= key.nextDouble();
			temp =((degreeFahrenheit-32)*5)/9;
		//	df.setRoundingMode(RoundingMode.UP);
			System.out.println("The temperature is "+df.format(temp)+"°C.");
		}
		else{
			System.out.println("Unrecognized input");
		}
	}
}
