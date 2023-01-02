package com.duffyLearning.in28minutes1.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MySQLDbDataService implements DataService{
	public int[] retrieveData() {
		return new int[] { 1,2,3,4,5};
	}
}
