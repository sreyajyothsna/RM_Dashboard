package net.codejava.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class HireTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String category;
	
	private String tgview;
	
	private int p1;
	
	
	private int p2;
	
	
	private int p3;
	
	
	private int p4;
	
	
	private int p5;
	
	
	private int p6;
	
	
	private int p7;
	
	
	private int p8;
	
	
	private int p9;
	
	
	private int p10;
	
	
	private int p11;
	
	
	private int p12;
	
	
	private int p13;
	
	
	private String comments;
	
	public HireTable() {}

	

	public HireTable(Long id, String category, String tgview, int p1, int p2, int p3, int p4, int p5, int p6, int p7,
			int p8, int p9, int p10, int p11, int p12, int p13, String comments) {
		super();
		this.id = id;
		this.category = category;
		this.tgview = tgview;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
		this.p7 = p7;
		this.p8 = p8;
		this.p9 = p9;
		this.p10 = p10;
		this.p11 = p11;
		this.p12 = p12;
		this.p13 = p13;
		this.comments = comments;
	}



	public String getTgview() {
		return tgview;
	}

	public void setTgview(String tgview) {
		this.tgview = tgview;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getP1() {
		return p1;
	}

	public void setP1(int p1) {
		this.p1 = p1;
	}

	public int getP2() {
		return p2;
	}

	public void setP2(int p2) {
		this.p2 = p2;
	}

	public int getP3() {
		return p3;
	}

	public void setP3(int p3) {
		this.p3 = p3;
	}

	public int getP4() {
		return p4;
	}

	public void setP4(int p4) {
		this.p4 = p4;
	}

	public int getP5() {
		return p5;
	}

	public void setP5(int p5) {
		this.p5 = p5;
	}

	public int getP6() {
		return p6;
	}

	public void setP6(int p6) {
		this.p6 = p6;
	}

	public int getP7() {
		return p7;
	}

	public void setP7(int p7) {
		this.p7 = p7;
	}

	public int getP8() {
		return p8;
	}

	public void setP8(int p8) {
		this.p8 = p8;
	}

	public int getP9() {
		return p9;
	}

	public void setP9(int p9) {
		this.p9 = p9;
	}

	public int getP10() {
		return p10;
	}

	public void setP10(int p10) {
		this.p10 = p10;
	}

	public int getP11() {
		return p11;
	}

	public void setP11(int p11) {
		this.p11 = p11;
	}

	public int getP12() {
		return p12;
	}

	public void setP12(int p12) {
		this.p12 = p12;
	}

	public int getP13() {
		return p13;
	}

	public void setP13(int p13) {
		this.p13 = p13;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	
}
