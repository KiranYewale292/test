package com.guru99automation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99automation.pageobject.Guru99Base;
import com.guru99automation.pageobject.Guru99LoginPage;
import com.guru99automation.utilities.ExcelReader;


public class Guru99LoginPageTest extends Guru99Base 
{
	
	private static final String FilePath = null;
	private static final String SheetName = null;
    public ExcelReader rdr = new ExcelReader();
    @Test
	public void LoginTest()
	{  
		logger.info("Enter URL:" + baseURL);
		driver.get(baseURL);
	    
		Guru99LoginPage lp= new Guru99LoginPage(driver);
	    logger.info("Set UserName:" + userName);
	    lp.setUserName(userName);
	    logger.info("Set Password:" + password);
	    lp.setPassword(password);
        logger.info("Click on Submit button");
	    lp.clickSubmit();    
    
        if(driver.getTitle().equals("facebook"))
        {
        	logger.info(driver.getTitle() + ":: is verified is expected title");
        	Assert.assertTrue(true, "you are @ right place");
        }
        else
        {
        	logger.info(driver.getTitle()+ ":: is not expected title");
        	Assert.assertTrue(false, "you are @ wrong place");
        }
	}
	
	
	/*public Object[][] getData()
	{
		Object[][] returnData=null;
		int rowid=0;
		int rowcount=rdr.getRowCount(FilePath,SheetName);
		int colCount=rdr.getColCount(FilePath,SheetName,rowid);
		for(int i=1; i<rowcount; i++)
		{
			for(int j=0; j<colCount; j++)
			{
				
				returnData[i-1][j]=rdr.getDataInGrid(FilePath,SheetName,i,j);
			}
		}
		//return retunData;
		
		
		
		return returnData;
	}*/
	
	
  
	
	
	
	
	
	
}
