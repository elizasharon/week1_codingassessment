package com.bawarchi.model;

public class Dish implements Comparable<Dish>{
	
	
	private int id;
	private String name;
	private double calories;
	private double price;
	
	
	
	public Dish(int id,String name,double calories,double price)
	{
		this.calories=calories;
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	
	
	
	@Override
	public int compareTo(Dish o) {
		
		return Integer.valueOf(this.id).compareTo(o.id);
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(this==obj)
		{
			return true;
		}
		
		if(!(obj instanceof Dish) || obj==null)
		{
			return false;
		}
		
		Dish d= (Dish) obj;
		
		if(d.id==this.id)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getCalories() {
		return calories;
	}




	public void setCalories(double calories) {
		this.calories = calories;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}
	
	public void getDish()
	{
		System.out.println("name: "+this.getName());
		System.out.println("Price: "+this.getPrice());
		System.out.println("calories: "+this.getCalories());
		System.out.println("id: "+this.getId());
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	





	


	


















	

}
