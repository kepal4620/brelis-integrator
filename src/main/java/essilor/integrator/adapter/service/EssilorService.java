package essilor.integrator.adapter.service;

import essilor.integrator.adapter.domain.getorder.GetOrderAsPDFByPoNum;
import essilor.integrator.adapter.domain.getorder.GetOrderAsPDFByPoNumResponse;
import essilor.integrator.adapter.domain.getorder.GetOrderByPoNum;
import essilor.integrator.adapter.domain.getorder.GetOrderByPoNumResponse;
import essilor.integrator.adapter.domain.owvalidation.ValidateOrderFromPMS;
import essilor.integrator.adapter.domain.owvalidation.ValidateOrderFromPMSResponse;
import essilor.integrator.adapter.domain.supplier.GetSuppliers;
import essilor.integrator.adapter.domain.supplier.GetSuppliersResponse;
import essilor.integrator.adapter.domain.uploadfile.UploadCustomFile;
import essilor.integrator.adapter.domain.uploadfile.UploadCustomFileResponse;
import essilor.integrator.adapter.domain.uploadfile.UploadOrderByAction;
import essilor.integrator.adapter.domain.uploadfile.UploadOrderByActionResponse;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.annotation.Resource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Map;

@Service
public class EssilorService {

    private Map<String, WebServiceTemplate> uploadFileWsTemplateMap;

	private Map<String, WebServiceTemplate> getOrderWsTemplateMap;

    private Map<String, WebServiceTemplate> owValidationWsTemplateMap;

    private Map<String, WebServiceTemplate> supplierWSTemplateMap;

    @Resource
    public void setUploadFileWsTemplateMap(Map<String, WebServiceTemplate> uploadFileWsTemplateMap) {
        this.uploadFileWsTemplateMap = uploadFileWsTemplateMap;
    }

    @Resource
    public void setGetOrderWsTemplateMap(Map<String, WebServiceTemplate> getOrderWsTemplateMap) {
        this.getOrderWsTemplateMap= getOrderWsTemplateMap;
    }

    @Resource
    public void setOwValidationWsTemplateMap(Map<String, WebServiceTemplate> owValidationWsTemplateMap) {
        this.owValidationWsTemplateMap= owValidationWsTemplateMap;
    }

    @Resource
    public void setSupplierWSTemplateMap(Map<String, WebServiceTemplate> supplierWSTemplateMap) {
        this.supplierWSTemplateMap= supplierWSTemplateMap;
    }


    public UploadCustomFileResponse uploadCustomFile(UploadCustomFile request, String branchCode) {
        WebServiceTemplate template = uploadFileWsTemplateMap.get(branchCode);
        if (template == null) {
            throw new IllegalStateException("Cannot find UploadCustomFile");
        }
        		UploadCustomFileResponse response = (UploadCustomFileResponse) template
                        .marshalSendAndReceive(request);
		return response;
	}

	public String uploadCustomFile(String message, String branchCode) {
        WebServiceTemplate template = uploadFileWsTemplateMap.get(branchCode);
        if (template == null) {
            throw new IllegalStateException("Cannot find UploadCustomFile");
        }
		StringWriter respWriter = new StringWriter();
		StreamSource source = new StreamSource(new StringReader(message));
		StreamResult result = new StreamResult(respWriter);
		template.sendSourceAndReceiveToResult(source, result);
		return respWriter.toString();
	}

	public GetOrderByPoNumResponse getOrderByPoNum(GetOrderByPoNum request, String branchCode) {
        WebServiceTemplate template = getOrderWsTemplateMap.get(branchCode);
        if (template == null) {
            throw new IllegalStateException("Cannot find GetOrderWsTemplate");
        }
        GetOrderByPoNumResponse response = (GetOrderByPoNumResponse) template
                .marshalSendAndReceive(request);
		return response;
	}

	public String getOrderByPoNum(String message, String branchCode) {
        WebServiceTemplate template = getOrderWsTemplateMap.get(branchCode);
        if (template == null) {
            throw new IllegalStateException("Cannot find GetOrderWsTemplate");
        }
		StringWriter respWriter = new StringWriter();
		StreamSource source = new StreamSource(new StringReader(message));
		StreamResult result = new StreamResult(respWriter);
		template.sendSourceAndReceiveToResult(source, result);
		return respWriter.toString();
	}

