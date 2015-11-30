package edu.iut.app;

import java.util.ArrayList;

public class CriteriaFunctionJury implements Criteria {

	public ArrayList<ExamEvent> meetCriteria(ArrayList<ExamEvent> jury){
		ArrayList<ExamEvent> juryPersons = new ArrayList<ExamEvent>(); 
	      
	      for (ExamEvent person : jury) {
	         if(person.getPerson().toString().equalsIgnoreCase("JURY")){
	            juryPersons.add(person);
	         }
	      }
	     return juryPersons;
   }
}
	

