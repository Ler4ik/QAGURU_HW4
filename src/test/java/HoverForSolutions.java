import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HoverForSolutions {

    @Test
    void hoverForSolutionsHaveEnterprise(){
        //открыть https://github.com/
        open("https://github.com/");
        //навести на Solutions
        $("div.header-menu-wrapper").$(byText("Solutions")).hover();
        //выбрать Enterprise
        $("div.header-menu-wrapper").$$("ul li a").
                findBy(text("Enterprise")).click();
        //проверить, что страница Enterprise загрузилась(есть заголовок"Build like the best.")
        $(byText("Build like the best"));
    }
}
