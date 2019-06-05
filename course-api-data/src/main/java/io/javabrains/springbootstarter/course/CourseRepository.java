 package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

// CrudRepository is a generic type so CrudRepository<@Entity class, data type of @id>
public interface CourseRepository extends CrudRepository<Course, String>{
	public List<Course> findByTopicId(String name);
}
