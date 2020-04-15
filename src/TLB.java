import java.util.Hashtable;

/**
 * @author Owner
 *
 */
public class TLB {
	Hashtable<Integer, Integer> memory;

	public TLB() {
		memory = new Hashtable<>();
	}

	public void populateTable(int[] keys, int[] value) {
		for (int i = 0; i < keys.length; i++) {
			memory.put(keys[0], value[0]);
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
