package com.bawarchi.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import com.bawarchi.comparators.CaloriesGTComparator;
import com.bawarchi.comparators.CaloriesLTComparator;
import com.bawarchi.comparators.PriceGTComparator;
import com.bawarchi.comparators.PriceLTComparator;

public class Interact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Dish> items= new ArrayList<Dish>();
		Dish dish;
		dish=new Dish(1,"dosa",300,50);
		items.add(dish);
		dish=new Dish(2,"Idli-Vada",200,40);
		items.add(dish);
		dish=new Dish(3,"Pulav",330,80);
		items.add(dish);
		dish=new Dish(4,"Roti-Curry",300,250);
		items.add(dish);
		dish=new Dish(5,"Neer-Dosa",300,100);
		items.add(dish);
		
		Collections.sort(items,new CaloriesGTComparator());
			Iterator<Dish> it = items.iterator(); 
		
			//System.out.println("List elements : ");
			/*while(it.hasNext())
				{
				Dish temp=it.next();
				System.out.println(temp.getCalories());
				}
			*/
		
		System.out.println("=================Welcome=====================");
		System.out.println("Please choose from the below options ");
		System.out.println("1 => To sort the dishes in the increasing order of calories");
		System.out.println("2 => To sort the dishes in the decreasing order of calories"
				+ "3 => To sort the dishes in the increasing order of price"
				+ " 4 => To sort the dishes in the decreasing order of price ");
		System.out.println(" ===============================================");
		
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		sc.nextLine();
		
		if(input==1)
		{
			Collections.sort(items,new CaloriesGTComparator());
			while(it.hasNext())
			{
			Dish temp=it.next();
			temp.getDish();
			}
			
			
		}
		
		else if(input==2)
		{
			Collections.sort(items,new CaloriesLTComparator());
			while(it.hasNext())
			{
			Dish temp=it.next();
			temp.getDish();
			}
			
		}
		
		else if(input==3)
		{
			Collections.sort(items,new PriceGTComparator());
			while(it.hasNext())
			{
			Dish temp=it.next();
			temp.getDish();
			}
		}
		else
		{
			Collections.sort(items,new PriceLTComparator());
			while(it.hasNext())
			{
			Dish temp=it.next();
			temp.getDish();
			}
		}
		
		it = items.iterator(); 
		
		System.out.println("enter the dish id");
		int id=sc.nextInt();
		sc.nextLine();
		int flag=0;
		Dish temp=null;
		while(it.hasNext() && flag==0)
		{
			temp=it.next();
				if(temp.getId()==id)
						{
							flag=1;
						}
		}
		
		if(flag==0)
		{
			System.out.println("No item is selected");
		}
		else
		{
			System.out.println("you have selected "+temp.getName());
			System.out.println("Please enter your name: ");
			String name=sc.nextLine();
			System.out.println("Please pay the bill of Rs "+temp.getPrice());
			double price=sc.nextDouble();
			
			if(price==temp.getPrice())
			{
				System.out.println(" ========Thanks for your order. ================");
			}
			else if(price>temp.getPrice())
			{
				System.out.println(" ========Thanks for your order. Please collect the change = Rs " + (price-temp.getPrice()));
			}
			else
			{
				System.out.println(" ========Amount paid is less than Bill Amount ================");
			}
		}
		

	}

}
