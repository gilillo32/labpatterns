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
		new PacientThermometerGUI(pacient);
		
		Observable secondPatient = new Covid19Pacient("Jon", 30);
		new PacientObserverGUI(secondPatient);
		new PacientSymptomGUI(secondPatient);
		new PacientThermometerGUI(secondPatient);
		
		Observable thirdPatient = new Covid19Pacient("Ekain", 26);
		new PacientObserverGUI(thirdPatient);
		new PacientSymptomGUI(thirdPatient);
		new PacientThermometerGUI(thirdPatient);
	}


}
