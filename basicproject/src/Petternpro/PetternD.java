package Petternpro;

public class PetternD {

	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=3;col++) {
				if(row==1) {
					System.out.print("*");
					
					
				}
				else if (row==2) {
					if((col==1)||(col==4)){
						System.out.print(" *");
					}
					else {
						System.out.print("  ");
					}
				}
					else if(row==3) {
						if((col!=1)||(col!=3)) {
							System.out.print(" *");
						
						}
					  else { System.out.println(""); }
					 
						}
					}
					
					
				
			System.out.println();
			}
		}
	

	

}
