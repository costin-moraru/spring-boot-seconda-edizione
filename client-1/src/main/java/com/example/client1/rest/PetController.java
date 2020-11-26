package com.example.client1.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.client1.api.PetApi;
import com.example.client1.model.ModelApiResponse;
import com.example.client1.model.Pet;

@RestController
@RequestMapping("/pet")
public class PetController implements PetApi {

	@Override
	public ResponseEntity<Void> addPet(Pet body) {
		// TODO Auto-generated method stub
		return PetApi.super.addPet(body);
	}

	@Override
	public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
		// TODO Auto-generated method stub
		return PetApi.super.deletePet(petId, apiKey);
	}

	@Override
	public ResponseEntity<List<Pet>> findPetsByStatus(List<String> status) {
		// TODO Auto-generated method stub
		return PetApi.super.findPetsByStatus(status);
	}

	@Override
	public ResponseEntity<List<Pet>> findPetsByTags(List<String> tags) {
		// TODO Auto-generated method stub
		return PetApi.super.findPetsByTags(tags);
	}

	@Override
	public ResponseEntity<Pet> getPetById(Long petId) {
		// TODO Auto-generated method stub
		return PetApi.super.getPetById(petId);
	}

	@Override
	public ResponseEntity<Void> updatePet(Pet body) {
		// TODO Auto-generated method stub
		return PetApi.super.updatePet(body);
	}

	@Override
	public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
		// TODO Auto-generated method stub
		return PetApi.super.updatePetWithForm(petId, name, status);
	}

	@Override
	public ResponseEntity<ModelApiResponse> uploadFile(Long petId, String additionalMetadata, MultipartFile file) {
		// TODO Auto-generated method stub
		return PetApi.super.uploadFile(petId, additionalMetadata, file);
	}

	
}
