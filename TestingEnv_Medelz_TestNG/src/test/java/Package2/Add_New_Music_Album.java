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



public class Add_New_Music_Album {
	
	public static WebDriver driver;
	
	
	@Test (priority = 1)
	public void AddMusicAlbum() {

			
			WebElement profileButton = driver.findElement(By.xpath("//div[@class='profile-container cta-item nav-menu-desktop']//div[@class='nav-item dropdown']"));
			profileButton.click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// Edit Profile Page
			WebElement editProfileButton = driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item internal-link'][normalize-space()='Edit Profile']"));
			editProfileButton.click();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		JavascriptExecutor jse = (JavascriptExecutor) driver;//Scroll Down
			//Scroll Down
			jse.executeScript("window.scrollBy(0,270)");
			
			
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Click Music category (Edit Profile)
			WebElement musicPage= driver.findElement(By.xpath("//a[@id='music-tab']"));
			musicPage.click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//Scroll to Create Album until its visible in the view port.
			jse.executeScript("window.scrollBy(0,900)");
			
			System.out.checkError();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Click Create Album (Song)
			driver.findElement(By.xpath("//*[@id=\"albums_for_music\"]/div[1]/div/a")).click();		
			
			//Waiting for Create Album modal container to appear.
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			WebElement modalAlbumContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='artist_albums_music_create']//div[@class='modal-content']")));
			
			//Clicking Album Title*
			WebElement albumMusicTitle = modalAlbumContainer.findElement(By.xpath("//div[@id='artist_albums_music_create']//div[@class='form-group playlist_name_create']//input[@type='text']"));
			albumMusicTitle.click();
			albumMusicTitle.sendKeys("Album 1 Title Created by Selenium");
			
			//Clicking Album Description*
			WebElement albumDescriptionTitle = modalAlbumContainer.findElement(By.xpath("//div[@id='artist_albums_music_create']//div[@class='form-group playlist_desc_create']//input[@type='text']"));
			albumDescriptionTitle.click();
			albumDescriptionTitle.sendKeys("Album 1 Description Created by Selenium");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Click Browse button (music album)
			modalAlbumContainer.findElement(By.xpath("//div[@id='artist_albums_music_create']//a[@class='create_playlist_banner wvc-button wvc-button-hover cursor_point create_album_banner'][normalize-space()='Browse']")).click();
			
			//Pop-up Modal of Select File //Uploading Thumbnail File
			
			//Waiting for Pop-up Modal of Select Album Thumbnail File to open
			WebDriverWait wait20 = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait20.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='single_image_upload_modal_id']//div[@class='modal-content']")));
			
			//Uploading Album Thumbnail File
			File uploadThumbnailFile = new File("C:\\eclipse-workspace\\SeleniumTraining\\Files\\AlbumThumbnail.jpg");
			
			WebElement fileAudioInput = modalAlbumContainer.findElement(By.xpath("//input[@class='custom-file-input mt-0 upload_single_image_file']"));
			fileAudioInput.sendKeys(uploadThumbnailFile.getAbsolutePath());
			
			//waiting for Success validation message (Thumbnail/File is Uploaded....)
			WebElement messageAudioElementAlbum = modalAlbumContainer.findElement(By.xpath("//div[@id='single_image_upload_modal_id']//div[@class='modal-content']"));
			WebDriverWait wait30 = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait30.until(ExpectedConditions.textToBePresentInElement(messageAudioElementAlbum, "File is valid, and has been successfully uploaded."));
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Click Done After success validation message (Song is Uploaded....) appears
			modalAlbumContainer.findElement(By.xpath("//button[@class='wvc-button wvc-button-hover wvc-button-size-xs select_single_img_button']")).click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//Album Type drop down (Public, Private,...)
			modalAlbumContainer.findElement(By.xpath("//span[@id='select2-album_type_music_create-container']")).click();
			WebElement dropDownAlbumSearch = modalAlbumContainer.findElement(By.xpath("//input[@aria-label='Search']"));
			dropDownAlbumSearch.click();
			dropDownAlbumSearch.sendKeys("Public");
			dropDownAlbumSearch.sendKeys(Keys.ENTER);
					
			
			//Scroll in modal "Targeting the div of the whole screen (turned blue) when modal is opened"
			WebElement scroll = driver.findElement(By.xpath("//div[@id='artist_albums_music_create']"));
			jse.executeScript("arguments[0].scrollTop += 200;", scroll);
			
			
			//Click Multiple Song Album Songs
			modalAlbumContainer.findElement(By.xpath("//body[1]/div[33]/div[1]/div[1]/div[2]/div[5]/span[1]/span[1]/span[1]")).click();
			
			// Finding <ul> element
			WebElement ulElement = driver.findElement(By.id("select2-album_music_select_create-results"));

			// Finding <li> elements
			List<WebElement> liElements = ulElement.findElements(By.tagName("li"));

			// Click the first and second <li> elements
			liElements.get(0).click();
			liElements.get(1).click();	
				
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
			//AgainClick Multiple Song Album Songs Field
			modalAlbumContainer.findElement(By.xpath("//body[1]/div[33]/div[1]/div[1]/div[2]/div[5]/span[1]/span[1]/span[1]")).click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			jse.executeScript("arguments[0].scrollTop += 100;", scroll);
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Click on modal 
			driver.findElement(By.xpath("//div[@id='artist_albums_music_create']//div[@class='modal-body']")).click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Click Save Changes Button.
			modalAlbumContainer.findElement(By.xpath("//*[@id=\"artist_albums_music_create\"]/div/div/div[3]/button[2]")).click();
			
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
	
	}

}
