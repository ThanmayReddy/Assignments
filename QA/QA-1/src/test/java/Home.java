import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Home {
    @Test(description = "Verify that home page is displayed after cliclking on the url or not")
    public void launch() {
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.quit();
    }

    @Test(description = "Verify that on clicking on login button user is redirected to login page or not ")
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.get(webDriver.getCurrentUrl());
        WebElement login = webDriver.findElement(By.xpath("//a[@name='Login']"));
        login.click();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriver.quit();
    }

    @Test(description = "Verify that when user clicks on a product, user should be redirected to product specification page.")
    public void productOnclick() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.get(webDriver.getCurrentUrl());
        WebElement product = webDriver.findElement(By.xpath("//div[@name='card_content_Cameras']"));
        product.click();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriver.quit();
    }

    @Test(description = "Verify that when user clicks on add to cart, the product should be added to cart.")
    public void AddToCart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.get(webDriver.getCurrentUrl());
        WebElement product = webDriver.findElement(By.xpath("//div[@name='card_content_Cameras']"));
        product.click();
        WebElement addtocart = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-products/div/main/div/div/div/ul/li/div/div[3]/div/div/div/div[2]/div[2]/button"));
        addtocart.click();
        WebElement username = webDriver.findElement(By.xpath("//*[@id='ng-app']/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[1]/div/div/div/wm-input/input"));
        username.sendKeys("user");
        WebElement password = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[2]/div/div/div/wm-input/input"));
        password.sendKeys("user");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement signin = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[3]/button"));
        signin.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.quit();
    }

    @Test(description = "Verify that search field accepts alphabets, numbers or symbols.")
    public void searchbar() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.get(webDriver.getCurrentUrl());
        WebElement searchbar = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-main/div/header/div/app-partial-header/section/div/div/div[2]/div/input[1]"));
        searchbar.sendKeys("Canon PowerShot SX160 IS Point & Shoot");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchbar.sendKeys(Keys.ENTER);
        webDriver.quit();


    }

    @Test(description = "Verify that after entering search text and clicking on search icon, the search should be performed.")
    public void searchButton() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.get(webDriver.getCurrentUrl());
        WebElement searchbar = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-main/div/header/div/app-partial-header/section/div/div/div[2]/div/input[1]"));
        searchbar.sendKeys("Canon PowerShot SX160 IS Point & Shoot");
        WebElement searchbutton = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-main/div/header/div/app-partial-header/section/div/div/div[2]/div/span[5]"));
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchbutton.click();
        webDriver.quit();
    }

    @Test(description = "Verify that after entering search text and clicking on search icon, the search should be performed.")
    public void removefromcart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.get(webDriver.getCurrentUrl());
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement login = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-main/div/section/app-partial-topnav/section/nav/div/div[2]/ul[2]/li[5]/a"));
        login.click();
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement username = webDriver.findElement(By.xpath("//*[@id='ng-app']/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[1]/div/div/div/wm-input/input"));
        username.sendKeys("user");
        WebElement password = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[2]/div/div/div/wm-input/input"));
        password.sendKeys("user");
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement signin = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[3]/button"));
        signin.click();
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement mycart = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-main/div/section/app-partial-topnav/section/nav/div/div[2]/ul[2]/li[1]/a"));
        mycart.click();
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement closebutton = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-mycart/div/main/div/div/div/div[2]/div[1]/div/div/div/div/ul/li/div/div[3]/div/div/div/div[2]/div[5]/button"));
        closebutton.click();
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        webDriver.quit();

    }

    @Test(description = "Verify that user should be able to place the order of items present in cart.")
    public void orderfromcart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.get(webDriver.getCurrentUrl());
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement login = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-main/div/section/app-partial-topnav/section/nav/div/div[2]/ul[2]/li[5]/a"));
        login.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement username = webDriver.findElement(By.xpath("//*[@id='ng-app']/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[1]/div/div/div/wm-input/input"));
        username.sendKeys("user");
        WebElement password = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[2]/div/div/div/wm-input/input"));
        password.sendKeys("user");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement signin = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[3]/button"));
        signin.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement mycart = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-main/div/section/app-partial-topnav/section/nav/div/div[2]/ul[2]/li[1]/a"));
        mycart.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement placeorder = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-mycart/div/main/div/div/div/div[2]/div[2]/div/div/div[3]/div/button"));
        placeorder.click();
        webDriver.quit();
    }

    @Test(description = "Verify that user should be able to place the order of items present in cart.")
    public void addAddress() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.get(webDriver.getCurrentUrl());
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement login = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-main/div/section/app-partial-topnav/section/nav/div/div[2]/ul[2]/li[5]/a"));
        login.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement username = webDriver.findElement(By.xpath("//*[@id='ng-app']/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[1]/div/div/div/wm-input/input"));
        username.sendKeys("user");
        WebElement password = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[2]/div/div/div/wm-input/input"));
        password.sendKeys("user");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement signin = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[3]/button"));
        signin.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement mycart = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-main/div/section/app-partial-topnav/section/nav/div/div[2]/ul[2]/li[1]/a"));
        mycart.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement placeorder = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-mycart/div/main/div/div/div/div[2]/div[2]/div/div/div[3]/div/button"));
        placeorder.click();
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement next = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-paymentprocess/div/main/div/div/div/div/div[1]/div/div[3]/div/button[2]"));
        next.click();
        WebElement add = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-paymentprocess/div/main/div/div/div/div/div[1]/div/div[2]/form[2]/div/div[2]/div[1]/a/span[2]"));
        add.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.quit();
    }

    @Test(description = "Verify that user should be able to select filters and get result ss opted.")
    public void filters() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.get(webDriver.getCurrentUrl());
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement allproducts = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-main/div/section/app-partial-topnav/section/nav/div/div[2]/ul[1]/li[2]/a/span[2]"));
        allproducts.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement filter = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-allproducts/div/main/div/div/div[2]/ul/li[2]/a/div/span"));
        filter.click();
        webDriver.quit();
    }

    @Test(description = "Verify that user should be able to see out of stock items when selected include out of stock option")
    public void outofstock() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.get(webDriver.getCurrentUrl());
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement allproducts = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-main/div/section/app-partial-topnav/section/nav/div/div[2]/ul[1]/li[2]/a/span[2]"));
        allproducts.click();
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement includeoutofstock = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-allproducts/div/main/div/div/div[1]/app-partial-filteroptions_partial/section/div/div/div/div/label/span"));
        includeoutofstock.click();
        webDriver.quit();
    }

    @Test(description = "Verify that on loging in with admin credintials should be redirected to admin page ")
    public void adminlogin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.get(webDriver.getCurrentUrl());
        WebElement login = webDriver.findElement(By.xpath("//a[@name='Login']"));
        login.click();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement username = webDriver.findElement(By.xpath("//*[@id='ng-app']/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[1]/div/div/div/wm-input/input"));
        username.sendKeys("admin");
        WebElement password = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[2]/div/div/div/wm-input/input"));
        password.sendKeys("admin");
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement signin = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[3]/button"));
        signin.click();
        webDriver.quit();
    }

    @Test(description = "Verify that on clicking add new button admin should be able to add new products to list ")
    public void addnew() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.get(webDriver.getCurrentUrl());
        WebElement login = webDriver.findElement(By.xpath("//a[@name='Login']"));
        login.click();
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement username = webDriver.findElement(By.xpath("//*[@id='ng-app']/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[1]/div/div/div/wm-input/input"));
        username.sendKeys("admin");
        WebElement password = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[2]/div/div/div/wm-input/input"));
        password.sendKeys("admin");
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement signin = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[3]/button"));
        signin.click();
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement addnew = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-admin/div/main/div/div/div/div/div[1]/div/app-partial-productslist_admin/section/div/div/div[1]/div/div/div[1]/div[1]/h3/div[3]/button"));
        addnew.click();

        webDriver.quit();

    }

    @Test(description = "verify that on clicking on user button all the user details are visible on screen ")
    public void seeusers() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.get(webDriver.getCurrentUrl());
        WebElement login = webDriver.findElement(By.xpath("//a[@name='Login']"));
        login.click();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement username = webDriver.findElement(By.xpath("//*[@id='ng-app']/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[1]/div/div/div/wm-input/input"));
        username.sendKeys("admin");
        WebElement password = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[2]/div/div/div/wm-input/input"));
        password.sendKeys("admin");
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement signin = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[3]/button"));
        signin.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement user = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-admin/div/main/div/div/div/ul/li[2]/a/div/span"));
        user.click();
        webDriver.quit();
    }
    @Test(description = "verify that on clicking on orders button all the user details are visible on orders ")
    public void seeorders() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.get(webDriver.getCurrentUrl());
        WebElement login = webDriver.findElement(By.xpath("//a[@name='Login']"));
        login.click();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement username = webDriver.findElement(By.xpath("//*[@id='ng-app']/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[1]/div/div/div/wm-input/input"));
        username.sendKeys("admin");
        WebElement password = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[2]/form/div/div[1]/div/div[2]/div/div/div/wm-input/input"));
        password.sendKeys("admin");
        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement signin = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/modal-container/app-partial-common/div/div/div[3]/button"));
        signin.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement orders = webDriver.findElement(By.xpath("//*[@id=\"ng-app\"]/app-root/app-page-admin/div/main/div/div/div/ul/li[3]/a/div/span"));
        orders.click();
        webDriver.quit();
    }
}

