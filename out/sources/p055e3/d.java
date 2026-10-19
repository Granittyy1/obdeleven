package p055e3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* JADX INFO: compiled from: MDRootLayout.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f34727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f34728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MDRootLayout f34729d;

    public d(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z10) {
        this.f34729d = mDRootLayout;
        this.f34727b = viewGroup;
        this.f34728c = z10;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        boolean z10;
        boolean z11;
        MDRootLayout mDRootLayout = this.f34729d;
        MDButton[] mDButtonArr = mDRootLayout.f23281b;
        int length = mDButtonArr.length;
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            MDButton mDButton = mDButtonArr[i10];
            if (mDButton != null && mDButton.getVisibility() != 8) {
                z10 = true;
                break;
            }
            i10++;
        }
        ViewGroup viewGroup = this.f34727b;
        boolean z13 = viewGroup instanceof WebView;
        boolean z14 = this.f34728c;
        if (z13) {
            WebView webView = (WebView) viewGroup;
            if (z14) {
                View view = mDRootLayout.f23283d;
                if (view == null || view.getVisibility() == 8) {
                    z11 = false;
                } else {
                    if (webView.getPaddingTop() + webView.getScrollY() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                mDRootLayout.f23285f = z11;
            }
            if (z10) {
                if ((webView.getMeasuredHeight() + webView.getScrollY()) - webView.getPaddingBottom() < webView.getScale() * webView.getContentHeight()) {
                    z12 = true;
                }
            }
            mDRootLayout.f23286g = z12;
        } else {
            MDRootLayout.a(mDRootLayout, viewGroup, z14, z10);
        }
        mDRootLayout.invalidate();
    }
}
