import java.util.Arrays;

public class Formatter {

	int lineWidth;
	private char spaces[];

	public void setLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
		spaces = new char[lineWidth];
		Arrays.fill(spaces, ' ');
	}

	public String center(String string) {
		StringBuffer b = new StringBuffer();
		int padding = (lineWidth - string.length()) / 2;
		b.append(spaces, 0, padding);
		b.append(string);
		b.append(spaces, 0, padding);
		return b.toString();
	}

}
