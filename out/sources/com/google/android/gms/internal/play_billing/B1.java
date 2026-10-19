package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class B1 extends C1 {
    public B1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.C1
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(this.f26109a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.C1
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(this.f26109a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.C1
    public final void c(Object obj, long j, boolean z10) {
        if (D1.f26117g) {
            D1.b(obj, j, z10 ? (byte) 1 : (byte) 0);
        } else {
            D1.c(obj, j, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.C1
    public final void d(Object obj, long j, byte b10) {
        if (D1.f26117g) {
            D1.b(obj, j, b10);
        } else {
            D1.c(obj, j, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.C1
    public final void e(Object obj, long j, double d10) {
        this.f26109a.putLong(obj, j, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.C1
    public final void f(Object obj, long j, float f10) {
        this.f26109a.putInt(obj, j, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.C1
    public final boolean g(Object obj, long j) {
        return D1.f26117g ? D1.q(obj, j) : D1.r(obj, j);
    }
}
