package lab.galaxy.certunpinning;

import android.util.Log;

import javax.net.ssl.SSLSocketFactory;

/**
 * Created by liuruikai756 on 12/04/2017.
 */

public class Hook_HttpsURLConnection_setSSLSocketFactory {
    public static String className = "javax.net.ssl.HttpsURLConnection";
    public static String methodName = "setSSLSocketFactory";
    public static String methodSig = "(Ljavax/net/ssl/SSLSocketFactory;)V";
    public static void hook(Object thiz, SSLSocketFactory sslSocketFactory) {
        Log.w("YAHFA", "HttpsURLConnection.setSSLSocketFactory()");
    }
}
