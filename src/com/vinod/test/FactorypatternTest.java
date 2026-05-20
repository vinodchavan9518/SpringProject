package com.vinod.test;

import com.vinod.comps.Bike;
import com.vinod.factory.BikeFactory;

public class FactorypatternTest {
	void main()
	{
		Bike bike=BikeFactory.orderBike("standard");
		bike.drive();
		IO.println("=========================");
		Bike bike1=BikeFactory.orderBike("sports");
		bike1.drive();
		IO.println("===========================");
		Bike bike2=BikeFactory.orderBike("electric");
		bike2.drive();
		IO.println("===================");
		Bike bike3=BikeFactory.orderBike("Bullet");
		bike3.drive();
		
	}

}
