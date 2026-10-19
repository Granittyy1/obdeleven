package androidx.compose.runtime.collection;

import androidx.collection.K;
import androidx.collection.L;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ScopeMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class e<Key, Scope> {
    public static final void a(K<Object, Object> k10, Key key, Scope scope) {
        int iH = k10.h(key);
        boolean z10 = iH < 0;
        Object obj = z10 ? null : k10.f9129c[iH];
        if (obj != null) {
            if (obj instanceof L) {
                ((L) obj).d(scope);
            } else if (obj != scope) {
                L l10 = new L((Object) null);
                l10.d(obj);
                l10.d(scope);
                scope = (Scope) l10;
            }
            scope = (Scope) obj;
        }
        if (!z10) {
            k10.f9129c[iH] = scope;
            return;
        }
        int i10 = ~iH;
        k10.f9128b[i10] = key;
        k10.f9129c[i10] = scope;
    }

    public static final boolean b(K<Object, Object> k10, Key key, Scope scope) {
        Object objD = k10.d(key);
        if (objD == null) {
            return false;
        }
        if (!(objD instanceof L)) {
            if (!objD.equals(scope)) {
                return false;
            }
            k10.j(key);
            return true;
        }
        L l10 = (L) objD;
        boolean zL = l10.l(scope);
        if (zL && l10.b()) {
            k10.j(key);
        }
        return zL;
    }

    public static final void c(K<Object, Object> k10, Scope scope) {
        boolean zB;
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
                        Object obj = k10.f9128b[i13];
                        Object obj2 = k10.f9129c[i13];
                        if (obj2 instanceof L) {
                            i.c(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            L l10 = (L) obj2;
                            l10.l(scope);
                            zB = l10.b();
                        } else {
                            zB = obj2 == scope;
                        }
                        if (zB) {
                            k10.k(i13);
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
}
