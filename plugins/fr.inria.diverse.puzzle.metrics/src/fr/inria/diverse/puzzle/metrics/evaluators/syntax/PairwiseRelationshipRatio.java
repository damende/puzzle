package fr.inria.diverse.puzzle.metrics.evaluators.syntax;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.utils.EcoreQueries;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class PairwiseRelationshipRatio {

	public static String evaluate(ArrayList<Language> languages){
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		String result = "";
		
		for (EPackage ePackageI : ePackages) {
			for (EPackage ePackageJ : ePackages) {
				if(!ePackageI.getName().equals(ePackageJ.getName())){
					double currentValue = ((double)EcoreQueries.getIntersection(ePackageI, ePackageJ).size()) / ((double)EcoreQueries.getUnion(ePackageI, ePackageJ).size());
					
					result += "  - " + ePackageI.getName() + " vs " + ePackageJ.getName() + ": " + currentValue + " (" + EcoreQueries.getIntersection(ePackageI, ePackageJ).size() + ", "+ EcoreQueries.getUnion(ePackageI, ePackageJ).size() + ")" + "\n";
				}
			}
		}
		return result;
	}
	
	public static String getVariablesDeclaration(ArrayList<Language> languages){
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		String answer = "";
		for (EPackage ePackageI : ePackages) {
			answer += "var barRelationshipRatio" + ePackageI.getName() + " = {\n";
			
			String labels = "";
			String dataForSyntax = "";
			String dataForSemantics = "";
			boolean first = true;
			for (EPackage ePackageJ : ePackages) {
				if(!ePackageI.getName().equals(ePackageJ.getName())){
					double currentValue = (((double)EcoreQueries.getIntersection(ePackageI, ePackageJ).size()) / ((double)EcoreQueries.getUnion(ePackageI, ePackageJ).size()))*100;
					
					if(!first) labels += ",";
					labels += "\"" + ePackageJ.getName() + "\"";
					
					if(!first){
						dataForSyntax +=  ",";
						dataForSemantics +=  ",";
					}
					dataForSyntax += currentValue;
					dataForSemantics += currentValue; //TODO Do something!
					first = false;
					
				}
			}
			
			answer += "   labels : [" + labels + "],\n";
			answer += "   datasets : [\n";
			answer += "     {\n";
			answer += "        fillColor : \"rgba(220,220,220,0.5)\",\n";
			answer += "        strokeColor : \"rgba(220,220,220,0.8)\",\n";
			answer += "        highlightFill: \"rgba(220,220,220,0.75)\",\n";
			answer += "        highlightStroke: \"rgba(220,220,220,1)\",\n";
			answer += "        data : [" + dataForSyntax + "]\n";
			answer += "      },\n";
			answer += "      {\n";
			answer += "        fillColor : \"rgba(151,187,205,0.5)\",\n";
			answer += "        strokeColor : \"rgba(151,187,205,0.8)\",\n";
			answer += "        highlightFill : \"rgba(151,187,205,0.75)\",\n";
			answer += "        highlightStroke : \"rgba(151,187,205,1)\",\n";
			answer += "        data : [" + dataForSemantics + "]\n"; 
			answer += "      }\n";
			answer += "    ]\n";
			answer += "};\n";
		}
		
		return answer;
	}
	
	public static String getWindow(ArrayList<Language> languages){
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		String answer = "";
		for (EPackage ePackageI : ePackages) {
			answer += "    var ctxRelationshipRatio" + ePackageI.getName() + " = document.getElementById(\"pie-relationship-ratio-" + ePackageI.getName() + "\").getContext(\"2d\");\n";
			answer += "    window.window.window.myBarRelationshipRatio" + ePackageI.getName() + " = new Chart(ctxRelationshipRatio" + ePackageI.getName() + ").Bar(barRelationshipRatio" + ePackageI.getName() + ", {\n";
			answer += "       responsive : false\n";
			answer += "    });\n\n";
		}
		return answer;
	}
	
	public static String getTables(ArrayList<Language> languages){
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		String answer = "";
		char index = 'a';
		for (EPackage ePackageI : ePackages) {
			answer += "                <table align=\"center\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" style=\"width:500px;\">\n";
			answer += "                    <tbody>\n";
			answer += "                        <tr>\n";
			answer += "                            <td style=\"text-align: center;\">\n";
			answer += "                                <div id=\"canvas-relationship-ratio-" + ePackageI.getName() + "\" width=\"150\" height=\"150\">\n";
			answer += "                                    <canvas id=\"pie-relationship-ratio-" + ePackageI.getName() + "\" width=\"450\" height=\"200\"/>\n";
			answer += "                                </div>\n";
			answer += "                            </td>\n";
			answer += "                        </tr>\n";
			answer += "                        <tr>\n";
			answer += "                            <td style=\"text-align: center;\">\n";
			answer += "                                <span style=\"font-family:lucida sans unicode,lucida grande,sans-serif;font-size:11px;\">\n";
			answer += "                                    <strong>Figure 7" + index + ".</strong></br>\n";
			answer += "                                    Pair-wise Relationship Ratio for " + ePackageI.getName() + "</br>\n";
			answer += "                                    ----\n";
			answer += "                                </span>\n";
			answer += "                            </td>\n";
			answer += "                        </tr>\n";
			answer += "                    </tbody>\n";
			answer += "                </table>\n";
			
			index++;
		}
		return answer;
	}
}
