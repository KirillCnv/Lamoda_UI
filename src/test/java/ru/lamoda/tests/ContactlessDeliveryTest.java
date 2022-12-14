package ru.lamoda.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Feature("Проверка сайта https://www.lamoda.ru/")
@Story("Проверка сайта")
@Owner("KirillCnv")
@Severity(SeverityLevel.CRITICAL)
@Link(value = "Testing", url = "https://www.lamoda.ru/")

public class ContactlessDeliveryTest extends TestConfig {

    @DisplayName("Проверка страницы \"Бесконтактная доставка  с примеркой\"")
    @Tag("Lamoda")
    @Test
    void CheckDelivery() {
        step("Открыть главную страницу", () ->
                open("/")
        );
        step("Кликнуть на кнопку \"Бесконтактная доставка  с примеркой\"", () ->
                contactlessDeliveryPage.clickButtonDelivery()
        );
        step("Проверить, что открылось окно \"Бесконтактная доставка  с примеркой\"", () ->
                contactlessDeliveryPage.checkWindowDelivery()
        );
    }
}