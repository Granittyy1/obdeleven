package com.google.android.gms.common.api.internal;

import U4.C0804l;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a<R extends g, A> extends BasePendingResult<R> {
    public abstract void h() throws RemoteException;

    public final void i(Status status) {
        C0804l.a("Failed result must not be success", !(status.f25308b <= 0));
        d(a());
    }
}
