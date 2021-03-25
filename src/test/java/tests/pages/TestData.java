package tests.pages;

import com.github.javafaker.Faker;

public class TestData {
    Faker faker = new Faker();

    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            mobile = faker.phoneNumber().subscriberNumber(10),
            month = "October",
            year = "1979",
            interest1 = "Civic",
            interest2 = "History",
            hobby1 = "Reading",
            hobby2 = "Music",
            image = "floppa.png",
            address = faker.address().fullAddress(),
            state = "Haryana",
            city = "Panipat";
}
