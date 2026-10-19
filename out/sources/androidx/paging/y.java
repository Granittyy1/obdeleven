package androidx.paging;

import A1.C0575j;
import java.util.List;

/* JADX INFO: compiled from: PagingState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<PagingSource.b.C0195b<Key, Value>> f19453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f19454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f19455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19456d;

    public y(List<PagingSource.b.C0195b<Key, Value>> pages, Integer num, w wVar, int i10) {
        kotlin.jvm.internal.i.e(pages, "pages");
        this.f19453a = pages;
        this.f19454b = num;
        this.f19455c = wVar;
        this.f19456d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (kotlin.jvm.internal.i.a(this.f19453a, yVar.f19453a) && kotlin.jvm.internal.i.a(this.f19454b, yVar.f19454b) && kotlin.jvm.internal.i.a(this.f19455c, yVar.f19455c) && this.f19456d == yVar.f19456d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f19453a.hashCode();
        Integer num = this.f19454b;
        return Integer.hashCode(this.f19456d) + this.f19455c.hashCode() + iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingState(pages=");
        sb2.append(this.f19453a);
        sb2.append(", anchorPosition=");
        sb2.append(this.f19454b);
        sb2.append(", config=");
        sb2.append(this.f19455c);
        sb2.append(", leadingPlaceholderCount=");
        return C0575j.b(sb2, this.f19456d, ')');
    }
}
