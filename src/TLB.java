import java.util.Hashtable;

/**
 * @author Owner
 *
 */
public class TLB {
	Hashtable<Integer, Integer> memory;
	int pageFault;
	int pageHit;
	int[] pageNumber;
	int[] frameNumber;
	int[] entryAge;

	public TLB() {
		memory = new Hashtable<>();
		pageFault = 0;
		pageHit = 0;
	}

	public void populateTable(int[] keys, int[] value) {
		for (int i = 0; i < keys.length; i++) {
			memory.put(keys[i], value[i]);
		}
	}

	public int get(int key) {
		return memory.get(key);
	}

	public void put(int key, int value) {
		memory.put(key, value);
	}

	public boolean isHit(int key) {
		if (memory.get(key) != null) {
			return true;
		} else {
			return false;
		}

	}
}
