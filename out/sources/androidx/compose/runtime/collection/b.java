package androidx.compose.runtime.collection;

import Ia.l;
import androidx.collection.I;
import androidx.collection.K;
import androidx.collection.Q;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: MultiValueMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class b<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K<Object, Object> f12942a;

    public /* synthetic */ b(K k10) {
        this.f12942a = k10;
    }

    public static final void a(K<Object, Object> k10, K k11, V v10) {
        int iH = k10.h(k11);
        boolean z10 = iH < 0;
        Object obj = z10 ? null : k10.f9129c[iH];
        if ((obj instanceof List) && (obj instanceof Ja.a)) {
            boolean z11 = obj instanceof Ja.c;
        }
        if (obj != null) {
            if (obj instanceof I) {
                I i10 = (I) obj;
                i10.g(v10);
                v10 = (V) i10;
            } else {
                Object[] objArr = Q.f9119a;
                I i11 = new I(2);
                i11.g(obj);
                i11.g(v10);
                v10 = (V) i11;
            }
        }
        if (!z10) {
            k10.f9129c[iH] = v10;
            return;
        }
        int i12 = ~iH;
        k10.f9128b[i12] = k11;
        k10.f9129c[i12] = v10;
    }

    public static K b() {
        return new K((Object) null);
    }

    public static final Object c(K k10, androidx.compose.runtime.Q q10) {
        Object objD = k10.d(q10);
        if (objD == null) {
            return null;
        }
        if (!(objD instanceof I)) {
            k10.j(q10);
            return objD;
        }
        I i10 = (I) objD;
        if (i10.d()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i11 = i10.f9109b - 1;
        E eB = i10.b(i11);
        i10.k(i11);
        i.c(eB, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (i10.d()) {
            k10.j(q10);
        }
        if (i10.f9109b == 1) {
            k10.l(q10, i10.a());
        }
        return eB;
    }

    public static final void d(K k10, androidx.compose.runtime.Q q10, l lVar) {
        Object objD = k10.d(q10);
        if (objD != null) {
            if (!(objD instanceof I)) {
                if (((Boolean) lVar.invoke(objD)).booleanValue()) {
                    k10.j(q10);
                    return;
                }
                return;
            }
            I i10 = (I) objD;
            int i11 = i10.f9109b;
            Object[] objArr = i10.f9108a;
            int i12 = 0;
            Na.i iVarJ = Na.l.J(0, i11);
            int i13 = iVarJ.f4687b;
            int i14 = iVarJ.f4688c;
            if (i13 <= i14) {
                while (true) {
                    objArr[i13 - i12] = objArr[i13];
                    if (((Boolean) lVar.invoke(objArr[i13])).booleanValue()) {
                        i12++;
                    }
                    if (i13 == i14) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            Q3.d.w(objArr, null, i11 - i12, i11);
            i10.f9109b -= i12;
            if (i10.d()) {
                k10.j(q10);
            }
            if (i10.f9109b == 0) {
                k10.l(q10, i10.a());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0090 A[LOOP:0: B:9:0x001f->B:28:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[EDGE_INSN: B:31:0x0093->B:29:0x0093 BREAK  A[LOOP:0: B:9:0x001f->B:28:0x0090], SYNTHETIC] */
    public static final I e(K k10) {
        if (k10.e()) {
            I i10 = Q.f9120b;
            i.c(i10, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return i10;
        }
        I i11 = new I((Object) null);
        Object[] objArr = k10.f9129c;
        long[] jArr = k10.f9127a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j = jArr[i12];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i12 != length) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i12 << 3) + i14];
                            if (obj instanceof I) {
                                i.c(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                I elements = (I) obj;
                                i.e(elements, "elements");
                                if (!elements.d()) {
                                    int i15 = i11.f9109b + elements.f9109b;
                                    Object[] objArr2 = i11.f9108a;
                                    if (objArr2.length < i15) {
                                        i11.m(i15, objArr2);
                                    }
                                    Q3.d.n(i11.f9109b, 0, elements.f9109b, elements.f9108a, i11.f9108a);
                                    i11.f9109b += elements.f9109b;
                                }
                            } else {
                                i.c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                i11.g(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                    if (i12 != length) {
                        break;
                    }
                    i12++;
                }
            }
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return i.a(this.f12942a, ((b) obj).f12942a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12942a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f12942a + ')';
    }
}
