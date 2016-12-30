package chapter07;

/**
 * p135 Box类
 * @author marsamoeba
 *
 */
public class Box {
	double width;
	double height;
	double depth;
	
	Box(double w, double h, double d) {
		width = w;
	    height = h;
	    depth = d;
	}
	
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}
	
	Box(double len) {
		width = height = depth = len;
	}
	
	double volume() {
		return width * height * depth;
	}

}
