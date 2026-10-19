package com.google.accompanist.placeholder;

import C4.v;
import D9.o;
import I.e;
import I.h;
import androidx.compose.animation.core.E;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.f0;
import kotlin.collections.l;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PlaceholderHighlight.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E<Float> f25229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f25230c;

    public c() {
        throw null;
    }

    public c(long j, E e10, float f10) {
        this.f25228a = j;
        this.f25229b = e10;
        this.f25230c = f10;
    }

    @Override // com.google.accompanist.placeholder.a
    public final E<Float> a() {
        return this.f25229b;
    }

    @Override // com.google.accompanist.placeholder.a
    public final float b(float f10) {
        float f11 = this.f25230c;
        return f10 <= f11 ? o.n(0.0f, 1.0f, f10 / f11) : o.n(1.0f, 0.0f, (f10 - f11) / (1.0f - f11));
    }

    @Override // com.google.accompanist.placeholder.a
    public final f0 c(float f10, long j) {
        long j10 = this.f25228a;
        return new f0(l.s(new H(H.b(0.0f, j10)), new H(j10), new H(H.b(0.0f, j10))), e.c(0.0f, 0.0f), Na.l.x(Math.max(h.d(j), h.b(j)) * f10 * 2, 0.01f), 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return H.c(this.f25228a, cVar.f25228a) && i.a(this.f25229b, cVar.f25229b) && Float.compare(this.f25230c, cVar.f25230c) == 0;
    }

    public final int hashCode() {
        int i10 = H.f13505m;
        return Float.hashCode(this.f25230c) + ((this.f25229b.hashCode() + (Long.hashCode(this.f25228a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shimmer(highlightColor=");
        v.h(this.f25228a, ", animationSpec=", sb2);
        sb2.append(this.f25229b);
        sb2.append(", progressForMaxAlpha=");
        return B7.b.d(sb2, this.f25230c, ')');
    }
}
