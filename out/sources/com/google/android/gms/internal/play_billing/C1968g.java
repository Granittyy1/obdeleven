package com.google.android.gms.internal.play_billing;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1968g extends C1959d implements InterfaceC1974i {
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1974i
    public final void O(String str, String str2, p237t3.z zVar) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        int i10 = C1965f.f26182a;
        parcelE.writeStrongBinder(zVar);
        try {
            this.f26179c.transact(1, parcelE, null, 1);
        } finally {
            parcelE.recycle();
        }
    }
}
