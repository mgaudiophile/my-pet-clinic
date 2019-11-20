package mgaudiofile.spring.mypetclinic.services;

import mgaudiofile.spring.mypetclinic.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
