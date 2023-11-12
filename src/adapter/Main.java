package adapter;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

import domain.Covid19Pacient;
import domain.Symptom;

public class Main {
	
	public static void main(String[] args) {
		Covid19Pacient patient = new Covid19Pacient("aimar", 14);
		patient.addSymptomByName("fiebre", 2);
		patient.addSymptomByName("cefalea", 1);
		patient.addSymptomByName("tos seca", 3);
		patient.addSymptomByName("astenia", 2);
		patient.addSymptomByName("expectoracion", 1);
		
		Collection<Symptom> sintomak = patient.getSymptoms();
		InvertedIterator invertedIterator = new InvertedIteratorImpl(sintomak);
		Iterator<Object> sortedIterator = Sorting.sortedIterator(invertedIterator, new SymptomSorting());

        // Imprimir los síntomas ordenados
        while (sortedIterator.hasNext()) {
            Symptom symptom = (Symptom) sortedIterator.next();
            System.out.println(symptom.getName());
        }
	}
}
