package ru.skillFactory;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstTest extends WebDriverSettings{
    @Test
    public void firstTest1() {

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Онлайн-школа SkillFactory — онлайн-обучение востребованным IT-профессиям"));
    }
    @Test
    public void firstTest2() {

        WebElement Link;
        Link = driver.findElements(By.xpath("//a[contains(text(),'Все курсы')]")).get(0);
        Link.click();
        }
    @Test
    public void firstTest3() {

        WebElement Link;
        Link = driver.findElements(By.xpath("//a[contains(text(),'Бесплатные мероприятия')]")).get(0);
        Link.click();
    }
    @Test
    public void firstTest4() {

        WebElement Link;
        Link = driver.findElements(By.xpath("//a[@class='tn-atom'][normalize-space()='Data Science']")).get(0);
        Link.click();
    }
    @Test
    public void firstTest5() {

        WebElement Link;
        Link = driver.findElements(By.xpath("//a[@class='tn-atom'][contains(text(),'Аналитика данных')]")).get(0);
        Link.click();
    }
    @Test
    public void firstTest6() {

        WebElement Link;
        Link = driver.findElements(By.xpath("//a[@class='tn-atom'][contains(text(),'Программирование')]")).get(0);
        Link.click();
    }
    @Test
    public void firstTest7() {

        WebElement Link;
        Link = driver.findElements(By.xpath("//a[@class='tn-atom'][contains(text(),'Блог')]")).get(0);
        Link.click();
    }
    @Test
    public void firstTest8() {

        WebElement Link;
        Link = driver.findElements(By.xpath("//a[@class='tn-atom'][contains(text(),'Сотрудничество')]")).get(0);
        Link.click();
    }
    @Test
    public void firstTest9() {

        WebElement Link;
        Link = driver.findElements(By.xpath("//a[@class='tn-atom'][contains(text(),'Корпоративное обучение')]")).get(0);
        Link.click();
    }
    @Test
    public void firstTest10() {

        WebElement Link;
        Link = driver.findElements(By.xpath("//a[@class='tn-atom'][contains(text(),'Бесплатно')]")).get(0);
        Link.click();
    }
    @Test
    public void firstTest11() {

        WebElement Link;
        Link = driver.findElements(By.xpath("//a[contains(text(),'Онлайн-курсы')]")).get(0);
        Link.click();
    }
    @Test
    public void firstTest12() {

        WebElement Link;
        Link = driver.findElements(By.xpath("(//a[contains(text(),'+7 495 291-09-12')])[2]")).get(0);
        Link.click();
    }
    @Test
    public void firstTest13() {

        WebElement Link;
        Link = driver.findElements(By.xpath("(//a[contains(text(),'+7 958 577-04-17')])[2]")).get(0);
        Link.click();
    }
    @Test
    public void firstTest14() {

        WebElement Link;
        Link = driver.findElements(By.xpath("//iframe[@id='carrot-messenger-collapsed-frame']")).get(0);
        Link.click();
    }
    @Test
    public void firstTest15() {

        WebElement Link;
        Link = driver.findElements(By.xpath("//a[contains(text(),'«Надёжный старт в IT»')]")).get(0);
        Link.click();
        Link = driver.findElements(By.linkText("Записаться на курс")).get(0);
        Link.click();
    }
    @Test
    public void firstTest16() {

        WebElement Link;
        Link = driver.findElements(By.xpath("//a[contains(text(),'Онлайн-курсы')]")).get(0);
        Link.click();
        Link = driver.findElements(By.xpath("//span[contains(text(),'Разработка игр')]")).get(0);
        Link.click();
    }
    @Test
    public void firstTest17() {

        WebElement Link;
        Link = driver.findElements(By.xpath("//u[contains(text(),'Посмотреть все направления')]")).get(0);
        Link.click();
    }
    @Test
    public void firstTest18() {

        WebElement Link;
        Link = driver.findElements(By.linkText("Привет, я Data Scientist в «Тинькофф»")).get(0);
        Link.click();
    }@Test
    public void firstTest19() {

        WebElement Link;
        Link = driver.findElements(By.linkText("Кто такой Fullstack-разработчик?")).get(0);
        Link.click();
    }
    @Test
    public void firstTest20() {

        WebElement Link;
        Link = driver.findElements(By.linkText("Читать блог")).get(0);
        Link.click();
    }
    @Test
    public void firstTest21() {

        WebElement Link;
        Link = driver.findElements(By.linkText("Все отзывы и интервью")).get(0);
        Link.click();
    }
    @Test
    public void firstTest22() {

        WebElement Link;
        Link = driver.findElements(By.cssSelector(".t-slds__item.t-slds__item_active.t-slds__item-loaded")).get(0);
        Link.click();
    }
    @Test
    public void firstTest23() {

        WebElement Link;
        Link = driver.findElements(By.xpath("(//a[@role='button'][contains(text(),'Получить консультацию')])[2]")).get(0);
        Link.click();
    }
    @Test
    public void firstTest24() {

        WebElement Link;
        Link = driver.findElements(By.linkText("Школа дизайна Contented")).get(0);
        Link.click();
    }
    @Test
    public void firstTest25() {

        WebElement Link;
        Link = driver.findElements(By.linkText("Сведения об образовательной организации")).get(0);
        Link.click();
        Link = driver.findElements(By.xpath("(//a[normalize-space()='VKontakte'])[1]")).get(0);
        Link.click();
    }

}
