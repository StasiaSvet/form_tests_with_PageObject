package page;

import org.junit.jupiter.api.Test;
import tests.FormTestsPageObjects;

public class FormTests {

    FormTestsPageObjects formTestsPageObjects = new FormTestsPageObjects();

    @Test
    void successfulFormstTest() {
        formTestsPageObjects.openPage();
        formTestsPageObjects.fillForm();
        formTestsPageObjects.checkData();
    }


    ;
}
