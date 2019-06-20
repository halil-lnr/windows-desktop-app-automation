package com.thangamfrm.windowsdesktopappautomation;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

@SuppressWarnings("rawtypes")
public class NotepadTest extends Assert {

	private WindowsDriver notepadSession = null;
	private String notepadAppId = "C:\\Windows\\System32\\notepad.exe";

	@BeforeClass
	public void setup() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("app", notepadAppId);
			notepadSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
			notepadSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		} catch (Exception e) {
			fail("Unable to initialize the NotepadTest!" + e.getMessage());
		}
	}

	@Test
	public void testEnterText() {
		WebElement editBox = notepadSession.findElementByClassName("Edit");
		String input = "abcdeABCDE 12345 !@#$%";
		editBox.sendKeys(input);
		assertEquals(editBox.getText(), input, "Text in Notepad is NOT matching with entered/input text!!!");
	}

	@AfterClass
	public void tearDown() {
		// Close the application and delete the session
		if (notepadSession != null) {
			notepadSession.close();
			try {
				// Dismiss Save dialog if it is blocking the exit
				notepadSession.findElementByName("Don't Save").click();
			} catch (Exception e) {
				// ignore
			} finally {
				notepadSession.quit();
				notepadSession = null;
			}
		}
	}

}
