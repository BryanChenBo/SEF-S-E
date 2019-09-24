package sefrealestate;

public class Property {
	
	private String propertyID;
	private String name;
	private String Adress;
	private String Suburb;
	private String Capacity;
	private Double Price;
	private String Type;// For rent or for sale
	private Double SalesCommision;
	private String status;
	
	private String OwnerName;
	private String OwnerID;

	
	public Property(String propertyID, String name, String adress, String suburb, String capacity, Double price,
			String type, Double salesCommision, String status, String OwnerID) {
		
		this.propertyID = propertyID;
		this.name = name;
		Adress = adress;
		Suburb = suburb;
		Capacity = capacity;
		Price = price;
		Type = type;
		SalesCommision = salesCommision;
		this.status = status;
		this .OwnerID = OwnerID;
	}
	
	
	
	public String getOwnerName() {
		return OwnerName;
	}



	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}



	public String getOwnerID() {
		return OwnerID;
	}



	public void setOwnerID(String ownerID) {
		OwnerID = ownerID;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getPropertyID() {
		return propertyID;
	}
	public void setPropertyID(String propertyID) {
		this.propertyID = propertyID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getSuburb() {
		return Suburb;
	}
	public void setSuburb(String suburb) {
		Suburb = suburb;
	}
	public String getCapacity() {
		return Capacity;
	}
	public void setCapacity(String capacity) {
		Capacity = capacity;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Double getSalesCommision() {
		return SalesCommision;
	}
	public void setSalesCommision(Double salesCommision) {
		SalesCommision = salesCommision;
	}

	
	
	
}
