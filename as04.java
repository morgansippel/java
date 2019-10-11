import java.util.Scanner;

public class Change {

  public static void main(String[] args) {
		Scanner fromKey = new Scanner(System.in);
		System.out.print("Please input an amount ");
		double  num = fromKey.nextDouble();
		double rounded =  Math.round(num*100);
		int money = (int)rounded;

    if (money >= 10000) {
		int NumHundreds  = money / 10000;
		System.out.println(NumHundreds + " hundreds");
		money -= NumHundreds * 10000;
}
    if (money >= 5000) {
		int NumFifties = money / 5000;
		System.out.println(NumFifties + " fifties");
		money -= NumFifties * 5000;
}
    if (money >= 2000) {
		int NumTwenties = money/2000;
		System.out.println(NumTwenties + " twenties");
		money -= NumTwenties * 2000;
}
    if (money >= 1000) {
		int NumTens = money/1000;
		System.out.println(NumTens + " tens");
		money -= NumTens * 1000;
}
    if (money >= 500) {
		int NumFives = money/500;
		System.out.println(NumFives + " fives");
		money -= NumFives *500;
}
    if (money >= 100) {
		int NumOnes = money/100;
		System.out.println(NumOnes + " Ones");
		money -= NumOnes * 100;
}
    if (money >= 25) {
		int Quaters = money/25;
		System.out.println(Quaters + " Quaters");
		money -= Quaters * 25;
}
    if (money >= 10) {
		int Dimes = money/10;
		System.out.println(Dimes + " Dimes");
		money -= Dimes * 10;
}
    if (money >= 5) {
		int Nickels = money/5;
		System.out.println(Nickels + " Nickels");
		money -= Nickels * 5;
}

    if (money >= 1) {
		int Pennys = money/1;
		System.out.println(Pennys + " Pennys");
		money -= Pennys * 1;

	}

}
