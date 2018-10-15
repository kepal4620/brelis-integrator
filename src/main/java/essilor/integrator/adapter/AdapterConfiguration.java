package essilor.integrator.adapter;

import essilor.integrator.adapter.dao.ConfDao;
import essilor.integrator.adapter.domain.AdapterConfigInfo;
import essilor.integrator.adapter.domain.eet.EetConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class AdapterConfiguration {

    @Autowired
    private ConfDao confDaoImpl;

    @Bean
    Map<String, AdapterConfigInfo> adapterConfigMap() {
        return confDaoImpl.getAdapterConfigInfo();
    }
}
