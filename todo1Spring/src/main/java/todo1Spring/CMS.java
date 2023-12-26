package todo1Spring;

public class CMS {
	private int id;
	private String tittle;
	private int duration;
	private String provider;
	private int fees;
	
	public CMS() {
		// TODO Auto-generated constructor stub
	}

	public CMS(int id, String tittle, int duration, String provider, int fees) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.duration = duration;
		this.provider = provider;
		this.fees = fees;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "CMS [id=" + id + ", tittle=" + tittle + ", duration=" + duration + ", provider=" + provider + ", fees="
				+ fees + "]";
	}

}
