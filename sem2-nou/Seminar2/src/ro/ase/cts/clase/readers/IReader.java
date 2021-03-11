package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

import java.util.Scanner;;

public abstract class IReader {
    protected String numeFisier;

    public IReader(String numeFisier) {
        this.numeFisier = numeFisier;
    }
    
    public void citireAplicant(Scanner input, Aplicant aplicant)
    {
    	  String nume = input.next();
          String prenume = (input.next()).toString();
          int varsta = Integer.valueOf(input.nextInt());
          int punctaj = Integer.valueOf(input.nextInt());
          int nr = Integer.valueOf(input.nextInt());
          String[] vect = new String[5];
          for (int i = 0; i < nr; i++)
              vect[i] = input.next();
          
          aplicant.setNume(nume);
          aplicant.setPrenume(prenume);
          aplicant.setVarsta(varsta);
          aplicant.setPunctaj(punctaj);
          aplicant.setNr_proiecte(nr);
          aplicant.setVectorDenumiri(vect, nr);
         
    	
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException, NumberFormatException;
}
