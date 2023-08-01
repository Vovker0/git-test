package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

    @Test
    void googleTest() {
        open("https://google.com");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"));
    }
}
