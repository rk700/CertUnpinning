package lab.galaxy.certunpinning;

import android.net.http.SslError;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/**
 * Created by liuruikai756 on 13/04/2017.
 */

public class Hook_WebViewClient_onReceivedSslError {
    public static String className = "android.webkit.WebViewClient";
    public static String methodName = "onReceivedSslError";
    public static String methodSig =
            "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V";
    public static void hook(Object thiz, WebView webView, SslErrorHandler handler, SslError error) {
        Log.w("YAHFA", "WebViewClient.onReceivedSslError()");
        handler.proceed();
    }
}
