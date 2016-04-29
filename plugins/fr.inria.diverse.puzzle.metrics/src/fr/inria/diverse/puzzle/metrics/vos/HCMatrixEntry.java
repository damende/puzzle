package fr.inria.diverse.puzzle.metrics.vos;

public class HCMatrixEntry {

	// ----------------------------------------------
	// Attributes
	// ----------------------------------------------
	
	private HCTreeNode x;
	private HCTreeNode y;
	private double value;
	
	// ----------------------------------------------
	// Constructor
	// ----------------------------------------------
	
	public HCMatrixEntry(HCTreeNode x, HCTreeNode y, double value){
		this.x = x;
		this.y = y;
		this.value = value;
	}
	
	// ----------------------------------------------
	// Methods
	// ----------------------------------------------

	public String toString(){
		return Double.toString(this.value);
	}
	
	// ----------------------------------------------
	// Getters and setters
	// ----------------------------------------------
	
	public HCTreeNode getX() {
		return x;
	}

	public void setX(HCTreeNode x) {
		this.x = x;
	}

	public HCTreeNode getY() {
		return y;
	}

	public void setY(HCTreeNode y) {
		this.y = y;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}