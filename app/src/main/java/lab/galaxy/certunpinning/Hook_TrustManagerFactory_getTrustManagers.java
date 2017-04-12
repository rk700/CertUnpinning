package lab.galaxy.certunpinning;

import android.util.Log;

import javax.net.ssl.TrustManager;

/**
 * Created by liuruikai756 on 12/04/2017.
 */

public class Hook_TrustManagerFactory_getTrustManagers {
    public static String className = "javax.net.ssl.TrustManagerFactory";
    public static String methodName = "getTrustManagers";
    public static String methodSig = "()[Ljavax/net/ssl/TrustManager;";
    public static TrustManager[] hook(Object thiz) {
        Log.w("YAHFA", "TrustManagerFactory.getTrustManagers()");
        return new TrustManager[] {new InsecureTrustManager()};
    }
}
