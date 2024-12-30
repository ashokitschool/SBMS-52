package in.ashokit.bindings;

public class Customer {

	private Integer cid;
	private String name;
	private Long phno;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phno=" + phno + "]";
	}

}
