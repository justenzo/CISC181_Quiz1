
public class Logic {
	private String name;
	private int R2B;
	private int R3B;
	private int RHR;
	private int RBB;
	private int RR;
	private int RAB;
	private int RH;

	
	//Initialize the instance of this class
	public Logic(String name, int RAB, int RH, int R2B,int R3B, int RHR,int RR, int RBB) {
		this.name=name;
		this.R2B=R2B;
		this.R3B=R3B;
		this.RBB=RBB;
		this.RAB=RAB;
		this.RH=RH;
		this.RR=RR;
		this.RHR=RHR;
	}
		
	
	public double BA() {
		int a=this.RH+this.R2B+2*this.R3B+3*this.RHR;
		return (double) a/RAB;
	}

	public double SLG() {
		return (double)(2*this.R2B+3*this.R3B+4*this.RHR)/this.RAB;
	}
	
	public double OBS() {
		return (double) OBP()+SLG();
	}
	public double OBP() {
		return (double)(this.RH+this.RBB)/(this.RAB+this.RBB);
	}
	
	public int TB() {
		return this.RH+this.R2B+2*this.R3B+3*this.RHR;
	}
	
	
}
