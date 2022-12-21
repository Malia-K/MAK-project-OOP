package Model;

public final class Connect {

	private final static String BASE_PATH = "C:\\Users\\Karina\\OOP\\MAK-project-OOP\\MAK-OOP-PROJECT\\data.ser";
	private static Connect instance = new Connect(BASE_PATH);
	private String path;
	
	private Connect(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return getInstance().path;
	}

	public static Connect getInstance() {
		return instance;
	}
}
