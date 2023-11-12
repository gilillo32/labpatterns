package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SeveritySorting implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
        return Integer.compare(((Symptom) o1).getSeverityIndex(), ((Symptom)o2).getSeverityIndex());
	}
}
