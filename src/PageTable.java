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
public class PageTable {
	static int PAGE_SIZE = 256;
	InputStream is;

	public PageTable() {
		File data = new File("BACKING_STORE.bin");
		try {
			is = new BufferedInputStream(new FileInputStream(data));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Retrieves a page from the page table
	 *
	 * @param page page number
	 * @return the array holding the data
	 */
	public int[] retrievePage(int page) {
		int[] memory = new int[256];
		gotoPage(page);

		for (int i = 0; i < PAGE_SIZE; i++) {
			try {
				memory[i] = is.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return memory;
	}

	/**
	 * Moves to the desired page
	 *
	 * @param page page number
	 */
	public void gotoPage(int page) {
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
	}
}
