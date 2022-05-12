package helpers;

import org.apache.commons.lang3.RandomStringUtils;

public class TestDataGenerator {
    public static String getString(int lenght){


        boolean useLetters = true;
        boolean useNumbers = false;

//        String generatedString = RandomStringUtils.random(lenght,useLetters,useNumbers);
        return RandomStringUtils.random(lenght,useLetters,useNumbers); //можем так написать что используем пакет  apache.

    }
}
