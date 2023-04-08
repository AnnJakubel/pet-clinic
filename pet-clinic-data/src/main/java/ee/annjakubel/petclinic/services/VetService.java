package ee.annjakubel.petclinic.services;

import ee.annjakubel.petclinic.model.Owner;
import ee.annjakubel.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
