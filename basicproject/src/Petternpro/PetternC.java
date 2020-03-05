package Petternpro;

public class PetternC {

	public static void main(String[] args) {
		
for(int row=1;row<=5;row++) {
	for(int col=1;col<=5;col++) {
		if((row==1)||(row==5)) {
			if(col==1) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
			
				
			}
		else if(col==1) {
			System.out.println("*");
		}
	}
	System.out.println();
	
}
	}

}
