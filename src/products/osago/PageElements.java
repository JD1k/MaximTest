package products.osago;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.WithTextCaseInsensitive;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PageElements {

    public static SelenideElement test = $x("//span[text()='Рассчитать стоимость']");
    public static SelenideElement okno = $x("//div[@class='SelectFieldInner__indicators css-1wy0on6']//div");
    // Транспортное средство
    public static SelenideElement Type = $(new WithTextCaseInsensitive("Легковые ТС (B)"));
    public static SelenideElement tsCategory = $x("//div[@class='SelectFieldInner__value-container SelectFieldInner__value-container--has-value css-1hwfws3']");
    public static SelenideElement enginePower = $x("//*[@class='input-group']/input[@name='content.object.data.power.value']");
    public static SelenideElement Marka = $x("//*[@id='content-object-data-mark']//div[@class='SelectFieldInner__value-container css-1hwfws3']");
    public static SelenideElement Year = $x("//*[@class='input-group']/input[@name='content.object.data.prodYear']");
    public static SelenideElement Model = $x("");// Модель тс заблокировано
    public static SelenideElement tsVin = $x("//*[@class='input-group']/input[@name='content.object.data.vin']");
    public static SelenideElement tsNumber = $x("//*[@class='input-group']/input[@name='content.object.data.gosNumber']");
    // Серия и номер СТС
    public static SelenideElement stsSeries = $x("//*[@class='input-group']/input[@name='content.object.data.sts.seria']");
    public static SelenideElement stsNumber = $x("//*[@class='input-group']/input[@name='content.object.data.sts.number']");
    public static SelenideElement stsData = $x("//*[@class='input-group']/input[@name='content.object.data.sts.doi']");
    //Срок страхования
    public static SelenideElement inBenning = $x("//*[@class='input-group']/input[@name='content.object.data.periods[0].beginDate']");
    public static SelenideElement inBefore = $x("//*[@class='input-group']/input[@name='content.object.data.periods[0].endDate']");
    // Переход на следующую вкладку
    public static SelenideElement resume = $x("//*[@class='text-right']/button");

    ////div[text()='Легковые ТС (B)']

}
