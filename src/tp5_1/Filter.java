package tp5_1;

import java.io.File;
import java.io.FilenameFilter;

class Filtre implements FilenameFilter {
	private char lettre;
	public Filtre(char lettreDébut) {
		lettre = lettreDébut;
		}

	@Override
	public boolean accept(File dir, String name) {
		
		return name.startsWith(String.valueOf(this.lettre));
	}

}
