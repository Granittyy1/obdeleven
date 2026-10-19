package androidx.compose.foundation;

import android.content.Context;

/* JADX INFO: renamed from: androidx.compose.foundation.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0929a implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p013b0.c f9860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.foundation.layout.L f9862d;

    public C0929a(Context context, p013b0.c cVar, long j, androidx.compose.foundation.layout.L l10) {
        this.f9859a = context;
        this.f9860b = cVar;
        this.f9861c = j;
        this.f9862d = l10;
    }

    @Override // androidx.compose.foundation.F
    public final AndroidEdgeEffectOverscrollEffect a() {
        return new AndroidEdgeEffectOverscrollEffect(this.f9859a, this.f9860b, this.f9861c, this.f9862d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0929a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        C0929a c0929a = (C0929a) obj;
        return kotlin.jvm.internal.i.a(this.f9859a, c0929a.f9859a) && kotlin.jvm.internal.i.a(this.f9860b, c0929a.f9860b) && androidx.compose.ui.graphics.H.c(this.f9861c, c0929a.f9861c) && kotlin.jvm.internal.i.a(this.f9862d, c0929a.f9862d);
    }

    public final int hashCode() {
        int iHashCode = (this.f9860b.hashCode() + (this.f9859a.hashCode() * 31)) * 31;
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        return this.f9862d.hashCode() + C4.b.c(this.f9861c, iHashCode, 31);
    }
}
