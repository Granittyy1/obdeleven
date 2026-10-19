package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27757b;

    public o(int i10, long j) {
        this.f27756a = i10;
        this.f27757b = j;
    }

    @Override // com.google.android.play.integrity.internal.p
    public final int a() {
        return this.f27756a;
    }

    @Override // com.google.android.play.integrity.internal.p
    public final long b() {
        return this.f27757b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f27756a == pVar.a() && this.f27757b == pVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f27757b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.f27756a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f27756a);
        sb2.append(", eventTimestamp=");
        return p005a4.o.d(this.f27757b, "}", sb2);
    }
}
