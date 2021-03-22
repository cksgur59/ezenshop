package kr.co.vo;

import java.util.Date;

/**
 * @author cksgu
 *
 */
public class MemberVO {

	private String id;
	private String pw;
	private String name;
	private String gender;
	private String email;
	private String address1;
	private String address2;
	private String address3;
	private String phone;
	private int admin;
	private int money;
	private int point;
	private Date regDate;
	private Date updateDate;

	public MemberVO() {
		// TODO Auto-generated constructor stub
	}

	public MemberVO(String id, String pw, String name, String gender, String email, String address1, String address2,
			String address3, String phone, int admin, int money, int point, Date regDate, Date updateDate) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.phone = phone;
		this.admin = admin;
		this.money = money;
		this.point = point;
		this.regDate = regDate;
		this.updateDate = updateDate;
	}

	public MemberVO(String id, String pw, String name, String gender, String email, String address1, String address2,
			String address3, String phone, int admin) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.phone = phone;
		this.admin = admin;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		this.admin = admin;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", gender=" + gender + ", email=" + email
				+ ", address1=" + address1 + ", address2=" + address2 + ", address3=" + address3 + ", phone=" + phone
				+ ", admin=" + admin + ", money=" + money + ", point=" + point + ", regDate=" + regDate
				+ ", updateDate=" + updateDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
