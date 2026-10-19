package p304y9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: renamed from: y9.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnitBaseDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class C2828g {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f48561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f48567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f48568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f48569i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f48570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final G f48571l;

    /* JADX INFO: renamed from: y9.g$a */
    /* JADX INFO: compiled from: ControlUnitBaseDTO.kt */
    @d
    public static final class a implements D<C2828g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48572a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48572a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.ControlUnitBaseDTO", aVar, 12);
            c1536l0.k("picture", true);
            c1536l0.k("objectId", false);
            c1536l0.k("klineId", true);
            c1536l0.k("canKWP2000Id", true);
            c1536l0.k("klineKWP2000Id", true);
            c1536l0.k("udsContiId", true);
            c1536l0.k("udsExtRespId", true);
            c1536l0.k("udsExtReqId", true);
            c1536l0.k("udsRespId", true);
            c1536l0.k("udsReqId", true);
            c1536l0.k("name", true);
            c1536l0.k("texttable", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            Ya.b<?> bVarC = Za.a.c(m.a.f48603a);
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{bVarC, y0Var, Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(G.a.f48481a)};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String str = null;
            G g10 = null;
            String str2 = null;
            m mVar = null;
            String strJ = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            int i10 = 0;
            boolean z10 = true;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                switch (iO) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        mVar = (m) aVarA.d(c1536l0, 0, m.a.f48603a, mVar);
                        i10 |= 1;
                        break;
                    case 1:
                        strJ = aVarA.j(c1536l0, 1);
                        i10 |= 2;
                        continue;
                    case 2:
                        str3 = (String) aVarA.d(c1536l0, 2, y0.f22677a, str3);
                        i10 |= 4;
                        break;
                    case 3:
                        str4 = (String) aVarA.d(c1536l0, 3, y0.f22677a, str4);
                        i10 |= 8;
                        break;
                    case 4:
                        str5 = (String) aVarA.d(c1536l0, 4, y0.f22677a, str5);
                        i10 |= 16;
                        break;
                    case 5:
                        str6 = (String) aVarA.d(c1536l0, 5, y0.f22677a, str6);
                        i10 |= 32;
                        break;
                    case 6:
                        str7 = (String) aVarA.d(c1536l0, 6, y0.f22677a, str7);
                        i10 |= 64;
                        break;
                    case 7:
                        str8 = (String) aVarA.d(c1536l0, 7, y0.f22677a, str8);
                        i10 |= 128;
                        break;
                    case 8:
                        str9 = (String) aVarA.d(c1536l0, 8, y0.f22677a, str9);
                        i10 |= 256;
                        break;
                    case 9:
                        str = (String) aVarA.d(c1536l0, 9, y0.f22677a, str);
                        i10 |= 512;
                        break;
                    case 10:
                        str2 = (String) aVarA.d(c1536l0, 10, y0.f22677a, str2);
                        i10 |= 1024;
                        break;
                    case 11:
                        g10 = (G) aVarA.d(c1536l0, 11, G.a.f48481a, g10);
                        i10 |= 2048;
                        break;
                    default:
                        throw new UnknownFieldException(iO);
                }
                strJ = strJ;
            }
            aVarA.c(c1536l0);
            return new C2828g(i10, mVar, strJ, str3, str4, str5, str6, str7, str8, str9, str, str2, g10);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            C2828g value = (C2828g) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = C2828g.Companion;
            boolean zV = bVarA.v(c1536l0);
            m mVar = value.f48561a;
            if (zV || mVar != null) {
                bVarA.q(c1536l0, 0, m.a.f48603a, mVar);
            }
            bVarA.p(c1536l0, 1, value.f48562b);
            boolean zV2 = bVarA.v(c1536l0);
            String str = value.f48563c;
            if (zV2 || str != null) {
                bVarA.q(c1536l0, 2, y0.f22677a, str);
            }
            boolean zV3 = bVarA.v(c1536l0);
            String str2 = value.f48564d;
            if (zV3 || str2 != null) {
                bVarA.q(c1536l0, 3, y0.f22677a, str2);
            }
            boolean zV4 = bVarA.v(c1536l0);
            String str3 = value.f48565e;
            if (zV4 || str3 != null) {
                bVarA.q(c1536l0, 4, y0.f22677a, str3);
            }
            boolean zV5 = bVarA.v(c1536l0);
            String str4 = value.f48566f;
            if (zV5 || str4 != null) {
                bVarA.q(c1536l0, 5, y0.f22677a, str4);
            }
            boolean zV6 = bVarA.v(c1536l0);
            String str5 = value.f48567g;
            if (zV6 || str5 != null) {
                bVarA.q(c1536l0, 6, y0.f22677a, str5);
            }
            boolean zV7 = bVarA.v(c1536l0);
            String str6 = value.f48568h;
            if (zV7 || str6 != null) {
                bVarA.q(c1536l0, 7, y0.f22677a, str6);
            }
            boolean zV8 = bVarA.v(c1536l0);
            String str7 = value.f48569i;
            if (zV8 || str7 != null) {
                bVarA.q(c1536l0, 8, y0.f22677a, str7);
            }
            boolean zV9 = bVarA.v(c1536l0);
            String str8 = value.j;
            if (zV9 || str8 != null) {
                bVarA.q(c1536l0, 9, y0.f22677a, str8);
            }
            boolean zV10 = bVarA.v(c1536l0);
            String str9 = value.f48570k;
            if (zV10 || str9 != null) {
                bVarA.q(c1536l0, 10, y0.f22677a, str9);
            }
            boolean zV11 = bVarA.v(c1536l0);
            G g10 = value.f48571l;
            if (zV11 || g10 != null) {
                bVarA.q(c1536l0, 11, G.a.f48481a, g10);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: renamed from: y9.g$b */
    /* JADX INFO: compiled from: ControlUnitBaseDTO.kt */
    public static final class b {
        public final Ya.b<C2828g> serializer() {
            return a.f48572a;
        }
    }

    @d
    public /* synthetic */ C2828g(int i10, m mVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, G g10) {
        if (2 != (i10 & 2)) {
            p241t7.b.w(i10, 2, a.f48572a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f48561a = null;
        } else {
            this.f48561a = mVar;
        }
        this.f48562b = str;
        if ((i10 & 4) == 0) {
            this.f48563c = null;
        } else {
            this.f48563c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f48564d = null;
        } else {
            this.f48564d = str3;
        }
        if ((i10 & 16) == 0) {
            this.f48565e = null;
        } else {
            this.f48565e = str4;
        }
        if ((i10 & 32) == 0) {
            this.f48566f = null;
        } else {
            this.f48566f = str5;
        }
        if ((i10 & 64) == 0) {
            this.f48567g = null;
        } else {
            this.f48567g = str6;
        }
        if ((i10 & 128) == 0) {
            this.f48568h = null;
        } else {
            this.f48568h = str7;
        }
        if ((i10 & 256) == 0) {
            this.f48569i = null;
        } else {
            this.f48569i = str8;
        }
        if ((i10 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str9;
        }
        if ((i10 & 1024) == 0) {
            this.f48570k = null;
        } else {
            this.f48570k = str10;
        }
        if ((i10 & 2048) == 0) {
            this.f48571l = null;
        } else {
            this.f48571l = g10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2828g)) {
            return false;
        }
        C2828g c2828g = (C2828g) obj;
        return i.a(this.f48561a, c2828g.f48561a) && i.a(this.f48562b, c2828g.f48562b) && i.a(this.f48563c, c2828g.f48563c) && i.a(this.f48564d, c2828g.f48564d) && i.a(this.f48565e, c2828g.f48565e) && i.a(this.f48566f, c2828g.f48566f) && i.a(this.f48567g, c2828g.f48567g) && i.a(this.f48568h, c2828g.f48568h) && i.a(this.f48569i, c2828g.f48569i) && i.a(this.j, c2828g.j) && i.a(this.f48570k, c2828g.f48570k) && i.a(this.f48571l, c2828g.f48571l);
    }

    public final int hashCode() {
        m mVar = this.f48561a;
        int iB = B1.a.b(this.f48562b, (mVar == null ? 0 : mVar.hashCode()) * 31, 31);
        String str = this.f48563c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f48564d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f48565e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f48566f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f48567g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f48568h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f48569i;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f48570k;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        G g10 = this.f48571l;
        return iHashCode9 + (g10 != null ? g10.hashCode() : 0);
    }

    public final String toString() {
        return "ControlUnitBaseDTO(picture=" + this.f48561a + ", id=" + this.f48562b + ", klineId=" + this.f48563c + ", canKWP2000Id=" + this.f48564d + ", klineKWP2000Id=" + this.f48565e + ", udsContiId=" + this.f48566f + ", udsExtRespId=" + this.f48567g + ", udsExtReqId=" + this.f48568h + ", udsRespId=" + this.f48569i + ", udsReqId=" + this.j + ", name=" + this.f48570k + ", textTable=" + this.f48571l + ")";
    }
}
