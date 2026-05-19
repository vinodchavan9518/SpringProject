package com.vinod.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vinod.sbeans.DayFind;


public class DendencyDayTest {
	void main()
	{
		
		
		 ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/vinod/ctgs/Compile.xml");
          
           DayFind find=ctx.getBean("sf",DayFind.class);
		 
		 String msg=find.showDayName();
		 IO.println("Day name::"+msg);
	}

}
