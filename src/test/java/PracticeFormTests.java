import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.PracticeForm;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.textCaseSensitive;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PracticeFormTests {


    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1512x810";
        Configuration.browser = "firefox";
    }

    @Test
    void myFirstTest() {
        PracticeForm practiceForm = new PracticeForm();
        open("/automation-practice-form");

        practiceForm.setFirstName("Alexei")
                .setLastName()
                .setEmail()
                .setBirthDate("February","2022" );
        Selenide.sleep(2000);
//        $("#firstName").setValue("Alexei");
//        $("#lastName").setValue("Lisenkov");
//        $("#userEmail").setValue("alexlis@mail.ru");
//        $("#genterWrapper").$(byText("Male")).click();
//        $("#userNumber").setValue("8999666555");
//        $("#dateOfBirthInput").click();
//        $(".react-datepicker__month-select").selectOption("February");
//        $(".react-datepicker__year-select").selectOption("2022");
//        $(".react-datepicker__day--006:not(.react-datepicker__day--outside-month)").click();
//        $("#subjectsInput").setValue("Physics").pressEnter();
//        $("#hobbiesWrapper").$(byText("Sports")).click();
//        $("#hobbiesWrapper").$(byText("Music")).click();
//        $("#hobbiesWrapper").$(byText("Reading")).click();
//        $("#uploadPicture").uploadFromClasspath("img/1.png");
//        $("#currentAddress").setValue("Saint-Petersburg");
//        $("#state").click();
//        $("#stateCity-wrapper").$(byText("NCR")).click();
//        $("#city").click();
//        $("#stateCity-wrapper").$(byText("Delhi")).click();
//        $("#submit").click();
//        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
//        $(".table-responsive").shouldHave(text("Alexei Lisenkov"), text("alexlis@mail.ru"), text("Male"), text("8999666555"),
//                text("Saint-Petersburg"), text("NCR Delhi"));
    }
}
