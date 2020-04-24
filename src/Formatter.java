/**
 * @author Owner
 *
 */
public class Formatter {
	String data;

	public Formatter(String data) {
		this.data = data;
	}

	public String logicalAddrToPageAddr(int addr) {
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
