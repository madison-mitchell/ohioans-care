package org.ohioanscare.serverside.Repositories;

import org.ohioanscare.serverside.Models.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
}
