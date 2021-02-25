package clase;

public class Zebra extends Animal {
	private int varsta;

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public Zebra(String name,int varsta) {
		super(name);
		this.varsta = varsta;
	}
	
	

}
