package chapter06;

/**
 * Box类
 * @author marsamoeba
 *
 */
class Box {
	double width;
	double height;
	double depth;
	
//	// BoxDemo3.java
//	void volume() {
//		System.out.print("Volume is ");
//		System.out.println(width * height * depth);
//	}
	
	// BoxDemo4.java
	double volume() {
		return width * height * depth;
	}
	
	// BoxDemo5.java
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// BoxDemo6.java
	Box() {
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}
}
