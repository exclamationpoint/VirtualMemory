import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Owner
 *
 */
public class FileInput {

	BufferedReader bis;

	public FileInput(File data) {
		try {
			InputStream is = new FileInputStream(data);
			bis = new BufferedReader(new InputStreamReader(is), 256 * 256);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public String getNext() {
		try {
			return bis.readLine();
		} catch (IOException e) {
			return null;
		}
	}
}
