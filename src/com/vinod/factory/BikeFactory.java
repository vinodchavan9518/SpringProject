package com.vinod.factory;

import com.vinod.comps.Bike;
import com.vinod.comps.BulletBike;
import com.vinod.comps.ElectricBike;
import com.vinod.comps.SportSBike;
import com.vinod.comps.StandardBike;

public class BikeFactory {
	
	//static factory method having factory pattern logic
	public static Bike orderBike(String type)
	{
	        Bike bike=null;
		if(type.equalsIgnoreCase("standard"))
			bike=(Bike) new StandardBike();
		else if(type.equalsIgnoreCase("sports"))
			bike=(Bike) new SportSBike();
		else if(type.equalsIgnoreCase("Electric"))
			bike=(Bike) new ElectricBike();
		else if(type.equalsIgnoreCase("bullet"))
			 bike=(Bike) new BulletBike();
		else
			
			throw new IllegalArgumentException("Invaild bike Type");
		return bike;
	}

}
