package com.java.jdksfeatures.jdkversion.jdk13;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TextBlockFeature {
    private String stringWithTextBlock = """      
     Some 
       Nested          
         Text        
       Is     
     Here      
   """;

    private String stringWithoutTextBlock =
            "  Some\n" +
                    "    Nested\n" +
                    "      Text\n" +
                    "    Is\n" +
                    "  Here\n";
    public void printTexBlocks(){
        log.info("String With TextBlock = " + stringWithTextBlock);
        log.info("String Without TextBlock = " + stringWithoutTextBlock);
    }
}
