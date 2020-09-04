package practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    	List<Hero> list = new ArrayList<>();
    	for(int i=0; i<100000; i++) {
    		list.add(new Hero("red"));
    		list.add(new Hero("blue"));
    		list.add(new Hero("yellow"));
    		list.add(new Hero("black"));
    	}
		list.stream().forEach(a -> a.sleep()); /*15秒*/

		for (Hero hero : list) { /*確かにこっちのほうが少し速い。14秒*/
			hero.sleep();
		}

    }
}
