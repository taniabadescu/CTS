package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class Reader {
	
	protected String fileName;
	public abstract List<Aplicant> readAplicants() throws FileNotFoundException;
	
	public Reader(String fileName) {
		super();
		this.fileName = fileName;
	}
}
