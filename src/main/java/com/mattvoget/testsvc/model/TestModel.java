package com.mattvoget.testsvc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TestModel 
{
	private String name;
	private String description;
	
	public TestModel(){
		this("Hello","World!");
	}
	
	public TestModel(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
