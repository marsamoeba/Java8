package chapter11;

/**
 * p253 使用同步方法
 * @author marsamoeba
 *
 */
class Callme {
	void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
			e.printStackTrace();
		}
		 System.out.println("]");
	}
}

class Synch {

}
