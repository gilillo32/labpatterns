package adapter;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import domain.Symptom;

public class InvertedIteratorImpl<T> implements InvertedIterator {

	 private List<T> elements;
	    private int currentIndex = 0;

	    public InvertedIteratorImpl(Collection<Symptom> sintomak) {
	    	this.elements = (List<T>)sintomak;
	    }

	    public T previous() {
	        if (hasPrevious()) {
	            return elements.get(currentIndex--);
	        }
	        return null;
	    }

	    public boolean hasPrevious() {
	        return currentIndex > 0;
	    }

	    public void goLast() {
	        currentIndex = elements.size() - 1;
	    }
}
