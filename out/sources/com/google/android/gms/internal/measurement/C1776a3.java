package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1776a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InterfaceC1894r3 f25657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile zzij f25658b;

    static {
        D2 d10 = D2.f25420b;
    }

    public final int a() {
        if (this.f25658b != null) {
            return this.f25658b.B();
        }
        if (this.f25657a != null) {
            return this.f25657a.c();
        }
        return 0;
    }

    public final InterfaceC1894r3 b(InterfaceC1894r3 interfaceC1894r3) {
        if (this.f25657a == null) {
            synchronized (this) {
                if (this.f25657a == null) {
                    try {
                        this.f25657a = interfaceC1894r3;
                        this.f25658b = zzij.f26049b;
                    } catch (zzkb unused) {
                        this.f25657a = interfaceC1894r3;
                        this.f25658b = zzij.f26049b;
                    }
                }
            }
        }
        return this.f25657a;
    }

    public final zzij c() {
        if (this.f25658b != null) {
            return this.f25658b;
        }
        synchronized (this) {
            try {
                if (this.f25658b != null) {
                    return this.f25658b;
                }
                if (this.f25657a == null) {
                    this.f25658b = zzij.f26049b;
                } else {
                    this.f25658b = this.f25657a.d();
                }
                return this.f25658b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776a3)) {
            return false;
        }
        C1776a3 c1776a3 = (C1776a3) obj;
        InterfaceC1894r3 interfaceC1894r3 = this.f25657a;
        InterfaceC1894r3 interfaceC1894r4 = c1776a3.f25657a;
        if (interfaceC1894r3 == null && interfaceC1894r4 == null) {
            return c().equals(c1776a3.c());
        }
        if (interfaceC1894r3 == null || interfaceC1894r4 == null) {
            return interfaceC1894r3 != null ? interfaceC1894r3.equals(c1776a3.b(interfaceC1894r3.e())) : b(interfaceC1894r4.e()).equals(interfaceC1894r4);
        }
        return interfaceC1894r3.equals(interfaceC1894r4);
    }

    public int hashCode() {
        return 1;
    }
}
