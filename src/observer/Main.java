package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable pacient = new Covid19Pacient("inigo", 22);
		new PacientObserverGUI(pacient);
		new PacientSymptomGUI(pacient);
	}


}
