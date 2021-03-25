package com.devsuperior.aulamongo.services;

import com.devsuperior.aulamongo.models.dto.PostDTO;
import com.devsuperior.aulamongo.models.entities.Post;
import com.devsuperior.aulamongo.repositories.PostRepository;
import com.devsuperior.aulamongo.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;

	public PostDTO findById(String id) {
		Post entity = getEntityById(id);
		return new PostDTO(entity);
	}

	private Post getEntityById(String id) {
		Optional<Post> result = repository.findById(id);
		return result.orElseThrow(() -> new ResourceNotFoundException("Recurso no encontrado"));
	}
}
