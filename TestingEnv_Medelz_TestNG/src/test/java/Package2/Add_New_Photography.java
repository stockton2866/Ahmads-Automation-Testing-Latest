package Package2;

import java.io.File;
import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_New_Photography extends baseClass {
	
	
	@Test (priority = 1)
	public void AddPhotography () {
		
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
		JavascriptExecutor jse = (JavascriptExecutor) driver;//Scroll Down
		jse.executeScript("window.scrollBy(0,270)");
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click Photography category (Edit Profile)
		WebElement photographyPage= driver.findElement(By.xpath("//a[@id='photography-tab']"));
		photographyPage.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Click Add New Photography
		WebElement addPhoto = driver.findElement(By.xpath("//*[@id=\"photography_section\"]/div/div/a/span"));
		addPhoto.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement modalContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='my_photography_upload']//div[@class='modal-content']")));
		
		//Photography Name/Title*
		WebElement photographyName = modalContainer.findElement(By.xpath("//div[@id='my_photography_upload']//input[@type='text']"));
		photographyName.click();
		photographyName.sendKeys("Photography Content Uploaded by Selenium Title 1");
		
		//Photography Description*
		WebElement photographyDescription = modalContainer.findElement(By.xpath("//div[@id='my_photography_upload']//input[@id='my_song_upload_desc']"));
		photographyDescription.click();
		photographyDescription.sendKeys("Photography Content Uploaded by Selenium Description 1");
		
		
		//Photography Genres Drop down*
		modalContainer.findElement(By.xpath("//div[@class='form-group tags_cat_row photography_genres']//span[@role='combobox']")).click();
		WebElement searchBoxPhotographyGenre = modalContainer.findElement(By.xpath("//input[@placeholder='Search by keyword']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		searchBoxPhotographyGenre.sendKeys("Abstract Photography");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		searchBoxPhotographyGenre.sendKeys(Keys.ENTER);
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Add Here
		//Scroll inside the modal "Targeting the div of only the modal"
		WebElement scrollInsidePhotographyModal = driver.findElement(By.xpath("//div[@id='my_photography_upload']//div[@class='modal-body']"));
		jse.executeScript("arguments[0].scrollTop += 100;", scrollInsidePhotographyModal);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Photography Content Quality Drop down*
		modalContainer.findElement(By.xpath("//div[@id='my_photography_upload']//div[@class='form-group content_quality_type']//span[@role='combobox']")).click();
		WebElement searchBoxPhotographyQuality = modalContainer.findElement(By.xpath("//input[@aria-label='Search']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		searchBoxPhotographyQuality.sendKeys("Professional");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		searchBoxPhotographyQuality.sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Scroll in modal "Targeting the div of the whole screen (turned blue) when modal is opened"
		WebElement scrollAddNewPhotography = driver.findElement(By.xpath("//div[@id='my_photography_upload']"));
		jse.executeScript("arguments[0].scrollTop += 50;", scrollAddNewPhotography);
		
		
		//Photography Type Drop down*
		modalContainer.findElement(By.xpath("//div[@id='my_photography_upload']//div[@class='form-group']//span[@role='combobox']")).click();
		WebElement searchBoxPhotographyType = modalContainer.findElement(By.xpath("//input[@aria-label='Search']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		searchBoxPhotographyType.sendKeys("Public");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		searchBoxPhotographyType.sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		//Click Next Button
		modalContainer.findElement(By.xpath("//a[@category-title='photography'][normalize-space()='Next']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//waiting for (Step 2 of 3) bar
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Step 2 of 3')]")));
		
		//Click Browse button (photography)
		modalContainer.findElement(By.id("my_song_upload_audio_video")).click();
		
		
		//Pop-up Modal of Select File //Uploading File
		
		//Waiting for Pop-up Modal of Select Photography File to open
		WebDriverWait wait20 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait20.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='photography_upload_modal']//div[@class='modal-content']")));

		//Uploading Photography File
		File uploadPhotographyFile = new File("C:\\eclipse-workspace\\SeleniumTraining\\Files\\Photography1.mp4");
		
		WebElement filePhotographyInput = modalContainer.findElement(By.xpath("//div[@id='photography_upload_modal']//input[@name='video_song_file']"));
		filePhotographyInput.sendKeys(uploadPhotographyFile.getAbsolutePath());
		
		//waiting for Success validation message (Photo is Uploaded....)
		WebElement messagePhotographyElement = modalContainer.findElement(By.xpath("//div[@id='photography_upload_modal']//div[@class='modal-body']"));
		WebDriverWait wait30 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait30.until(ExpectedConditions.textToBePresentInElement(messagePhotographyElement, "Song is uplaoded and thumbnail created successfully!"));
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click Done After success validation message (Photo is Uploaded....) appears
		modalContainer.findElement(By.xpath("//button[@category-title='photography']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Click Next Button on (Step 2 of 3)
		modalContainer.findElement(By.xpath("//a[@category-title='photography'][normalize-space()='Next']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//waiting for (Step 3 of 3) bar
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Step 3 of 3')]")));
		
		//Scroll in modal "Targeting the div of the whole screen (turned blue) when modal is opened"
		WebElement scrollAddNewPhotographySubmit = driver.findElement(By.xpath("//div[@id='my_photography_upload']"));
		jse.executeScript("arguments[0].scrollTop += 30;", scrollAddNewPhotographySubmit);
		
		
		//Click Submit Button (Photography)
		modalContainer.findElement(By.xpath("//div[@id='my_photography_upload']//button[@id='my_song_upload_save']")).click();
		
		///////////////////////////////////////////////
		
		try {
			Thread.sleep(9000);
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
		
		//Click Create Album (Photography)
		driver.findElement(By.xpath("//*[@id=\"albums_for_photography\"]/div[1]/div/a")).click();		
		
		//Waiting for Create Album modal container to appear.
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement modalAlbumContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='artist_albums_photography_create']//div[@class='modal-content']")));
		
		//Clicking Album Title*
		WebElement albumPhotographyTitle = modalAlbumContainer.findElement(By.xpath("//div[@id='artist_albums_photography_create']//div[@class='form-group playlist_name_create']//input[@type='text']"));
		albumPhotographyTitle.click();
		albumPhotographyTitle.sendKeys("Album 1 Photography Title Created by Selenium");
		
		//Clicking Album Description*
		WebElement albumPhotographyDescriptionTitle = modalAlbumContainer.findElement(By.xpath("//div[@id='artist_albums_photography_create']//div[@class='form-group playlist_desc_create']//input[@type='text']"));
		albumPhotographyDescriptionTitle.click();
		albumPhotographyDescriptionTitle.sendKeys("Album 1 Photography Description Created by Selenium");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click Browse button (photography album)
		modalAlbumContainer.findElement(By.xpath("//div[@id='artist_albums_photography_create']//a[@class='create_playlist_banner wvc-button wvc-button-hover cursor_point create_album_banner'][normalize-space()='Browse']")).click();
		
		//Pop-up Modal of Select File //Uploading Thumbnail File
		
		//Waiting for Pop-up Modal of Select Album Thumbnail File to open
		//WebDriverWait wait20 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait20.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='single_image_upload_modal_id']//div[@class='modal-content']")));
		
		//Uploading Album Thumbnail File
		File uploadThumbnailFile = new File("C:\\eclipse-workspace\\SeleniumTraining\\Files\\PhotographyAlbum.jpg");
		
		WebElement fileThumbnailInput = modalAlbumContainer.findElement(By.xpath("//input[@class='custom-file-input mt-0 upload_single_image_file']"));
		fileThumbnailInput.sendKeys(uploadThumbnailFile.getAbsolutePath());
		
		//waiting for Success validation message (Thumbnail/File is Uploaded....)
		WebElement messagePhotoElementAlbum = modalAlbumContainer.findElement(By.xpath("//div[@id='single_image_upload_modal_id']//div[@class='modal-body']"));
		//WebDriverWait wait30 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait30.until(ExpectedConditions.textToBePresentInElement(messagePhotoElementAlbum, "File is valid, and has been successfully uploaded."));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click Done After success validation message (Thumbnail/File is Uploaded....) appears
		modalAlbumContainer.findElement(By.xpath("//button[@class='wvc-button wvc-button-hover wvc-button-size-xs select_single_img_button']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Scroll in modal "Targeting the div of the whole screen (turned blue) when modal is opened"
		WebElement scrollPhotographyAlbum = driver.findElement(By.xpath("//div[@id='artist_albums_photography_create']"));
		jse.executeScript("arguments[0].scrollTop += 200;", scrollPhotographyAlbum);
		
		//Album Type drop down (Public, Private,...)
		modalAlbumContainer.findElement(By.xpath("//body[1]/div[50]/div[1]/div[1]/div[2]/div[4]/span[1]/span[1]/span[1]")).click();
		WebElement dropDownAlbumSearch = modalAlbumContainer.findElement(By.xpath("//input[@aria-label='Search']"));
		dropDownAlbumSearch.click();
		dropDownAlbumSearch.sendKeys("Public");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dropDownAlbumSearch.sendKeys(Keys.ENTER);
				
		
		jse.executeScript("arguments[0].scrollTop += 200;", scrollPhotographyAlbum);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click Multiple Photography Content Album
		modalAlbumContainer.findElement(By.xpath("//*[@id=\"artist_albums_photography_create\"]/div/div/div[2]/div[5]/span/span[1]/span")).click();
		
		// Finding <ul> element
		WebElement ulPhotographyAlbumElement = driver.findElement(By.xpath("//ul[@id='select2-album_photography_select_create-results']"));

		// Finding <li> elements
		List<WebElement> liPhotographyAlbumElements = ulPhotographyAlbumElement.findElements(By.tagName("li"));

		// Click the first and second <li> elements
		liPhotographyAlbumElements.get(0).click();
		liPhotographyAlbumElements.get(1).click();	
			
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click on modal 
		driver.findElement(By.xpath("//div[@id='artist_albums_photography_create']//div[@class='modal-footer']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click Save Changes Button.
		modalAlbumContainer.findElement(By.xpath("//div[@id='artist_albums_photography_create']//button[@type='button'][normalize-space()='Save Changes']")).click();
		
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	jse.executeScript("window.scrollBy(0,500)");	
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Click Create Play list (Photography)
	driver.findElement(By.xpath("//*[@id=\"gallery_section_photography\"]/div/div[1]/div/a")).click();		
	
	//Waiting for Create Play list modal container to appear.
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	WebElement modalPlaylistContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='photography_gallery_create']//div[@class='modal-content']")));
	
	//Clicking Play list Title*
	WebElement playlistPhotographyTitle = modalPlaylistContainer.findElement(By.xpath("//div[@id='photography_gallery_create']//div[@class='form-group playlist_name_create']//input[@type='text']"));
	playlistPhotographyTitle.click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	playlistPhotographyTitle.sendKeys("Playlist 1 Photography Title Created by Selenium");
	
	//Clicking Play list Description*
	WebElement playlistPhotographyDescription = modalPlaylistContainer.findElement(By.xpath("//div[@id='photography_gallery_create']//div[@class='form-group playlist_desc_create']//input[@type='text']"));
	playlistPhotographyDescription.click();
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	playlistPhotographyDescription.sendKeys("Playlist 1 Photography Description Created by Selenium");
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Click Browse Play list Image button (Photography Play list)
	modalPlaylistContainer.findElement(By.xpath("//div[@id='photography_gallery_create']//a[@class='create_playlist_banner wvc-button-hover wvc-button cursor_point'][normalize-space()='Browse']")).click();
	
	
	//Pop-up Modal of Select File //Uploading Play List File
	
	//Waiting for Pop-up Modal of Select Play List Play List File to open
	//WebDriverWait wait20 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait20.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='single_image_upload_modal_id']//div[@class='modal-content']")));
	
	//Uploading Album Play List File
	File uploadPlaylistFile = new File("C:\\eclipse-workspace\\SeleniumTraining\\Files\\PhotographyPlaylist.jpg");
	
	WebElement filePlaylistInput = modalPlaylistContainer.findElement(By.xpath("//input[@class='custom-file-input mt-0 upload_single_image_file']"));
	filePlaylistInput.sendKeys(uploadPlaylistFile.getAbsolutePath());
	
	//waiting for Success validation message (Play List/File is Uploaded....)
	WebElement messagePhotographyPlaylistElement = modalPlaylistContainer.findElement(By.xpath("//div[@id='single_image_upload_modal_id']//div[@class='modal-body']"));
	wait20.until(ExpectedConditions.textToBePresentInElement(messagePhotographyPlaylistElement, "File is valid, and has been successfully uploaded."));


	
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
	
	
	//Scroll in modal "Targeting the div of the whole screen (turned blue) when modal is opened"
	WebElement scrollPhotographyPlaylist = driver.findElement(By.xpath("//div[@id='photography_gallery_create']"));
	jse.executeScript("arguments[0].scrollTop += 300;", scrollPhotographyPlaylist);
	
	//Play List Type drop down (Public, Private,...)
	modalPlaylistContainer.findElement(By.xpath("//body[1]/div[51]/div[1]/div[1]/div[2]/div[4]/span[1]/span[1]/span[1]")).click();
	WebElement dropDownPhotographyPlaylistSearch = modalPlaylistContainer.findElement(By.xpath("//input[@aria-label='Search']"));
	dropDownPhotographyPlaylistSearch.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	dropDownPhotographyPlaylistSearch.sendKeys("Public");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	dropDownPhotographyPlaylistSearch.sendKeys(Keys.ENTER);
			

	jse.executeScript("arguments[0].scrollTop += 600;", scrollPhotographyPlaylist);
	
	//Click Multiple Song Play list Songs
	modalPlaylistContainer.findElement(By.xpath("//*[@id=\"photography_gallery_create\"]/div/div/div[2]/div[5]/span/span[1]/span")).click();
	
	// Finding <ul> element
	WebElement ulPlaylistPhotographyElement = driver.findElement(By.xpath("//ul[@id='select2-gallery_photography_select_create-results']"));

	// Finding <li> elements
	List<WebElement> liPlaylistPhotographyElements = ulPlaylistPhotographyElement.findElements(By.tagName("li"));

	// Click the first and second <li> elements
	liPlaylistPhotographyElements.get(0).click();
	liPlaylistPhotographyElements.get(1).click();
//	liPlaylistPhotographyElements.get(2).click();
//	liPlaylistPhotographyElements.get(4).click();

	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

	//Click on modal 
	driver.findElement(By.xpath("//div[@id='photography_gallery_create']//div[@class='modal-footer']")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	jse.executeScript("arguments[0].scrollTop += 100;", scrollPhotographyPlaylist);

	
	//Click Save Changes Button.
	modalPlaylistContainer.findElement(By.xpath("//div[@id='photography_gallery_create']//button[@type='button'][normalize-space()='Save Changes']")).click();

		
	try {
		Thread.sleep(9000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	//Scroll UPWARDS
	jse.executeScript("window.scrollBy(900,0)");
	
	
	
	}

}
