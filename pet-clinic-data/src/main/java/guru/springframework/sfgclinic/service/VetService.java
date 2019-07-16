package guru.springframework.sfgclinic.service;

import guru.springframework.sfgclinic.model.Vet;

import java.util.Set;

public interface VetService extends BaseService<Vet> {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
