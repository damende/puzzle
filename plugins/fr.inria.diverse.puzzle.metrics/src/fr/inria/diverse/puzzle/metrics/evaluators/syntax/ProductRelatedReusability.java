package fr.inria.diverse.puzzle.metrics.evaluators.syntax;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

public class ProductRelatedReusability {

	public static String evaluateForSyntax(ArrayList<EPackage> ePackages){
		String values = "";
		double SoSC = SizeOfCommonality.evaluateForSyntax(ePackages);
		boolean first = true;
		for (EPackage ePackage : ePackages) {
			double currentValue = (SoSC / countConstructs(ePackage))*100;
			if(!first)
				values +=  ",";
			values += currentValue;
			first = false;
		}
		
		return values;
	}
	
	public static String evaluateForSemantics(ArrayList<EPackage> ePackages){
		//TODO Do something!
		String values = "";
		double SoSC = SizeOfCommonality.evaluateForSyntax(ePackages);
		boolean first = true;
		for (EPackage ePackage : ePackages) {
			double currentValue = (SoSC / countConstructs(ePackage))*100;
			if(!first)
				values +=  ",";
			values += currentValue;
			first = false;
		}
		
		return values;
	}
	
	private static double countConstructs(EPackage ePackage){
		double count = ePackage.getEClassifiers().size();
		
		for (EPackage eSubPackage : ePackage.getESubpackages()) {
			count += countConstructs(eSubPackage);
		}
		
		return count;
	}
	
	public static String getVariablesDeclaration(ArrayList<EPackage> ePackages){
		String answer = "var barProductRelatedReusability = {\n";
		
		boolean first = true;
		String labels = "";
		for (EPackage ePackage : ePackages) {
			if(!first) labels += ",";
			labels += "\"" + ePackage.getName() + "\"";
			first = false;
		}
		
		answer += "   labels : [" + labels + "],\n";
		answer += "   datasets : [\n";
		answer += "     {\n";
		answer += "        fillColor : \"rgba(220,220,220,0.5)\",\n";
		answer += "        strokeColor : \"rgba(220,220,220,0.8)\",\n";
		answer += "        highlightFill: \"rgba(220,220,220,0.75)\",\n";
		answer += "        highlightStroke: \"rgba(220,220,220,1)\",\n";
		answer += "        data : [" + evaluateForSyntax(ePackages) + "]\n";
		answer += "      },\n";
		answer += "      {\n";
		answer += "        fillColor : \"rgba(151,187,205,0.5)\",\n";
		answer += "        strokeColor : \"rgba(151,187,205,0.8)\",\n";
		answer += "        highlightFill : \"rgba(151,187,205,0.75)\",\n";
		answer += "        highlightStroke : \"rgba(151,187,205,1)\",\n";
		answer += "        data : [" + evaluateForSemantics(ePackages) + "]\n"; 
		answer += "      }\n";
		answer += "    ]\n";
		answer += "};\n";
		
		return answer;
	}
	
	public static String getWindow(){
		String answer = "    var ctxProductRelatedReusability = document.getElementById(\"pie-product-reusability\").getContext(\"2d\");\n";
		answer += "    window.myBarProductReusability = new Chart(ctxProductRelatedReusability).Bar(barProductRelatedReusability, {\n";
		answer += "       responsive : false\n";
		answer += "    });\n\n";
		return answer;
	}
}