package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class D2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile D2 f25420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D2 f25421c = new D2(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, N2.d<?, ?>> f25422a;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1894r3 f25423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25424b;

        public a(InterfaceC1894r3 interfaceC1894r3, int i10) {
            this.f25423a = interfaceC1894r3;
            this.f25424b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25423a == aVar.f25423a && this.f25424b == aVar.f25424b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f25423a) * 65535) + this.f25424b;
        }
    }

    public D2() {
        this.f25422a = new HashMap();
    }

    public final <ContainingType extends InterfaceC1894r3> N2.d<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (N2.d) this.f25422a.get(new a(containingtype, i10));
    }

    public D2(int i10) {
        this.f25422a = Collections.emptyMap();
    }
}
