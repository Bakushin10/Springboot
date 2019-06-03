 package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

// CrudRepository is a generic type so CrudRepository<Entity class, data type of id>
public interface TopicRepository extends CrudRepository<Topic, String>{

}
