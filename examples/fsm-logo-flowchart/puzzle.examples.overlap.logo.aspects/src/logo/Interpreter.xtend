package logo

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import kmLogo.KmLogoPackage
import kmLogo.LogoProgram

import static extension logo.LogoProgramAspect.*
import java.util.Hashtable
import java.util.ArrayList

class Interpreter {

	new() {
	}

	def eval(String modelPath) {
		var fact = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(KmLogoPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(KmLogoPackage.eNS_URI, KmLogoPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);

		var rs = new ResourceSetImpl()

		var uri = URI.createFileURI(modelPath);
		var res = rs.getResource(uri, true);
		var LogoProgram logo = res.contents.get(0) as LogoProgram
		var Hashtable<String, Object> context = new Hashtable<String, Object>()
		var Turtle turtle = new Turtle()
		context.put('turtle', turtle)
		var ArrayList<Hashtable<String,Integer>> stack = new ArrayList<Hashtable<String,Integer>>()
		context.put('stack', stack)
		logo.eval(context)
	}
	
	def static void main(String[] args){
		(new Interpreter()).eval('models/SimpleLogo.xmi')
	}
}
