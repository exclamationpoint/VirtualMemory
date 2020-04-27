/**
 * @author Owner
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MMU mmu = new MMU(); // New MMU object

		mmu.loadLogical(); // Reads the address.txt file

		/*
		 * Iterates through the list of logical addresses then translates to the
		 * page address and offset. Then retrieves the data from physical
		 * memory. Except it doesn't work. I'm not getting the same values that
		 * are in the answers.txt.
		 */
		for (int i = 0; i < mmu.addresses.length; i++) {
			int address = mmu.addresses[i];
			int pageNumber = mmu.getPageNumber(address);
			int offset = mmu.getOffset(address);

			int[] page = mmu.getPage(pageNumber);
			mmu.loadPhysical(page);
			int data = mmu.getData(offset);

			System.out.println("Virtual Address: " + address + " Physical Address: " + offset + " Value" + data);
		}
	}
}
