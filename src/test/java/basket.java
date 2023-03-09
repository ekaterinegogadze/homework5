import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class basket extends ChromeRunner {
    @Test
    public void EEtest1() {

        $(byClassName("cart-count")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byClassName("unexpanded")).$(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
        $(byId("search_list")).setValue("მობილური").pressEnter();
        $(byClassName("button-section")).$(byClassName("add_to_cart")).click();
        $(byClassName("btn-darkred")).click();
        $(byText("კალათა ცარიელია")).shouldNotBe(Condition.visible, Duration.ofMillis(5000));
        $(byClassName("redButton")).click();
        $(byClassName("unexpanded")).$(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldNotBe(Condition.visible);
        $(byClassName("btn-cart")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);

        sleep(3000);
    }
}