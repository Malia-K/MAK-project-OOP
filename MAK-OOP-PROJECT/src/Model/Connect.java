package Model;

public final class Connect {

	private final static String BASE_PATH = "C:\\Users\\USER\\git\\repository\\MAK-OOP-PROJECT\\src\\Model\\text.txt";
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
