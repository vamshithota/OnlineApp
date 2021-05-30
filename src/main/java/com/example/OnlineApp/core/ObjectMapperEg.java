package com.example.OnlineApp.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperEg {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
			
		ObjectMapper mmapper = new ObjectMapper();
		Car car = new Car("White","v6");
		mmapper.writeValue( new File("src/main/resources/car.json"), car);
	}

}
