/**
 * @author Owner
 *
 */
public class Formatter {
	String data;
	static int FRAME_SIZE = 256;
	static int TOTAL_FRAME_COUNT = 256;
	static String PAGE_MASK = "0xFF00";
	static String OFFSET_MASK = " 0xFF";
	static int SHIFT = 8;
	static int TLB_SIZE = 16;
	static int PAGE_TABLE_SIZE = 256;
	static int PAGE_READ_SIZE = 256;

	public Formatter(String data) {
		this.data = data;
	}

	public String toMemAddress() {
		int halfway = data.length() / 2;
		String output = data.substring(halfway, data.length() - 1);
		return output;
	}

	public String[] pageOffsetArray() {
		String address = toMemAddress();
		String[] output = new String[2];
		output[0] = address.substring(0, (address.length() / 2) - 1);
		output[1] = address.substring(address.length() / 2, address.length() - 1);
		return output;
	}
}
