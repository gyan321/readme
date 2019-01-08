package com.training.hashmap;
import java.util.HashMap;
import java.util.Map;

public class HashMapObject {

	public static void main(String[] args) {
		Employee e1=new Employee(102, "Archana");
		Employee e2=new Employee(102, "Tarun");
		Employee e3=new Employee(106, "Jagdesh");
		 

		HashMap<Employee,String> empHasMapObject=new HashMap<>();
		empHasMapObject.put(e1, "Developer");
		empHasMapObject.put(e2, "Developer");
		empHasMapObject.put(e3, "Developer");

		for(Map.Entry<Employee,String> entry :empHasMapObject.entrySet())
		{
			System.out.println(entry.getKey()+"....."+entry.getValue()); 
		}
		//System.out.println(empHasMapObject.get(e3));
		//e3.setEmpId(123);

		//System.out.println(empHasMapObject.get(e3));  


	}

}
