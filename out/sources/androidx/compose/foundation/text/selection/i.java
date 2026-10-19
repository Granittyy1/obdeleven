package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.style.ResolvedTextDirection;

/* JADX INFO: compiled from: Selection.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f11602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f11603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11604c;

    /* JADX INFO: compiled from: Selection.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResolvedTextDirection f11605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f11607c;

        public a(ResolvedTextDirection resolvedTextDirection, int i10, long j) {
            this.f11605a = resolvedTextDirection;
            this.f11606b = i10;
            this.f11607c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11605a == aVar.f11605a && this.f11606b == aVar.f11606b && this.f11607c == aVar.f11607c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f11607c) + p005a4.q.b(this.f11606b, this.f11605a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnchorInfo(direction=");
            sb2.append(this.f11605a);
            sb2.append(", offset=");
            sb2.append(this.f11606b);
            sb2.append(", selectableId=");
            return C4.a.h(sb2, this.f11607c, ')');
        }
    }

    public i(a aVar, a aVar2, boolean z10) {
        this.f11602a = aVar;
        this.f11603b = aVar2;
        this.f11604c = z10;
    }

    public static i a(i iVar, a aVar, a aVar2, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            aVar = iVar.f11602a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = iVar.f11603b;
        }
        iVar.getClass();
        return new i(aVar, aVar2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.i.a(this.f11602a, iVar.f11602a) && kotlin.jvm.internal.i.a(this.f11603b, iVar.f11603b) && this.f11604c == iVar.f11604c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11604c) + ((this.f11603b.hashCode() + (this.f11602a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Selection(start=");
        sb2.append(this.f11602a);
        sb2.append(", end=");
        sb2.append(this.f11603b);
        sb2.append(", handlesCrossed=");
        return Z3.o.d(sb2, this.f11604c, ')');
    }
}
