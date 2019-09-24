package sefrealestate;

public class offer {
	public String OfferID;
	private String PropertyID;
	private String PropertyName;
	private String Name;
	private String ID;
	private String OfferDate;
	private Double Deposit;
	private Double Price;
	private Double CommissionRate = Price * 0.05;
	private String Duration;
	private Double WeeklyRent;
	private Double weeklyManagementFee = WeeklyRent * 0.08;
	private String type;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public offer(String offerID, String propertyID, String propertyName, String name, String iD, String offerDate,
			String duration, Double weeklyRent) {

		this.OfferID = offerID;
		this.PropertyID = propertyID;
		this.PropertyName = propertyName;
		this.Name = name;
		this.ID = iD;
		this.OfferDate = offerDate;
		this.Duration = duration;
		this.WeeklyRent = weeklyRent;
		this.type = "rent";

	}

	public offer(String offerID, String propertyID, String propertyName, String name, String iD, String offerDate,
			Double price) {
		super();
		this.OfferID = offerID;
		PropertyID = propertyID;
		PropertyName = propertyName;
		Name = name;
		ID = iD;
		OfferDate = offerDate;
		Price = price;
		type = "sell";
	}

	public String getOfferID() {
		return OfferID;
	}

	public void setOfferID(String offerID) {
		OfferID = offerID;
	}

	public String getPropertyID() {
		return PropertyID;
	}

	public void setPropertyID(String propertyID) {
		PropertyID = propertyID;
	}

	public String getPropertyName() {
		return PropertyName;
	}

	public void setPropertyName(String propertyName) {
		PropertyName = propertyName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getOfferDate() {
		return OfferDate;
	}

	public void setOfferDate(String offerDate) {
		OfferDate = offerDate;
	}

	public Double getDeposit() {
		return Deposit;
	}

	public void setDeposit(Double deposit) {
		Deposit = deposit;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public Double getCommissionRate() {
		return CommissionRate;
	}

	public void setCommissionRate(Double commissionRate) {
		CommissionRate = commissionRate;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	public Double getWeeklyRent() {
		return WeeklyRent;
	}

	public void setWeeklyRent(Double weeklyRent) {
		WeeklyRent = weeklyRent;
	}

	public Double getWeeklyManagementFee() {
		return weeklyManagementFee;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
