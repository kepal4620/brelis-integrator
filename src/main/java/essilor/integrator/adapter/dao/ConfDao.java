package essilor.integrator.adapter.dao;

import essilor.integrator.adapter.domain.eet.EetConfigInfo;

import java.util.Map;

public interface ConfDao {

	String getOrganisation(String branchCode);
	String getCity(String branchCode);
	String getStreet(String branchCode);
	String getZipCode(String branchCode);

	String getOrdersDir();
	String getSoftwareOriginatorName();
	String getSoftwareSenderName();
	String getSoftwareOriginatorVersion();
	String getSoftwareSenderVersion();
	String getEetUri();
	String getEetKeystoreType();
	Map<String, EetConfigInfo> getEetConfig();
}
