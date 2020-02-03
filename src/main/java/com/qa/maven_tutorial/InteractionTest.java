package com.qa.maven_tutorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.tutorial.Interaction;

public class InteractionTest {
	
	@Test
	public void greetingTest() {
		Interaction interaction = new Interaction();
		assertEquals("Hi friend", interaction.greeting());
		
		
	}

}
