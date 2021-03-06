import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFormatter {

	@Test
	public void testCenterLine() {
		Formatter f = new Formatter();
		f.setLineWidth(10);
		assertEquals("   word   ", f.center("word"));
		assertEquals("   SLU    ", f.center("SLU"));
	}

	@Test
	public void testCrazyCenterLine() {
		Formatter f = new Formatter();
		f.setLineWidth(9);
		String thomasGrade = "f";
		assertEquals("    f    ", f.center(thomasGrade));
	}

}
