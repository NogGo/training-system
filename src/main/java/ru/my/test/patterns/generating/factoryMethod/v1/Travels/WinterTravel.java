package ru.my.test.patterns.generating.factoryMethod.v1.Travels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WinterTravel implements Travel {

    private static final Logger log = LoggerFactory.getLogger(WinterTravel.class);

    @Override
    public void startPack() {
        log.info("status INFO: Start Winter Travel!");
        goTraval();
    }

    @Override
    public void goTraval() {
        log.info("status INFO:  GOOOOOOOOO  !!!! Winter Travel!");
    }
}
