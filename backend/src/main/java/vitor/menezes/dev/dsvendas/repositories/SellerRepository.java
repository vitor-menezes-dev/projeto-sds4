package vitor.menezes.dev.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vitor.menezes.dev.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
