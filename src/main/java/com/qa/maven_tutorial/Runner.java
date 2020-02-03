package com.qa.maven_tutorial;

import com.qa.tutorial.Interaction;

public class Runner {
	public static void main(String[] args) {
		Interaction interaction =new Interaction();
			System.out.println(interaction.greeting() +" "+interaction.insult());
	
	}

 }
