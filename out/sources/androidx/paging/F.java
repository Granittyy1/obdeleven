package androidx.paging;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: TransformablePage.kt */
/* JADX INFO: loaded from: classes.dex */
public final class F<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F<Object> f19230d = new F<>(0, EmptyList.f42983b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f19231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<T> f19232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19233c;

    public F(int[] originalPageOffsets, List data, int i10) {
        kotlin.jvm.internal.i.e(originalPageOffsets, "originalPageOffsets");
        kotlin.jvm.internal.i.e(data, "data");
        this.f19231a = originalPageOffsets;
        this.f19232b = data;
        this.f19233c = i10;
        if (originalPageOffsets.length == 0) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f10 = (F) obj;
        return Arrays.equals(this.f19231a, f10.f19231a) && kotlin.jvm.internal.i.a(this.f19232b, f10.f19232b) && this.f19233c == f10.f19233c && kotlin.jvm.internal.i.a(null, null);
    }

    public final int hashCode() {
        return (p005a4.p.d(Arrays.hashCode(this.f19231a) * 31, 31, this.f19232b) + this.f19233c) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb2.append(Arrays.toString(this.f19231a));
        sb2.append(", data=");
        sb2.append(this.f19232b);
        sb2.append(", hintOriginalPageOffset=");
        return p005a4.q.c(sb2, this.f19233c, ", hintOriginalIndices=null)");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(int i10, List<? extends T> data) {
        this(new int[]{i10}, data, i10);
        kotlin.jvm.internal.i.e(data, "data");
    }
}
