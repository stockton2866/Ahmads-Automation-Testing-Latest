package Package2;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class Add_New_Music extends baseClass {
	
	
	//(retryAnalyzer = Package2.RetryAnalyzer.class)
	@Test 
	public void AddMusic () {
		JavascriptExecutor jse = (JavascriptExecutor) driver;//Scroll Down
//		jse.executeScript("window.scrollBy(0,200)");
				
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(180));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='profile-container cta-item nav-menu-desktop']//div[@class='nav-item dropdown']")));

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
		
		
		//Click Add New Song
		WebElement addSong = driver.findElement(By.xpath("//span[text()='Add New Song']"));
		addSong.click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement modalContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='my_music_upload']//div[@class='modal-content']")));
		
		//Song Name/Title*
		WebElement songName = modalContainer.findElement(By.xpath("//div[@id='my_music_upload']//input[@type='text']"));
		songName.click();
		songName.sendKeys("Audio Song Uploaded by Selenium Title 1");
		
		//Song Description*
		WebElement songDescription = modalContainer.findElement(By.xpath("//div[@id='my_music_upload']//input[@id='my_song_upload_desc']"));
		songDescription.click();
		songDescription.sendKeys("Audio Song Uploaded by Selenium Description 1");
		
		
		//Song Genres Drop down*
		modalContainer.findElement(By.xpath("//span[@id='select2-tags_cate_genres_1297_upload-container']")).click();
		WebElement searchBoxGenre = modalContainer.findElement(By.xpath("//input[@placeholder='Search by keyword']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		searchBoxGenre.sendKeys("Abstract Beats");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		searchBoxGenre.sendKeys(Keys.ENTER);
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Song Languages Drop down*
		modalContainer.findElement(By.xpath("//span[@id='select2-tags_cate_languages_1296_upload-container']")).click();
		WebElement searchBoxLanguage = modalContainer.findElement(By.xpath("//input[@placeholder='Search by keyword']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		searchBoxLanguage.click();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		searchBoxLanguage.sendKeys("Albanian");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		searchBoxLanguage.sendKeys(Keys.ENTER);

		
		//Content Quality Drop down*
		modalContainer.findElement(By.xpath("//span[@id='select2-content_quality_type_music-container']")).click();
		WebElement searchBoxQuality = modalContainer.findElement(By.xpath("//input[@aria-label='Search']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		searchBoxQuality.sendKeys("Professional");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		searchBoxQuality.sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Scroll in modal "Targeting the div of the whole screen (turned blue) when modal is opened"
		WebElement scrollAddNewMusic = driver.findElement(By.xpath("//div[@id='my_music_upload']"));
		jse.executeScript("arguments[0].scrollTop += 50;", scrollAddNewMusic);
		
		//Click Next Button
		modalContainer.findElement(By.xpath("//a[@category-title='music'][normalize-space()='Next']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//waiting for (Step 2 of 3) bar
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Step 2 of 3')]")));
		
		//Click Browse button (music)
		modalContainer.findElement(By.id("my_song_upload_audio_video")).click();
		
		
		//Pop-up Modal of Select File //Uploading File
		
		//Waiting for Pop-up Modal of Select Audio File to open
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='music_upload_modal']//div[@class='modal-content']")));

		//Uploading Audio File
		File uploadAudioFile = new File("C:\\eclipse-workspace\\SeleniumTraining\\Files\\Audio1.mp3");
		
		WebElement fileAudioInput = modalContainer.findElement(By.xpath("//div[@id='music_upload_modal']//input[@name='video_song_file']"));
		fileAudioInput.sendKeys(uploadAudioFile.getAbsolutePath());
		
		//waiting for Success validation message (Song is Uploaded....)
		WebElement messageAudioElement = modalContainer.findElement(By.xpath("//div[@id='music_upload_modal']//div[@class='modal-body']"));
		wait.until(ExpectedConditions.textToBePresentInElement(messageAudioElement, "Song is uplaoded and thumbnail created successfully!"));
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click Done After success validation message (Song is Uploaded....) appears
		modalContainer.findElement(By.xpath("//button[@category-title='music']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		modalContainer.findElement(By.xpath("//div[@class='poster_edit_btn edit_content_thumbnail']//i[@title='Edit Image']")).click();
		
		
		//Pop-up Modal of Select Audio File thumbnail //Uploading File
		
		//Waiting for Pop-up Modal of Select Audio File to open
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='single_image_upload_modal_id']//div[@class='modal-content']")));
																				
		//Uploading Audio File Thumbnail
		File uploadAudioThumbnailFile = new File("C:\\eclipse-workspace\\SeleniumTraining\\Files\\Audiothumbnail.jpg");
				
		WebElement fileAudioThumbnailInput = modalContainer.findElement(By.xpath("//input[@class='custom-file-input mt-0 upload_single_image_file']"));
		fileAudioThumbnailInput.sendKeys(uploadAudioThumbnailFile.getAbsolutePath());
		
		//waiting for Success validation message (Song is Uploaded....)
		WebElement messageAudioThumbnailElement = modalContainer.findElement(By.xpath("//div[@id='single_image_upload_modal_id']//div[@class='modal-content']"));
		
		wait.until(ExpectedConditions.textToBePresentInElement(messageAudioThumbnailElement, "File is valid, and has been successfully uploaded."));
				
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
				
		//Click Done After success validation message (Song is Uploaded....) appears
		modalContainer.findElement(By.xpath("//button[@class='wvc-button wvc-button-hover wvc-button-size-xs select_single_img_button']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click Next Button on (Step 2 of 3)
		modalContainer.findElement(By.xpath("//a[@category-title='music'][normalize-space()='Next']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//waiting for (Step 3 of 3) bar
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Step 3 of 3')]")));
		
		//Scroll in modal "Targeting the div of the whole screen (turned blue) when modal is opened"
		WebElement scrollAddNewMusicSubmit = driver.findElement(By.xpath("//div[@id='my_music_upload']"));
		jse.executeScript("arguments[0].scrollTop += 30;", scrollAddNewMusicSubmit);
		
		
		//Click Submit Button (Music)
		modalContainer.findElement(By.xpath("//div[@id='my_music_upload']//button[@id='my_song_upload_save']")).click();
		
	}
	
//	@Test (priority = 2)
//	public void VerifyAddMusic() {
//		
//	}

}
