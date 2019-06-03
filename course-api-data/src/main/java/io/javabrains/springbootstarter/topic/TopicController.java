package io.javabrains.springbootstarter.topic;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicservice;
	
	// by default @RequestMapping calls GET method 
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicservice.getAllTopics();
	}
	
	// PathVaraiable enables the passed values to be able to use in the function
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicservice.getTopic(id);
	}
	
	//@RequestBody enables the function to read HTTP request
	// since POST method is called, we need to specify the method = RequestMethod.POST
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicservice.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicservice.updateTopic(id, topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicservice.deleteTopic(id);
	}
}
