package p055e3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* JADX INFO: compiled from: MDRootLayout.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f34721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f34722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MDRootLayout f34723d;

    public b(MDRootLayout mDRootLayout, View view, boolean z10) {
        this.f34723d = mDRootLayout;
        this.f34721b = view;
        this.f34722c = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f34721b;
        if (view.getMeasuredHeight() == 0) {
            return true;
        }
        WebView webView = (WebView) view;
        int i10 = MDRootLayout.f23280u;
        float measuredHeight = webView.getMeasuredHeight();
        float scale = webView.getScale() * webView.getContentHeight();
        boolean z10 = this.f34722c;
        MDRootLayout mDRootLayout = this.f34723d;
        if (measuredHeight < scale) {
            mDRootLayout.b((ViewGroup) view, z10);
        } else {
            if (z10) {
                mDRootLayout.f23285f = false;
            }
            mDRootLayout.f23286g = false;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
