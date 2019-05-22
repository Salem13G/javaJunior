package lesson15;

import lesson14.CustomException;
import lesson14.StringUtilsClass;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        StringUtilsClass utils = new StringUtilsClass();
        try {
            utils.findNumbers("123.654d");
        } catch (CustomException e) {
            e.printStackTrace();
        }

        logger.info("Message");
    }
}
