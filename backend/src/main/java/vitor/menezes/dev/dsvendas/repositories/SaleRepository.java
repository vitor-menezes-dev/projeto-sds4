package vitor.menezes.dev.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vitor.menezes.dev.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
