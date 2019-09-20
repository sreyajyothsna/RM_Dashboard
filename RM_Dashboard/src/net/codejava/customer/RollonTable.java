package net.codejava.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rollon_table")
public class RollonTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "portfolio")
	private String portfolio; 
	
	@Column(name = "offering")
	private String offering; 
	
	@Column(name = "talent_group")
	private String talentGroup; 
	
	@Column(name = "client_name")
	private String clientName; 
	
	@Column(name = "period")
	private String period; 
	
	@Column(name = "week")
	private String week; 
	
	@Column(name = "stage")
	private String stage; 
	
	@Column(name = "tot_pract_required")
	private int totPractRequired; 
	
	@Column(name = "probability")
	private float probability;
	
	@Column(name = "start_date")
	private String startDate; 
	
	@Column(name = "end_date")
	private String endDate;  
	
	@Column(name = "requested_date")
	private String requestedDate;
	
	@Column(name = "skills")
	private String skills;  
	
	@Column(name = "hcatalog_code")
	private String hcatalogSkills;
	
	public RollonTable() {}

	public RollonTable(Long id, String portfolio, String offering, String talentGroup, String clientName,
			String period, String week, String stage, int totPractRequired, float probability, String startDate,
			String endDate, String requestedDate, String skills, String hcatalogSkills) {
		super();
		this.id = id;
		this.portfolio = portfolio;
		this.offering = offering;
		this.talentGroup = talentGroup;
		this.clientName = clientName;
		this.period = period;
		this.week = week;
		this.stage = stage;
		this.totPractRequired = totPractRequired;
		this.probability = probability;
		this.startDate = startDate;
		this.endDate = endDate;
		this.requestedDate = requestedDate;
		this.skills = skills;
		this.hcatalogSkills = hcatalogSkills;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}

	public String getOffering() {
		return offering;
	}

	public void setOffering(String offering) {
		this.offering = offering;
	}

	public String getTalentGroup() {
		return talentGroup;
	}

	public void setTalentGroup(String talentGroup) {
		this.talentGroup = talentGroup;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public int getTotPractRequired() {
		return totPractRequired;
	}

	public void setTotPractRequired(int totPractRequired) {
		this.totPractRequired = totPractRequired;
	}

	public float getProbability() {
		return probability;
	}

	public void setProbability(float probability) {
		this.probability = probability;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getRequestedDate() {
		return requestedDate;
	}

	public void setRequestedDate(String requestedDate) {
		this.requestedDate = requestedDate;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getHcatalogSkills() {
		return hcatalogSkills;
	}

	public void setHcatalogSkills(String hcatalogSkills) {
		this.hcatalogSkills = hcatalogSkills;
	}
	
}
