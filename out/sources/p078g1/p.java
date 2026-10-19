package p078g1;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p114j1.A;

/* JADX INFO: compiled from: MediaItem.java */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f35354g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f35356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f35357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f35358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f35359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f35360f;

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f35361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Uri f35362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f35363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b.a f35364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d.a f35365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<Object> f35366f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ImmutableList<i> f35367g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Uri f35368h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f35369i;
        public r j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public e.a f35370k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public g f35371l;

        public final p a() {
            f fVar;
            this.f35365e.getClass();
            Uri uri = this.f35362b;
            if (uri != null) {
                this.f35365e.getClass();
                fVar = new f(uri, this.f35363c, null, this.f35366f, this.f35367g, this.f35368h, this.f35369i);
            } else {
                fVar = null;
            }
            String str = this.f35361a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            b.a aVar = this.f35364d;
            aVar.getClass();
            c cVar = new c(aVar);
            e.a aVar2 = this.f35370k;
            aVar2.getClass();
            e eVar = new e(aVar2);
            r rVar = this.j;
            if (rVar == null) {
                rVar = r.f35393B;
            }
            return new p(str2, cVar, fVar, eVar, rVar, this.f35371l);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f35372a;

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f35373a = Long.MIN_VALUE;

            @Deprecated
            public final c a() {
                return new c(this);
            }
        }

        static {
            new b(new a());
            A.B(0);
            A.B(1);
            A.B(2);
            A.B(3);
            A.B(4);
            A.B(5);
            A.B(6);
        }

        public b(a aVar) {
            aVar.getClass();
            int i10 = A.f40996a;
            this.f35372a = aVar.f35373a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return this.f35372a == bVar.f35372a;
        }

        public final int hashCode() {
            long j = this.f35372a;
            return ((((int) 0) * 31) + ((int) (j ^ (j >>> 32)))) * 29791;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    @Deprecated
    public static final class c extends b {
        static {
            new b.a().a();
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class d {

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {
            public a() {
                ImmutableMap.h();
                ImmutableList.K();
            }
        }

        public final boolean equals(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f35374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f35375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f35376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f35377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f35378e;

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f35379a = -9223372036854775807L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f35380b = -9223372036854775807L;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f35381c = -9223372036854775807L;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public float f35382d = -3.4028235E38f;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float f35383e = -3.4028235E38f;

            public final e a() {
                return new e(this);
            }
        }

        static {
            new a().a();
            A.B(0);
            A.B(1);
            A.B(2);
            A.B(3);
            A.B(4);
        }

        public e(a aVar) {
            long j = aVar.f35379a;
            long j10 = aVar.f35380b;
            long j11 = aVar.f35381c;
            float f10 = aVar.f35382d;
            float f11 = aVar.f35383e;
            this.f35374a = j;
            this.f35375b = j10;
            this.f35376c = j11;
            this.f35377d = f10;
            this.f35378e = f11;
        }

        public final a a() {
            a aVar = new a();
            aVar.f35379a = this.f35374a;
            aVar.f35380b = this.f35375b;
            aVar.f35381c = this.f35376c;
            aVar.f35382d = this.f35377d;
            aVar.f35383e = this.f35378e;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f35374a == eVar.f35374a && this.f35375b == eVar.f35375b && this.f35376c == eVar.f35376c && this.f35377d == eVar.f35377d && this.f35378e == eVar.f35378e;
        }

        public final int hashCode() {
            long j = this.f35374a;
            long j10 = this.f35375b;
            int i10 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f35376c;
            int i11 = (i10 + ((int) ((j11 >>> 32) ^ j11))) * 31;
            float f10 = this.f35377d;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f35378e;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f35384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f35385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<Object> f35386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImmutableList<i> f35387d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Uri f35388e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f35389f;

        static {
            com.obdeleven.service.core.b.b(0, 1, 2, 3, 4);
            A.B(5);
            A.B(6);
            A.B(7);
        }

        public f() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Uri uri, String str, d dVar, List list, ImmutableList immutableList, Uri uri2, long j) {
            this.f35384a = uri;
            this.f35385b = t.m(str);
            this.f35386c = list;
            this.f35387d = immutableList;
            ImmutableList.a aVarB = ImmutableList.B();
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                ((i) immutableList.get(i10)).getClass();
                aVarB.e(new h());
            }
            aVarB.h();
            this.f35388e = uri2;
            this.f35389f = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f35384a.equals(fVar.f35384a) && Objects.equals(this.f35385b, fVar.f35385b) && Objects.equals(null, null) && this.f35386c.equals(fVar.f35386c) && this.f35387d.equals(fVar.f35387d) && Objects.equals(this.f35388e, fVar.f35388e) && this.f35389f == fVar.f35389f;
        }

        public final int hashCode() {
            int iHashCode = this.f35384a.hashCode() * 31;
            String str = this.f35385b;
            int iHashCode2 = (this.f35387d.hashCode() + ((this.f35386c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31;
            Uri uri = this.f35388e;
            return (int) ((((long) (iHashCode2 + (uri != null ? uri.hashCode() : 0))) * 31) + this.f35389f);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f35390a = new g();

        static {
            A.B(0);
            A.B(1);
            A.B(2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    @Deprecated
    public static final class h extends i {
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static class i {

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {
        }

        static {
            com.obdeleven.service.core.b.b(0, 1, 2, 3, 4);
            A.B(5);
            A.B(6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            ((i) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    static {
        b.a aVar = new b.a();
        ImmutableMap.h();
        ImmutableList.K();
        Collections.emptyList();
        ImmutableList.K();
        e.a aVar2 = new e.a();
        g gVar = g.f35390a;
        aVar.a();
        aVar2.a();
        r rVar = r.f35393B;
        com.obdeleven.service.core.b.b(0, 1, 2, 3, 4);
        A.B(5);
    }

    public p(String str, c cVar, f fVar, e eVar, r rVar, g gVar) {
        this.f35355a = str;
        this.f35356b = fVar;
        this.f35357c = eVar;
        this.f35358d = rVar;
        this.f35359e = cVar;
        this.f35360f = gVar;
    }

    public final a a() {
        a aVar = new a();
        aVar.f35364d = new b.a();
        aVar.f35365e = new d.a();
        aVar.f35366f = Collections.emptyList();
        aVar.f35367g = ImmutableList.K();
        aVar.f35370k = new e.a();
        aVar.f35371l = g.f35390a;
        aVar.f35369i = -9223372036854775807L;
        c cVar = this.f35359e;
        b.a aVar2 = new b.a();
        aVar2.f35373a = cVar.f35372a;
        aVar.f35364d = aVar2;
        aVar.f35361a = this.f35355a;
        aVar.j = this.f35358d;
        aVar.f35370k = this.f35357c.a();
        aVar.f35371l = this.f35360f;
        f fVar = this.f35356b;
        if (fVar != null) {
            aVar.f35363c = fVar.f35385b;
            aVar.f35362b = fVar.f35384a;
            aVar.f35366f = fVar.f35386c;
            aVar.f35367g = fVar.f35387d;
            aVar.f35368h = fVar.f35388e;
            aVar.f35365e = new d.a();
            aVar.f35369i = fVar.f35389f;
        }
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Objects.equals(this.f35355a, pVar.f35355a) && this.f35359e.equals(pVar.f35359e) && Objects.equals(this.f35356b, pVar.f35356b) && this.f35357c.equals(pVar.f35357c) && Objects.equals(this.f35358d, pVar.f35358d) && Objects.equals(this.f35360f, pVar.f35360f);
    }

    public final int hashCode() {
        int iHashCode = this.f35355a.hashCode() * 31;
        f fVar = this.f35356b;
        int iHashCode2 = (this.f35358d.hashCode() + ((this.f35359e.hashCode() + ((this.f35357c.hashCode() + ((iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f35360f.getClass();
        return iHashCode2;
    }
}
