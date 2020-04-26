import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Owner
 *
 */
public class MMU {
	PageTable memory;
	int[] addresses;

	public MMU() {
		memory = new PageTable();
		addresses = new int[65536];

	}

	/**
	 * @return the memory
	 */
	public PageTable getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(PageTable memory) {
		this.memory = memory;
	}

	/**
	 * @return the addresses
	 */
	public int[] getAddresses() {
		return addresses;
	}

	public void loadLogical() {
		File file = new File("addresses.txt");
		BufferedReader br;

		try {
			br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < addresses.length; i++) {
				addresses[i] = br.read();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getReleventPageNumber(int address) {
		int memAddress = MemoryTranslation.logicalAddrToMemAddr(address);
		return MemoryTranslation.memAddrToPageAddr(memAddress);
	}

	public int getOffset(int address) {
		int memAddress = MemoryTranslation.logicalAddrToMemAddr(address);
		return MemoryTranslation.memAddrToOffset(memAddress);
	}
}
