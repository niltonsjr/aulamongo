package com.devsuperior.aulamongo.controllers;

import com.devsuperior.aulamongo.models.dto.PostDTO;
import com.devsuperior.aulamongo.models.dto.UserDTO;
import com.devsuperior.aulamongo.services.PostService;
import com.devsuperior.aulamongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostController {

	@Autowired
	private PostService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<PostDTO> findById(@PathVariable String id) {
		PostDTO obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
