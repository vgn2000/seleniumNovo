package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;

public class EditorPage extends BasePage {

	public EditorPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	private By editorLocator = By.id("tinymce");
	private By frame = By.tagName("iframe");

	
	
	/** Get text from TinyMCE WYSIWYG Editor 
	 * @throws IOException */
	public String getEditorText() throws IOException {
		switchToFrame(frame);
		String text = find(editorLocator).getText();
		return text;
	}
	
	
}
