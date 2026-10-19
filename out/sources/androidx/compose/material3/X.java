package androidx.compose.material3;

import androidx.compose.ui.node.InterfaceC1184e;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
public final class X implements androidx.compose.foundation.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12416c;

    /* JADX INFO: compiled from: Ripple.kt */
    public static final class a implements androidx.compose.ui.graphics.L {
        public a() {
        }

        @Override // androidx.compose.ui.graphics.L
        public final long a() {
            return X.this.f12416c;
        }
    }

    public X(boolean z10, float f10, long j) {
        this.f12414a = z10;
        this.f12415b = f10;
        this.f12416c = j;
    }

    @Override // androidx.compose.foundation.z
    public final InterfaceC1184e b(androidx.compose.foundation.interaction.j jVar) {
        a aVar = new a();
        return new C1071x(jVar, this.f12414a, this.f12415b, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x10 = (X) obj;
        if (this.f12414a == x10.f12414a && p013b0.f.a(this.f12415b, x10.f12415b) && kotlin.jvm.internal.i.a(null, null)) {
            return androidx.compose.ui.graphics.H.c(this.f12416c, x10.f12416c);
        }
        return false;
    }

    @Override // androidx.compose.foundation.z
    public final int hashCode() {
        int iD = O.a.d(this.f12415b, Boolean.hashCode(this.f12414a) * 31, 961);
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        return Long.hashCode(this.f12416c) + iD;
    }
}
