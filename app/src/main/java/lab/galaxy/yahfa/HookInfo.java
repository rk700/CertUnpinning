package lab.galaxy.yahfa;

/**
 * Created by liuruikai756 on 12/04/2017.
 */

public class HookInfo {
    public static String[] hookItemNames = {
        "lab.galaxy.certunpinning.Hook_SSLContext_init",
//        "lab.galaxy.certunpinning.Hook_TrustManagerFactory_getTrustManagers",
        "lab.galaxy.certunpinning.Hook_HttpsURLConnection_setSSLSocketFactory",
        "lab.galaxy.certunpinning.Hook_WebViewClient_onReceivedSslError"
    };
}
