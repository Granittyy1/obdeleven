package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.AbstractC1969g0;
import com.google.android.gms.internal.play_billing.AbstractC1972h0;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1972h0<MessageType extends AbstractC1972h0<MessageType, BuilderType>, BuilderType extends AbstractC1969g0<MessageType, BuilderType>> implements InterfaceC1967f1 {
    protected int zza = 0;

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1967f1
    public final zzei A() {
        try {
            I0 i10 = (I0) this;
            int iD = i10.d();
            zzei zzeiVar = zzei.f26345b;
            byte[] bArr = new byte[iD];
            Logger logger = AbstractC2001r0.f26243c;
            C1999q0 c1999q0 = new C1999q0(iD, bArr);
            i10.a(c1999q0);
            if (c1999q0.u() == 0) {
                return new zzeg(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(androidx.compose.foundation.gestures.d.b("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public final byte[] c() {
        try {
            I0 i10 = (I0) this;
            int iD = i10.d();
            byte[] bArr = new byte[iD];
            Logger logger = AbstractC2001r0.f26243c;
            C1999q0 c1999q0 = new C1999q0(iD, bArr);
            i10.a(c1999q0);
            if (c1999q0.u() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(androidx.compose.foundation.gestures.d.b("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public int e(InterfaceC1994o1 interfaceC1994o1) {
        throw null;
    }
}
