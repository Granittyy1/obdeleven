package p304y9;

import C4.v;
import Ya.k;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p005a4.p;
import p005a4.q;
import p011ab.e;
import p024bb.c;
import p037cb.C1521e;
import p037cb.C1527h;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.I;
import p037cb.S;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: OcaDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class t {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Ya.b<Object>[] f48624p = {null, null, null, null, null, null, null, null, new C1521e(y0.f22677a), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f48631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f48632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<String> f48633i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f48634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f48635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f48636m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f48637n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f48638o;

    /* JADX INFO: compiled from: OcaDTO.kt */
    @d
    public static final class a implements D<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48639a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48639a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.OcaDTO", aVar, 15);
            c1536l0.k("objectId", false);
            c1536l0.k("appID", true);
            c1536l0.k("name", true);
            c1536l0.k("description", true);
            c1536l0.k("price", true);
            c1536l0.k("picture", true);
            c1536l0.k("video", true);
            c1536l0.k("usage", true);
            c1536l0.k("values", true);
            c1536l0.k("isPublic", true);
            c1536l0.k("status", true);
            c1536l0.k("category", true);
            c1536l0.k("createdAt", true);
            c1536l0.k("developer", true);
            c1536l0.k("isSkipOriginalValue", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            Ya.b<?> bVar = t.f48624p[8];
            y0 y0Var = y0.f22677a;
            I i10 = I.f22555a;
            C1527h c1527h = C1527h.f22612a;
            return new Ya.b[]{y0Var, i10, y0Var, y0Var, i10, y0Var, y0Var, i10, bVar, c1527h, i10, y0Var, S.f22579a, y0Var, c1527h};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Ya.b<Object>[] bVarArr = t.f48624p;
            List list = null;
            String strJ = null;
            String strJ2 = null;
            String strJ3 = null;
            String strJ4 = null;
            String strJ5 = null;
            String strJ6 = null;
            String strJ7 = null;
            int i10 = 0;
            int iH = 0;
            int iH2 = 0;
            int iH3 = 0;
            boolean zL = false;
            int iH4 = 0;
            boolean zL2 = false;
            long jA = 0;
            boolean z10 = true;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                switch (iO) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        strJ = aVarA.j(c1536l0, 0);
                        i10 |= 1;
                        break;
                    case 1:
                        iH = aVarA.h(c1536l0, 1);
                        i10 |= 2;
                        break;
                    case 2:
                        strJ2 = aVarA.j(c1536l0, 2);
                        i10 |= 4;
                        break;
                    case 3:
                        strJ3 = aVarA.j(c1536l0, 3);
                        i10 |= 8;
                        break;
                    case 4:
                        iH2 = aVarA.h(c1536l0, 4);
                        i10 |= 16;
                        break;
                    case 5:
                        strJ4 = aVarA.j(c1536l0, 5);
                        i10 |= 32;
                        break;
                    case 6:
                        strJ5 = aVarA.j(c1536l0, 6);
                        i10 |= 64;
                        break;
                    case 7:
                        iH3 = aVarA.h(c1536l0, 7);
                        i10 |= 128;
                        break;
                    case 8:
                        list = (List) aVarA.e(c1536l0, 8, bVarArr[8], list);
                        i10 |= 256;
                        break;
                    case 9:
                        zL = aVarA.l(c1536l0, 9);
                        i10 |= 512;
                        break;
                    case 10:
                        iH4 = aVarA.h(c1536l0, 10);
                        i10 |= 1024;
                        break;
                    case 11:
                        strJ6 = aVarA.j(c1536l0, 11);
                        i10 |= 2048;
                        break;
                    case 12:
                        jA = aVarA.A(c1536l0, 12);
                        i10 |= 4096;
                        break;
                    case 13:
                        strJ7 = aVarA.j(c1536l0, 13);
                        i10 |= 8192;
                        break;
                    case 14:
                        zL2 = aVarA.l(c1536l0, 14);
                        i10 |= 16384;
                        break;
                    default:
                        throw new UnknownFieldException(iO);
                }
            }
            aVarA.c(c1536l0);
            return new t(i10, strJ, iH, strJ2, strJ3, iH2, strJ4, strJ5, iH3, list, zL, iH4, strJ6, jA, strJ7, zL2);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            t value = (t) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48625a);
            boolean zV = bVarA.v(c1536l0);
            int i10 = value.f48626b;
            if (zV || i10 != -1) {
                bVarA.g(1, i10, c1536l0);
            }
            boolean zV2 = bVarA.v(c1536l0);
            String str = value.f48627c;
            if (zV2 || !i.a(str, "")) {
                bVarA.p(c1536l0, 2, str);
            }
            boolean zV3 = bVarA.v(c1536l0);
            String str2 = value.f48628d;
            if (zV3 || !i.a(str2, "")) {
                bVarA.p(c1536l0, 3, str2);
            }
            boolean zV4 = bVarA.v(c1536l0);
            int i11 = value.f48629e;
            if (zV4 || i11 != 0) {
                bVarA.g(4, i11, c1536l0);
            }
            boolean zV5 = bVarA.v(c1536l0);
            String str3 = value.f48630f;
            if (zV5 || !i.a(str3, "")) {
                bVarA.p(c1536l0, 5, str3);
            }
            boolean zV6 = bVarA.v(c1536l0);
            String str4 = value.f48631g;
            if (zV6 || !i.a(str4, "")) {
                bVarA.p(c1536l0, 6, str4);
            }
            boolean zV7 = bVarA.v(c1536l0);
            int i12 = value.f48632h;
            if (zV7 || i12 != 0) {
                bVarA.g(7, i12, c1536l0);
            }
            boolean zV8 = bVarA.v(c1536l0);
            List<String> list = value.f48633i;
            if (zV8 || !i.a(list, EmptyList.f42983b)) {
                bVarA.s(c1536l0, 8, t.f48624p[8], list);
            }
            boolean zV9 = bVarA.v(c1536l0);
            boolean z10 = value.j;
            if (zV9 || z10) {
                bVarA.e(c1536l0, 9, z10);
            }
            boolean zV10 = bVarA.v(c1536l0);
            int i13 = value.f48634k;
            if (zV10 || i13 != 0) {
                bVarA.g(10, i13, c1536l0);
            }
            boolean zV11 = bVarA.v(c1536l0);
            String str5 = value.f48635l;
            if (zV11 || !i.a(str5, "")) {
                bVarA.p(c1536l0, 11, str5);
            }
            boolean zV12 = bVarA.v(c1536l0);
            long j = value.f48636m;
            if (zV12 || j != 0) {
                bVarA.j(c1536l0, 12, j);
            }
            boolean zV13 = bVarA.v(c1536l0);
            String str6 = value.f48637n;
            if (zV13 || !i.a(str6, "")) {
                bVarA.p(c1536l0, 13, str6);
            }
            boolean zV14 = bVarA.v(c1536l0);
            boolean z11 = value.f48638o;
            if (zV14 || z11) {
                bVarA.e(c1536l0, 14, z11);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: OcaDTO.kt */
    public static final class b {
        public final Ya.b<t> serializer() {
            return a.f48639a;
        }
    }

    @d
    public t(int i10, String str, int i11, String str2, String str3, int i12, String str4, String str5, int i13, List list, boolean z10, int i14, String str6, long j, String str7, boolean z11) {
        if (1 != (i10 & 1)) {
            p241t7.b.w(i10, 1, a.f48639a.getDescriptor());
            throw null;
        }
        this.f48625a = str;
        this.f48626b = (i10 & 2) == 0 ? -1 : i11;
        if ((i10 & 4) == 0) {
            this.f48627c = "";
        } else {
            this.f48627c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f48628d = "";
        } else {
            this.f48628d = str3;
        }
        if ((i10 & 16) == 0) {
            this.f48629e = 0;
        } else {
            this.f48629e = i12;
        }
        if ((i10 & 32) == 0) {
            this.f48630f = "";
        } else {
            this.f48630f = str4;
        }
        if ((i10 & 64) == 0) {
            this.f48631g = "";
        } else {
            this.f48631g = str5;
        }
        if ((i10 & 128) == 0) {
            this.f48632h = 0;
        } else {
            this.f48632h = i13;
        }
        this.f48633i = (i10 & 256) == 0 ? EmptyList.f42983b : list;
        if ((i10 & 512) == 0) {
            this.j = false;
        } else {
            this.j = z10;
        }
        if ((i10 & 1024) == 0) {
            this.f48634k = 0;
        } else {
            this.f48634k = i14;
        }
        if ((i10 & 2048) == 0) {
            this.f48635l = "";
        } else {
            this.f48635l = str6;
        }
        this.f48636m = (i10 & 4096) == 0 ? 0L : j;
        if ((i10 & 8192) == 0) {
            this.f48637n = "";
        } else {
            this.f48637n = str7;
        }
        if ((i10 & 16384) == 0) {
            this.f48638o = false;
        } else {
            this.f48638o = z11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return i.a(this.f48625a, tVar.f48625a) && this.f48626b == tVar.f48626b && i.a(this.f48627c, tVar.f48627c) && i.a(this.f48628d, tVar.f48628d) && this.f48629e == tVar.f48629e && i.a(this.f48630f, tVar.f48630f) && i.a(this.f48631g, tVar.f48631g) && this.f48632h == tVar.f48632h && i.a(this.f48633i, tVar.f48633i) && this.j == tVar.j && this.f48634k == tVar.f48634k && i.a(this.f48635l, tVar.f48635l) && this.f48636m == tVar.f48636m && i.a(this.f48637n, tVar.f48637n) && this.f48638o == tVar.f48638o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48638o) + B1.a.b(this.f48637n, C4.b.c(this.f48636m, B1.a.b(this.f48635l, q.b(this.f48634k, androidx.compose.animation.D.b(p.d(q.b(this.f48632h, B1.a.b(this.f48631g, B1.a.b(this.f48630f, q.b(this.f48629e, B1.a.b(this.f48628d, B1.a.b(this.f48627c, q.b(this.f48626b, this.f48625a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.f48633i), 31, this.j), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OcaDTO(id=");
        sb2.append(this.f48625a);
        sb2.append(", appGroupId=");
        sb2.append(this.f48626b);
        sb2.append(", title=");
        sb2.append(this.f48627c);
        sb2.append(", description=");
        sb2.append(this.f48628d);
        sb2.append(", price=");
        sb2.append(this.f48629e);
        sb2.append(", picture=");
        sb2.append(this.f48630f);
        sb2.append(", video=");
        sb2.append(this.f48631g);
        sb2.append(", usage=");
        sb2.append(this.f48632h);
        sb2.append(", availableValues=");
        sb2.append(this.f48633i);
        sb2.append(", isPublic=");
        sb2.append(this.j);
        sb2.append(", testState=");
        sb2.append(this.f48634k);
        sb2.append(", category=");
        sb2.append(this.f48635l);
        sb2.append(", createdAt=");
        sb2.append(this.f48636m);
        sb2.append(", developerId=");
        sb2.append(this.f48637n);
        sb2.append(", isSkipOriginalValue=");
        return v.f(sb2, this.f48638o, ")");
    }
}
