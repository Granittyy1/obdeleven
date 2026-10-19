package androidx.compose.ui.semantics;

import androidx.collection.C0895x;
import androidx.collection.Entries;
import androidx.collection.K;
import androidx.collection.U;
import androidx.compose.animation.D;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: SemanticsConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l implements w, Iterable<Map.Entry<? extends v<?>, ? extends Object>>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K<v<?>, Object> f15234b = U.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0895x f15235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15237e;

    public final void A(l lVar) {
        K<v<?>, Object> k10 = lVar.f15234b;
        Object[] objArr = k10.f9128b;
        Object[] objArr2 = k10.f9129c;
        long[] jArr = k10.f9127a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        v<?> vVar = (v) obj;
                        K<v<?>, Object> k11 = this.f15234b;
                        Object objD = k11.d(vVar);
                        kotlin.jvm.internal.i.c(vVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = vVar.f15254b.invoke(objD, obj2);
                        if (objInvoke != null) {
                            k11.l(vVar, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.semantics.w
    public final <T> void e(v<T> vVar, T t8) {
        boolean z10 = t8 instanceof a;
        K<v<?>, Object> k10 = this.f15234b;
        if (!z10 || !k10.b(vVar)) {
            k10.l(vVar, t8);
            return;
        }
        Object objD = k10.d(vVar);
        kotlin.jvm.internal.i.c(objD, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) objD;
        a aVar2 = (a) t8;
        String str = aVar2.f15190a;
        if (str == null) {
            str = aVar.f15190a;
        }
        p293xa.e eVar = aVar2.f15191b;
        if (eVar == null) {
            eVar = aVar.f15191b;
        }
        k10.l(vVar, new a(str, eVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.i.a(this.f15234b, lVar.f15234b) && this.f15236d == lVar.f15236d && this.f15237e == lVar.f15237e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15237e) + D.b(this.f15234b.hashCode() * 31, 31, this.f15236d);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends v<?>, ? extends Object>> iterator() {
        C0895x c0895x = this.f15235c;
        if (c0895x == null) {
            K<v<?>, Object> k10 = this.f15234b;
            k10.getClass();
            C0895x c0895x2 = new C0895x(k10);
            this.f15235c = c0895x2;
            c0895x = c0895x2;
        }
        return ((Entries) c0895x.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:5:0x0028->B:15:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[EDGE_INSN: B:18:0x0062->B:16:0x0062 BREAK  A[LOOP:0: B:5:0x0028->B:15:0x005f], SYNTHETIC] */
    public final l k() {
        l lVar = new l();
        lVar.f15236d = this.f15236d;
        lVar.f15237e = this.f15237e;
        K<v<?>, Object> k10 = lVar.f15234b;
        k10.getClass();
        K<v<?>, Object> from = this.f15234b;
        kotlin.jvm.internal.i.e(from, "from");
        Object[] objArr = from.f9128b;
        Object[] objArr2 = from.f9129c;
        long[] jArr = from.f9127a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i10 << 3) + i12;
                            k10.l((v<?>) objArr[i13], objArr2[i13]);
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return lVar;
    }

    public final <T> T q(v<T> vVar) {
        T t8 = (T) this.f15234b.d(vVar);
        if (t8 != null) {
            return t8;
        }
        throw new IllegalStateException("Key not present: " + vVar + " - consider getOrElse or getOrNull");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f15236d) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f15237e) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        K<v<?>, Object> k10 = this.f15234b;
        Object[] objArr = k10.f9128b;
        Object[] objArr2 = k10.f9129c;
        long[] jArr = k10.f9127a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            sb2.append(str);
                            sb2.append(((v) obj).f15253a);
                            sb2.append(" : ");
                            sb2.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return G0.a.l(this) + "{ " + ((Object) sb2) + " }";
    }

    public final <T> T v(v<T> vVar, Ia.a<? extends T> aVar) {
        T t8 = (T) this.f15234b.d(vVar);
        return t8 == null ? aVar.invoke() : t8;
    }
}
