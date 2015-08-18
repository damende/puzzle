package fr.inria.diverse.k3.sle.common.utils;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.vos.ConceptMemberVO;
import fr.inria.diverse.k3.sle.common.vos.ConceptMembersGroupVO;
import fr.inria.diverse.k3.sle.common.vos.ModuleConceptsVO;


public class FamiliesServices {
	
	private static FamiliesServices instance;
	
	private FamiliesServices(){}

	public static FamiliesServices getInstance(){
		if(instance == null){
			instance = new FamiliesServices();
		}
		return instance;
	}
	
	public ArrayList<ConceptMemberVO> getConceptMemberMappingList(ArrayList<EPackage> ePackages){
		ArrayList<ConceptMemberVO> conceptMemberList = new ArrayList<ConceptMemberVO>();
		for (EPackage ePackage : ePackages) {
			this.fillConceptMemberList(conceptMemberList, ePackage, ePackage.getName());
		}
		
		System.out.println("Step 1");
		for (ConceptMemberVO conceptMemberVO : conceptMemberList) {
			System.out.println(conceptMemberVO);
		}
		
		return conceptMemberList;
	}
	
	public ArrayList<ConceptMembersGroupVO> getConceptMemberGroupList(ArrayList<ConceptMemberVO> conceptMemberList){
		ArrayList<ConceptMembersGroupVO> conceptMemberGroupList = new ArrayList<ConceptMembersGroupVO>();
		for (ConceptMemberVO conceptMemberVO : conceptMemberList) {
			ConceptMembersGroupVO conceptMemberGroupLegacy = getConceptMemberGroup(conceptMemberGroupList, conceptMemberVO);
			if(conceptMemberGroupLegacy == null){
				ConceptMembersGroupVO conceptMemberGroupVO = new ConceptMembersGroupVO(conceptMemberVO.getConcept());
				conceptMemberGroupVO.getMemberGroup().add(conceptMemberVO.getMemberName());
				conceptMemberGroupList.add(conceptMemberGroupVO);
			}else{
				conceptMemberGroupLegacy.getMemberGroup().add(conceptMemberVO.getMemberName());
			}
		}
		System.out.println("Step 2");
		for (ConceptMembersGroupVO conceptMembersGroupVO : conceptMemberGroupList) {
			System.out.println(conceptMembersGroupVO);
		}
		
		return conceptMemberGroupList;
	}
	
	public ArrayList<ModuleConceptsVO> obtainConceptsOwenerLanguagesList(ArrayList<EPackage> ePackages){
		// Step 1: Scan the metamodels creating the concept-member list.
		ArrayList<ConceptMemberVO> conceptMemberList = this.getConceptMemberMappingList(ePackages);
		
		// Step 2: For each concept, get the group of members it belongs.
		ArrayList<ConceptMembersGroupVO> conceptMemberGroupList = this.getConceptMemberGroupList(conceptMemberList);
		
		ArrayList<ModuleConceptsVO> moduleConceptsList = new ArrayList<ModuleConceptsVO>();
		int i = 1;
		for (ConceptMembersGroupVO conceptMembersGroupVO : conceptMemberGroupList) {
			ModuleConceptsVO legacyModule = getLegacyFeature(moduleConceptsList, conceptMembersGroupVO);
			if(legacyModule == null){
				ModuleConceptsVO newModule = new ModuleConceptsVO("module" + i, conceptMembersGroupVO.getMemberGroup().toString());
				newModule.getConcepts().add(conceptMembersGroupVO.getConcept());
				moduleConceptsList.add(newModule);
				i++;
			}else{
				legacyModule.getConcepts().add(conceptMembersGroupVO.getConcept());
			}
		}
		
		System.out.println("Step 3");
		for (ModuleConceptsVO moduleConceptsVO : moduleConceptsList) {
			System.out.println(moduleConceptsVO);
		}
		
		return moduleConceptsList;
	}
	
	private void fillConceptMemberList(ArrayList<ConceptMemberVO> conceptMemberList, 
			EPackage ePackage, String memberName) {
		for (EClassifier concept : ePackage.getEClassifiers()) {
			ConceptMemberVO conceptMember = new ConceptMemberVO(concept, memberName);
			conceptMemberList.add(conceptMember);
		}
		for (EPackage subPackage : ePackage.getESubpackages()) {
			this.fillConceptMemberList(conceptMemberList, subPackage, memberName);
		}
	}
	
	private ConceptMembersGroupVO getConceptMemberGroup(ArrayList<ConceptMembersGroupVO> conceptMemberGroupList,
			ConceptMemberVO conceptMemberVO) {
		for (ConceptMembersGroupVO conceptMembersGroupVO : conceptMemberGroupList) {
			if(conceptMembersGroupVO.getConcept().getName().equals(conceptMemberVO.getConcept().getName()))
				return conceptMembersGroupVO;
		}
		return null;
	}
	
	private ModuleConceptsVO getLegacyFeature(
			ArrayList<ModuleConceptsVO> featureConceptsList,
			ConceptMembersGroupVO conceptMembersGroupVO) {
		for (ModuleConceptsVO featureConceptsVO : featureConceptsList) {
			if(featureConceptsVO.getMembers().equals(conceptMembersGroupVO.getMemberGroup().toString()))
				return featureConceptsVO;
		}
		return null;
	}
}