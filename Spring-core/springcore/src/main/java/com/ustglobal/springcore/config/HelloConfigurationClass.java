package com.ustglobal.springcore.config;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

@Configuration
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {

	@Bean(name = "hello")
	//@Scope("prototype")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("I Love Choclate");
		return hello;
	}
	
	/*
	 * @Bean(name = "dog") public Dog getDog() { return new Dog(); }
	 * 
	 * @Bean(name = "cat") public Cat getCat() { return new Cat(); }
	 * 
	 * @Bean(name = "pet") public Pet getPet() { Pet pet = new Pet();
	 * pet.setName("Scooby"); //pet.setAnimal(getDog()); //call getDog() but will
	 * not create new object execute old one and not return new output . return pet;
	 * }
	 */
}
