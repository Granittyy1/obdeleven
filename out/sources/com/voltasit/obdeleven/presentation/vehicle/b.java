package com.voltasit.obdeleven.presentation.vehicle;

import B8.D0;
import kotlin.jvm.internal.i;
import p297y1.y;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f33428d;

    public /* synthetic */ b(Object obj, int i10, Object obj2) {
        this.f33426b = i10;
        this.f33427c = obj;
        this.f33428d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33426b) {
            case 0:
                VehicleBaseFragment this$0 = (VehicleBaseFragment) this.f33427c;
                i.e(this$0, "this$0");
                D0 binding = (D0) this.f33428d;
                i.e(binding, "$binding");
                this$0.q().f33570z = binding.f1642C.getWidth() / 2;
                break;
            default:
                ((y1.i.c) this.f33427c).getClass();
                ((y) this.f33428d).c();
                break;
        }
    }
}
