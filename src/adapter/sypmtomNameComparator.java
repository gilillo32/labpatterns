package adapter;

import java.util.Comparator;

import domain.Symptom;
public class sypmtomNameComparator implements Comparator<Symptom>{

		public int compare(Symptom o1, Symptom o2) {
			return o1.getName().compareToIgnoreCase(o2.getName());
		}

	}

