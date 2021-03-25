package tests.tests;

import org.junit.jupiter.api.Test;
import tests.pages.FormTestsPage;

public class FormTests {

    FormTestsPage formTestsPageObjects = new FormTestsPage();

    @Test
    void successfulFormstTest() {
        formTestsPageObjects.openPage();
        formTestsPageObjects.fillForm();
        formTestsPageObjects.checkData();
    }


}
