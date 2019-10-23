package com.mainacad;

import com.mainacad.service.FIleService;

import java.util.logging.Logger;

public class ApplicationRunner {

    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());


    public static void main(String[] args) {


        String text = " Some new text\nI wanted to be written\n";

        FIleService.writeTextToFIle(text, "test.txt");
        String inputText = FIleService.readTextfromFIle("test.txt");


        LOGGER.info("\n" + inputText);
    }
}
