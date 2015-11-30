package edu.iut.app;

import java.util.ArrayList;
import java.util.Date;

public class CriteriaAVenir implements Criteria {

	public ArrayList<ExamEvent> meetCriteria(ArrayList<ExamEvent> dates){
		ArrayList<ExamEvent> aVenir = new ArrayList<ExamEvent>(); 
	      
	      for (ExamEvent d : dates) {
	         if(d.getDate().after(new Date())){
	            aVenir.add(d);
	         }
	      }
	     return aVenir;
   }
}
