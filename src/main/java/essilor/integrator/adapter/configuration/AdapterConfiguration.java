package essilor.integrator.adapter.configuration;

import essilor.integrator.adapter.domain.AdapterConfigInfo;
import essilor.integrator.adapter.configuration.AdapterConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AdapterConfiguration {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private AdapterConfigurationService configurationService;

    @Autowired
    private SaajSoapMessageFactory messageFactory;

    @Autowired
    private Jaxb2Marshaller uploadFileServiceMarshaller;

    @Autowired
    private Jaxb2Marshaller getOrderServiceMarshaller;

    @Autowired
    private Jaxb2Marshaller owValidationServiceMarshaller;

    @Autowired
    private Jaxb2Marshaller supplierServiceMarshaller;

    @Value("${adapter.uri.uploadfile}")
    private String uploadFileUri;

    @Value("${adapter.uri.getorder}")
    private String getOrderUri;

    @Value("${adapter.uri.owvalidation}")
    private String owvalidationUri;

    @Value("${adapter.uri.supplier}")
    private String supplierUri;


    @Bean
    Map<String, AdapterConfigInfo> adapterConfigMap() {
        return configurationService.getAdapterConfiguration();
    }

    @Bean
    public Map<String, WebServiceTemplate> uploadFileWsTemplateMap() throws Exception {
        Map<String, AdapterConfigInfo> adapterConfigMap = applicationContext.getBean("adapterConfigMap", Map.class);
        Map<String, WebServiceTemplate> wsMap = new HashMap<>();
        for (AdapterConfigInfo adapterConfigInfo : adapterConfigMap.values()) {
            WebServiceTemplate wsTemplate = new WebServiceTemplate(this.messageFactory);
            wsTemplate.setMarshaller(this.uploadFileServiceMarshaller);
            wsTemplate.setUnmarshaller(this.uploadFileServiceMarshaller);
            wsTemplate.setDefaultUri(uploadFileUri);
            wsTemplate.setMessageSender(new HttpComponentsMessageSender());
            wsMap.put(adapterConfigInfo.getKod(), wsTemplate);
        }
        return wsMap;
    }

    @Bean
    Map<String, WebServiceTemplate> getOrderWsTemplateMap() throws Exception {
        Map<String, AdapterConfigInfo> adapterConfigMap = applicationContext.getBean("adapterConfigMap", Map.class);
        Map<String, WebServiceTemplate> wsMap = new HashMap<>();
        for (AdapterConfigInfo adapterConfigInfo : adapterConfigMap.values()) {
            WebServiceTemplate wsTemplate = new WebServiceTemplate(this.messageFactory);
            wsTemplate.setMarshaller(this.getOrderServiceMarshaller);
            wsTemplate.setUnmarshaller(this.getOrderServiceMarshaller);
            wsTemplate.setDefaultUri(getOrderUri);
            wsTemplate.setMessageSender(new HttpComponentsMessageSender());
            wsMap.put(adapterConfigInfo.getKod(), wsTemplate);
        }
        return wsMap;
    }

    @Bean
    Map<String, WebServiceTemplate> owValidationWsTemplateMap() throws Exception {
        Map<String, AdapterConfigInfo> adapterConfigMap = applicationContext.getBean("adapterConfigMap", Map.class);
        Map<String, WebServiceTemplate> wsMap = new HashMap<>();
        for (AdapterConfigInfo adapterConfigInfo : adapterConfigMap.values()) {
            WebServiceTemplate wsTemplate = new WebServiceTemplate(this.messageFactory);
            wsTemplate.setMarshaller(this.owValidationServiceMarshaller);
            wsTemplate.setUnmarshaller(this.owValidationServiceMarshaller);
            wsTemplate.setDefaultUri(owvalidationUri);
            wsTemplate.setMessageSender(new HttpComponentsMessageSender());
            wsMap.put(adapterConfigInfo.getKod(), wsTemplate);
        }
        return wsMap;
    }

    @Bean
    Map<String, WebServiceTemplate> supplierWSTemplateMap() throws Exception {
        Map<String, AdapterConfigInfo> adapterConfigMap = applicationContext.getBean("adapterConfigMap", Map.class);
        Map<String, WebServiceTemplate> wsMap = new HashMap<>();
        for (AdapterConfigInfo adapterConfigInfo : adapterConfigMap.values()) {
            WebServiceTemplate wsTemplate = new WebServiceTemplate(this.messageFactory);
            wsTemplate.setMarshaller(this.supplierServiceMarshaller);
            wsTemplate.setUnmarshaller(this.supplierServiceMarshaller);
            wsTemplate.setDefaultUri(supplierUri);
            wsTemplate.setMessageSender(new HttpComponentsMessageSender());
            wsMap.put(adapterConfigInfo.getKod(), wsTemplate);
        }
        return wsMap;
    }
}
