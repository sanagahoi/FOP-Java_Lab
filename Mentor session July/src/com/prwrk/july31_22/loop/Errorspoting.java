package com.prwrk.july31_22.loop;

public class Errorspoting {
public static void main(String[] args) {
		
		/* program 1.
		 * 
		 * for (int counter = 0; counter < 10; counter++) {
			//System.out.println("counter is " + counter); 3 will be printed then loop will break 

			if(counter == 3) {
				break;
			}	
			System.out.println("counter is " + counter); //3 will not be printed
		}
	}*/
	
	for (int counter = 0; counter <= 10 ; counter++ ) {
		if(counter > 9) {
			System.out.println("values after 9 --> " + counter); //some extra info shd be there
			continue;
		}
		System.out.println("counter value : " + counter);
	}
}
}
