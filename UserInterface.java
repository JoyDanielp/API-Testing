import java.util.Scanner;

public class UserInterface {
	 public static void main(String[] args) {                                              
        
		 Scanner sc=new Scanner(System.in);    
		 
        // 	Fill the code here
		 System.out.println("Enter the Camera Specifications");
		 String companyName = sc.nextLine();
		 if(!companyName.equals("RIKON")) {
			 System.out.println(companyName+" is an invalid Company name");
			 return;
		 }
		 String Surname = sc.nextLine().toUpperCase();
		 if(!(Surname.length()>=3) || !(Surname.length()<5)) {
			 System.out.println(Surname+" is an invalid Customer Surname");
			 return;
		 }
		 String ISO = sc.nextLine();
		 if(!ISO.equals("100")&& !ISO.equals("200")&& !ISO.equals("400")&& !ISO.equals("800")) {
			 System.out.println(ISO + " is an invalid ISO");
			 return;
		 }
		 String cmode = sc.nextLine().toUpperCase();
		 if(!cmode.equals("AUTO") && !cmode.equals("MANUAL")) {
			 System.out.println(cmode + " is an invalid Camera Mode");
			 return;
		 }
		 String panno = sc.nextLine();
		 if(!panno.matches("[A-Z]{5}.{5}")) {
			 System.out.println(panno + " is an invalid PAN Number");
		 }
		 String c1 = companyName.substring(0,3);
		 String c2 = Surname.substring(0, 1);
		 String c5 = ISO;
		 String c3 = cmode.substring(0,1);
		 String c4 = panno.substring(0,5);
		 String result = c1+c2+c5+c3+c4;
		 System.out.println("Your coupon code is "+result);
        
    }
    
}
