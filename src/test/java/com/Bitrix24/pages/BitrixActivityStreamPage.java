package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Created by Serhat -S

public class BitrixActivityStreamPage
{
    //This is the Activity Stream Page (POM) -S
    
    public BitrixActivityStreamPage()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    
    //Poll section start -S
    @FindBy (id = "feed-add-post-form-tab-vote")
    public WebElement poll_section_button;
    
    @FindBy (xpath = "//body[@contenteditable='true']")
    public WebElement message_title_field;
    
    @FindBy (xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement message_title_iframe;
    
    @FindBy (name = "UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][QUESTION]")
    public WebElement question_text_field;
    
    @FindBy (name = "UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][0][MESSAGE]")
    public WebElement answer1_text_field;
    
    @FindBy (name = "UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][1][MESSAGE]")
    public WebElement answer2_text_field;
    
    @FindBy (id = "blog-submit-button-save")
    public WebElement send_button;
    
    @FindBy (id = "bx-b-uploadfile-blogPostForm")
    public WebElement upload_button_menu_open;
    
    @FindBy (name = "bxu_files[]")
    public WebElement upload_button;
    //Poll section end -s
}
