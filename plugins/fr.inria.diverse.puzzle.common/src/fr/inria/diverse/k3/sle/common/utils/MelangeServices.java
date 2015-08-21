package fr.inria.diverse.k3.sle.common.utils;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.melange.metamodel.melange.Language;

public class MelangeServices {

	public static ArrayList<EPackage> getEPackagesByALanguagesList(ArrayList<Language> languages){
		ArrayList<EPackage> ePackages = new ArrayList<EPackage>();
		for (Language language : languages) {
			if(language.getSyntax() != null){
				EPackage currentPackage = ModelUtils.loadEcoreResource(language.getSyntax().getEcoreUri());
				ePackages.add(currentPackage);
			}
		}
		return ePackages;
	}
}
