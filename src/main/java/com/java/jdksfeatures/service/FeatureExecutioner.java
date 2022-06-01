package com.java.jdksfeatures.service;

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
        log.info("Executing All Features");
        textBlockFeature.printTexBlocks();
    }
}
