package tests.pages;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class FormWithFakerPage extends TestData {

    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    public void fillForm() {
        $("#firstName").val(firstName);
        $("#lastName").val(lastName);
        $("#userEmail").val(email);
        $(byText("Male")).click();
        $("#userNumber").val(mobile);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--012").click();
        $("#subjectsInput").val(interest1).pressEnter();
        $("#subjectsInput").val(interest2).pressEnter();
        $(byText(hobby1)).click();
        $(byText(hobby2)).click();
        $("#uploadPicture").uploadFromClasspath(image);
        $("#currentAddress").val(address);
        $("#react-select-3-input").val(state).pressEnter();
        $("#react-select-4-input").val(city).pressEnter();
        $("#submit").click();
    }

    public void checkData() {
        $(".modal-content").shouldHave(text(firstName), text(lastName), text(email), text("Male"),
                text(mobile), text(month), text(year), text("12"), text(interest1), text(interest2), text(hobby1), text(hobby2),
                text(image), text(address), text(state), text(city));
    }



}

