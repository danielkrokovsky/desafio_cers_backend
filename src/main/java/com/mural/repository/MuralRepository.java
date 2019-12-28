package com.mural.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mural.model.Mural;


@RepositoryRestResource(collectionResourceRel = "mural", path = "mural")
public interface MuralRepository extends  PagingAndSortingRepository<Mural, Long> {

}
