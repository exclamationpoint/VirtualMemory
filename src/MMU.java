import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Owner
 *
 */
public class MMU {
	PageTable pageTable;
	PhysicalMemory physMem;
	int[] addresses;

	public MMU() {
		pageTable = new PageTable();
		addresses = new int[1000];
		physMem = new PhysicalMemory();

	}

	/**
	 * @return the memory
	 */
	public PageTable getMemory() {
		return pageTable;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(PageTable memory) {
		this.pageTable = memory;
	}

	public void loadLogical() {
		File file = new File("addresses.txt");
		BufferedReader br;

		try {
			br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < (addresses.length); i++) {
				int temp = Integer.parseInt(br.readLine());
				addresses[i] = temp;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int[] getPage(int page) {
		return pageTable.retrievePage(page);
	}

	public void loadPhysical(int[] data) {
		physMem.loadIntoMemory(data);
	}

	public int getData(int address) {
		return physMem.getData(address);
	}

	public int getPageNumber(int address) {
		int memAddress = MemoryTranslation.logicalAddrToMemAddr(address);
		return MemoryTranslation.memAddrToPageAddr(memAddress);
	}

	public int getOffset(int address) {
		int memAddress = MemoryTranslation.logicalAddrToMemAddr(address);
		return MemoryTranslation.memAddrToOffset(memAddress);
	}
}
