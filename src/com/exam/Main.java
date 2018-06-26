package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	int id;
	String name;
	int price;
	int kcal;
	List<Meal> meal = new ArrayList<>();
	

	public Main(){
		readMeal();
		for(Meal m : meal){
			System.out.println(m.getName());
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入餐點: ");
		int id = scanner.nextInt();
		System.out.println("請輸入數量: ");
		int n = scanner.nextInt();
		
	}
	
	
	
	public void start(){
		Scanner scanner = new Scanner(System.in);
		List<Meal> meals;
		for(int i=0;i<meals.size();i++){
			Meal meal = meals.get(i);
			System.out.println(meal.getId()+"\t"+meal.getName()+"\t"+meal.getPrice()+"\t"+meal.getKcal());
		}
		
		int z=-1;
		
		int total = 0;
		while(z!=0){
			System.out.println("請輸入餐點: ");
			//System.out.println("請輸入數量: ");
			String line = scanner.nextLine();
			switch(line){
			case "1":
				Meal meal = meals.get(0);
				System.out.print(meal.getId()+"\t"+meal.getName());
			break;
			case "2":
				Meal meal = meals.get(0);
				System.out.print(meal.getId()+"\t"+meal.getName());
			break;
			case "3":
				Meal meal = meals.get(0);
				System.out.print(meal.getId()+"\t"+meal.getName());
			break;
			case "4":
				Meal meal = meals.get(0);
				System.out.print(meal.getId()+"\t"+meal.getName());
			break;
			case "5":
				Meal meal = meals.get(0);
				System.out.print(meal.getId()+"\t"+meal.getName());
			break;
			case "6":
				Meal meal = meals.get(0);
				System.out.print(meal.getId()+"\t"+meal.getName());
			break;
			case "7":
				Meal meal = meals.get(0);
				System.out.print(meal.getId()+"\t"+meal.getName());
			break;
			case "0":
				Meal meal = meals.get(0);
				System.out.print(meal.getId()+"\t"+meal.getName());
			break;
			case "q":
				
			break;
					
			}
			
			
			
			
		}
	}
	
	
	
	private void readMeal() {
		FileReader fr;
		try {
			fr = new FileReader("menu.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String[] tokens = line.split(",");
			int count = Integer.parseInt(tokens[0]);
			for(int i=0;i<count;i++){
				String name = tokens[i*2+1];
				int price =Integer.parseInt(tokens[i*2+2]);
				int kcal =Integer.parseInt(tokens[i*2+3]);
				m.meals.add(new Meal(i+1,name,price,kcal));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

			//Main m = new Main();
		
	public static void main(String[] args) {
		new Main();
		
	}

}
