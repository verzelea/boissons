package com.example.boissons;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="boissons")
public interface BoissonRepository extends JpaRepository<Boisson, Integer> {
}
