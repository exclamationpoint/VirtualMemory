/**
 *
 */

/**
 * @author Owner
 *
 */
public class PhysicalMemory {
	int[] memory;

	public PhysicalMemory() {
		memory = new int[256];
	}

	public void loadIntoMemory(int[] data) {
		memory = data;
	}

}
