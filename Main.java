// 「スレッド「メイン」の例外java.lang.Error：未解決のコンパイル問題：
// ラムダ式のパラメーターhは、外側のスコープで定義されている別のローカル変数を再宣言できません。」
// このコードだとこういうエラーが出てしまう
package practice;
public class Main{
	public static void main(String[] args) {
		Hero h = new Hero();
//		MyFunction func = (h) -> {return h.getHp()+h.getHp();};
		MyFunction func = (Hero) -> {return h.hp;};　　/*ここを(Hero h)とできない*/
		int a = func.call(h);
		System.out.println(a);
	}
}










