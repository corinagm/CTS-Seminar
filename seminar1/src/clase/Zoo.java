package clase;

import java.util.List;
import java.util.ArrayList;

public class Zoo {
private Zookeeper zookeeper;
private List<Animal> animalList;


public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
	super();
	this.zookeeper = zookeeper;
	this.animalList = animalList;
}


public Zoo() {
	zookeeper = new ArrayList<>();
	animalList = (List<Animal>) new Zookeeper("Ion");
}

public void AdaugaAnimal(Animal animal)
{
	
}


}
