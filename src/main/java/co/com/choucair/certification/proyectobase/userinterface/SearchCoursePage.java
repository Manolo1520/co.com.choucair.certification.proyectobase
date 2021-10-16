package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the("button that shows us the course selected").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/aside/section[1]/div/div/div[1]/center/div/div/div/div[2]/div[1]/a/h4/strong"));
    public static final Target INPUT_COURSE = Target.the("Search de course").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("button to search de course").located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));
    public static final Target SELECT_COURSE = Target.the("Selection the course required").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div/h4/a"));
    public static final Target NAME_COURSE = Target.the("Find de name of course").located(By.xpath("/html/body/div[1]/div[2]/div/header/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));
}
