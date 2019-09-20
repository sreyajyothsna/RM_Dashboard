package net.codejava.customer;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cross_rollon_data")
public class crossRollonData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Source_type")
	private String sourceType;
	
	@Column(name = "P1")
	private int P1;
	
	@Column(name = "P2")
	private int P2;
	
	@Column(name = "P3")
	private int P3;
	
	@Column(name = "P4")
	private int P4;
	
	@Column(name = "P5")
	private int P5;
	
	@Column(name = "P6")
	private int P6;
	
	@Column(name = "P7")
	private int P7;
	
	@Column(name = "P8")
	private int P8;
	
	@Column(name = "P9")
	private int P9;
	
	@Column(name = "P10")
	private int P10;
	
	@Column(name = "P11")
	private int P11;
	
	@Column(name = "P12")
	private int P12;
	
	@Column(name = "P13")
	private int P13;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public int getP1() {
		return P1;
	}

	public void setP1(int p1) {
		P1 = p1;
	}

	public int getP2() {
		return P2;
	}

	public void setP2(int p2) {
		P2 = p2;
	}

	public int getP3() {
		return P3;
	}

	public void setP3(int p3) {
		P3 = p3;
	}

	public int getP4() {
		return P4;
	}

	public void setP4(int p4) {
		P4 = p4;
	}

	public int getP5() {
		return P5;
	}

	public void setP5(int p5) {
		P5 = p5;
	}

	public int getP6() {
		return P6;
	}

	public void setP6(int p6) {
		P6 = p6;
	}

	public int getP7() {
		return P7;
	}

	public void setP7(int p7) {
		P7 = p7;
	}

	public int getP8() {
		return P8;
	}

	public void setP8(int p8) {
		P8 = p8;
	}

	public int getP9() {
		return P9;
	}

	public void setP9(int p9) {
		P9 = p9;
	}

	public int getP10() {
		return P10;
	}

	public void setP10(int p10) {
		P10 = p10;
	}

	public int getP11() {
		return P11;
	}

	public void setP11(int p11) {
		P11 = p11;
	}

	public int getP12() {
		return P12;
	}

	public void setP12(int p12) {
		P12 = p12;
	}

	public int getP13() {
		return P13;
	}

	public void setP13(int p13) {
		P13 = p13;
	}

	
	
}
	