package com.prewrk.july30_22.ifElse;

public class IfElseErrorChecker3 {

public static void main(String[] args) {
		
		boolean isAnyFoulMadeByTeamA = false;		
		int noOfFoulsByTeamA = 0;
		
		if(isAnyFoulMadeByTeamA) {
			noOfFoulsByTeamA = noOfFoulsByTeamA + 2;
		} 
		
		if (noOfFoulsByTeamA == 0) 
			System.out.println("Team A did made some fouls during the play");
		else 
			System.out.println("Team A did not make any fouls during the play");
			System.out.println("Team A gets extra points for no fouls");		
		
		
		
		/*this was the error of curly braces
			if (noOfFoulsByTeamA == 0) {
				System.out.println("Team A did made some fouls during the play");
			}
			else {
				System.out.println("Team A did not make any fouls during the play");
			}
		
		System.out.println("Team A gets extra points for no fouls");
		*/		

	}
}
