package ru.skillFactory;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverSettings {
    public ChromeDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZAU\\IdeaProjects\\Unit_36.1\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skillfactory.ru/");
        System.out.println("test start");
    }
    @After
    public void close() {
        System.out.println("test close");

    }
}
