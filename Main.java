public class Main{
	public static void main (String[]args){
		double hight=160;
		double weight=57;
		double hightm=hight/100;
		double bmi=weight/(hightm*hightm);
	System.out.println("あなたのBMIは"+String.format("%.2f",bmi)+"です。");
	}
}
