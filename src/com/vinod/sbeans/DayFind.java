package com.vinod.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


	
	@Component("sf")
	public class DayFind {
		
		private LocalDate date;
		
		public  DayFind() {
			IO.println("DayFind:0-param constructor");
			
			
		}
	    @Autowired
		public void setDate(LocalDate date) {
			IO.println("DayFind.setDate()");
			this.date = date;
		}
		    public String showDayName()
		    {
		    	IO.println("DayFind.showDayName()");
		    	int day=date.getMonthValue();
		    	
		    	if(day>=1 && day<=3)
		    		return "Holiday";
		    	else if(day>=4&& day<=6)
		    		return "Work Day";
		    	else
		    		return "Meeting";
		    }
	    
		
		
		

	}





