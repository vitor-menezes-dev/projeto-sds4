package vitor.menezes.dev.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import vitor.menezes.dev.dsvendas.entities.Sale;

public class SaleDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;

	private SellerDTO seller;

	public SaleDTO() {
	}

	public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}

	public SaleDTO(Sale entity) {
		this.id = entity.getId();
		this.visited = entity.getVisited();
		this.deals = entity.getVisited();
		this.amount = entity.getAmount();
		this.date = entity.getDate();
		this.seller = new SellerDTO(entity.getSeller());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaleDTO other = (SaleDTO) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SaleDTO [");
		if (id != null) {
			builder.append("id=");
			builder.append(id);
			builder.append(", ");
		}
		if (visited != null) {
			builder.append("visited=");
			builder.append(visited);
			builder.append(", ");
		}
		if (deals != null) {
			builder.append("deals=");
			builder.append(deals);
			builder.append(", ");
		}
		if (amount != null) {
			builder.append("amount=");
			builder.append(amount);
			builder.append(", ");
		}
		if (date != null) {
			builder.append("date=");
			builder.append(date);
			builder.append(", ");
		}
		if (seller != null) {
			builder.append("seller=");
			builder.append(seller);
		}
		builder.append("]");
		return builder.toString();
	}

}
