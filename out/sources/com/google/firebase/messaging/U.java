package com.google.firebase.messaging;

import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import io.intercom.android.sdk.IntercomStatusCallback;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class U implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28335c;

    public /* synthetic */ U(int i10, Object obj) {
        this.f28334b = i10;
        this.f28335c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28334b) {
            case 0:
                V.a aVar = (V.a) this.f28335c;
                aVar.f28342a.getAction();
                aVar.f28343b.d(null);
                break;
            case 1:
                ((ControlUnitFragment) ((BaseFragment) this.f28335c)).a0();
                break;
            case 2:
                ((IntercomStatusCallback) this.f28335c).onSuccess();
                break;
            case 3:
                ((FetchedAppSettingsManager.a) this.f28335c).onSuccess();
                break;
            default:
                AppStartTrace appStartTrace = (AppStartTrace) this.f28335c;
                if (appStartTrace.f28450o == null) {
                    appStartTrace.f28450o = new com.google.firebase.perf.util.h();
                    long j = appStartTrace.d().f28507b;
                    com.google.firebase.perf.v1.i.a aVar2 = appStartTrace.f28441e;
                    aVar2.w(j);
                    aVar2.x(appStartTrace.d().b(appStartTrace.f28450o));
                    appStartTrace.f(aVar2);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ U(FetchedAppSettingsManager.a aVar, p165n4.j jVar) {
        this.f28334b = 3;
        this.f28335c = aVar;
    }
}
