package adapter;

import domain.Covid19Pacient;
import java.util.Vector;

public class Covid19PacientInvertedIteratorAdapter implements InvertedIterator {
    private Vector<Covid19Pacient> pacients;
    private int currentIndex;

    public Covid19PacientInvertedIteratorAdapter(Vector<Covid19Pacient> pacients) {
        this.pacients = pacients;
        this.currentIndex = pacients.size() - 1;
    }

    @Override
    public Object previous() {
        if (hasPrevious()) {
            return pacients.get(currentIndex--);
        }
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return currentIndex >= 0;
    }

    @Override
    public void goLast() {
        currentIndex = pacients.size() - 1;
    }
}
