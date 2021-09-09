package vitor.menezes.dev.dsvendas.dto;

import java.io.Serializable;

import vitor.menezes.dev.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Long visited;
	private Long deals;

	public SaleSuccessDTO() {
	}

	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SaleSuccessDTO [");
		if (sellerName != null) {
			builder.append("sellerName=");
			builder.append(sellerName);
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
		}
		builder.append("]");
		return builder.toString();
	}

}
