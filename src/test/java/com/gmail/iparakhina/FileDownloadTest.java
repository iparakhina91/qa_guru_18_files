package com.gmail.iparakhina;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;


import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class FileDownloadTest {

    @Test
    void downloadTest() throws Exception {
        Selenide.open("https://github.com/qa-guru/niffler/blob/master/README.md");
        File File = $("a[href*='/qa-guru/niffler/raw/master/README.md]'").download();
        System.out.println("");
    }
}
