package pachet1;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zoo zoo= new Zoo();
		Girafa g1= new Girafa("Gigi");
		Girafa g2= new Girafa("Mimi");
		
		zoo.AdaugaAnimal(g1);
		zoo.AdaugaAnimal(g2);
		
		Zebra z1= new Zebra("Zuzu", 2);
		Zebra z2= new Zebra("Lola", 4);
		
		zoo.AdaugaAnimal(z1);
		zoo.AdaugaAnimal(z2);
		 
		
	}

}
