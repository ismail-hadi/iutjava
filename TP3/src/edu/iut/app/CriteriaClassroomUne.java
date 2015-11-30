package edu.iut.app;

import java.util.ArrayList;

public class CriteriaClassroomUne implements Criteria {

	public ArrayList<ExamEvent> meetCriteria(ArrayList<ExamEvent> classe){
		ArrayList<ExamEvent> classeUne = new ArrayList<ExamEvent>(); 
	      
	      for (ExamEvent c : classe) {
	         if(c.getClassroom().toString().equalsIgnoreCase("1")){
	            classeUne.add(c);
	         }
	      }
	     return classeUne;
   }
}
