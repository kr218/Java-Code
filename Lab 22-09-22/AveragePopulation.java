package prac_3;

public class AveragePopulation {

	public static void main(String[] args) {
		int Population_of_Town_then=175000;
		int Population_of_Town_now=262500;
		double Increase_Population;
		double Average_Population;
		double Population_Increase_PerYear;
		Increase_Population=(Population_of_Town_now-Population_of_Town_then);
		Average_Population=((Increase_Population/Population_of_Town_then)*100);
		Population_Increase_PerYear=(Average_Population/10);
		
		
		System.out.println(" Increasing Population:  " +  Population_Increase_PerYear + " %/year");

	}

}
