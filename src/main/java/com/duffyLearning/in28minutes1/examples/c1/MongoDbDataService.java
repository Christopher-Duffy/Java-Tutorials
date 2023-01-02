package com.duffyLearning.in28minutes1.examples.c1;

import org.springframework.stereotype.Repository;

//@Component
//@Primary
@Repository
public class MongoDbDataService implements DataService{
	public int[] retrieveData() {
		return new int[] { 11,22,33,44,55};
	}
}
