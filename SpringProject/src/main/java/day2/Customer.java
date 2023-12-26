package day2;

public class Customer {
	private int Cid;
	private String Cname;
	private Address permanentAddress;
	

	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public int getCid() {
		return Cid;
	}


	public void setCid(int cid) {
		Cid = cid;
	}


	public String getCname() {
		return Cname;
	}


	public void setCname(String cname) {
		Cname = cname;
	}


	public Address getPermanentAddress() {
		return permanentAddress;
	}


	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}


	@Override
	public String toString() {
		return "Customer [Cid=" + Cid + ", Cname=" + Cname + ", permanentAddress=" + permanentAddress + "]";
	}

}
