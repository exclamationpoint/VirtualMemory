/**
 * @author Owner
 *
 */
public class MemoryTranslation {

	/**
	 * Translates from logical into a memory address
	 *
	 * @param addr address to translate
	 * @return translated address
	 */
	public static int logicalAddrToMemAddr(int addr) {
		return addr & 0xFFFF;
	}

	/**
	 * Translates the memory address into the page number
	 *
	 * @param addr address to translate
	 * @return int translated address
	 */
	public static int memAddrToPageAddr(int addr) {
		return addr >>> 8;
	}

	/**
	 * Returns the offset
	 *
	 * @param addr address to translate
	 * @return int translated address
	 */
	public static int memAddrToOffset(int addr) {
		return addr & 0xFF;
	}
}
