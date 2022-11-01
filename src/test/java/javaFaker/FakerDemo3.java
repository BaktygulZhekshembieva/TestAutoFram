package javaFaker;

import com.github.javafaker.Faker;

public class FakerDemo3 {
    public static void main(String[] args) {

        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String funnyName = faker.funnyName().name();
        long randomNumber = faker.number().randomNumber();
        int randomDigit = faker.number().randomDigit();
        int randomNamberBetween1And10 = faker.number().numberBetween(1,10);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
        System.out.println(funnyName);
        System.out.println(randomNumber);
        System.out.println(randomDigit);
        System.out.println(randomNamberBetween1And10);
    }
}
