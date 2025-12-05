package JavaSamp;

public class DryRun {
	
		
		String Fruite="Apple";
		int Price= 200;
		
		public void poly() {
			System.out.println("The fruite name is"+Fruite +"Amount of per KG "+ Price);
		}
		void poly(int a,int b) {
			int c=a+b;
			System.out.println("Total number of KG's stored " + c);
		}
		void poly(int a,String b) {
			System.out.println("Giveaway winning person: "+b+"  Winning amount is: "+a);
		}

		public static void main(String[] args) {
			DryRun output=new DryRun();
			output.poly();
			output.poly(50, 122);
			output.poly(10000, "Subin");

		}

	}



