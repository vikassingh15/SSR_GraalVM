package com.demo.ssr.comments;

import com.demo.ssr.utils.Functions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Handles creating new comments and fetching all comments via AJAX.
 */

@RestController
@RequestMapping(value = "/api", produces = APPLICATION_JSON_VALUE)
public class CommentResource {

	@Autowired
	private CommentRepository repository;

	@RequestMapping(path = "/comments", method = POST)
	public Comment add(@Valid @RequestBody Comment comment) {
		return repository.save(comment);
	}

	@RequestMapping(path = "/comments", method = GET)
	public List<Comment> comments() {
		// You shouldn't do this in a real app - you should page the data!
		return Functions.map(repository.findAll(), c -> c);
	}
}
