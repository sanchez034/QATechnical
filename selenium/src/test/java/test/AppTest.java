package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.appPage;
//The first Selenium TestNG test.

public class AppTest extends BaseTest{


    // -----------------------------------------------------Tests-------------------------------------------------------------------------------
    @Test
    public void TestWithAllResultsFound (){
        appPage pageObject = new appPage(driver);
        
        pageObject.search("black");
        String name = pageObject.selectProduct();
        String size = pageObject.selectSize();
        pageObject.addToCart();
        pageObject.makeOrder();
        pageObject.openCart();
        assertTrue(pageObject.checkItem(name, size), "Check that the item is on the basket");
    }
    
    @Test
    public void AdidasTest (){
        appPage pageObject = new appPage(driver);
        
        pageObject.search("adidas");
        String name = pageObject.selectProduct();
        String size = pageObject.selectSize();
        pageObject.addToCart();
        pageObject.makeOrder();
        pageObject.openCart();
        assertTrue(pageObject.checkItem(name, size), "Check that the item is on the basket");
    }

}
