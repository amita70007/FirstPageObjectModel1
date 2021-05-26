package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest extends Utils {
    HomePage homepage = new HomePage();
    @BeforeMethod

    public void open_browser() throws IOException, InterruptedException {
        homepage.openBrowser();
    }




    @AfterMethod
    public void close_browser(){

        homepage.closeBrowser();
    }



}
