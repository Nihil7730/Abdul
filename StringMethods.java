package JavaSamp;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

import org.apache.tools.ant.taskdefs.Length;

public class StringMethods {

	public static void main(String[] args) {
		
	//Length of the string
		String a="Flying Raigin";
		System.out.println(a.length());
		
	   //Concat add the multiple string
		
		String b="Sage art summoning ";
		//System.out.println(a+b);
		
		System.out.println(a.concat(b).concat("Add directly to the string"));
		
		//trim()---> Remove the space right and left
		
		System.out.println(b.trim());
		
		//CharAt  --> Return the charecter based on index
		
		System.out.println(b.charAt(2));
		
		//Contains ---> Validate the string value 
		
		System.out.println(b.contains("Sage"));
		
		// Equals and EqaualsIgnoreCase -----> To compare the strings
		
		System.out.println(b.equals("sage art summoning"));
		System.out.println(b.equalsIgnoreCase("sage art summoning"));
		
		//Replace ----> To replace the String 
		
		System.out.println(b.replace("S", "P"));
		
		//Substring() To get the range of the values 
		
		System.out.println(b.substring(0, 4));
		
		//toUpperCase() and toLowerCase()
		
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		
		//split() ---> To separate the string
		
		String B[]=b.split("i");
		System.out.println(Arrays.toString(B));
		
		System.out.println(B[0]);
		System.out.println(B[1]);
		
		
		//Reverse the string
		
		String s="Technology hello this is rahman";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//Approach2
		
		String Tec="Technology";
		String Rev="";
		
		char c[]=Tec.toCharArray();
		
		for(int i=Tec.length()-1;i<=0;i--) {
			Rev=Rev+c[i];
		}
		System.out.println(Rev);
		
		//Approach 3 Using StringBuffer
		
		StringBuffer A=new StringBuffer("Welcome");
		System.out.println("Reverse the String is: "+A.reverse());
		
		//Approach 4 Using StringBuilder
		
		StringBuilder C=new StringBuilder("Welcome");
		System.out.println("Reverse the String is: "+C.reverse());
		
		String M="welcome to home";
		String N[]=M.split("to");
		
		System.out.println(Arrays.toString(N));
		System.out.print(N[1]);
		System.out.println(N[0]);	
		
		
		//Reverse the String as per the word
		
		String Name ="Rahman Abdul";
		String word[]=Name.split(" ");
		String result="";
		
		for(String Word:word) {
			String Rever="";
			
			for(int i=Word.length()-1;i>=0;i--) {
				Rever=Rever+Word.charAt(i);
			}
			result=result+" "+Rever;
			}
		System.out.println(result);
			
		}
		
		
		
		
		
		}
	
	
	

