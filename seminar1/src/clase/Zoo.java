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
	
	this.animalList=new ArrayList<>();
	this.zookeeper=new Zookeeper("Ion");
}

public void AdaugaAnimal(Animal animal)
{
	animalList.add(animal);
}

public void addAnimal(Animal animal)
{
	animalList.add(animal);
}
public void feedAnimal()
{
	for(Animal a : animalList) {
		zookeeper.feed(a);
	}
}

}
