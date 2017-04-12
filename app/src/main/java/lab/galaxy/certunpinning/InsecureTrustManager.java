package lab.galaxy.certunpinning;

import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

/**
 * Created by liuruikai756 on 12/04/2017.
 */

public class InsecureTrustManager implements X509TrustManager{
    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType){ }
    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType){ }
    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
