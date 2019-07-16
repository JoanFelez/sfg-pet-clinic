package guru.springframework.sfgclinic.service;

import java.util.Set;

public interface BaseService<T> {

    T findById(Long id);

    T save(T object);

    Set<T> findAll();
}
