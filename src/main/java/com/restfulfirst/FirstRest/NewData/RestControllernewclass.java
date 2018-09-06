package com.restfulfirst.FirstRest.NewData;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.restfulfirst.FirstRest.Newuser.User;

@RestController
public class RestControllernewclass {

	private Daoclass objec;

	// Doing Mapping without any variable
	@GetMapping("/newusers")
	public String newrestapi() {
		return "Hello my new class";
	}

	@GetMapping("/allusers")
	public List<AccessClass> allusers() {
		return objec.findAlluser();
	}

	// Making dependedecie class which we mapped with two different variables.

	@GetMapping(path = "/accessclasses")
	public AccessClass accessclass() {
		return new AccessClass("Akash", "Hello", 1);
	}

	@GetMapping(path = "/accessclasses/id/{nam}/{nam1}")
	public AccessClass accessclass(@PathVariable String nam, @PathVariable String nam1, @PathVariable int id) {
		return new AccessClass(String.format("String Two Name,%s", nam), nam1, id);

	}

	/*
	 * @PostMapping(path="/tosavedatainuser") public ResponseEntity<Object>
	 * createuserdata(@Valid @RequestBody AccessClass objec) { User savedUser =
	 * objec.save(objec); // CREATED // /user/{id} savedUser.getId()
	 * 
	 * URI location =
	 * ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand
	 * (savedUser.getId()) .toUri();
	 * 
	 * return ResponseEntity.created(location).build();
	 * 
	 * }
	 */

}
