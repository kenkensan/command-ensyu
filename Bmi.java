public class Main{
	public static void main (String[]args){
	System.out.print("1人目の身長:");
	double hight1=new java.util.Scanner(System.in).nextInt();
	System.out.print("1人目の体重:");
	double weight1=new java.util.Scanner(System.in).nextInt();
	System.out.print("2人目の身長:");
	double hight2=new java.util.Scanner(System.in).nextInt();
	System.out.print("2人目の体重:");
	double weight2=new java.util.Scanner(System.in).nextInt();
	double hightm=hight1/100;
	double hightm2=hight2/100;
	double bmi=weight1/(hightm*hightm);
	double bmi2=weight2/(hightm2*hightm2);
	System.out.println("あなたたちのBMIは"+String.format("%.2f",bmi)+"と,"+String.format("%.2f",bmi2)+"です。");}
}
