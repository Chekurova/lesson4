package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Selenide.$;

public class PracticeForm {

    private CalendarComponent calendarComponent = new CalendarComponent();
    // locators
    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail");

    // action
    public PracticeForm setFirstName(String name) {
        firstNameInput.setValue(name);

        return this;
    }

    public PracticeForm setLastName() {
        lastNameInput.setValue("Lisenkov");

        return this;
    }

    public PracticeForm setEmail() {
        emailInput.setValue("alexlis@mail.ru");

        return this;
    }

    public PracticeForm setBirthDate(String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(month, year);

        return this;
    }


}
