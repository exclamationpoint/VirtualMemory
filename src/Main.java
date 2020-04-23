import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

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
		File bin = new File("BACKING_STORE.bin");
		FileInput data = new FileInput(file);
		BufferedInputStream bfi;
		try {
			FileInputStream binInput = new FileInputStream(bin);
			int BUFFER_SIZE = 32 * 1024; // 32kb
			bfi = new BufferedInputStream(binInput, BUFFER_SIZE);
			System.out.println(bfi.read());
			System.out.println(data.getNext());
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
