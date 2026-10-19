package com.facebook.login;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;

/* JADX INFO: renamed from: com.facebook.login.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1769a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25101e;

    public /* synthetic */ RunnableC1769a(Object obj, Object obj2, Object obj3, int i10) {
        this.f25098b = i10;
        this.f25099c = obj;
        this.f25100d = obj2;
        this.f25101e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25098b) {
            case 0:
                C1770b this$0 = (C1770b) this.f25099c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                LoginClient.b request = (LoginClient.b) this.f25100d;
                kotlin.jvm.internal.i.e(request, "$request");
                Bundle bundle = (Bundle) this.f25101e;
                try {
                    this$0.j(request, bundle);
                    this$0.t(request, bundle, null);
                } catch (FacebookException e10) {
                    this$0.t(request, null, e10);
                    return;
                }
                break;
            default:
                ((GaugeManager) this.f25099c).lambda$stopCollectingGauges$3((String) this.f25100d, (ApplicationProcessState) this.f25101e);
                break;
        }
    }
}
