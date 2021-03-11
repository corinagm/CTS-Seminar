package ro.ase.cts.program;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.IReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	private static List<Aplicant> citesteAplicanti(IReader readAplicanti) throws FileNotFoundException {
		return readAplicanti.readAplicanti();
	}

	public static void main(String[] args) {
		
		System.out.println("Suma finantata pentru angajati este: "+ Angajat.getSumaFinantare());
		System.out.println("Suma finantata pentru studenti este: "+ Student.getSumaFinantare());
		System.out.println("Suma finantata pentru elevi este: "+ Elev.getSumaFinantare());
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new AngajatiReader("angajati.txt"));
			Proiect proiect=new Proiect(81);
			for(Aplicant aplicant:listaAplicanti)
				{
				System.out.println(aplicant.toString());				
				System.out.println(aplicant);
				
				aplicant.afisareRaspunsProiect(proiect);
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
