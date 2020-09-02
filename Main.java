package list05_practice;
import java.util.function.IntBinaryOperator;

public class Main {

	public static int sub(int a, int b) {
		return a-b;
	}

	public static void main(String[] args) {
		IntBinaryOperator tekitou = Main::sub; /*IntBinaryOperatorはapplyAsInt(int, int)を関数メソッドに持つ関数型インタフェース*/
		int x = 150;						 /*Main::subは関数を変数に入れる専用の記述か...*/
		int y = 96;
		int a = tekitou.applyAsInt(x, y); /*applyAsIntもお決まりのメソッド*/
		System.out.println(x+"-"+y+"="+a);
	}

}
