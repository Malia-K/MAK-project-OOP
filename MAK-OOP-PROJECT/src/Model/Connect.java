package Model;

/**
 * 
 * Class to communicate with database serialization file.
 * @author Miras
 *
 */
public final class Connect {

	private final static String BASE_PATH = "C:\\Users\\Miras\\git\\MAK-project-OOP\\MAK-OOP-PROJECT\\data.ser";
	private static Connect instance = new Connect(BASE_PATH);
	private String path;
	
	/**
	 * 
	 * Private constructor that assigns path to variable. 
	 * @param path
	 */
	private Connect(String path) {
		this.path = path;
	}
	
	/**
	 * 
	 * Returns path to the data.ser. 
	 * @return String
	 */
	public String getPath() {
		return getInstance().path;
	}
	
	/**
	 * 
	 * Returns instance of class Connect.
	 * @return Connect
	 */
	public static Connect getInstance() {
		return instance;
	}
}
