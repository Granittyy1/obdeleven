package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InterfaceC1967f1 f26155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile zzei f26156b;

    public final int a() {
        if (this.f26156b != null) {
            return ((zzeg) this.f26156b).zza.length;
        }
        if (this.f26155a != null) {
            return this.f26155a.d();
        }
        return 0;
    }

    public final zzei b() {
        if (this.f26156b != null) {
            return this.f26156b;
        }
        synchronized (this) {
            try {
                if (this.f26156b != null) {
                    return this.f26156b;
                }
                if (this.f26155a == null) {
                    this.f26156b = zzei.f26345b;
                } else {
                    this.f26156b = this.f26155a.A();
                }
                return this.f26156b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(InterfaceC1967f1 interfaceC1967f1) {
        if (this.f26155a != null) {
            return;
        }
        synchronized (this) {
            if (this.f26155a != null) {
                return;
            }
            try {
                this.f26155a = interfaceC1967f1;
                this.f26156b = zzei.f26345b;
            } catch (zzfq unused) {
                this.f26155a = interfaceC1967f1;
                this.f26156b = zzei.f26345b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0)) {
            return false;
        }
        S0 s10 = (S0) obj;
        InterfaceC1967f1 interfaceC1967f1 = this.f26155a;
        InterfaceC1967f1 interfaceC1967f2 = s10.f26155a;
        if (interfaceC1967f1 == null && interfaceC1967f2 == null) {
            return b().equals(s10.b());
        }
        if (interfaceC1967f1 != null && interfaceC1967f2 != null) {
            return interfaceC1967f1.equals(interfaceC1967f2);
        }
        if (interfaceC1967f1 != null) {
            s10.c(interfaceC1967f1.B());
            return interfaceC1967f1.equals(s10.f26155a);
        }
        c(interfaceC1967f2.B());
        return this.f26155a.equals(interfaceC1967f2);
    }

    public int hashCode() {
        return 1;
    }
}
