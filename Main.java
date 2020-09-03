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
    public static void main(String[] args) {
    	Hero h = new Hero();
    	MyFunction func = (Hero a, String b) -> {return b+a.getHp()+"の二乗は"+(a.getHp())*(a.getHp());};	/*(Hero a, String b)のHero引数がここが躓いたところ。*/
    	String a = func.call(h,"計算の結果は、");
    	System.out.println(a);
    }
}
