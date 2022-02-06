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
		if (string.length() % 2 == 1 && (lineWidth % 2 != 1))
			b.append(spaces, 0, 1);
		return b.toString();
	}

}
