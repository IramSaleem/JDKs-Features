package com.java.jdksfeatures.jdkversion.jdk13;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TextBlockFeature {
    public String getBlockOfHtml() {
        return """
            <html>

                <body>
                    <span>example text</span>
                </body>
            </html>""";
    }
    /**
     *  This is the only point where double qoute is need to be escaped '\"""'
     */

    public String getTextWithEscapeDoubleQuote() {
        return """
            "fun" with
            whitespace
            and other escapes \"""
            """;
    }

    public String getTextWithCarriageReturns() {
        return """
separated with\r
carriage returns""";
    }

    public String getIgnoredNewLines() {
        return """
            This is a long test which looks to \
            have a newline but actually does not""";
    }

    public String getEscapedSpaces() {
        return """
            line 1       
            line 2       \s
            """;
    }

    public String getFormattedText(String parameter) {
        return """
            My Name is : %s
            """.formatted(parameter);
    }
}
