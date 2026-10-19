package io.intercom.android.sdk.conversation;

import android.webkit.WebView;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class JavascriptRunner {
    private final Collection<Runnable> actionsAfterLoad;
    private boolean hasLoaded;
    private final WebView webView;

    public JavascriptRunner(WebView webView) {
        this(webView, new ArrayList());
    }

    public synchronized void clearPendingScripts() {
        this.actionsAfterLoad.clear();
    }

    public synchronized void reset() {
        this.hasLoaded = false;
        clearPendingScripts();
    }

    public synchronized void run(final String str) {
        try {
            Runnable runnable = new Runnable() { // from class: io.intercom.android.sdk.conversation.JavascriptRunner.1
                @Override // java.lang.Runnable
                public void run() {
                    JavascriptRunner.this.webView.loadUrl(InAppMessageWebViewClient.JAVASCRIPT_PREFIX + str);
                }
            };
            if (this.hasLoaded) {
                this.webView.post(runnable);
            } else {
                this.actionsAfterLoad.add(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void runPendingScripts() {
        try {
            this.hasLoaded = true;
            Iterator<Runnable> it = this.actionsAfterLoad.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            clearPendingScripts();
        } catch (Throwable th) {
            throw th;
        }
    }

    public JavascriptRunner(WebView webView, Collection<Runnable> collection) {
        this.hasLoaded = false;
        this.webView = webView;
        this.actionsAfterLoad = collection;
    }
}
