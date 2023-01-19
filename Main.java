import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner output = new Scanner(System.in);
	    String[] subject = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	    double[] grades = new double[9];
	    System.out.print("Name: ");
	    String name = output.nextLine();
	    System.out.print("Section: ");
	    String section = output.nextLine();
	    
	    for(int i = 0; i < subject.length; i++) {
	        System.out.print(subject[i] + " ");
	        grades[i] = output.nextDouble();
	    }
	    System.out.println("\t\tSubject    Grades\n");
	    for (int i = 0; i < subject.length; i++) {
	        System.out.println(subject[i] + " " + grades[i]);
	        
	    }
	    GWAcheck(grades);
	    
	}
	public static void GWAcheck(double[] grades) {
	    double GWA = grades[0] + grades [1] + grades [2] + grades [3] + grades [4] + grades [5] + grades [6] + grades [7] + grades [8];
	    GWA = GWA / 9;
	    System.out.printf("%.2f", GWA);
	    if (GWA >= 75 && GWA <= 100) {
	        System.out.println("\nRemarks: Passed");
	    }
	    else {
	        System.out.println("\nRemarks: Failed");
	    }
	}
}

