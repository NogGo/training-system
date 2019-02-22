package ru.my.test.patterns.generating.factoryMethod.Travels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SummerTravel implements Travel {

    private static final Logger log = LoggerFactory.getLogger(SummerTravel.class);
    @Override
    public void startPack() {
        if (log.isDebugEnabled())
            log.debug("status DEBUG: Start Summer Travel!");
        log.info("status INFO: Start Summer Travel!");
        goTraval();
    }

    @Override
    public void goTraval() {
        log.info("status INFO:  GOOOOOOOOO  !!!! Summer Travel!");
    }
}
