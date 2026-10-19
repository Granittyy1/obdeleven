package com.google.android.gms.internal.location;

import S4.C0762d;
import U4.AbstractC0798f;
import U4.C0795c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.collection.X;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends AbstractC0798f {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final X f25371G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final X f25372H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final X f25373I;

    public i(Context context, Looper looper, C0795c c0795c, com.google.android.gms.common.api.d.a aVar, com.google.android.gms.common.api.d.b bVar) {
        super(context, looper, 23, c0795c, aVar, bVar);
        this.f25371G = new X();
        this.f25372H = new X();
        this.f25373I = new X();
        new X();
    }

    @Override // U4.AbstractC0794b
    public final String B() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // U4.AbstractC0794b
    public final String C() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // U4.AbstractC0794b
    public final void E(int i10) {
        super.E(i10);
        synchronized (this.f25371G) {
            this.f25371G.clear();
        }
        synchronized (this.f25372H) {
            this.f25372H.clear();
        }
        synchronized (this.f25373I) {
            this.f25373I.clear();
        }
    }

    @Override // U4.AbstractC0794b, com.google.android.gms.common.api.a.e
    public final int n() {
        return 11717000;
    }

    @Override // U4.AbstractC0794b
    public final IInterface v(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof q ? (q) iInterfaceQueryLocalInterface : new p(iBinder);
    }

    @Override // U4.AbstractC0794b
    public final C0762d[] x() {
        return p106i5.h.f36749a;
    }
}
