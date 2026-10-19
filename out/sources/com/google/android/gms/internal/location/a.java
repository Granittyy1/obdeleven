package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f25367c;

    public a(IBinder iBinder) {
        this.f25367c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25367c;
    }
}
