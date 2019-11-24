package mgaudiofile.spring.mypetclinic.services;

import mgaudiofile.spring.mypetclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
