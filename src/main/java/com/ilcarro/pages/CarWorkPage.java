package com.ilcarro.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class CarWorkPage extends BasePage {
    public CarWorkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "1")
    WebElement carWorkLink;

    public CarWorkPage clickOnCarWorkLink() {
        click(carWorkLink);
        return this;
    }

    @FindBy(tagName = "input")
    WebElement locationField;

    public CarWorkPage selectLocation(String text) {
        type(locationField, text);
        pause(500);
        locationField.sendKeys(Keys.DOWN);
        locationField.sendKeys(Keys.ENTER);
        return this;
    }


    @FindBy(id = "make")
    WebElement markeField;
    @FindBy(id = "model")
    WebElement modelField;
    @FindBy(id = "year")
    WebElement yearField;
    @FindBy(id = "seats")
    WebElement seatsField;
    @FindBy(id = "class")
    WebElement classField;
    @FindBy(id = "serialNumber")
    WebElement serialNumberField;
    @FindBy(id = "price")
    WebElement priceField;
    @FindBy(id = "fuel")
    WebElement fuelField;
    @FindBy(css = ".file-input-label")

    WebElement uploadField;
    @FindBy(css = "button[type='submit']")
    WebElement submitButton;

    public CarWorkPage enteredValidData(String marke, String model, String year, String fuel, String seats, String classs, String serialNumber, String price) {
        type(markeField, marke);
        type(modelField, model);
        type(yearField, year);

        new Select(fuelField).selectByVisibleText(fuel);

        type(seatsField, seats);
        type(classField, classs);
        type(serialNumberField, serialNumber);
        type(priceField, price);


        return this;
    }


    public CarWorkPage uploadingPhoto() {
        click(uploadField);

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        Dimension dimension = driver.manage().window().getSize();

        int x = dimension.getWidth() - 870;
        int y = dimension.getHeight() - 810;

        robot.mouseMove(x, y);
        pause(500);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        pause(500);
        robot.keyPress(KeyEvent.VK_ENTER);

        return this;
    }

    public CarWorkPage confirm() {
        click(submitButton);
        return this;
    }


    @FindBy(tagName = "h1")
    WebElement message;

    public CarWorkPage isSuccessTextPresent(String text) {
        assert message.getText().contains(text);
        return this;
    }
}
