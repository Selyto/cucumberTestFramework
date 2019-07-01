package managers;

import java.io.IOException;

import dataReader.ConfigReader;
import dataReader.ExcelReader;
import dataReader.JSONReader;

public class FileReaderManager {

    ConfigReader configFileReader;
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager fileRead() {
		return new FileReaderManager();
	}
	
	public ConfigReader getConfiguration() throws IOException {
		return new ConfigReader();
	}
	
	public ExcelReader getExcel() throws IOException {
		return new ExcelReader();
	}
	
	public JSONReader getJSON() throws IOException {
		return new JSONReader();
	}
}

