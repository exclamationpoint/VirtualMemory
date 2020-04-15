import java.io.File;

/**
 * 
 */

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
		TLB memory = new TLB();
	}

}
