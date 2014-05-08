package se.waymark.rentit;

import se.waymark.rentit.controller.MainController;
import se.waymark.rentit.view.MainFrame;

public class Main {
    public static void main(String[] args) {
        executeApp();
    }

	public static MainFrame executeApp() {
		MainController controller = new MainController();
        return new MainFrame(controller);
	}
}