package sefrealestate;

public class Invoice {
	
	private int InvoiceID;
	private String CustomerName;
	private int CustomerID;
	private String invoiceDate;
	private int Deposit;
	private int ReservedPropertyID;
	private String reservedPropertyName;
	
	
	
	public Invoice(int invoiceID, String customerName, int customerID, String invoiceDate, int deposit,
			int reservedPropertyID, String reservedPropertyName) {
		super();
		InvoiceID = invoiceID;
		CustomerName = customerName;
		CustomerID = customerID;
		this.invoiceDate = invoiceDate;
		Deposit = deposit;
		ReservedPropertyID = reservedPropertyID;
		this.reservedPropertyName = reservedPropertyName;
	}



	public int getInvoiceID() {
		return InvoiceID;
	}



	public void setInvoiceID(int invoiceID) {
		InvoiceID = invoiceID;
	}



	public String getCustomerName() {
		return CustomerName;
	}



	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}



	public int getCustomerID() {
		return CustomerID;
	}



	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}



	public String getInvoiceDate() {
		return invoiceDate;
	}



	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}



	public int getDeposit() {
		return Deposit;
	}



	public void setDeposit(int deposit) {
		Deposit = deposit;
	}



	public int getReservedPropertyID() {
		return ReservedPropertyID;
	}



	public void setReservedPropertyID(int reservedPropertyID) {
		ReservedPropertyID = reservedPropertyID;
	}



	public String getReservedPropertyName() {
		return reservedPropertyName;
	}



	public void setReservedPropertyName(String reservedPropertyName) {
		this.reservedPropertyName = reservedPropertyName;
	}
	
	 

}
