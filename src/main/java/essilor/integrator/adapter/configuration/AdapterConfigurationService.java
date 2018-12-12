package essilor.integrator.adapter.configuration;

import essilor.integrator.adapter.dao.ConfDao;
import essilor.integrator.adapter.domain.AdapterConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AdapterConfigurationService {

    @Autowired
    private ConfDao confDao;

    public Map<String, AdapterConfigInfo> getAdapterConfiguration() {
        return confDao.getAdapterConfigInfo();
    }
}
