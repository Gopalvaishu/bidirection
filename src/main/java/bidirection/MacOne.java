package bidirection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MacOne {
	@Id
	private int mid;
	private String mname;
	private long mphone;
	
	@OneToMany
	List<Cus> c1;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public long getMphone() {
		return mphone;
	}

	public void setMphone(long mphone) {
		this.mphone = mphone;
	}

	public List<Cus> getC1() {
		return c1;
	}

	public void setC1(List<Cus> c1) {
		this.c1 = c1;
	}
	}
