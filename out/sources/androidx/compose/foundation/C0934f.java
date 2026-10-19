package androidx.compose.foundation;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.W;

/* JADX INFO: renamed from: androidx.compose.foundation.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0934f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public W f9901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.compose.ui.graphics.E f9902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public J.a f9903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Path f9904d;

    public C0934f() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0934f)) {
            return false;
        }
        C0934f c0934f = (C0934f) obj;
        return kotlin.jvm.internal.i.a(this.f9901a, c0934f.f9901a) && kotlin.jvm.internal.i.a(this.f9902b, c0934f.f9902b) && kotlin.jvm.internal.i.a(this.f9903c, c0934f.f9903c) && kotlin.jvm.internal.i.a(this.f9904d, c0934f.f9904d);
    }

    public final int hashCode() {
        W w3 = this.f9901a;
        int iHashCode = (w3 == null ? 0 : w3.hashCode()) * 31;
        androidx.compose.ui.graphics.E e10 = this.f9902b;
        int iHashCode2 = (iHashCode + (e10 == null ? 0 : e10.hashCode())) * 31;
        J.a aVar = this.f9903c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Path path = this.f9904d;
        return iHashCode3 + (path != null ? path.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f9901a + ", canvas=" + this.f9902b + ", canvasDrawScope=" + this.f9903c + ", borderPath=" + this.f9904d + ')';
    }

    public C0934f(int i10) {
        this.f9901a = null;
        this.f9902b = null;
        this.f9903c = null;
        this.f9904d = null;
    }
}
