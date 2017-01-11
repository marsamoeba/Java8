package chapter09.MyPack;

/**
 * p195 一个简单的包的示例
 * @author marsamoeba
 *
 */
class Balance {
	String name;
	double bal;
	
	Balance(String n, double b) {
		name = n;
		bal = b;
	}
	
	void show() {
	    if(bal<0) 
	    	System.out.print("-->> ");
	    System.out.println(name + ": $" + bal);
	}
}
class AccontBalance {
	
}