	public GetOrderAsPDFByPoNumResponse getOrderAsPDFByPoNum(
			GetOrderAsPDFByPoNum request, String branchCode) {
        WebServiceTemplate template = getOrderWsTemplateMap.get(branchCode);
        if (template == null) {
            throw new IllegalStateException("Cannot find GetOrderWsTemplate");
        }
		GetOrderAsPDFByPoNumResponse response = (GetOrderAsPDFByPoNumResponse) template
				.marshalSendAndReceive(request);
		return response;
	}

	public String getOrderAsPDFByPoNum(String message, String branchCode) {
        WebServiceTemplate template = getOrderWsTemplateMap.get(branchCode);
        if (template == null) {
            throw new IllegalStateException("Cannot find GetOrderWsTemplate");
        }
		StringWriter respWriter = new StringWriter();
		StreamSource source = new StreamSource(new StringReader(message));
		StreamResult result = new StreamResult(respWriter);
		template.sendSourceAndReceiveToResult(source, result);
		return respWriter.toString();
	}

	public UploadOrderByActionResponse uploadOrderByAction(
			UploadOrderByAction request, String branchCode) {
        WebServiceTemplate template = uploadFileWsTemplateMap.get(branchCode);
        if (template == null) {
            throw new IllegalStateException("Cannot find UploadFileWsTemplate");
        }
		UploadOrderByActionResponse response = (UploadOrderByActionResponse) template
				.marshalSendAndReceive(request);
		return response;
	}

	public String uploadOrderByAction(String message, String branchCode) {
        WebServiceTemplate template = uploadFileWsTemplateMap.get(branchCode);
        if (template == null) {
            throw new IllegalStateException("Cannot find UploadFileWsTemplate");
        }
		StringWriter respWriter = new StringWriter();
		StreamSource source = new StreamSource(new StringReader(message));
		StreamResult result = new StreamResult(respWriter);
		template.sendSourceAndReceiveToResult(source, result);
		return respWriter.toString();
	}

	public ValidateOrderFromPMSResponse validateOrderFromPMS(
			ValidateOrderFromPMS request, String branchCode) {
        WebServiceTemplate template = owValidationWsTemplateMap.get(branchCode);
        if (template == null) {
            throw new IllegalStateException("Cannot find OwValidationWSTemplate");
        }
		ValidateOrderFromPMSResponse response = (ValidateOrderFromPMSResponse) template
				.marshalSendAndReceive(request);
		return response;
	}

	public String validateOrderFromPMS(String message, String branchCode) {
        WebServiceTemplate template = owValidationWsTemplateMap.get(branchCode);
        if (template == null) {
            throw new IllegalStateException("Cannot find OwValidationWSTemplate");
        }
		StringWriter respWriter = new StringWriter();
		StreamSource source = new StreamSource(new StringReader(message));
		StreamResult result = new StreamResult(respWriter);
		template.sendSourceAndReceiveToResult(source, result);
		return respWriter.toString();
	}

	public GetSuppliersResponse getSuppliers(GetSuppliers request, String branchCode) {
        WebServiceTemplate template = supplierWSTemplateMap.get(branchCode);
        if (template == null) {
            throw new IllegalStateException("Cannot find SupplierWsTemplate");
        }
		GetSuppliersResponse response = (GetSuppliersResponse) template
				.marshalSendAndReceive(request);
		return response;
	}

	public String getSuppliers(String message, String branchCode) {
        WebServiceTemplate template = supplierWSTemplateMap.get(branchCode);
        if (template == null) {
            throw new IllegalStateException("Cannot find SupplierWsTemplate");
        }
		StringWriter respWriter = new StringWriter();
		StreamSource source = new StreamSource(new StringReader(message));
		StreamResult result = new StreamResult(respWriter);
		template.sendSourceAndReceiveToResult(source, result);
		return respWriter.toString();
	}
}
