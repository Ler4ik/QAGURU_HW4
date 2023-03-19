import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @Test
    void dragAndDrop(){
        //открыть https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //перенести прямоугольник А на место В
        $("#column-a").dragAndDropTo("#column-b");
        //проверить, что прямоугольники действительно поменялись
        $("#column-b").shouldHave(text("A"));
        $("#column-a").shouldHave(text("B"));

    }

}
