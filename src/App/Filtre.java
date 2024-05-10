package App;

import java.io.File;
import java.io.FilenameFilter;

class Filtre implements FilenameFilter {
	 private char lettre;
	 
	 public Filtre(char lettreDébut) {
	 lettre = lettreDébut;
	 }
	 public boolean accept(File repFiltre, String nom) {
	return	lettre==nom.charAt(0);
	 }
	}
