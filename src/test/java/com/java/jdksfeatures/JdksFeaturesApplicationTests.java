package com.java.jdksfeatures;

import com.java.jdksfeatures.jdkversion.jdk13.TextBlockFeature;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class JdksFeaturesApplicationTests {
	@Autowired
	TextBlockFeature textBlockFeature;

	@Test
	void removeMinimumIndentationTest() {

		String expected = "<html>\n"
				+ "\n"
				+ "    <body>\n"
				+ "        <span>example text</span>\n"
				+ "    </body>\n"
				+ "</html>";
		assertEquals(expected,textBlockFeature.getBlockOfHtml());
	}

	@Test
	void escapingCarriageToReturnCarriage() {
		String expected = "separated with\r\ncarriage returns";
		assertEquals(expected,textBlockFeature.getTextWithCarriageReturns());
	}
	@Test
	void escapingTheLineBreak() {
		String expected = "This is a long test which looks to have a newline but actually does not";
		assertEquals(expected,textBlockFeature.getIgnoredNewLines());
	}
	@Test
	void tailingSpaceIsEscapedUnlessEscapeUsingSequence() {
		String expected = "line 1\nline 2        \n";
		assertEquals(expected,textBlockFeature.getEscapedSpaces());
	}

}
