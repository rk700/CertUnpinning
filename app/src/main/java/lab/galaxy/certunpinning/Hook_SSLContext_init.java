package lab.galaxy.certunpinning;

import android.util.Log;

import java.security.SecureRandom;

import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import javax.net.ssl.SSLContext;

/**
 * Created by liuruikai756 on 12/04/2017.
 */

public class Hook_SSLContext_init {
    public static String className = "javax.net.ssl.SSLContext";
    public static String methodName = "init";
    public static String methodSig =
            "([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V";

    public static void hook(Object thiz, KeyManager[] keyManagers, TrustManager[] trustManagers,
                            SecureRandom secureRandom) {
        Log.w("YAHFA", "SSLContext.init()");
        origin(thiz, null, new TrustManager[]{new InsecureTrustManager()}, secureRandom);
    }

    public static void origin(Object thiz, KeyManager[] keyManagers, TrustManager[] trustManagers,
                            SecureRandom secureRandom) {
        Log.w("YAHFA", "should not be here");
        return;
    }
}
