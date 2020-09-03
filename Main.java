package practice;
class Hero{
	private int hp = 100;
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
}
public class Main {
	public static String sub(Hero a, String b) {
		return b+a.getHp()+"の二乗は"+(a.getHp()*a.getHp());
	}
    public static void main(String[] args) {
//    	MyFunction func = (int a) -> {return a*a;};
//    	int x = 200;
//    	int a = func.call(x);
//    	System.out.println(x+"の二乗は"+a);

    	Hero h = new Hero();
//    	System.out.println("h.getHp()="+h.getHp());
//    	MyFunction f = (Hero) -> {return "hpは" + h.getHp() + "です";};
//    	int a = h.getHp();
//    	System.out.println(f.call(a));
    	MyFunction func = Main::sub;
    	String a = func.call(h,"計算の結果、");
    	System.out.println(a);

//今のところ、ポイントは３つ。
//12行目、public static String sub(Hero a, String b)のリターン型と引数、
//27行目、String a = func.call(h,"計算の結果、")のリターン型と引数、
//MyFunction.javaのString call(Hero a, String b)のリターン型と引数、を揃える
    }
}