package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Demo5 extends Utils {


    public static void main(String[] args) throws IOException, InterruptedException {

        readProperty();

        HomePage homepage = new HomePage();
        homepage.openBrowser();
        homepage.driver.findElement(By.cssSelector("button[type='submit']")).click();
        Alert alert = homepage.driver.switchTo().alert();
        String alertMessage = homepage.driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        alert.accept();
        homepage.closeBrowser();

    }

}
