package com.java.jdksfeatures.service;

import com.java.jdksfeatures.jdkversion.jdk13.SwitchExpressions;
import com.java.jdksfeatures.jdkversion.jdk13.TextBlockFeature;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class FeatureExecutioner {
    @Autowired
    TextBlockFeature textBlockFeature;

    public void startExecution(){
        log.info(textBlockFeature.getTextWithEscapeDoubleQuote());
        log.info(textBlockFeature.getFormattedText("Wajeeh Ahmed"));
        log.info(String.valueOf(SwitchExpressions.getValueBefore12("d")));
        log.info(String.valueOf(SwitchExpressions.getValueMultipleLabels("d")));
        log.info(String.valueOf(SwitchExpressions.getValueViaArrow("d")));
        log.info(String.valueOf(SwitchExpressions.getValueViaYield("d")));
        log.info(String.valueOf(SwitchExpressions.getValueViaYieldAndArrow("d")));
    }
}
