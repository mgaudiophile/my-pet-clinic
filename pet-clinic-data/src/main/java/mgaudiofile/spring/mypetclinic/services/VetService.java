package mgaudiofile.spring.mypetclinic.services;

import mgaudiofile.spring.mypetclinic.models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
