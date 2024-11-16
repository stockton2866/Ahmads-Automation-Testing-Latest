package Package2;

import java.io.File;
import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class Add_New_Music_Playlist {
	
	public static WebDriver driver;
	
	
	@Test (priority = 1)
	public void AddMusicPlaylist() {
		
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(180));	
	JavascriptExecutor jse = (JavascriptExecutor) driver;//Scroll Down	
	jse.executeScript("window.scrollBy(0,500)");	
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Click Create Play list (Song)
	driver.findElement(By.xpath("//*[@id=\"play_list_for_music\"]/div[1]/div/a")).click();		
	
	//Waiting for Create Play list modal container to appear.
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	WebElement modalPlaylistContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='artist_playlist_music_create']//div[@class='modal-content']")));
	
	//Clicking Play list Title*
	WebElement playlistMusicTitle = modalPlaylistContainer.findElement(By.xpath("//div[@id='artist_playlist_music_create']//div[@class='form-group playlist_name_create']//input[@type='text']"));
	playlistMusicTitle.click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	playlistMusicTitle.sendKeys("Playlist 1 Title Created by Selenium");
	
	//Clicking Play list Description*
	WebElement playlistDescriptionTitle = modalPlaylistContainer.findElement(By.xpath("//div[@id='artist_playlist_music_create']//div[@class='form-group playlist_desc_create']//input[@type='text']"));
	playlistDescriptionTitle.click();
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	playlistDescriptionTitle.sendKeys("Playlist 1 Description Created by Selenium");
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Click Browse Play list Image button (music Play list)
	modalPlaylistContainer.findElement(By.xpath("//div[@id='artist_playlist_music_create']//a[@class='create_playlist_banner wvc-button wvc-button-hover cursor_point'][normalize-space()='Browse']")).click();
	
	
	//Pop-up Modal of Select File //Uploading Play List File
	
	//Waiting for Pop-up Modal of Select Play List Play List File to open
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='single_image_upload_modal_id']//div[@class='modal-content']")));
	
	//Uploading Album Play List File
	File uploadPlaylistFile = new File("C:\\eclipse-workspace\\SeleniumTraining\\Files\\PlaylistThumbnail.jpg");
	
	WebElement filePlaylistInput = modalPlaylistContainer.findElement(By.xpath("//input[@class='custom-file-input mt-0 upload_single_image_file']"));
	filePlaylistInput.sendKeys(uploadPlaylistFile.getAbsolutePath());
	
	//waiting for Success validation message (Play List/File is Uploaded....)
	WebElement messageAudioPlaylistElement = modalPlaylistContainer.findElement(By.xpath("//div[@id='single_image_upload_modal_id']//div[@class='modal-content']"));
	wait.until(ExpectedConditions.textToBePresentInElement(messageAudioPlaylistElement, "File is valid, and has been successfully uploaded."));


	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Click Done After success validation message (Play List is Uploaded....) appears
	driver.findElement(By.xpath("//button[@class='wvc-button wvc-button-hover wvc-button-size-xs select_single_img_button']")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	//Play List Type drop down (Public, Private,...)
	modalPlaylistContainer.findElement(By.xpath("//body[1]/div[32]/div[1]/div[1]/div[2]/div[4]/span[1]/span[1]/span[1]")).click();
	WebElement dropDownPlaylistSearch = modalPlaylistContainer.findElement(By.xpath("//input[@aria-label='Search']"));
	dropDownPlaylistSearch.click();
	dropDownPlaylistSearch.sendKeys("Public");
	dropDownPlaylistSearch.sendKeys(Keys.ENTER);
			

	//Scroll in modal "Targeting the div of the whole screen (turned blue) when modal is opened"
	WebElement scrollPlaylist = driver.findElement(By.xpath("//div[@id='artist_playlist_music_create']"));
	jse.executeScript("arguments[0].scrollTop += 200;", scrollPlaylist);
	
	
	//Click Multiple Song Play list Songs
	modalPlaylistContainer.findElement(By.xpath("//body[1]/div[32]/div[1]/div[1]/div[2]/div[5]/span[1]/span[1]/span[1]")).click();
	
	// Finding <ul> element
	WebElement ulPlaylistElement = driver.findElement(By.id("select2-playlist_music_select_create-results"));

	// Finding <li> elements
	List<WebElement> liPlaylistElements = ulPlaylistElement.findElements(By.tagName("li"));

	// Click the first and second <li> elements
	liPlaylistElements.get(0).click();
	liPlaylistElements.get(1).click();
	liPlaylistElements.get(2).click();
	liPlaylistElements.get(4).click();

	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
	//AgainClick Multiple Song Play list Songs Field
	modalPlaylistContainer.findElement(By.xpath("//span[@aria-expanded='true']")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	jse.executeScript("arguments[0].scrollTop += 100;", scrollPlaylist);

	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Click on modal 
	driver.findElement(By.xpath("//div[@id='artist_playlist_music_create']//div[@class='modal-content']")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Click Save Changes Button.
	modalPlaylistContainer.findElement(By.xpath("//div[@id='artist_playlist_music_create']//button[@type='button'][normalize-space()='Save Changes']")).click();

	}

}
