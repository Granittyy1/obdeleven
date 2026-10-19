package E;

import A8.A;
import androidx.compose.runtime.Recomposer;
import java.util.Arrays;
import p114j1.C2479a;

/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f2956e = new t(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f2959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f2960d;

    /* JADX INFO: compiled from: TrieNode.kt */
    public static final class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t<K, V> f2961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2962b;

        public a(t<K, V> tVar, int i10) {
            this.f2961a = tVar;
            this.f2962b = i10;
        }
    }

    public t(int i10, int i11, Object[] objArr, A a10) {
        this.f2957a = i10;
        this.f2958b = i11;
        this.f2959c = a10;
        this.f2960d = objArr;
    }

    public static t j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, A a10) {
        if (i12 > 30) {
            return new t(0, 0, new Object[]{obj, obj2, obj3, obj4}, a10);
        }
        int iK = C2479a.k(i10, i12);
        int iK2 = C2479a.k(i11, i12);
        if (iK != iK2) {
            return new t((1 << iK) | (1 << iK2), 0, iK < iK2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, a10);
        }
        return new t(0, 1 << iK, new Object[]{j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, a10)}, a10);
    }

    public final Object[] a(int i10, int i11, int i12, K k10, V v10, int i13, A a10) {
        Object obj = this.f2960d[i10];
        t tVarJ = j(obj != null ? obj.hashCode() : 0, obj, x(i10), i12, k10, v10, i13 + 5, a10);
        int iT = t(i11);
        int i14 = iT + 1;
        Object[] objArr = this.f2960d;
        Object[] objArr2 = new Object[objArr.length - 1];
        Q3.d.r(0, i10, 6, objArr, objArr2);
        Q3.d.n(i10, i10 + 2, i14, objArr, objArr2);
        objArr2[iT - 1] = tVarJ;
        Q3.d.n(iT, i14, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f2958b == 0) {
            return this.f2960d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f2957a);
        int length = this.f2960d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += s(i10).b();
        }
        return iBitCount;
    }

    public final boolean c(K k10) {
        Na.g gVarI = Na.l.I(2, Na.l.J(0, this.f2960d.length));
        int i10 = gVarI.f4687b;
        int i11 = gVarI.f4688c;
        int i12 = gVarI.f4689d;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!kotlin.jvm.internal.i.a(k10, this.f2960d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(int i10, int i11, Object obj) {
        int iK = 1 << C2479a.k(i10, i11);
        if (h(iK)) {
            return kotlin.jvm.internal.i.a(obj, this.f2960d[f(iK)]);
        }
        if (!i(iK)) {
            return false;
        }
        t<K, V> tVarS = s(t(iK));
        return i11 == 30 ? tVarS.c(obj) : tVarS.d(i10, i11 + 5, obj);
    }

    public final boolean e(t<K, V> tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f2958b != tVar.f2958b || this.f2957a != tVar.f2957a) {
            return false;
        }
        int length = this.f2960d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f2960d[i10] != tVar.f2960d[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f2957a) * 2;
    }

    public final Object g(int i10, int i11, Object obj) {
        int iK = 1 << C2479a.k(i10, i11);
        if (h(iK)) {
            int iF = f(iK);
            if (kotlin.jvm.internal.i.a(obj, this.f2960d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iK)) {
            return null;
        }
        t<K, V> tVarS = s(t(iK));
        if (i11 != 30) {
            return tVarS.g(i10, i11 + 5, obj);
        }
        Na.g gVarI = Na.l.I(2, Na.l.J(0, tVarS.f2960d.length));
        int i12 = gVarI.f4687b;
        int i13 = gVarI.f4688c;
        int i14 = gVarI.f4689d;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return null;
        }
        while (!kotlin.jvm.internal.i.a(obj, tVarS.f2960d[i12])) {
            if (i12 == i13) {
                return null;
            }
            i12 += i14;
        }
        return tVarS.x(i12);
    }

    public final boolean h(int i10) {
        return (i10 & this.f2957a) != 0;
    }

    public final boolean i(int i10) {
        return (i10 & this.f2958b) != 0;
    }

    public final t<K, V> k(int i10, f<K, V> fVar) {
        fVar.getClass();
        fVar.b(fVar.f2944g - 1);
        fVar.f2942e = x(i10);
        Object[] objArr = this.f2960d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f2959c != fVar.f2940c) {
            return new t<>(0, 0, C2479a.e(i10, objArr), fVar.f2940c);
        }
        this.f2960d = C2479a.e(i10, objArr);
        return this;
    }

    public final t<K, V> l(int i10, K k10, V v10, int i11, f<K, V> fVar) {
        t<K, V> tVarL;
        int iK = 1 << C2479a.k(i10, i11);
        boolean zH = h(iK);
        A a10 = this.f2959c;
        if (zH) {
            int iF = f(iK);
            if (!kotlin.jvm.internal.i.a(k10, this.f2960d[iF])) {
                fVar.getClass();
                fVar.b(fVar.f2944g + 1);
                A a11 = fVar.f2940c;
                if (a10 != a11) {
                    return new t<>(this.f2957a ^ iK, this.f2958b | iK, a(iF, iK, i10, k10, v10, i11, a11), a11);
                }
                this.f2960d = a(iF, iK, i10, k10, v10, i11, a11);
                this.f2957a ^= iK;
                this.f2958b |= iK;
                return this;
            }
            fVar.f2942e = x(iF);
            if (x(iF) == v10) {
                return this;
            }
            if (a10 == fVar.f2940c) {
                this.f2960d[iF + 1] = v10;
                return this;
            }
            fVar.f2943f++;
            Object[] objArr = this.f2960d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = v10;
            return new t<>(this.f2957a, this.f2958b, objArrCopyOf, fVar.f2940c);
        }
        if (!i(iK)) {
            fVar.getClass();
            fVar.b(fVar.f2944g + 1);
            A a12 = fVar.f2940c;
            int iF2 = f(iK);
            if (a10 != a12) {
                return new t<>(this.f2957a | iK, this.f2958b, C2479a.c(this.f2960d, iF2, k10, v10), a12);
            }
            this.f2960d = C2479a.c(this.f2960d, iF2, k10, v10);
            this.f2957a |= iK;
            return this;
        }
        int iT = t(iK);
        t<K, V> tVarS = s(iT);
        if (i11 == 30) {
            Na.g gVarI = Na.l.I(2, Na.l.J(0, tVarS.f2960d.length));
            int i12 = gVarI.f4687b;
            int i13 = gVarI.f4688c;
            int i14 = gVarI.f4689d;
            if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                fVar.getClass();
                fVar.b(fVar.f2944g + 1);
                tVarL = new t<>(0, 0, C2479a.c(tVarS.f2960d, 0, k10, v10), fVar.f2940c);
            } else {
                while (true) {
                    if (!kotlin.jvm.internal.i.a(k10, tVarS.f2960d[i12])) {
                        if (i12 == i13) {
                            break;
                        }
                        i12 += i14;
                    } else {
                        fVar.f2942e = tVarS.x(i12);
                        if (tVarS.f2959c == fVar.f2940c) {
                            tVarS.f2960d[i12 + 1] = v10;
                            tVarL = tVarS;
                        } else {
                            fVar.f2943f++;
                            Object[] objArr2 = tVarS.f2960d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            kotlin.jvm.internal.i.d(objArrCopyOf2, "copyOf(...)");
                            objArrCopyOf2[i12 + 1] = v10;
                            tVarL = new t<>(0, 0, objArrCopyOf2, fVar.f2940c);
                        }
                    }
                }
                fVar.getClass();
                fVar.b(fVar.f2944g + 1);
                tVarL = new t<>(0, 0, C2479a.c(tVarS.f2960d, 0, k10, v10), fVar.f2940c);
            }
        } else {
            tVarL = tVarS.l(i10, k10, v10, i11 + 5, fVar);
        }
        return tVarS == tVarL ? this : r(iT, tVarL, fVar.f2940c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r27v0, types: [E.t, E.t<K, V>] */
    /* JADX WARN: Type inference failed for: r4v17, types: [E.t] */
    /* JADX WARN: Type inference failed for: r4v21, types: [E.t] */
    /* JADX WARN: Type inference failed for: r4v22, types: [E.t] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25, types: [E.t] */
    /* JADX WARN: Type inference failed for: r4v26, types: [E.t] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type E.t<K, V> to ?? for r27v0 'this'  ??
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:139)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.inline(CodeShrinkVisitor.java:212)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:73)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:48)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:39)
        */
    public final E.t<K, V> m(E.t<K, V> r28, int r29, G.a r30, E.f<K, V> r31) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E.t.m(E.t, int, G.a, E.f):E.t");
    }

    public final t<K, V> n(int i10, K k10, int i11, f<K, V> fVar) {
        t<K, V> tVarN;
        int iK = 1 << C2479a.k(i10, i11);
        if (h(iK)) {
            int iF = f(iK);
            return kotlin.jvm.internal.i.a(k10, this.f2960d[iF]) ? p(iF, iK, fVar) : this;
        }
        if (!i(iK)) {
            return this;
        }
        int iT = t(iK);
        t<K, V> tVarS = s(iT);
        if (i11 == 30) {
            Na.g gVarI = Na.l.I(2, Na.l.J(0, tVarS.f2960d.length));
            int i12 = gVarI.f4687b;
            int i13 = gVarI.f4688c;
            int i14 = gVarI.f4689d;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!kotlin.jvm.internal.i.a(k10, tVarS.f2960d[i12])) {
                        if (i12 == i13) {
                            tVarN = tVarS;
                            break;
                        }
                        i12 += i14;
                    } else {
                        tVarN = tVarS.k(i12, fVar);
                        break;
                    }
                }
            } else {
                tVarN = tVarS;
                break;
            }
        } else {
            tVarN = tVarS.n(i10, k10, i11 + 5, fVar);
        }
        return q(tVarS, tVarN, iT, iK, fVar.f2940c);
    }

    public final t<K, V> o(int i10, K k10, V v10, int i11, f<K, V> fVar) {
        t<K, V> tVarO;
        int iK = 1 << C2479a.k(i10, i11);
        if (h(iK)) {
            int iF = f(iK);
            return (kotlin.jvm.internal.i.a(k10, this.f2960d[iF]) && kotlin.jvm.internal.i.a(v10, x(iF))) ? p(iF, iK, fVar) : this;
        }
        if (!i(iK)) {
            return this;
        }
        int iT = t(iK);
        t<K, V> tVarS = s(iT);
        if (i11 == 30) {
            Na.g gVarI = Na.l.I(2, Na.l.J(0, tVarS.f2960d.length));
            int i12 = gVarI.f4687b;
            int i13 = gVarI.f4688c;
            int i14 = gVarI.f4689d;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!kotlin.jvm.internal.i.a(k10, tVarS.f2960d[i12]) || !kotlin.jvm.internal.i.a(v10, tVarS.x(i12))) {
                        if (i12 == i13) {
                            tVarO = tVarS;
                            break;
                        }
                        i12 += i14;
                    } else {
                        tVarO = tVarS.k(i12, fVar);
                        break;
                    }
                }
            } else {
                tVarO = tVarS;
                break;
            }
        } else {
            tVarO = tVarS.o(i10, k10, v10, i11 + 5, fVar);
        }
        return q(tVarS, tVarO, iT, iK, fVar.f2940c);
    }

    public final t<K, V> p(int i10, int i11, f<K, V> fVar) {
        fVar.getClass();
        fVar.b(fVar.f2944g - 1);
        fVar.f2942e = x(i10);
        Object[] objArr = this.f2960d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f2959c != fVar.f2940c) {
            return new t<>(i11 ^ this.f2957a, this.f2958b, C2479a.e(i10, objArr), fVar.f2940c);
        }
        this.f2960d = C2479a.e(i10, objArr);
        this.f2957a ^= i11;
        return this;
    }

    public final t<K, V> q(t<K, V> tVar, t<K, V> tVar2, int i10, int i11, A a10) {
        A a11 = this.f2959c;
        if (tVar2 == null) {
            Object[] objArr = this.f2960d;
            if (objArr.length == 1) {
                return null;
            }
            if (a11 != a10) {
                return new t<>(this.f2957a, i11 ^ this.f2958b, C2479a.f(i10, objArr), a10);
            }
            this.f2960d = C2479a.f(i10, objArr);
            this.f2958b ^= i11;
        } else if (a11 == a10 || tVar != tVar2) {
            return r(i10, tVar2, a10);
        }
        return this;
    }

    public final t<K, V> r(int i10, t<K, V> tVar, A a10) {
        Object[] objArr = this.f2960d;
        if (objArr.length == 1 && tVar.f2960d.length == 2 && tVar.f2958b == 0) {
            tVar.f2957a = this.f2958b;
            return tVar;
        }
        if (this.f2959c == a10) {
            objArr[i10] = tVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = tVar;
        return new t<>(this.f2957a, this.f2958b, objArrCopyOf, a10);
    }

    public final t<K, V> s(int i10) {
        Object obj = this.f2960d[i10];
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int t(int i10) {
        return (this.f2960d.length - 1) - Integer.bitCount((i10 - 1) & this.f2958b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a u(int i10, int i11, Object obj, Object obj2) {
        a aVarU;
        int iK = 1 << C2479a.k(i10, i11);
        if (h(iK)) {
            int iF = f(iK);
            if (!kotlin.jvm.internal.i.a(obj, this.f2960d[iF])) {
                return new a(new t(this.f2957a ^ iK, this.f2958b | iK, a(iF, iK, i10, obj, obj2, i11, null), null), 1);
            }
            if (x(iF) == obj2) {
                return null;
            }
            Object[] objArr = this.f2960d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new a(new t(this.f2957a, this.f2958b, objArrCopyOf, null), 0);
        }
        if (!i(iK)) {
            return new a(new t(this.f2957a | iK, this.f2958b, C2479a.c(this.f2960d, f(iK), obj, obj2), null), 1);
        }
        int iT = t(iK);
        t<K, V> tVarS = s(iT);
        if (i11 == 30) {
            Na.g gVarI = Na.l.I(2, Na.l.J(0, tVarS.f2960d.length));
            int i12 = gVarI.f4687b;
            int i13 = gVarI.f4688c;
            int i14 = gVarI.f4689d;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!kotlin.jvm.internal.i.a(obj, tVarS.f2960d[i12])) {
                        if (i12 == i13) {
                            aVarU = new a(new t(0, 0, C2479a.c(tVarS.f2960d, 0, obj, obj2), null), 1);
                            break;
                        }
                        i12 += i14;
                    } else {
                        if (obj2 != tVarS.x(i12)) {
                            Object[] objArr2 = tVarS.f2960d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            kotlin.jvm.internal.i.d(objArrCopyOf2, "copyOf(...)");
                            objArrCopyOf2[i12 + 1] = obj2;
                            aVarU = new a(new t(0, 0, objArrCopyOf2, null), 0);
                            break;
                        }
                        aVarU = null;
                        break;
                    }
                }
            } else {
                aVarU = new a(new t(0, 0, C2479a.c(tVarS.f2960d, 0, obj, obj2), null), 1);
                break;
            }
            if (aVarU == null) {
                return null;
            }
        } else {
            aVarU = tVarS.u(i10, i11 + 5, obj, obj2);
            if (aVarU == null) {
                return null;
            }
        }
        aVarU.f2961a = w(iT, iK, aVarU.f2961a);
        return aVarU;
    }

    public final t v(int i10, Recomposer.c cVar, int i11) {
        t<K, V> tVarV;
        int iK = 1 << C2479a.k(i10, i11);
        if (h(iK)) {
            int iF = f(iK);
            if (!kotlin.jvm.internal.i.a(cVar, this.f2960d[iF])) {
                return this;
            }
            Object[] objArr = this.f2960d;
            if (objArr.length == 2) {
                return null;
            }
            return new t(this.f2957a ^ iK, this.f2958b, C2479a.e(iF, objArr), null);
        }
        if (!i(iK)) {
            return this;
        }
        int iT = t(iK);
        t<K, V> tVarS = s(iT);
        if (i11 == 30) {
            Na.g gVarI = Na.l.I(2, Na.l.J(0, tVarS.f2960d.length));
            int i12 = gVarI.f4687b;
            int i13 = gVarI.f4688c;
            int i14 = gVarI.f4689d;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!kotlin.jvm.internal.i.a(cVar, tVarS.f2960d[i12])) {
                        if (i12 == i13) {
                            tVarV = tVarS;
                            break;
                        }
                        i12 += i14;
                    } else {
                        Object[] objArr2 = tVarS.f2960d;
                        if (objArr2.length != 2) {
                            tVarV = new t<>(0, 0, C2479a.e(i12, objArr2), null);
                            break;
                        }
                        tVarV = null;
                        break;
                    }
                }
            } else {
                tVarV = tVarS;
                break;
            }
        } else {
            tVarV = tVarS.v(i10, cVar, i11 + 5);
        }
        if (tVarV != null) {
            return tVarS != tVarV ? w(iT, iK, tVarV) : this;
        }
        Object[] objArr3 = this.f2960d;
        if (objArr3.length == 1) {
            return null;
        }
        return new t(this.f2957a, iK ^ this.f2958b, C2479a.f(iT, objArr3), null);
    }

    public final t<K, V> w(int i10, int i11, t<K, V> tVar) {
        Object[] objArr = tVar.f2960d;
        if (objArr.length != 2 || tVar.f2958b != 0) {
            Object[] objArr2 = this.f2960d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i10] = tVar;
            return new t<>(this.f2957a, this.f2958b, objArrCopyOf, null);
        }
        if (this.f2960d.length == 1) {
            tVar.f2957a = this.f2958b;
            return tVar;
        }
        int iF = f(i11);
        Object[] objArr3 = this.f2960d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        kotlin.jvm.internal.i.d(objArrCopyOf2, "copyOf(...)");
        Q3.d.n(i10 + 2, i10 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        Q3.d.n(iF + 2, iF, i10, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new t<>(this.f2957a ^ i11, i11 ^ this.f2958b, objArrCopyOf2, null);
    }

    public final V x(int i10) {
        return (V) this.f2960d[i10 + 1];
    }
}
