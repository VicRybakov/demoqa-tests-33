package tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest  {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
    }

    @Test
    void fillFormTest() {
        Configuration.pageLoadStrategy = "eager";
        open("/text-box");
        $("#userName").setValue("Виктор");
        $("#userEmail").setValue("7152955@gmail.com");
        $("#currentAddress").setValue("Винокурова");
        $("#permanentAddress").setValue("21");
        $("#submit").click();
        $("#output #name").shouldHave(text("Виктор"));
        $("#output #email").shouldHave(text("7152955@gmail.com"));
        $("#output #currentAddress").shouldHave(text("Винокурова"));
        $("#output #permanentAddress").shouldHave(text("21"));
    }
}
