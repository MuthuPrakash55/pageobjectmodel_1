package bdd.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pageobject.register;

public class base_class {
        public static WebDriver driver;
        public register reg;
        
        
        public static void intializebrowser(String browser) {
			switch (browser) {
			case "chrome":
				driver=new ChromeDriver();
				break;
			case "edge":
				driver=new EdgeDriver();
				break;
	
			default:
				break;
			}
		}
        public static WebDriver getdriver() {
        	return driver;
        }
        
}
