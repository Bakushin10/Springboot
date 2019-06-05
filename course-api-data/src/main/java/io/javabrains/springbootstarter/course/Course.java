package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;

/*
 * 
 * 
 * A model object represents data in the MVC (Model View Controller) pattern.
 * An entity object represents data in the ORM (Object Relational Mapping) pattern.
 * They could be the same object. Or not.
 * 
 * An entity is annotated as @Entity, and has a special relationship with your database - 
 * generally each instance of an entity corresponds to a single row and the class itself corresponds 
 * to the table in which those rows are stored. 
 * In any case, we supply annotations for persistence on our entity classes.
 * 
 * Since entity is the model of the db, it also uses the annotation to specify the primary key
 */

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Topic topic;
	
	public Course() {
		
	}
	
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}
