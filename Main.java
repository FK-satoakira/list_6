package practice;

public class Main {
    public static void main(String[] args) {
    	FuncList funclist = new FuncList();
    	Func1 func1 = FuncList::isOdd;
    	Func2 func2 = funclist::addNamePrefix;
    	System.out.println(func1.call(3));
    	System.out.println(func2.call(func1.call(2), "yamada"));
    }
}