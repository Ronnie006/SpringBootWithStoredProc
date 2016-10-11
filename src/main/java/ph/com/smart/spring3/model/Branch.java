package ph.com.smart.spring3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "STORE_BRANCHES")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "getBranches", 
			procedureName = "pgetallbranch",
			resultClasses=Branch.class,
			parameters = {
			   @StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, name = "p_out_result", type = void.class),
			   @StoredProcedureParameter(mode = ParameterMode.OUT, name = "p_out_resp_code", type = String.class)
			})
})

public class Branch {

	@Id
	@Column(name="STORE_BRANCH_ID")
	private String branchId;
	
	@Column(name="BRANCH_NAME")
	private String branchName;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="LONGITUDE")
	private String longitude;
	
	@Column(name="LATITUDE")
	private String latitude;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="ZIP_CODE")
	private String zipCode;
	
	@Column(name="REGION")
	private String region;
	
	@Column(name="CONTACT_NO")
	private String contactNumber;
	
	@Column(name="STORE_HOURS")
	private String storeHours;
	
	@Column(name="BRANCH_TYPE")
	private String branchType;
	
	@Column(name="BRAND_TYPE")
	private String brandType;
	
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getStoreHours() {
		return storeHours;
	}
	public void setStoreHours(String storeHours) {
		this.storeHours = storeHours;
	}
	public String getBranchType() {
		return branchType;
	}
	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}
	public String getBrandType() {
		return brandType;
	}
	public void setBrandType(String brandType) {
		this.brandType = brandType;
	}
	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", address=" + address + ", longitude="
				+ longitude + ", latitude=" + latitude + ", city=" + city + ", zipCode=" + zipCode + ", region="
				+ region + ", contactNumber=" + contactNumber + ", storeHours=" + storeHours + ", branchType="
				+ branchType + ", brandType=" + brandType + "]";
	}
	
	
	
}
