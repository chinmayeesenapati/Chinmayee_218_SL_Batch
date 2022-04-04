package key;

public class main {

	public static void main(String[] args) {
		
		FileOperations.createMainFolderIfNotPresent("Folder");
		
		Display.printWelcomeScreen("Welcome", "Hello,I am CHINU");
		
		Menue.handleWelcomeScreenInput();
	}

}