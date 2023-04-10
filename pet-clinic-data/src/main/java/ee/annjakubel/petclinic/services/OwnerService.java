package ee.annjakubel.petclinic.services;

import ee.annjakubel.petclinic.model.Owner;

import java.util.Set;

//CrudService takes in T and ID, in this case Owner class and Long parameter
public interface OwnerService extends CrudService<Owner, Long> {
    //Additional method aside those from CrudService
    Owner findByLastName(String lastName);

    //deleted the methods of findById and so on...
    //because now through extension the methods
    //automatically exist in this interface as well.
    //This will be the same for other Services implemented
    //at this point in time.
}
