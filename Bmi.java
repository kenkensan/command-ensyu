public class Main{
	public static void main (String[]args){
	System.out.print("1�l�ڂ̐g��:");
	double hight1=new java.util.Scanner(System.in).nextInt();
	System.out.print("1�l�ڂ̑̏d:");
	double weight1=new java.util.Scanner(System.in).nextInt();
	System.out.print("2�l�ڂ̐g��:");
	double hight2=new java.util.Scanner(System.in).nextInt();
	System.out.print("2�l�ڂ̑̏d:");
	double weight2=new java.util.Scanner(System.in).nextInt();
	double hightm=hight1/100;
	double hightm2=hight2/100;
	double bmi=weight1/(hightm*hightm);
	double bmi2=weight2/(hightm2*hightm2);
	System.out.println("���Ȃ�������BMI��"+String.format("%.2f",bmi)+"��,"+String.format("%.2f",bmi2)+"�ł��B");}
}
