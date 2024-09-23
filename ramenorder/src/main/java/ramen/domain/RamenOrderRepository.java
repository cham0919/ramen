package ramen.domain;

import ramen.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="ramenOrders", path="ramenOrders")
public interface RamenOrderRepository extends PagingAndSortingRepository<RamenOrder, >{
}