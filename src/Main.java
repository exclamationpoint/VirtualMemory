import java.io.File;

/**
 * @author Owner
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("addresses.txt");

		FileInput data = new FileInput(file);
		RAM memory = new RAM();

		for (int i = 0; i < 256; i++) {
			System.out.println(memory.getEntry(i));
		}

	}

}
