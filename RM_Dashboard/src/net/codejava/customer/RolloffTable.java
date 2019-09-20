package net.codejava.customer;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "rolloff_table")
public class RolloffTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Business_line")
	private String business_line;
	
	@Column(name = "Capability")
	private String capability; 
	
	@Column(name = "sub_capability")
	private String  subCapability; 
	
	@Column(name = "Client_name")
	private String clientName; 
	
	public RolloffTable() {}
	
	public RolloffTable(Long id, String business_line, String capability, String subCapability, String clientName,
			String candidateName, String level, String location, String rolloffDate, String billingStatus,
			String deployable, String staffingNotes, String primarySkill, String secondarySkill) {
		super();
		this.id = id;
		this.business_line = business_line;
		this.capability = capability;
		this.subCapability = subCapability;
		this.clientName = clientName;
		this.candidateName = candidateName;
		this.level = level;
		this.location = location;
		this.rolloffDate = rolloffDate;
		this.billingStatus = billingStatus;
		this.deployable = deployable;
		this.staffingNotes = staffingNotes;
		this.primarySkill = primarySkill;
		this.secondarySkill = secondarySkill;
	}

	@Column(name = "Candidate_name")
	private String candidateName; 
	
	@Column(name = "level")
	private String level; 
	
	@Column(name = "location")
	private String location; 
	
	@Column(name = "Roll_off_date")
	private String rolloffDate; 
	
	@Column(name = "Billing_status")
	private String billingStatus;
	
	@Column(name = "Deployable")
	private String deployable;
	
	@Column(name = "Staffing_notes")
	private String staffingNotes;
	
	@Column(name = "Primary_skill")
	private String primarySkill;
	
	@Column(name = "Secondary_skill")
	private String secondarySkill;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBusiness_line() {
		return business_line;
	}

	public void setBusiness_line(String business_line) {
		this.business_line = business_line;
	}

	public String getCapability() {
		return capability;
	}

	public void setCapability(String capability) {
		this.capability = capability;
	}

	public String getSubCapability() {
		return subCapability;
	}

	public void setSubCapability(String subCapability) {
		this.subCapability = subCapability;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRolloffDate() {
		return rolloffDate;
	}

	public void setRolloffDate(String rolloffDate) {
		this.rolloffDate = rolloffDate;
	}

	public String getBillingStatus() {
		return billingStatus;
	}

	public void setBillingStatus(String billingStatus) {
		this.billingStatus = billingStatus;
	}

	public String getDeployable() {
		return deployable;
	}

	public void setDeployable(String deployable) {
		this.deployable = deployable;
	}

	public String getStaffingNotes() {
		return staffingNotes;
	}

	public void setStaffingNotes(String staffingNotes) {
		this.staffingNotes = staffingNotes;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public String getSecondarySkill() {
		return secondarySkill;
	}

	public void setSecondarySkill(String secondarySkill) {
		this.secondarySkill = secondarySkill;
	}

}
