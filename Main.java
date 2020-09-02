package list05_practice;

public class Main {

	public static String sub(int a, int b) {
		return a+"+"+b+"="+(a+b);
	}

	public static void main(String[] args) {
		SatoFunction tekitou = Main::sub; /*IntBinaryOperatorはapplyAsInt(int, int)を関数メソッドに持つ関数型インタフェース*/
		int x = 1250;						 /*Main::subは関数を変数に入れる専用の記述か...*/
		int y = 96;
		String a =tekitou.satoS(x, y); /*applyAsIntもお決まりのメソッド*/
//		System.out.println(x+"-"+y+"="+a);
		System.out.println(a);
	}
//自作のSatoFunctionを使うためコードを変更した
}
