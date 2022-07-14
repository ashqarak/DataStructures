package com.practice.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MinimumDistance {

	public static void main(String[] args) {
		Location location = new Location();
		List list = new ArrayList();
		
		Map<Location, Boolean> loc = new HashMap<Location, Boolean>();
		loc.put(location.gym, true);
		loc.put(location.mall, false);
		loc.put(location.office, false);
		
		list.add(loc);
		
		Map<Location, Boolean> loc1 = new HashMap<Location, Boolean>();
		loc1.put(location.gym, false);
		loc1.put(location.mall, true);
		loc1.put(location.office, false);
		
		list.add(loc1);
		
		Map<Location, Boolean> loc2 = new HashMap<Location, Boolean>();
		loc2.put(location.gym, true);
		loc2.put(location.mall, false);
		loc2.put(location.office, true);
		
		list.add(loc2);
		
		Map<Location, Boolean> loc3 = new HashMap<Location, Boolean>();
		loc3.put(location.gym, false);
		loc3.put(location.mall, false);
		loc3.put(location.office, true);
		
		list.add(loc3);
		
		Map<Location, Boolean> loc4 = new HashMap<Location, Boolean>();
		loc4.put(location.gym, true);
		loc4.put(location.mall, false);
		loc4.put(location.office, false);
		
		list.add(loc4);
		
		int distance = findDistance(list);
		System.out.println(distance);
	}

	@SuppressWarnings("unlikely-arg-type")
	private static int findDistance(List<Location> list) {
		
		Location [] array = (Location[]) list.toArray();
		int differenceBetweenGymAndSchool =  0;
		int	differenceBetweenGymAndStore = 0;
		int differenceBetweenStoreAndSchool = 0;
		
		for(int i = 0; i < array.length; i++) {
			Location location = array[i];
			if(Objects.equals(true, location.gym) && Objects.equals(true, location.mall) && Objects.equals(true, location.office)) {
				return i;
			}
			
			
		}
			return 	differenceBetweenGymAndSchool;
			
		}
		
	}
	


