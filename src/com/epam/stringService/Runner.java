package com.epam.stringService;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {
        StringService service = new StringService();
        service.zipString();
        service.replaceChar();
    }
}
