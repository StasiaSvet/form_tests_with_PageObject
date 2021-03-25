package tests.tests;

import org.junit.jupiter.api.Test;
import tests.pages.FormWithFakerPage;

public class FormWithFakerTests {

    FormWithFakerPage formTestsWithJFakerObject = new FormWithFakerPage();

    @Test
    void successfulFormstTest() {
        formTestsWithJFakerObject.openPage();
        formTestsWithJFakerObject.fillForm();
        formTestsWithJFakerObject.checkData();
    }
}
