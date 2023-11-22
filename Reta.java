package prog2_lista1;

public class Reta {
	private double linear; //x é p linear 
	private double angular; //y é o angular
	
	public Reta( double linear, double angular) {
		this.linear = linear;
		this.angular = angular;
		
	}

	public double getLinear() {
		return linear;
	}

	public void setLinear(double linear) {
		this.linear = linear;
	}

	public double getAngular() {
		return angular;
	}

	public void setAngular(double angular) {
		this.angular = angular;
	}
	
	public boolean pertence(double x , double y) {
		if (y == angular * x + linear) {
			return true;
		} 
		return false;
	}
	public boolean interseptar(Reta r) {//outro objeto reta
		if(angular == r.getAngular()) {
			System.out.println("Paralelas");
			return false;
		} else {
			double x, y;
			x = (r.getLinear() - linear) / (angular - r.getAngular());		
			y = (angular*x+linear);
			System.out.println(" " + x + " " + y);
		} 
		return true;
	}

		public String toString() {
		return "y = " + linear + " + " + angular; 
	}

}
