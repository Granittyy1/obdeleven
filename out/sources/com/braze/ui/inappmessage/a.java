package com.braze.ui.inappmessage;

import android.app.Activity;
import androidx.media3.exoplayer.source.i;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import p235t1.j;
import p235t1.k;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements IWebViewClientStateListener, p114j1.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24420d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3) {
        this.f24418b = obj;
        this.f24419c = obj2;
        this.f24420d = obj3;
    }

    @Override // p114j1.f
    public void a(Object obj) {
        i.a aVar = (i.a) this.f24418b;
        ((i) obj).T(aVar.f18703a, aVar.f18704b, (j) this.f24419c, (k) this.f24420d);
    }

    @Override // com.braze.ui.inappmessage.listeners.IWebViewClientStateListener
    public void onPageFinished() {
        BrazeInAppMessageManager.displayInAppMessage$lambda$7((IInAppMessageViewWrapper) this.f24418b, (BrazeInAppMessageManager) this.f24419c, (Activity) this.f24420d);
    }
}
