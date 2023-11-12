package adapter2;

import domain.Covid19Pacient;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient pacient=new Covid19Pacient("aitor", 35);
		
		pacient.addSymptomByName("disnea", 2);
		pacient.addSymptomByName("cefalea", 1);
		pacient.addSymptomByName("astenia", 3);
		
		Covid19Pacient pacient1=new Covid19Pacient("jon", 35);
		
		pacient1.addSymptomByName("disnea", 3);
		pacient1.addSymptomByName("cefalea", 3);
		pacient1.addSymptomByName("astenia", 3);
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient);
		gui.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui.setVisible(true);
		ShowPacientTableGUI gui1=new ShowPacientTableGUI(pacient1);
		gui1.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui1.setVisible(true);


	}

}
