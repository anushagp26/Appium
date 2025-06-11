package rahulshettyacademy;

import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DemoTest {
	@Test
	public class Test1{
		 UiAutomator2Options options = new UiAutomator2Options();
	     //   options.setDeviceName("Anusha");
	       // options.setApp("C:\\Users\\santh\\Downloads\\Appium\\Appium\\src\\test\\java\\ApiDemos-debug.apk");
	       // options.setApp("C://Users//santh//Downloads//Appium//Appium//src//test//java//ApiDemos-debug.apk");
	    //    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

	        // Add your test logic here

	       // driver.quit(); // Always close the driver
		  int[] str= {1,2,3,1};  
			boolean flag = false;
			{
		for(int i=0;i<str.length;i++)
		{
		for(int j=i+1;j<str.length;j++)
		{
		if(str[i]==str[j])
		{
		System.out.println(str[i]);
		flag = true;
		}
		}
		}
		if(flag ==false)
		{
		    System.out.println("not");
		}
		    

		 System.out.print("anusha"); 


		
		System.out.println("Rushika");

		System.out.println("not1111214584");
		System.out.println("santhosh");
		
		System.out.println("Anusha");

	}

}
}

