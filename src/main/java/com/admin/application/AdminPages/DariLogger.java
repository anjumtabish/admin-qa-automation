package com.admin.application.AdminPages;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DariLogger {

    Logger logger = LoggerFactory.getLogger(DariLogger.class);
    public String info( String message) {

        logger.info(message);

        return "Howdy! Check out the Logs to see the output...";
    }
}
