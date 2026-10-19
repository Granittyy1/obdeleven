package p304y9;

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
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: VehicleBaseDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class K {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Ya.b<Object>[] f48523q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f48526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f48528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<String> f48530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f48531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f48532i;
    public final List<String> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f48533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f48534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f48535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f48536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f48537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Boolean f48538p;

    /* JADX INFO: compiled from: VehicleBaseDTO.kt */
    @d
    public static final class a implements D<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48539a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48539a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.VehicleBaseDTO", aVar, 16);
            c1536l0.k("objectId", false);
            c1536l0.k("forumLink", true);
            c1536l0.k("klineCUs", true);
            c1536l0.k("isFirewallProtected", true);
            c1536l0.k("modelValue", false);
            c1536l0.k("model", false);
            c1536l0.k("cuBlackList", true);
            c1536l0.k("supported", true);
            c1536l0.k("make", false);
            c1536l0.k("wmi", false);
            c1536l0.k("platform", false);
            c1536l0.k("endYear", true);
            c1536l0.k("startYear", false);
            c1536l0.k("picture", true);
            c1536l0.k("info", true);
            c1536l0.k("isSfdProtected", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            Ya.b<?>[] bVarArr = K.f48523q;
            Ya.b<?> bVar = bVarArr[2];
            C1527h c1527h = C1527h.f22612a;
            Ya.b<?> bVar2 = bVarArr[4];
            Ya.b<?> bVar3 = bVarArr[6];
            Ya.b<?> bVar4 = bVarArr[9];
            I i10 = I.f22555a;
            Ya.b<?> bVarC = Za.a.c(i10);
            Ya.b<?> bVarC2 = Za.a.c(m.a.f48603a);
            Ya.b<?> bVarC3 = Za.a.c(p.a.f48611a);
            Ya.b<?> bVarC4 = Za.a.c(c1527h);
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var, bVar, c1527h, bVar2, y0Var, bVar3, c1527h, y0Var, bVar4, y0Var, bVarC, i10, bVarC2, bVarC3, bVarC4};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Ya.b<Object>[] bVarArr = K.f48523q;
            List list = null;
            p pVar = null;
            m mVar = null;
            Integer num = null;
            String strJ = null;
            String strJ2 = null;
            List list2 = null;
            List list3 = null;
            String strJ3 = null;
            List list4 = null;
            Boolean bool = null;
            String strJ4 = null;
            String strJ5 = null;
            int i10 = 0;
            boolean zL = false;
            boolean zL2 = false;
            int iH = 0;
            boolean z10 = true;
            while (z10) {
                String str = strJ3;
                int iO = aVarA.o(c1536l0);
                switch (iO) {
                    case -1:
                        z10 = false;
                        strJ3 = str;
                        break;
                    case 0:
                        strJ = aVarA.j(c1536l0, 0);
                        i10 |= 1;
                        strJ3 = str;
                        zL = zL;
                        break;
                    case 1:
                        strJ2 = aVarA.j(c1536l0, 1);
                        i10 |= 2;
                        strJ3 = str;
                        zL = zL;
                        break;
                    case 2:
                        list2 = (List) aVarA.e(c1536l0, 2, bVarArr[2], list2);
                        i10 |= 4;
                        strJ3 = str;
                        zL = zL;
                        break;
                    case 3:
                        zL = aVarA.l(c1536l0, 3);
                        i10 |= 8;
                        strJ3 = str;
                        break;
                    case 4:
                        list3 = (List) aVarA.e(c1536l0, 4, bVarArr[4], list3);
                        i10 |= 16;
                        strJ3 = str;
                        zL = zL;
                        break;
                    case 5:
                        zL = zL;
                        strJ3 = aVarA.j(c1536l0, 5);
                        i10 |= 32;
                        zL = zL;
                        break;
                    case 6:
                        list4 = (List) aVarA.e(c1536l0, 6, bVarArr[6], list4);
                        i10 |= 64;
                        strJ3 = str;
                        zL = zL;
                        break;
                    case 7:
                        zL2 = aVarA.l(c1536l0, 7);
                        i10 |= 128;
                        strJ3 = str;
                        zL = zL;
                        break;
                    case 8:
                        strJ4 = aVarA.j(c1536l0, 8);
                        i10 |= 256;
                        strJ3 = str;
                        zL = zL;
                        break;
                    case 9:
                        list = (List) aVarA.e(c1536l0, 9, bVarArr[9], list);
                        i10 |= 512;
                        strJ3 = str;
                        zL = zL;
                        break;
                    case 10:
                        strJ5 = aVarA.j(c1536l0, 10);
                        i10 |= 1024;
                        strJ3 = str;
                        zL = zL;
                        break;
                    case 11:
                        num = (Integer) aVarA.d(c1536l0, 11, I.f22555a, num);
                        i10 |= 2048;
                        strJ3 = str;
                        zL = zL;
                        break;
                    case 12:
                        iH = aVarA.h(c1536l0, 12);
                        i10 |= 4096;
                        strJ3 = str;
                        zL = zL;
                        break;
                    case 13:
                        mVar = (m) aVarA.d(c1536l0, 13, m.a.f48603a, mVar);
                        i10 |= 8192;
                        strJ3 = str;
                        zL = zL;
                        break;
                    case 14:
                        pVar = (p) aVarA.d(c1536l0, 14, p.a.f48611a, pVar);
                        i10 |= 16384;
                        strJ3 = str;
                        zL = zL;
                        break;
                    case 15:
                        bool = (Boolean) aVarA.d(c1536l0, 15, C1527h.f22612a, bool);
                        i10 |= 32768;
                        strJ3 = str;
                        zL = zL;
                        break;
                    default:
                        throw new UnknownFieldException(iO);
                }
            }
            aVarA.c(c1536l0);
            return new K(i10, strJ, strJ2, list2, zL, list3, strJ3, list4, zL2, strJ4, list, strJ5, num, iH, mVar, pVar, bool);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            K value = (K) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48524a);
            boolean zV = bVarA.v(c1536l0);
            String str = value.f48525b;
            if (zV || !i.a(str, "")) {
                bVarA.p(c1536l0, 1, str);
            }
            boolean zV2 = bVarA.v(c1536l0);
            Ya.b<Object>[] bVarArr = K.f48523q;
            List<String> list = value.f48526c;
            if (zV2 || !i.a(list, EmptyList.f42983b)) {
                bVarA.s(c1536l0, 2, bVarArr[2], list);
            }
            boolean zV3 = bVarA.v(c1536l0);
            boolean z10 = value.f48527d;
            if (zV3 || z10) {
                bVarA.e(c1536l0, 3, z10);
            }
            bVarA.s(c1536l0, 4, bVarArr[4], value.f48528e);
            bVarA.p(c1536l0, 5, value.f48529f);
            boolean zV4 = bVarA.v(c1536l0);
            List<String> list2 = value.f48530g;
            if (zV4 || !i.a(list2, EmptyList.f42983b)) {
                bVarA.s(c1536l0, 6, bVarArr[6], list2);
            }
            boolean zV5 = bVarA.v(c1536l0);
            boolean z11 = value.f48531h;
            if (zV5 || z11) {
                bVarA.e(c1536l0, 7, z11);
            }
            bVarA.p(c1536l0, 8, value.f48532i);
            bVarA.s(c1536l0, 9, bVarArr[9], value.j);
            bVarA.p(c1536l0, 10, value.f48533k);
            boolean zV6 = bVarA.v(c1536l0);
            Integer num = value.f48534l;
            if (zV6 || num != null) {
                bVarA.q(c1536l0, 11, I.f22555a, num);
            }
            bVarA.g(12, value.f48535m, c1536l0);
            boolean zV7 = bVarA.v(c1536l0);
            m mVar = value.f48536n;
            if (zV7 || mVar != null) {
                bVarA.q(c1536l0, 13, m.a.f48603a, mVar);
            }
            boolean zV8 = bVarA.v(c1536l0);
            p pVar = value.f48537o;
            if (zV8 || pVar != null) {
                bVarA.q(c1536l0, 14, p.a.f48611a, pVar);
            }
            boolean zV9 = bVarA.v(c1536l0);
            Boolean bool = value.f48538p;
            if (zV9 || !i.a(bool, Boolean.FALSE)) {
                bVarA.q(c1536l0, 15, C1527h.f22612a, bool);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: VehicleBaseDTO.kt */
    public static final class b {
        public final Ya.b<K> serializer() {
            return a.f48539a;
        }
    }

    static {
        y0 y0Var = y0.f22677a;
        f48523q = new Ya.b[]{null, null, new C1521e(y0Var), null, new C1521e(y0Var), null, new C1521e(y0Var), null, null, new C1521e(y0Var), null, null, null, null, null, null};
    }

    @d
    public K(int i10, String str, String str2, List list, boolean z10, List list2, String str3, List list3, boolean z11, String str4, List list4, String str5, Integer num, int i11, m mVar, p pVar, Boolean bool) {
        if (5937 != (i10 & 5937)) {
            p241t7.b.w(i10, 5937, a.f48539a.getDescriptor());
            throw null;
        }
        this.f48524a = str;
        this.f48525b = (i10 & 2) == 0 ? "" : str2;
        this.f48526c = (i10 & 4) == 0 ? EmptyList.f42983b : list;
        if ((i10 & 8) == 0) {
            this.f48527d = false;
        } else {
            this.f48527d = z10;
        }
        this.f48528e = list2;
        this.f48529f = str3;
        this.f48530g = (i10 & 64) == 0 ? EmptyList.f42983b : list3;
        if ((i10 & 128) == 0) {
            this.f48531h = false;
        } else {
            this.f48531h = z11;
        }
        this.f48532i = str4;
        this.j = list4;
        this.f48533k = str5;
        if ((i10 & 2048) == 0) {
            this.f48534l = null;
        } else {
            this.f48534l = num;
        }
        this.f48535m = i11;
        if ((i10 & 8192) == 0) {
            this.f48536n = null;
        } else {
            this.f48536n = mVar;
        }
        if ((i10 & 16384) == 0) {
            this.f48537o = null;
        } else {
            this.f48537o = pVar;
        }
        this.f48538p = (i10 & 32768) == 0 ? Boolean.FALSE : bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        return i.a(this.f48524a, k10.f48524a) && i.a(this.f48525b, k10.f48525b) && i.a(this.f48526c, k10.f48526c) && this.f48527d == k10.f48527d && i.a(this.f48528e, k10.f48528e) && i.a(this.f48529f, k10.f48529f) && i.a(this.f48530g, k10.f48530g) && this.f48531h == k10.f48531h && i.a(this.f48532i, k10.f48532i) && i.a(this.j, k10.j) && i.a(this.f48533k, k10.f48533k) && i.a(this.f48534l, k10.f48534l) && this.f48535m == k10.f48535m && i.a(this.f48536n, k10.f48536n) && i.a(this.f48537o, k10.f48537o) && i.a(this.f48538p, k10.f48538p);
    }

    public final int hashCode() {
        int iB = B1.a.b(this.f48533k, p.d(B1.a.b(this.f48532i, androidx.compose.animation.D.b(p.d(B1.a.b(this.f48529f, p.d(androidx.compose.animation.D.b(p.d(B1.a.b(this.f48525b, this.f48524a.hashCode() * 31, 31), 31, this.f48526c), 31, this.f48527d), 31, this.f48528e), 31), 31, this.f48530g), 31, this.f48531h), 31), 31, this.j), 31);
        Integer num = this.f48534l;
        int iB2 = q.b(this.f48535m, (iB + (num == null ? 0 : num.hashCode())) * 31, 31);
        m mVar = this.f48536n;
        int iHashCode = (iB2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        p pVar = this.f48537o;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.f48610a.hashCode())) * 31;
        Boolean bool = this.f48538p;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "VehicleBaseDTO(id=" + this.f48524a + ", forumLink=" + this.f48525b + ", klineCUs=" + this.f48526c + ", isFirewallProtected=" + this.f48527d + ", modelValue=" + this.f48528e + ", model=" + this.f48529f + ", cuBlackList=" + this.f48530g + ", supported=" + this.f48531h + ", make=" + this.f48532i + ", wmi=" + this.j + ", platform=" + this.f48533k + ", endYear=" + this.f48534l + ", startYear=" + this.f48535m + ", picture=" + this.f48536n + ", info=" + this.f48537o + ", isSfdProtected=" + this.f48538p + ")";
    }
}
