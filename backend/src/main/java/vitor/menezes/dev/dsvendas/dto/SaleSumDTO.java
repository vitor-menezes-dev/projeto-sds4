package vitor.menezes.dev.dsvendas.dto;

import java.io.Serializable;

import vitor.menezes.dev.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Double sum;
	
	public SaleSumDTO() {
	}

	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SaleSumDTO [");
		if (sellerName != null) {
			builder.append("sellerName=");
			builder.append(sellerName);
			builder.append(", ");
		}
		if (sum != null) {
			builder.append("sum=");
			builder.append(sum);
		}
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
