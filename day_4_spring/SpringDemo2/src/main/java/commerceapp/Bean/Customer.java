package commerceapp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
    
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    private String FirstName;
    private String LastName;
    private String Address;
    private String MobileNumber;
    private String MailId;
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getMailId() {
		return MailId;
	}
	public void setMailId(String mailId) {
		MailId = mailId;
	}
	public double getPricePaid() {
		return PricePaid;
	}
	public void setPricePaid(double pricePaid) {
		PricePaid = pricePaid;
	}
	private double PricePaid;
	
	
	
}
