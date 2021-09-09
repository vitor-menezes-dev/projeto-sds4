package vitor.menezes.dev.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import vitor.menezes.dev.dsvendas.dto.SaleSuccessDTO;
import vitor.menezes.dev.dsvendas.dto.SaleSumDTO;
import vitor.menezes.dev.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("select new vitor.menezes.dev.dsvendas.dto.SaleSumDTO(obj.seller, sum(obj.amount)) "
			+ " from Sale obj group by obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("select new vitor.menezes.dev.dsvendas.dto.SaleSuccessDTO(obj.seller, sum(obj.visited), sum(obj.deals)) "
			+ " from Sale obj group by obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
	
}
