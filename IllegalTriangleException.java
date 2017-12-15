/*
 * Author: Chris Battisto
 * File: IllegalTriangleException.java
 * Date: 4/8/2015
 * Descr:
 * This class tells which sides are incorrect
 */
public class IllegalTriangleException extends Exception {
	private double side1;
	private double side2;
	private double side3;
	
	public IllegalTriangleException(double side1, double side2, double side3) {
		super("Illegal Triangle Exception:" + side1 + " and "+  side2 + " is less than "+side3);
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
}