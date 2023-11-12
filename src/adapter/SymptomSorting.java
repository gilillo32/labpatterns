package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SymptomSorting implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
        return ((Symptom) o1).getName().compareTo(((Symptom) o2).getName());
	}
}
