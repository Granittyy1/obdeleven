package p078g1;

import android.net.Uri;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p114j1.A;

/* JADX INFO: compiled from: Timeline.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35467a = new a();

    /* JADX INFO: compiled from: Timeline.java */
    public class a extends x {
        @Override // p078g1.x
        public final int b(Object obj) {
            return -1;
        }

        @Override // p078g1.x
        public final b f(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p078g1.x
        public final int h() {
            return 0;
        }

        @Override // p078g1.x
        public final Object l(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p078g1.x
        public final c m(int i10, c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p078g1.x
        public final int o() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f35468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f35469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f35470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f35471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f35472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f35473f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C2196b f35474g = C2196b.f35233c;

        static {
            com.obdeleven.service.core.b.b(0, 1, 2, 3, 4);
        }

        public final long a(int i10, int i11) {
            C2196b.a aVarA = this.f35474g.a(i10);
            if (aVarA.f35237a != -1) {
                return aVarA.f35242f[i11];
            }
            return -9223372036854775807L;
        }

        public final int b(long j) {
            int i10;
            C2196b.a aVarA;
            int i11;
            C2196b c2196b = this.f35474g;
            long j10 = this.f35471d;
            c2196b.getClass();
            if (j == Long.MIN_VALUE) {
                return -1;
            }
            if (j10 != -9223372036854775807L && j >= j10) {
                return -1;
            }
            int i12 = 0;
            while (true) {
                i10 = c2196b.f35235a;
                if (i12 >= i10) {
                    break;
                }
                c2196b.a(i12).getClass();
                c2196b.a(i12).getClass();
                if (0 > j && ((i11 = (aVarA = c2196b.a(i12)).f35237a) == -1 || aVarA.a(-1) < i11)) {
                    break;
                }
                i12++;
            }
            if (i12 < i10) {
                return i12;
            }
            return -1;
        }

        public final int c(long j) {
            C2196b c2196b = this.f35474g;
            int i10 = c2196b.f35235a;
            int i11 = i10 - 1;
            if (i11 == i10 - 1) {
                c2196b.a(i11).getClass();
            }
            while (i11 >= 0 && j != Long.MIN_VALUE) {
                c2196b.a(i11).getClass();
                if (j >= 0) {
                    break;
                }
                i11--;
            }
            if (i11 >= 0) {
                C2196b.a aVarA = c2196b.a(i11);
                int i12 = aVarA.f35237a;
                if (i12 == -1) {
                    return i11;
                }
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = aVarA.f35241e[i13];
                    if (i14 == 0 || i14 == 1) {
                        return i11;
                    }
                }
            }
            return -1;
        }

        public final long d(int i10) {
            this.f35474g.a(i10).getClass();
            return 0L;
        }

        public final int e(int i10) {
            return this.f35474g.a(i10).a(-1);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f35468a, bVar.f35468a) && Objects.equals(this.f35469b, bVar.f35469b) && this.f35470c == bVar.f35470c && this.f35471d == bVar.f35471d && this.f35472e == bVar.f35472e && this.f35473f == bVar.f35473f && Objects.equals(this.f35474g, bVar.f35474g);
        }

        public final boolean f(int i10) {
            C2196b c2196b = this.f35474g;
            int i11 = c2196b.f35235a;
            if (i10 != i11 - 1 || i10 != i11 - 1) {
                return false;
            }
            c2196b.a(i10).getClass();
            return false;
        }

        public final boolean g(int i10) {
            this.f35474g.a(i10).getClass();
            return false;
        }

        public final void h(Integer num, Object obj, int i10, long j, long j10, C2196b c2196b, boolean z10) {
            this.f35468a = num;
            this.f35469b = obj;
            this.f35470c = i10;
            this.f35471d = j;
            this.f35472e = j10;
            this.f35474g = c2196b;
            this.f35473f = z10;
        }

        public final int hashCode() {
            Integer num = this.f35468a;
            int iHashCode = (217 + (num == null ? 0 : num.hashCode())) * 31;
            Object obj = this.f35469b;
            int iHashCode2 = (((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31) + this.f35470c) * 31;
            long j = this.f35471d;
            int i10 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j10 = this.f35472e;
            return this.f35474g.hashCode() + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f35473f ? 1 : 0)) * 31);
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class c {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Object f35475p = new Object();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final p f35476q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public Object f35478b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f35480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f35481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f35482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f35483g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f35484h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public p.e f35485i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f35486k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f35487l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f35488m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f35489n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f35490o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f35477a = f35475p;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p f35479c = f35476q;

        static {
            p.b.a aVar = new p.b.a();
            ImmutableMap.h();
            ImmutableList.K();
            List listEmptyList = Collections.emptyList();
            ImmutableList immutableListK = ImmutableList.K();
            p.e.a aVar2 = new p.e.a();
            p.g gVar = p.g.f35390a;
            Uri uri = Uri.EMPTY;
            f35476q = new p("androidx.media3.common.Timeline", new p.c(aVar), uri != null ? new p.f(uri, null, null, listEmptyList, immutableListK, null, -9223372036854775807L) : null, new p.e(aVar2), r.f35393B, gVar);
            com.obdeleven.service.core.b.b(1, 2, 3, 4, 5);
            com.obdeleven.service.core.b.b(6, 7, 8, 9, 10);
            A.B(11);
            A.B(12);
            A.B(13);
        }

        public final boolean a() {
            return this.f35485i != null;
        }

        public final void b(p pVar, long j, long j10, long j11, boolean z10, boolean z11, p.e eVar, long j12, long j13) {
            p.f fVar;
            this.f35477a = f35475p;
            this.f35479c = pVar != null ? pVar : f35476q;
            if (pVar != null && (fVar = pVar.f35356b) != null) {
                Uri uri = fVar.f35388e;
            }
            this.f35480d = j;
            this.f35481e = j10;
            this.f35482f = j11;
            this.f35483g = z10;
            this.f35484h = z11;
            this.f35485i = eVar;
            this.f35486k = j12;
            this.f35487l = j13;
            this.f35488m = 0;
            this.f35489n = 0;
            this.f35490o = 0L;
            this.j = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f35477a, cVar.f35477a) && Objects.equals(this.f35479c, cVar.f35479c) && Objects.equals(this.f35485i, cVar.f35485i) && this.f35480d == cVar.f35480d && this.f35481e == cVar.f35481e && this.f35482f == cVar.f35482f && this.f35483g == cVar.f35483g && this.f35484h == cVar.f35484h && this.j == cVar.j && this.f35486k == cVar.f35486k && this.f35487l == cVar.f35487l && this.f35488m == cVar.f35488m && this.f35489n == cVar.f35489n && this.f35490o == cVar.f35490o;
        }

        public final int hashCode() {
            int iHashCode = (this.f35479c.hashCode() + ((this.f35477a.hashCode() + 217) * 31)) * 961;
            p.e eVar = this.f35485i;
            int iHashCode2 = eVar == null ? 0 : eVar.hashCode();
            long j = this.f35480d;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j10 = this.f35481e;
            int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f35482f;
            int i12 = (((((((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f35483g ? 1 : 0)) * 31) + (this.f35484h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
            long j12 = this.f35486k;
            int i13 = (i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f35487l;
            int i14 = (((((i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f35488m) * 31) + this.f35489n) * 31;
            long j14 = this.f35490o;
            return i14 + ((int) (j14 ^ (j14 >>> 32)));
        }
    }

    static {
        A.B(0);
        A.B(1);
        A.B(2);
    }

    public int a(boolean z10) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar, false).f35470c;
        if (m(i12, cVar, 0L).f35489n != i10) {
            return i10 + 1;
        }
        int iE = e(i12, i11, z10);
        if (iE == -1) {
            return -1;
        }
        return m(iE, cVar, 0L).f35488m;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.o() != o() || xVar.h() != h()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < o(); i10++) {
            if (!m(i10, cVar, 0L).equals(xVar.m(i10, cVar2, 0L))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < h(); i11++) {
            if (!f(i11, bVar, true).equals(xVar.f(i11, bVar2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != xVar.a(true) || (iC = c(true)) != xVar.c(true)) {
            return false;
        }
        while (iA != iC) {
            int iE = e(iA, 0, true);
            if (iE != xVar.e(iA, 0, true)) {
                return false;
            }
            iA = iE;
        }
        return true;
    }

    public abstract b f(int i10, b bVar, boolean z10);

    public b g(Object obj, b bVar) {
        return f(b(obj), bVar, true);
    }

    public abstract int h();

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iO = o() + 217;
        for (int i10 = 0; i10 < o(); i10++) {
            iO = (iO * 31) + m(i10, cVar, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i11 = 0; i11 < h(); i11++) {
            iH = (iH * 31) + f(i11, bVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair<Object, Long> i(c cVar, b bVar, int i10, long j) {
        Pair<Object, Long> pairJ = j(cVar, bVar, i10, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair<Object, Long> j(c cVar, b bVar, int i10, long j, long j10) {
        p241t7.b.f(i10, o());
        m(i10, cVar, j10);
        if (j == -9223372036854775807L) {
            j = cVar.f35486k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f35488m;
        f(i11, bVar, false);
        while (i11 < cVar.f35489n && bVar.f35472e != j) {
            int i12 = i11 + 1;
            if (f(i12, bVar, false).f35472e > j) {
                break;
            }
            i11 = i12;
        }
        f(i11, bVar, true);
        long jMin = j - bVar.f35472e;
        long j11 = bVar.f35471d;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(jMin, j11 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = bVar.f35469b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i10);

    public abstract c m(int i10, c cVar, long j);

    public final void n(int i10, c cVar) {
        m(i10, cVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
