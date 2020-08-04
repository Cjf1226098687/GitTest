
package com.qfedu.webxml;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a> <strong>�����ֻ���������ز�ѯWEB����</strong>���ṩ���µĹ����ֻ�����ι��������ݣ�ÿ�¸��¡�<br />ʹ�ñ�վ WEB ������ע�������ӱ�վ��<a href="http://www.webxml.com.cn/" target="_blank">http://www.webxml.com.cn/</a> ��л��ҵ�֧�֣�<br />&nbsp;
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MobileCodeWS", targetNamespace = "http://WebXml.com.cn/", wsdlLocation = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl")
public class MobileCodeWS
    extends Service
{

    private final static URL MOBILECODEWS_WSDL_LOCATION;
    private final static WebServiceException MOBILECODEWS_EXCEPTION;
    private final static QName MOBILECODEWS_QNAME = new QName("http://WebXml.com.cn/", "MobileCodeWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOBILECODEWS_WSDL_LOCATION = url;
        MOBILECODEWS_EXCEPTION = e;
    }

    public MobileCodeWS() {
        super(__getWsdlLocation(), MOBILECODEWS_QNAME);
    }

    public MobileCodeWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOBILECODEWS_QNAME, features);
    }

    public MobileCodeWS(URL wsdlLocation) {
        super(wsdlLocation, MOBILECODEWS_QNAME);
    }

    public MobileCodeWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOBILECODEWS_QNAME, features);
    }

    public MobileCodeWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MobileCodeWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MobileCodeWSSoap
     */
    @WebEndpoint(name = "MobileCodeWSSoap")
    public MobileCodeWSSoap getMobileCodeWSSoap() {
        return super.getPort(new QName("http://WebXml.com.cn/", "MobileCodeWSSoap"), MobileCodeWSSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MobileCodeWSSoap
     */
    @WebEndpoint(name = "MobileCodeWSSoap")
    public MobileCodeWSSoap getMobileCodeWSSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebXml.com.cn/", "MobileCodeWSSoap"), MobileCodeWSSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOBILECODEWS_EXCEPTION!= null) {
            throw MOBILECODEWS_EXCEPTION;
        }
        return MOBILECODEWS_WSDL_LOCATION;
    }

}
