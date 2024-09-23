package ramen.domain;

import ramen.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="ramenDeliveries", path="ramenDeliveries")
public interface RamenDeliveryRepository extends PagingAndSortingRepository<RamenDelivery, >{
}