package ee.annjakubel.petclinic.services;

import java.util.Set;

//Mimicking Spring Data Repository
public interface CrudService<T, ID> {
    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
