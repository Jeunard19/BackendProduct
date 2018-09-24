package com.winstgenerator.backend.DTO;

public class ProductDto {
	
	private Long id;
	
	private String productName; 
	
	private Long userId; 
	
	private String productCategory; 
	
	private Double pricePaid; 
	
	//public List<Double> pricesOnline; 
	
	private Double winstMargin;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Double getPricePaid() {
		return pricePaid;
	}

	public void setPricePaid(Double pricePaid) {
		this.pricePaid = pricePaid;
	}

	//public List<Double> getPricesOnline() {
	//	return pricesOnline;
	//}

	//public void setPricesOnline(List<Double> pricesOnline) {
	//	this.pricesOnline = pricesOnline;
	//}

	public Double getWinstMargin() {
		return winstMargin;
	}

	public void setWinstMargin(Double winstMargin) {
		this.winstMargin = winstMargin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	

}
