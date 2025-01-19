package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJUnitTest {
    @Test
    void successfulSearchTest() {
        Configuration.pageLoadStrategy = "eager";
        open("https://www.google.com/");
        $("[name=q]").setValue("сигмабой2").pressEnter();
        $("[id=search]").shouldHave(text("https://ru.selenide.org"));
    }
    @Test
    void firstTest(){
     Assertions.assertTrue(3>2);
    }
}
