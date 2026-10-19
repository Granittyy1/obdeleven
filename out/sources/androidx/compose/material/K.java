package androidx.compose.material;

import androidx.compose.ui.node.InterfaceC1184e;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
public final class K implements androidx.compose.foundation.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11769c;

    /* JADX INFO: compiled from: Ripple.kt */
    public static final class a implements androidx.compose.ui.graphics.L {
        public a() {
        }

        @Override // androidx.compose.ui.graphics.L
        public final long a() {
            return K.this.f11769c;
        }
    }

    public K(boolean z10, float f10, long j) {
        this.f11767a = z10;
        this.f11768b = f10;
        this.f11769c = j;
    }

    @Override // androidx.compose.foundation.z
    public final InterfaceC1184e b(androidx.compose.foundation.interaction.j jVar) {
        a aVar = new a();
        return new C1043t(jVar, this.f11767a, this.f11768b, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        if (this.f11767a == k10.f11767a && p013b0.f.a(this.f11768b, k10.f11768b) && kotlin.jvm.internal.i.a(null, null)) {
            return androidx.compose.ui.graphics.H.c(this.f11769c, k10.f11769c);
        }
        return false;
    }

    @Override // androidx.compose.foundation.z
    public final int hashCode() {
        int iD = O.a.d(this.f11768b, Boolean.hashCode(this.f11767a) * 31, 961);
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        return Long.hashCode(this.f11769c) + iD;
    }
}
