package rw.origene.controlflow.exercises;

public class Application {

	public static void main(String[] args) {
		
		
		
           boolean isLeapYear = NumberOfDaysInMonth.isLeapYear(2017);
           
           System.out.println(isLeapYear);
           
           int numberOfDays = NumberOfDaysInMonth.getDaysInMonth(1, 2017);
           
           System.out.println( numberOfDays );
           
           int sumOdd = SumOddRange.sumOdd(-1,  100);
           
           System.out.println(sumOdd);
           
           
	}

}
