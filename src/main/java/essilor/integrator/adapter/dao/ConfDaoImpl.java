package essilor.integrator.adapter.dao;

import essilor.integrator.adapter.domain.eet.EetConfigInfo;
import essilor.integrator.adapter.tools.Encryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfDaoImpl implements ConfDao {

	@Autowired
	private Encryptor encryptor;

	private JdbcTemplate jdbcTemplate;

	private static final String SQL = "select val from conf_ini where var = ?";

	private static final String GET_ORGANISATION_SQL = "select organizace from c_prevadzky where kod=?";

	private static final String GET_CITY_SQL = "select mesto from c_prevadzky where kod=?";

	private static final String GET_STREET_SQL = "select ulice from c_prevadzky where kod=?";

	private static final String GET_ZIP_SQL = "select psc from c_prevadzky where kod=?";

	private static final String GET_EET_CONFIG_SQL = "select kod,ico,dic,id_provozovny,id_pokl,eet_keystore_path,eet_keystore_pwd,eet_key_alias,dic_poverujiciho from c_prevadzky";

	private String softwareOriginatorName;
	
	private String softwareSenderName;
	
	private String softwareOriginatorVersion;
	
	private String softwareSenderVersion;

	public ConfDaoImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public String getOrganisation(String branchCode) {
		return jdbcTemplate.queryForObject(GET_ORGANISATION_SQL, String.class, branchCode);
	}

	@Override
	public String getCity(String branchCode) {
		return jdbcTemplate.queryForObject(GET_CITY_SQL, String.class, branchCode);
	}

	@Override
	public String getStreet(String branchCode) {
		return jdbcTemplate.queryForObject(GET_STREET_SQL, String.class, branchCode);
	}

	@Override
	public String getZipCode(String branchCode) {
		return jdbcTemplate.queryForObject(GET_ZIP_SQL, String.class, branchCode);
	}

	@Override
	public String getOrdersDir() {
		return jdbcTemplate.queryForObject(SQL, String.class, "OBJEDNAVKY_PDF_DIR");
	}

	@Override
	public String getSoftwareOriginatorName() {
		return softwareOriginatorName;
	}

	@Override
	public String getSoftwareSenderName() {
		return softwareSenderName;
	}

	@Override
	public String getSoftwareOriginatorVersion() {
		return softwareOriginatorVersion;
	}

	@Override
	public String getSoftwareSenderVersion() {
		return softwareSenderVersion;
	}

    public void setSoftwareOriginatorName(String softwareOriginatorName) {
		this.softwareOriginatorName = softwareOriginatorName;
	}

	public String getEetUri() {
		return jdbcTemplate.queryForObject(SQL, String.class, "EET_URI");
	}

	public String getEetKeystoreType() {
		return jdbcTemplate.queryForObject(SQL, String.class, "EET_KEYSTORE_TYPE");
	}

	public void setSoftwareSenderName(String softwareSenderName) {
		this.softwareSenderName = softwareSenderName;
	}

	public void setSoftwareOriginatorVersion(String softwareOriginatorVersion) {
		this.softwareOriginatorVersion = softwareOriginatorVersion;
	}

	public void setSoftwareSenderVersion(String softwareSenderVersion) {
		this.softwareSenderVersion = softwareSenderVersion;
	}

	public Map<String, EetConfigInfo> getEetConfig() {
		Map<String, EetConfigInfo> eetConfig = new HashMap<String, EetConfigInfo>();
		List<Map<String, Object>> rows =  jdbcTemplate.queryForList(GET_EET_CONFIG_SQL);
		for (Map<String, Object> row : rows) {
			EetConfigInfo eetConfigInfo = new EetConfigInfo();
			eetConfigInfo.setKod((String) row.get("kod"));
			eetConfigInfo.setIco((String) row.get("ico"));
			eetConfigInfo.setDic((String) row.get("dic"));
			eetConfigInfo.setId_provoz((String) row.get("id_provozovny"));
            eetConfigInfo.setId_pokl((String) row.get("id_pokl"));
            eetConfigInfo.setKeystorePath((String) row.get("eet_keystore_path"));
			eetConfigInfo.setKeyAlias((String) row.get("eet_key_alias"));
			eetConfigInfo.setDic_poverujuceho((String) row.get("dic_poverujiciho"));
			try {
				String password = encryptor.decrypt((String) row.get("eet_keystore_pwd"));
				eetConfigInfo.setKeystorePwd(password);
			} catch(Exception e) {
            	throw new RuntimeException(e);
			}
            eetConfig.put(eetConfigInfo.getKod(),eetConfigInfo);
		}
		return eetConfig;
	}
}
