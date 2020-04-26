import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
		BufferedReader br;

		try {
			br = new BufferedReader(new FileReader(file));
			System.out.println(br.read());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		MMU mmu = new MMU();

		mmu.loadLogical();
		int[] address = mmu.getAddresses();
		System.out.println(address[0]);

	}

}
