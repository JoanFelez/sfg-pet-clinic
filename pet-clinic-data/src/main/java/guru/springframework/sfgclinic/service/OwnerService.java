package guru.springframework.sfgclinic.service;

import guru.springframework.sfgclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String name);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}