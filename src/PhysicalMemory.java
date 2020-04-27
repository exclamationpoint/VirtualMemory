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

	/**
	 * Load data into physical memory
	 *
	 * @param data
	 */
	public void loadIntoMemory(int[] data) {
		memory = data;
	}

	/**
	 * Retrieves data
	 *
	 * @param address
	 * @return data requested
	 */
	public int getData(int address) {
		return memory[address];
	}

}
