import java.io.Console;
import java.util.Scanner;

public class Passengers {
		public static String[][] seating= {{"1","A","B","C","D"},
										   {"2","A","B","C","D"},
										   {"3","A","B","C","D"},
										   {"4","A","B","C","D"},
										   {"5","A","B","C","D"},
										   {"6","A","B","C","D"},
										   {"7","A","B","C","D"}};
		
		public static boolean hasSeat=true;//Will be used to assign if there are seats on the plane
		public static Scanner s= new Scanner(System.in);//building scanner
		
		public static void seating(){//open
			System.out.println("You will be selecting seats for this airplane.");
				for(int i = 0;i<seating.length; i++) {
					for(int k = 0;k<seating[0].length;k++) {
						System.out.print(seating[i][k]);
					}
					System.out.println("");
				}
				
			while(hasSeat=true){//loops the program as long as there are available seats on the plane. 
				assign();				
			}	
			
			System.out.println("There are no more available seats.");//announces that the program is over due to no more seats being available
			System.exit(0);
		}//close
		
		public static void assign() {//open
			System.out.print("You will input the seat selection using the row number and then seat lettter, ex: 1B, 2D \nPlease enter the seat number or Q to quit.");
			System.out.println("");
			String selection=s.nextLine();//Initialization of all necessary values
			String Letter= selection.substring(1);
			String Quit="Q";
			String A="A";
			String B="B";
			String C="C";
			String D="D";
			
			if(selection.equalsIgnoreCase(Quit)){//Allows user to quit
				System.out.println("Goodbye.");
				System.exit(0);
			}
			
				if(selection.length()==2){//makes certain that the entry meets the requirements
					int number= Integer.parseInt(selection.substring(0,1));
					if((number>0)&&(number<8)) {
						if(((Letter.equalsIgnoreCase(A))||(Letter.equalsIgnoreCase(B))||(Letter.equalsIgnoreCase(C))||(Letter.equalsIgnoreCase(D)))) {
					
							if(number==1) {
								for(int i =0;i<seating[0].length;i++) {
									if(seating[0][i].equals(Letter)) {
										seating[0][i]="X";
									}
								}
							}
							if(number==2) {
								for(int i =0;i<seating[1].length;i++) {
									if(seating[1][i].equals(Letter)) {
										seating[1][i]="X";
									}
								}
							}
							if(number==3) {
								for(int i =0;i<seating[2].length;i++) {
									if(seating[2][i].equals(Letter)) {
										seating[2][i]="X";
									}
								}
							}
							if(number==4) {
								for(int i =0;i<seating[3].length;i++) {
									if(seating[3][i].equals(Letter)) {
										seating[3][i]="X";
									}
								}
							}
							if(number==5) {
								for(int i =0;i<seating[4].length;i++) {
									if(seating[4][i].equals(Letter)) {
										seating[4][i]="X";
									}
								}
							}
							if(number==6) {
								for(int i =0;i<seating[5].length;i++) {
									if(seating[5][i].equals(Letter)) {
										seating[5][i]="X";
									}
								}
							}
							if(number==7) {
								for(int i =0;i<seating[6].length;i++) {
									if(seating[6][i].equals(Letter)) {
										seating[6][i]="X";
									}
								}
							}
					
						}
					else {//Throws an error if the Letters are incorrect
						System.out.println("This is not a valid input.");
					}
				}
				else {//Throws an Error if the numbers are incorrect
					System.out.println("This is not a valid input.");
					}
				}
			else {//Throws an error if the value entered is not of the proper length
				System.out.println("This is not a valid input.");
				}
				
			
			
			
			hasSeat=false;//makes certain that if there is no more available seats that the method wont run again after printing. 
			for(int i = 0;i<seating.length; i++) {//prints out seating chart and assigns hasSeat to true if there's an available seat it will set it to true
				for(int k = 0;k<seating[0].length;k++) {
						System.out.print(seating[i][k]);
					if(seating[i][k]!="X") {
						hasSeat=true;//sets has seat to true if there is available seats, makes certain that the program will run again if seats are available.
					}
				}
				System.out.println("");
			}	
		}//End of assign.
		
}
