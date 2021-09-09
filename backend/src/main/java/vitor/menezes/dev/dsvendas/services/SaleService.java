package vitor.menezes.dev.dsvendas.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vitor.menezes.dev.dsvendas.dto.SaleDTO;
import vitor.menezes.dev.dsvendas.dto.SaleSuccessDTO;
import vitor.menezes.dev.dsvendas.dto.SaleSumDTO;
import vitor.menezes.dev.dsvendas.entities.Sale;
import vitor.menezes.dev.dsvendas.repositories.SaleRepository;
import vitor.menezes.dev.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repo;
	
	@Autowired
	private SellerRepository sellerRepo;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepo.findAll();
		
		Page<Sale> result = repo.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repo.amountGroupedBySeller();
	};
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return repo.successGroupedBySeller();
	};
	
}
