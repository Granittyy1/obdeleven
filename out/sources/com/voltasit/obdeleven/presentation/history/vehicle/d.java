package com.voltasit.obdeleven.presentation.history.vehicle;

import android.app.Activity;
import com.obdeleven.service.model.ControlUnit;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import java.util.List;
import p134k8.C2642q1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f32497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f32498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32499g;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f32494b = i10;
        this.f32495c = obj;
        this.f32496d = obj2;
        this.f32497e = obj3;
        this.f32498f = obj4;
        this.f32499g = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32494b) {
            case 0:
                VehicleHistoryFragment this$0 = (VehicleHistoryFragment) this.f32495c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                p170n9.e eVar = (p170n9.e) this.f32496d;
                ControlUnit controlUnit = (ControlUnit) this.f32497e;
                C2642q1 c2642q1 = (C2642q1) this.f32498f;
                C2642q1 c2642q2 = (C2642q1) this.f32499g;
                this$0.w();
                eVar.f31857z = controlUnit;
                eVar.f31834E = c2642q2;
                eVar.f31841L = c2642q1;
                eVar.f31833D = true;
                eVar.f31832C = true;
                this$0.r().n(eVar, null);
                break;
            default:
                ((OverlayPresenter) this.f32495c).lambda$preloadAvatarThenDisplayNotifications$7((String) this.f32496d, (List) this.f32497e, (Intercom.Visibility) this.f32498f, (Activity) this.f32499g);
                break;
        }
    }
}
