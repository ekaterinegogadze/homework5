import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class Elitelectronics extends ChromeRunner {
    @Test
    public void EEtest() {


        $(".btn-register").click();
        $("#firstName").setValue("eka").shouldNotBe(Condition.empty);
        $("#lastName").setValue("gogadze").shouldNotBe(Condition.empty);
        $("#email").setValue("eka.gogadze88@gmail.com").shouldNotBe(Condition.empty);
        $("#password").setValue("Testtest1").shouldNotBe(Condition.empty);
        $("#confirmPassword").setValue("Testtest1").shouldNotBe(Condition.empty);
        $("#singup").shouldNotBe(Condition.empty);
        $("#singup").shouldBe(Condition.enabled);
    }
}
