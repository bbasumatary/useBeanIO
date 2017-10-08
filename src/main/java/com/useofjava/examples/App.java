package com.useofjava.examples;

import java.io.File;

import org.beanio.BeanReader;
import org.beanio.StreamFactory;

import com.useofjava.examples.bean.Borehole;

/**
 * @author Biswajeet.Basumatary
 * @date Saturday, 7 October 2017 20:10:11
 * @project useBeanIO
 *
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// create a BeanIO StreamFactory
		StreamFactory factory = StreamFactory.newInstance();

		// load the mapping file from the working directory
		factory.load("src/main/resources/Borehole.xml");

		// create a BeanReader to read from "input.csv"
		BeanReader in = factory.createReader("Boreholes", new File("src/main/resources/5010.dat"));

		Borehole borehole = null;

		// read records from "5010.dat"
		while ((borehole = (Borehole) in.read()) != null) {

			//process the Borehole object as needed
			
			// displaying api and kb elevation
			System.out.println(borehole.getApiWellNumber() + " : " + borehole.getRkbElevation());
		}

	}

}
