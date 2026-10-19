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

/* JADX INFO: compiled from: TextTableDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class G {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f48465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f48466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f48467i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f48468k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f48469l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f48470m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f48471n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f48472o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f48473p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f48474q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f48475r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f48476s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f48477t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f48478u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f48479v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f48480w;

    /* JADX INFO: compiled from: TextTableDTO.kt */
    @d
    public static final class a implements D<G> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48481a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48481a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.TextTableDTO", aVar, 23);
            c1536l0.k("objectId", false);
            c1536l0.k("de", true);
            c1536l0.k("fi", true);
            c1536l0.k("ru", true);
            c1536l0.k("sv", true);
            c1536l0.k("ko", true);
            c1536l0.k("pt", true);
            c1536l0.k("el", true);
            c1536l0.k("en", true);
            c1536l0.k("hr", true);
            c1536l0.k("it", true);
            c1536l0.k("fr", true);
            c1536l0.k("hu", true);
            c1536l0.k("es", true);
            c1536l0.k("zh", true);
            c1536l0.k("cs", true);
            c1536l0.k("ja", true);
            c1536l0.k("sl", true);
            c1536l0.k("pl", true);
            c1536l0.k("da", true);
            c1536l0.k("nl", true);
            c1536l0.k("tr", true);
            c1536l0.k("ro", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var)};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            int i10;
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String strJ = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                String str23 = str4;
                int iO = aVarA.o(c1536l0);
                switch (iO) {
                    case -1:
                        z10 = false;
                        str3 = str3;
                        str4 = str23;
                        str6 = str6;
                        str7 = str7;
                        str5 = str5;
                        str = str;
                        str16 = str16;
                        str8 = str8;
                        str17 = str17;
                        str9 = str9;
                        str18 = str18;
                        str10 = str10;
                        str19 = str19;
                        str11 = str11;
                        str20 = str20;
                        str12 = str12;
                        str21 = str21;
                        str13 = str13;
                        str22 = str22;
                        str2 = str2;
                        break;
                    case 0:
                        strJ = aVarA.j(c1536l0, 0);
                        i11 |= 1;
                        str3 = str3;
                        str4 = str23;
                        str6 = str6;
                        str7 = str7;
                        str5 = str5;
                        str = str;
                        str16 = str16;
                        str8 = str8;
                        str17 = str17;
                        str9 = str9;
                        str18 = str18;
                        str10 = str10;
                        str19 = str19;
                        str11 = str11;
                        str20 = str20;
                        str12 = str12;
                        str21 = str21;
                        str13 = str13;
                        str22 = str22;
                        str2 = str2;
                        break;
                    case 1:
                        str14 = (String) aVarA.d(c1536l0, 1, y0.f22677a, str14);
                        i11 |= 2;
                        str3 = str3;
                        str4 = str23;
                        str6 = str6;
                        str7 = str7;
                        str5 = str5;
                        str = str;
                        str16 = str16;
                        str8 = str8;
                        str17 = str17;
                        str9 = str9;
                        str18 = str18;
                        str10 = str10;
                        str19 = str19;
                        str11 = str11;
                        str20 = str20;
                        str12 = str12;
                        str21 = str21;
                        str13 = str13;
                        str22 = str22;
                        str2 = str2;
                        break;
                    case 2:
                        str = str;
                        str5 = str5;
                        str2 = str2;
                        str22 = str22;
                        str13 = str13;
                        str21 = str21;
                        str12 = str12;
                        str20 = str20;
                        str11 = str11;
                        str19 = str19;
                        str10 = str10;
                        str18 = str18;
                        str9 = str9;
                        str17 = str17;
                        str8 = str8;
                        str16 = str16;
                        str7 = str7;
                        str15 = (String) aVarA.d(c1536l0, 2, y0.f22677a, str15);
                        i11 |= 4;
                        str3 = str3;
                        str4 = str23;
                        str7 = str7;
                        str5 = str5;
                        str = str;
                        str16 = str16;
                        str8 = str8;
                        str17 = str17;
                        str9 = str9;
                        str18 = str18;
                        str10 = str10;
                        str19 = str19;
                        str11 = str11;
                        str20 = str20;
                        str12 = str12;
                        str21 = str21;
                        str13 = str13;
                        str22 = str22;
                        str2 = str2;
                        break;
                    case 3:
                        str2 = str2;
                        str22 = str22;
                        str13 = str13;
                        str21 = str21;
                        str12 = str12;
                        str20 = str20;
                        str11 = str11;
                        str19 = str19;
                        str10 = str10;
                        str18 = str18;
                        str9 = str9;
                        str17 = str17;
                        str16 = (String) aVarA.d(c1536l0, 3, y0.f22677a, str16);
                        i11 |= 8;
                        str3 = str3;
                        str4 = str23;
                        str8 = str8;
                        str5 = str5;
                        str = str;
                        str17 = str17;
                        str9 = str9;
                        str18 = str18;
                        str10 = str10;
                        str19 = str19;
                        str11 = str11;
                        str20 = str20;
                        str12 = str12;
                        str21 = str21;
                        str13 = str13;
                        str22 = str22;
                        str2 = str2;
                        break;
                    case 4:
                        str2 = str2;
                        str22 = str22;
                        str13 = str13;
                        str21 = str21;
                        str12 = str12;
                        str20 = str20;
                        str11 = str11;
                        str19 = str19;
                        str10 = str10;
                        str18 = str18;
                        str17 = (String) aVarA.d(c1536l0, 4, y0.f22677a, str17);
                        i11 |= 16;
                        str3 = str3;
                        str4 = str23;
                        str9 = str9;
                        str5 = str5;
                        str = str;
                        str18 = str18;
                        str10 = str10;
                        str19 = str19;
                        str11 = str11;
                        str20 = str20;
                        str12 = str12;
                        str21 = str21;
                        str13 = str13;
                        str22 = str22;
                        str2 = str2;
                        break;
                    case 5:
                        str2 = str2;
                        str22 = str22;
                        str13 = str13;
                        str21 = str21;
                        str12 = str12;
                        str20 = str20;
                        str11 = str11;
                        str19 = str19;
                        str18 = (String) aVarA.d(c1536l0, 5, y0.f22677a, str18);
                        i11 |= 32;
                        str3 = str3;
                        str4 = str23;
                        str10 = str10;
                        str5 = str5;
                        str = str;
                        str19 = str19;
                        str11 = str11;
                        str20 = str20;
                        str12 = str12;
                        str21 = str21;
                        str13 = str13;
                        str22 = str22;
                        str2 = str2;
                        break;
                    case 6:
                        str2 = str2;
                        str22 = str22;
                        str13 = str13;
                        str21 = str21;
                        str12 = str12;
                        str20 = str20;
                        str19 = (String) aVarA.d(c1536l0, 6, y0.f22677a, str19);
                        i11 |= 64;
                        str3 = str3;
                        str4 = str23;
                        str11 = str11;
                        str5 = str5;
                        str = str;
                        str20 = str20;
                        str12 = str12;
                        str21 = str21;
                        str13 = str13;
                        str22 = str22;
                        str2 = str2;
                        break;
                    case 7:
                        str2 = str2;
                        str22 = str22;
                        str13 = str13;
                        str21 = str21;
                        str20 = (String) aVarA.d(c1536l0, 7, y0.f22677a, str20);
                        i11 |= 128;
                        str3 = str3;
                        str4 = str23;
                        str12 = str12;
                        str5 = str5;
                        str = str;
                        str21 = str21;
                        str13 = str13;
                        str22 = str22;
                        str2 = str2;
                        break;
                    case 8:
                        str2 = str2;
                        str22 = str22;
                        str21 = (String) aVarA.d(c1536l0, 8, y0.f22677a, str21);
                        i11 |= 256;
                        str3 = str3;
                        str4 = str23;
                        str13 = str13;
                        str5 = str5;
                        str = str;
                        str22 = str22;
                        str2 = str2;
                        break;
                    case 9:
                        str22 = (String) aVarA.d(c1536l0, 9, y0.f22677a, str22);
                        i11 |= 512;
                        str3 = str3;
                        str4 = str23;
                        str2 = str2;
                        str5 = str5;
                        str = str;
                        break;
                    case 10:
                        str4 = (String) aVarA.d(c1536l0, 10, y0.f22677a, str23);
                        i11 |= 1024;
                        str3 = str3;
                        str5 = str5;
                        str = str;
                        break;
                    case 11:
                        str = str;
                        str3 = (String) aVarA.d(c1536l0, 11, y0.f22677a, str3);
                        i11 |= 2048;
                        str4 = str23;
                        str = str;
                        break;
                    case 12:
                        str3 = str3;
                        str2 = (String) aVarA.d(c1536l0, 12, y0.f22677a, str2);
                        i11 |= 4096;
                        str4 = str23;
                        str3 = str3;
                        break;
                    case 13:
                        str3 = str3;
                        str5 = (String) aVarA.d(c1536l0, 13, y0.f22677a, str5);
                        i11 |= 8192;
                        str4 = str23;
                        str3 = str3;
                        break;
                    case 14:
                        str3 = str3;
                        str6 = (String) aVarA.d(c1536l0, 14, y0.f22677a, str6);
                        i11 |= 16384;
                        str4 = str23;
                        str3 = str3;
                        break;
                    case 15:
                        str7 = (String) aVarA.d(c1536l0, 15, y0.f22677a, str7);
                        i10 = 32768;
                        i11 |= i10;
                        str4 = str23;
                        str3 = str3;
                        break;
                    case 16:
                        str8 = (String) aVarA.d(c1536l0, 16, y0.f22677a, str8);
                        i10 = 65536;
                        i11 |= i10;
                        str4 = str23;
                        str3 = str3;
                        break;
                    case 17:
                        str9 = (String) aVarA.d(c1536l0, 17, y0.f22677a, str9);
                        i10 = 131072;
                        i11 |= i10;
                        str4 = str23;
                        str3 = str3;
                        break;
                    case 18:
                        str10 = (String) aVarA.d(c1536l0, 18, y0.f22677a, str10);
                        i10 = 262144;
                        i11 |= i10;
                        str4 = str23;
                        str3 = str3;
                        break;
                    case 19:
                        str11 = (String) aVarA.d(c1536l0, 19, y0.f22677a, str11);
                        i10 = 524288;
                        i11 |= i10;
                        str4 = str23;
                        str3 = str3;
                        break;
                    case 20:
                        str12 = (String) aVarA.d(c1536l0, 20, y0.f22677a, str12);
                        i10 = 1048576;
                        i11 |= i10;
                        str4 = str23;
                        str3 = str3;
                        break;
                    case 21:
                        str13 = (String) aVarA.d(c1536l0, 21, y0.f22677a, str13);
                        i10 = 2097152;
                        i11 |= i10;
                        str4 = str23;
                        str3 = str3;
                        break;
                    case 22:
                        str = (String) aVarA.d(c1536l0, 22, y0.f22677a, str);
                        i10 = 4194304;
                        i11 |= i10;
                        str4 = str23;
                        str3 = str3;
                        break;
                    default:
                        throw new UnknownFieldException(iO);
                }
            }
            String str24 = str2;
            String str25 = str;
            String str26 = str5;
            String str27 = str6;
            String str28 = str4;
            String str29 = str13;
            String str30 = str21;
            String str31 = str12;
            String str32 = str20;
            String str33 = str11;
            String str34 = str19;
            String str35 = str10;
            String str36 = str18;
            String str37 = str9;
            String str38 = str17;
            String str39 = str8;
            String str40 = str16;
            String str41 = str7;
            String str42 = str15;
            aVarA.c(c1536l0);
            return new G(i11, strJ, str14, str42, str40, str38, str36, str34, str32, str30, str22, str28, str3, str24, str26, str27, str41, str39, str37, str35, str33, str31, str29, str25);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            G value = (G) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48459a);
            boolean zV = bVarA.v(c1536l0);
            String str = value.f48460b;
            if (zV || str != null) {
                bVarA.q(c1536l0, 1, y0.f22677a, str);
            }
            boolean zV2 = bVarA.v(c1536l0);
            String str2 = value.f48461c;
            if (zV2 || str2 != null) {
                bVarA.q(c1536l0, 2, y0.f22677a, str2);
            }
            boolean zV3 = bVarA.v(c1536l0);
            String str3 = value.f48462d;
            if (zV3 || str3 != null) {
                bVarA.q(c1536l0, 3, y0.f22677a, str3);
            }
            boolean zV4 = bVarA.v(c1536l0);
            String str4 = value.f48463e;
            if (zV4 || str4 != null) {
                bVarA.q(c1536l0, 4, y0.f22677a, str4);
            }
            boolean zV5 = bVarA.v(c1536l0);
            String str5 = value.f48464f;
            if (zV5 || str5 != null) {
                bVarA.q(c1536l0, 5, y0.f22677a, str5);
            }
            boolean zV6 = bVarA.v(c1536l0);
            String str6 = value.f48465g;
            if (zV6 || str6 != null) {
                bVarA.q(c1536l0, 6, y0.f22677a, str6);
            }
            boolean zV7 = bVarA.v(c1536l0);
            String str7 = value.f48466h;
            if (zV7 || str7 != null) {
                bVarA.q(c1536l0, 7, y0.f22677a, str7);
            }
            boolean zV8 = bVarA.v(c1536l0);
            String str8 = value.f48467i;
            if (zV8 || str8 != null) {
                bVarA.q(c1536l0, 8, y0.f22677a, str8);
            }
            boolean zV9 = bVarA.v(c1536l0);
            String str9 = value.j;
            if (zV9 || str9 != null) {
                bVarA.q(c1536l0, 9, y0.f22677a, str9);
            }
            boolean zV10 = bVarA.v(c1536l0);
            String str10 = value.f48468k;
            if (zV10 || str10 != null) {
                bVarA.q(c1536l0, 10, y0.f22677a, str10);
            }
            boolean zV11 = bVarA.v(c1536l0);
            String str11 = value.f48469l;
            if (zV11 || str11 != null) {
                bVarA.q(c1536l0, 11, y0.f22677a, str11);
            }
            boolean zV12 = bVarA.v(c1536l0);
            String str12 = value.f48470m;
            if (zV12 || str12 != null) {
                bVarA.q(c1536l0, 12, y0.f22677a, str12);
            }
            boolean zV13 = bVarA.v(c1536l0);
            String str13 = value.f48471n;
            if (zV13 || str13 != null) {
                bVarA.q(c1536l0, 13, y0.f22677a, str13);
            }
            boolean zV14 = bVarA.v(c1536l0);
            String str14 = value.f48472o;
            if (zV14 || str14 != null) {
                bVarA.q(c1536l0, 14, y0.f22677a, str14);
            }
            boolean zV15 = bVarA.v(c1536l0);
            String str15 = value.f48473p;
            if (zV15 || str15 != null) {
                bVarA.q(c1536l0, 15, y0.f22677a, str15);
            }
            boolean zV16 = bVarA.v(c1536l0);
            String str16 = value.f48474q;
            if (zV16 || str16 != null) {
                bVarA.q(c1536l0, 16, y0.f22677a, str16);
            }
            boolean zV17 = bVarA.v(c1536l0);
            String str17 = value.f48475r;
            if (zV17 || str17 != null) {
                bVarA.q(c1536l0, 17, y0.f22677a, str17);
            }
            boolean zV18 = bVarA.v(c1536l0);
            String str18 = value.f48476s;
            if (zV18 || str18 != null) {
                bVarA.q(c1536l0, 18, y0.f22677a, str18);
            }
            boolean zV19 = bVarA.v(c1536l0);
            String str19 = value.f48477t;
            if (zV19 || str19 != null) {
                bVarA.q(c1536l0, 19, y0.f22677a, str19);
            }
            boolean zV20 = bVarA.v(c1536l0);
            String str20 = value.f48478u;
            if (zV20 || str20 != null) {
                bVarA.q(c1536l0, 20, y0.f22677a, str20);
            }
            boolean zV21 = bVarA.v(c1536l0);
            String str21 = value.f48479v;
            if (zV21 || str21 != null) {
                bVarA.q(c1536l0, 21, y0.f22677a, str21);
            }
            boolean zV22 = bVarA.v(c1536l0);
            String str22 = value.f48480w;
            if (zV22 || str22 != null) {
                bVarA.q(c1536l0, 22, y0.f22677a, str22);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: TextTableDTO.kt */
    public static final class b {
        public final Ya.b<G> serializer() {
            return a.f48481a;
        }
    }

    @d
    public /* synthetic */ G(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        if (1 != (i10 & 1)) {
            p241t7.b.w(i10, 1, a.f48481a.getDescriptor());
            throw null;
        }
        this.f48459a = str;
        if ((i10 & 2) == 0) {
            this.f48460b = null;
        } else {
            this.f48460b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f48461c = null;
        } else {
            this.f48461c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f48462d = null;
        } else {
            this.f48462d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f48463e = null;
        } else {
            this.f48463e = str5;
        }
        if ((i10 & 32) == 0) {
            this.f48464f = null;
        } else {
            this.f48464f = str6;
        }
        if ((i10 & 64) == 0) {
            this.f48465g = null;
        } else {
            this.f48465g = str7;
        }
        if ((i10 & 128) == 0) {
            this.f48466h = null;
        } else {
            this.f48466h = str8;
        }
        if ((i10 & 256) == 0) {
            this.f48467i = null;
        } else {
            this.f48467i = str9;
        }
        if ((i10 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str10;
        }
        if ((i10 & 1024) == 0) {
            this.f48468k = null;
        } else {
            this.f48468k = str11;
        }
        if ((i10 & 2048) == 0) {
            this.f48469l = null;
        } else {
            this.f48469l = str12;
        }
        if ((i10 & 4096) == 0) {
            this.f48470m = null;
        } else {
            this.f48470m = str13;
        }
        if ((i10 & 8192) == 0) {
            this.f48471n = null;
        } else {
            this.f48471n = str14;
        }
        if ((i10 & 16384) == 0) {
            this.f48472o = null;
        } else {
            this.f48472o = str15;
        }
        if ((32768 & i10) == 0) {
            this.f48473p = null;
        } else {
            this.f48473p = str16;
        }
        if ((65536 & i10) == 0) {
            this.f48474q = null;
        } else {
            this.f48474q = str17;
        }
        if ((131072 & i10) == 0) {
            this.f48475r = null;
        } else {
            this.f48475r = str18;
        }
        if ((262144 & i10) == 0) {
            this.f48476s = null;
        } else {
            this.f48476s = str19;
        }
        if ((524288 & i10) == 0) {
            this.f48477t = null;
        } else {
            this.f48477t = str20;
        }
        if ((1048576 & i10) == 0) {
            this.f48478u = null;
        } else {
            this.f48478u = str21;
        }
        if ((2097152 & i10) == 0) {
            this.f48479v = null;
        } else {
            this.f48479v = str22;
        }
        if ((i10 & 4194304) == 0) {
            this.f48480w = null;
        } else {
            this.f48480w = str23;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return i.a(this.f48459a, g10.f48459a) && i.a(this.f48460b, g10.f48460b) && i.a(this.f48461c, g10.f48461c) && i.a(this.f48462d, g10.f48462d) && i.a(this.f48463e, g10.f48463e) && i.a(this.f48464f, g10.f48464f) && i.a(this.f48465g, g10.f48465g) && i.a(this.f48466h, g10.f48466h) && i.a(this.f48467i, g10.f48467i) && i.a(this.j, g10.j) && i.a(this.f48468k, g10.f48468k) && i.a(this.f48469l, g10.f48469l) && i.a(this.f48470m, g10.f48470m) && i.a(this.f48471n, g10.f48471n) && i.a(this.f48472o, g10.f48472o) && i.a(this.f48473p, g10.f48473p) && i.a(this.f48474q, g10.f48474q) && i.a(this.f48475r, g10.f48475r) && i.a(this.f48476s, g10.f48476s) && i.a(this.f48477t, g10.f48477t) && i.a(this.f48478u, g10.f48478u) && i.a(this.f48479v, g10.f48479v) && i.a(this.f48480w, g10.f48480w);
    }

    public final int hashCode() {
        int iHashCode = this.f48459a.hashCode() * 31;
        String str = this.f48460b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f48461c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f48462d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f48463e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f48464f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f48465g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f48466h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f48467i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f48468k;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f48469l;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f48470m;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f48471n;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f48472o;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f48473p;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f48474q;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f48475r;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f48476s;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f48477t;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f48478u;
        int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f48479v;
        int iHashCode22 = (iHashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.f48480w;
        return iHashCode22 + (str22 != null ? str22.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextTableDTO(id=");
        sb2.append(this.f48459a);
        sb2.append(", de=");
        sb2.append(this.f48460b);
        sb2.append(", fi=");
        sb2.append(this.f48461c);
        sb2.append(", ru=");
        sb2.append(this.f48462d);
        sb2.append(", sv=");
        sb2.append(this.f48463e);
        sb2.append(", ko=");
        sb2.append(this.f48464f);
        sb2.append(", pt=");
        sb2.append(this.f48465g);
        sb2.append(", el=");
        sb2.append(this.f48466h);
        sb2.append(", en=");
        sb2.append(this.f48467i);
        sb2.append(", hr=");
        sb2.append(this.j);
        sb2.append(", it=");
        sb2.append(this.f48468k);
        sb2.append(", fr=");
        sb2.append(this.f48469l);
        sb2.append(", hu=");
        sb2.append(this.f48470m);
        sb2.append(", es=");
        sb2.append(this.f48471n);
        sb2.append(", zh=");
        sb2.append(this.f48472o);
        sb2.append(", cs=");
        sb2.append(this.f48473p);
        sb2.append(", ja=");
        sb2.append(this.f48474q);
        sb2.append(", sl=");
        sb2.append(this.f48475r);
        sb2.append(", pl=");
        sb2.append(this.f48476s);
        sb2.append(", da=");
        sb2.append(this.f48477t);
        sb2.append(", nl=");
        sb2.append(this.f48478u);
        sb2.append(", tr=");
        sb2.append(this.f48479v);
        sb2.append(", ro=");
        return Q8.d.a(sb2, this.f48480w, ")");
    }
}
