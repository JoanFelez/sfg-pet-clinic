package guru.springframework.sfgclinic.service;

import guru.springframework.sfgclinic.model.Pet;

import java.util.Set;

public interface PetService extends BaseService<Pet> {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
