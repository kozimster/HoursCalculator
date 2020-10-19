import java.util.Scanner;
/*
 * program to calculate working hours after provide start and end time - lunch break 
 * 
 */


public class HoursCalculator {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String dayOfWeek;
		System.out.println("Please provide Start time (in the hh:mm format):");
		
		String start = scan.nextLine();
		
		System.out.println("Please provide End time in the hh:mm format):");
		
		String end = scan.nextLine();
		
		System.out.println("How long lunch breake(in minutes)");
		
		int lunchBreak = scan.nextInt();
				
		String HourStart = start.split(":")[0];
		String MinuteStart = start.split(":")[1];
		
		
			int hourStart = Integer.parseInt(HourStart);
			int minuteStart = Integer.parseInt(MinuteStart);
			
			String HourEnd = end.split(":")[0];
			String MinuteEnd= end.split(":")[1];
			
						
				int hourEnd = Integer.parseInt(HourEnd);
				int minuteEnd= Integer.parseInt(MinuteEnd);
			
		float total = ((float)((hourEnd * 60 + minuteEnd)-(hourStart * 60 + minuteStart) )-lunchBreak)	/60;
		
		System.out.println("Total hours today: " + total);
			
	
		
	}
	
}
