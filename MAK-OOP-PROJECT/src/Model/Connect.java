package Model;

public final class Connect {

	private final static String BASE_PATH = "C:\\Users\\Karina\\OOP\\MAK-project-OOP\\MAK-OOP-PROJECT\\text.txt";
	private static Connect instance = new Connect(BASE_PATH);
	private String path;
	
	private Connect(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return this.path;
	}

	public static String getInstance() {
		return instance.getPath();
	}
}
