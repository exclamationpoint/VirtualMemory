import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Owner
 *
 */
public class RAM {
	static int PAGE_SIZE = 256;
	InputStream is;
	int[] memory = new int[PAGE_SIZE];

	public RAM() {
		File data = new File("BACKING_STORE.bin");
		try {
			is = new BufferedInputStream(new FileInputStream(data), 32);
			loadIntoRAM(0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loadIntoRAM(int page) {
		int line = page * PAGE_SIZE;
		int counter = 0;
		while (counter <= line) {
			try {
				is.read();
				counter++;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (int i = 0; i < PAGE_SIZE; i++) {
			try {
				memory[i] = is.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public int getEntry(int index) {
		return memory[index];
	}
}
