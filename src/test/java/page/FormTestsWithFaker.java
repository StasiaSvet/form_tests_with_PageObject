package page;

import org.junit.jupiter.api.Test;
import tests.FormTestsWithJFakerObject;

public class FormTestsWithFaker {

    FormTestsWithJFakerObject formTestsWithJFakerObject = new FormTestsWithJFakerObject();

    @Test
    void successfulFormstTest() {
        formTestsWithJFakerObject.openPage();
        formTestsWithJFakerObject.fillForm();
        formTestsWithJFakerObject.checkData();
    }
}
