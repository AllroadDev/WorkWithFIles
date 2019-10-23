package com.mainacad;

import com.mainacad.service.FIleService;

import java.util.logging.Logger;

public class ApplicationRunner {

    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());


    public static void main(String[] args) {

        FIleService.copyFile("maxresdefault.jpg", "cat_copy.jpg");


        String text = " Some new text\nI wanted to be written\n";
        String text1 = "Different text\nI have done everything\n";

        FIleService.writeTextToFIle(text, "test.txt");
        String inputText = FIleService.readTextfromFIle("test.txt");

        FIleService.writeTextToFIle(text1, "trial.txt");
        String input = FIleService.readTextfromFIle("trial.txt");


        LOGGER.info("\n" + inputText);
        LOGGER.info("\n" + input);
    }
}
