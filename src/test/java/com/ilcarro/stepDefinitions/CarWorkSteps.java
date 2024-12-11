package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.CarWorkPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class CarWorkSteps {

    @And("User clicks on Let the car work link")
    public void clicks_on_Let_the_car_work_link() {
        new CarWorkPage(driver).clickOnCarWorkLink();
    }

    @And("User select Location")
    public void select_Location(){
//        new CarWorkPage(driver).selectLocation("Tel Aviv, Israel");
        new CarWorkPage(driver).selectLocation("Tel Aviv");
    }

    @And("User enters valid datas")
    public void enters_all_fields() {
        new CarWorkPage(driver).enteredValidData("Mazda", "RX-7", "2000","Petrol" ,"2", "Sport", "742g3dsaa4277", "999");
    }

    @And("User upload cars photo")
    public void upload_cars_photo() {
        new CarWorkPage(driver).uploadingPhoto();
    }

    @And("User clicks on Submit button")
    public void clicks_on_submit_button() {
        new CarWorkPage(driver).confirm();
    }

    @Then("User verifies Complete message is displayed")
    public void verifies_Complete_message_is_displayed() {
        new CarWorkPage(driver).isSuccessTextPresent("Car added");
    }

}
