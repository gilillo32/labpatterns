package adapter;

import java.util.Comparator;

import domain.Symptom;

public class severityIndexComparator implements Comparator<Symptom> {

	@Override
	public int compare(Symptom o1, Symptom o2) {
		return Integer.compare(o1.getSeverityIndex(),o2.getSeverityIndex());
	}

}
