package JavaSamp;

public class Arrays {

	public static void main(String[] args) {
		int a[]= {1,22,44,11,88,167};
		System.out.println(a.length);
		
		// Normal for
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
			// for Each
			
			for(int A:a) {
				System.out.println(A);
				
			
		}
			
			//Two Dymentional array
			int b[][]= {  {100,55},{800,100},{567,111} };
			System.out.println(b.length);
			
			for(int r=0;r<=2;r++) {
				for(int c=0;c<=1;c++) {
					System.out.print(b[r][c]+" ");
				}
				System.out.println();
			}
			
	}
	
	

}
