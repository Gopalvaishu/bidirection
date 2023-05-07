package bidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cus {
	
	@Id
	private long cid;
	private String cname;
	private long phone;
	@ManyToOne
	MacOne ii;
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public MacOne getIi() {
		return ii;
	}
	public void setIi(MacOne ii) {
		this.ii = ii;
	}
	
	
	
	

}
