
public class Formatter {
	int lineWidth;

	public void setLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
	}

	public String center(String string) {
		int length = string.length();
		if (length < lineWidth) {
			length = (lineWidth - length) / 2;
			String whiteSpace = "";
			for (int i = 0; i < length; i++) {
				whiteSpace = whiteSpace + " ";
			}
			return whiteSpace + string + whiteSpace;
		}
		return string;
	}
}
