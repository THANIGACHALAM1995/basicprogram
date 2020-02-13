package oop.day;

public class recusiivereverse {

	int x=5;
		void print () {
			System.out.println(x);
			x--;
			if(x>0) {
				print ();
				
				
			}
			//System.out.println(x);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			recusiivereverse sk= new recusiivereverse();
			sk.print();
			System.out.println("end");
		}

	}


