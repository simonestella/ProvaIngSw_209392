package it.simonestella.provaUnitTesting;

import java.util.List;

public class MyListUtil {
	
	public List<Integer> sort(List<Integer> list, int order){  
		
		/*
		 	order = 0 -> Ascendente
            order = 1 -> Discendente
		*/
		
		if (order == 0) {
			for (int i=0; i<list.size()-1; i++) {
				for (int j=i+1; j<list.size(); j++) {
					if (list.get(i) > list.get(j)) {
						Integer temp = list.get(i);
						list.set(i, list.get(j));
						list.set(j, temp);
					}
				}
			}
		} else if (order == 1) {
			for (int i=0; i<list.size()-1; i++) {
				for (int j=i+1; j<list.size(); j++) {
					if (list.get(i) < list.get(j)) {
						Integer temp = list.get(i);
						list.set(i, list.get(j));
						list.set(j, temp);
					}
				}
			}
		}
		
		return list;
    }
}
