package Model;

public final class Connect {

	private final static String BASE_PATH = "C:\\Users\\Miras\\git\\MAK-project-OOP\\MAK-OOP-PROJECT\\data.ser";
	private static Connect instance = new Connect(BASE_PATH);
	private String path;
	
	/*
	 * private constructor that assigns path to variable 
	 */
	private Connect(String path) {
		this.path = path;
	}
	
	/*
	 * returns path to the data.ser 
	 */
	public String getPath() {
		return getInstance().path;
	}
	
	/*
	 * returns instance of class Connect
	 */
	public static Connect getInstance() {
		return instance;
	}
}
