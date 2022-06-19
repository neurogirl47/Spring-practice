package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileReaderFortuneService implements FortuneService {
		
		@Override
		public String getFortune() {
			
			String[] data = new String[3];
			String line;
			
			//read string from the file
			try {
				BufferedReader reader = new BufferedReader(new FileReader("fortunes.txt"));
			
				for(int i = 0; i < 3; i++ ) {
				line = reader.readLine();
				data[i] = line;
				}
			reader.close();
			} catch(IOException e)
			{
				e.printStackTrace();
			}
			
			//create a random number generator
			Random myRandom = new Random();
			
			// pick a random string from the array
			int index = myRandom.nextInt(data.length);
			
			String theFortune = data[index];
			
			return theFortune;
		}

}
