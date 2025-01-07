package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5 {

	public static void main(String[] args) {

		/* This is the code to list top 5 populated countries in the world. Using list
		 * collection interface print the 2nd country.
		 */

		List<String> populatedCountries = new ArrayList<String>();
		populatedCountries.add("India");
		populatedCountries.add("China");
		populatedCountries.add("United States");
		populatedCountries.add("Indonesia");
		populatedCountries.add("Pakistan");

		System.out.println("****************************************");
		System.out.println("1.Second most populated country:" + populatedCountries.get(1));
		System.out.println("****************************************");

		/*This is the code to store the top 10 tourist attractions in the world using
		 * hashset collection interface and to print the size
		 */

		Set<String> touristPlaces = new HashSet<String>();
		touristPlaces.add("Taj Mahal");
		touristPlaces.add("Red Fort");
		touristPlaces.add("Eiffel Tower");
		touristPlaces.add("THe Great Wall of China");
		touristPlaces.add("London Bridge");
		touristPlaces.add("Colosseum");
		touristPlaces.add("Machu Picchu");
		touristPlaces.add("Atlai Mountains");
		touristPlaces.add("Sydney Opera House");
		touristPlaces.add("Great Barrier Reef");

		System.out.println("****************************************");
		System.out.println("2.The size of the most visit tourist attractions:" + touristPlaces.size());
		System.out.println("****************************************");

		/* This code to store the 5 largest cities in the united states using map collection interface and its
		 * populations using map collection interface
		 */
		 
		Map<String,String> largestCities = new HashMap<String,String>();
		largestCities.put("New York","8,804,190");
		largestCities.put("Los Angeles","3,820,914");
		largestCities.put("Chicago","2,664,452");
		largestCities.put("Houston","2,314,157");
		largestCities.put("Phoenix","1,650,070");
		
		System.out.println("****************************************");
		System.out.println("3.The 5 largest cities of United States:"+ largestCities);
		System.out.println("****************************************");
		
		
		/* This code is to store the array of 10 random integers and 
		 * to print the sum of 3rd and 5th value
		 */
		
		int [] randomNumbers= new int [] {2,6,8,9,3,4,7,1,5,10};
		int sum=randomNumbers[2]+randomNumbers[4];
		
		System.out.println("****************************************");
		System.out.println("4.Sum is:"+sum);
		System.out.println("****************************************");
		
		
		/* This code is to store top 5 highest-grossing movies of all time using list interface and 
		 * to print out 3rd movie in the list
		 */

		List<String> moviesList = new ArrayList<String>();
		moviesList.add("Pushpa 2");
		moviesList.add("Amaran");
		moviesList.add("Baasha");
		moviesList.add("Padaiyappa");
		moviesList.add("Annamalai");
		
		System.out.println("****************************************");
		System.out.println("5.The third movie in the list:"+moviesList.get(2));
		System.out.println("****************************************");
	}

}
