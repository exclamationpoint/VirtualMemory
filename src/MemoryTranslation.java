/**
 * @author Owner
 *
 */
public class MemoryTranslation {

	public static int logicalAddrToMemAddr(int addr) {
		return addr & 0xFFFF;
	}

	public static int memAddrToPageAddr(int addr) {
		return addr >>> 8;
	}

	public static int memAddrToOffset(int addr) {
		return addr & 0xFF;
	}
}
