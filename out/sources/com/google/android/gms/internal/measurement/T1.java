package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class T1 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R1 f25596a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(R1 r10) {
        super(null);
        this.f25596a = r10;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        R1 r10 = this.f25596a;
        synchronized (r10.f25577e) {
            r10.f25578f = null;
            r10.f25575c.run();
        }
        synchronized (r10) {
            try {
                Iterator it = r10.f25579g.iterator();
                while (it.hasNext()) {
                    ((V1) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
