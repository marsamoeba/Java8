package chapter08;

/**
 * p176 创建多级继承层次
 * @author marsamoeba
 *
 */
class Box1 {
	double width;
	double height;
	double depth;
	
	Box1(Box1 ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	Box1(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	Box1() {
		width = -1;
		height = -1;
		depth = -1;
	}
	
	Box1(double len) {
		width = height = depth = len;
	}
	
	double volume() {
		return width * height * depth;
	}
}

class BoxWeight2 extends Box1 {
double weight;
	
	BoxWeight2(BoxWeight2 ob) {
		super(ob);
		weight = ob.weight;
	}
	
	BoxWeight2(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;
	}
	
	BoxWeight2() {
		super();
		weight = -1;
	}
	
	BoxWeight2(double len, double m) {
		super(len);
		weight = m;
	}
}

class Shipment extends BoxWeight2 {
	double cost;
	Shipment(Shipment ob) {
		super(ob);
		cost = ob.cost;
	}
	Shipment(double w, double h, double d, double m, double c) {
	    super(w, h, d, m); 
	    cost = c;
	}
	Shipment() {
		super();
		cost = -1;
	}
	Shipment(double len, double m, double c) {
	    super(len, m);
	    cost = c;
	}
}

class DemoShipment {
	public static void main(String[] args) {
		Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
	    Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
	    
	    double vol;
	    vol = shipment1.volume();
	    System.out.println("Volume of shipment1 is " + vol);
	    System.out.println("Weight of shipment1 is " + shipment1.weight);
	    System.out.println("Shipping cost: $" + shipment1.cost);
	    System.out.println();
	    
	    vol = shipment2.volume();
	    System.out.println("Volume of shipment2 is " + vol);
	    System.out.println("Weight of shipment2 is " + shipment2.weight);
	    System.out.println("Shipping cost: $" + shipment2.cost);
	}
}
