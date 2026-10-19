package p304y9;

import Ya.k;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import me.zhanghai.android.materialprogressbar.R;
import p005a4.q;
import p011ab.e;
import p024bb.c;
import p037cb.C1521e;
import p037cb.C1527h;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;
import p293xa.d;
import p293xa.r;

/* JADX INFO: compiled from: UserDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class I {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Ya.b<Object>[] f48489F = {null, null, null, null, null, null, null, null, null, null, null, new C1521e(C2833l.a.f48600a), new C1521e(y0.f22677a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Boolean f48490A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final B f48491B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final B f48492C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C2822a f48493D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final String f48494E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f48501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f48502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f48503i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f48504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<C2833l> f48505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<String> f48506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f48507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f48508o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f48509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f48510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C2830i f48511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C2830i f48512s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Integer f48513t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p292x9.a f48514u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C f48515v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f48516w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Boolean f48517x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Boolean f48518y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Boolean f48519z;

    /* JADX INFO: compiled from: UserDTO.kt */
    @d
    public static final class a implements D<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48520a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48520a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.UserDTO", aVar, 31);
            c1536l0.k("objectId", false);
            c1536l0.k("account", true);
            c1536l0.k("username", true);
            c1536l0.k("createdAt", false);
            c1536l0.k("updatedAt", true);
            c1536l0.k("name", true);
            c1536l0.k("credits", false);
            c1536l0.k("appVersion", true);
            c1536l0.k("pro", true);
            c1536l0.k("userEmail", true);
            c1536l0.k("role", true);
            c1536l0.k("devices", true);
            c1536l0.k("roles", true);
            c1536l0.k("spentCredits", true);
            c1536l0.k("gotFreeCredits", true);
            c1536l0.k("purchasedCredits", true);
            c1536l0.k("picture", true);
            c1536l0.k("agreementSigned", true);
            c1536l0.k("bonusTime", true);
            c1536l0.k("adsWatched", true);
            c1536l0.k("countryCode", true);
            c1536l0.k("settings", true);
            c1536l0.k("email", true);
            c1536l0.k("emailVerified", true);
            c1536l0.k("allowResetPassword", true);
            c1536l0.k("reportEnabled", true);
            c1536l0.k("is2FAEnabled", true);
            c1536l0.k("vehicles", true);
            c1536l0.k("userRoles", true);
            c1536l0.k("acl", true);
            c1536l0.k("sessionToken", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            Ya.b<Object>[] bVarArr = I.f48489F;
            y0 y0Var = y0.f22677a;
            Ya.b<?> bVarC = Za.a.c(y0Var);
            Ya.b<?> bVarC2 = Za.a.c(y0Var);
            Ya.b<?> bVarC3 = Za.a.c(y0Var);
            p037cb.I i10 = p037cb.I.f22555a;
            Ya.b<?> bVarC4 = Za.a.c(i10);
            C1527h c1527h = C1527h.f22612a;
            Ya.b<?> bVarC5 = Za.a.c(c1527h);
            Ya.b<?> bVarC6 = Za.a.c(y0Var);
            Ya.b<?> bVarC7 = Za.a.c(i10);
            Ya.b<?> bVarC8 = Za.a.c(bVarArr[11]);
            Ya.b<?> bVarC9 = Za.a.c(bVarArr[12]);
            Ya.b<?> bVarC10 = Za.a.c(i10);
            Ya.b<?> bVarC11 = Za.a.c(i10);
            Ya.b<?> bVarC12 = Za.a.c(i10);
            Ya.b<?> bVarC13 = Za.a.c(y.a.f48669a);
            C2830i.a aVar = C2830i.a.f48584a;
            Ya.b<?> bVarC14 = Za.a.c(aVar);
            Ya.b<?> bVarC15 = Za.a.c(aVar);
            Ya.b<?> bVarC16 = Za.a.c(i10);
            Ya.b<?> bVarC17 = Za.a.c(p292x9.a.C0551a.f47914a);
            Ya.b<?> bVarC18 = Za.a.c(C.a.f48435a);
            Ya.b<?> bVarC19 = Za.a.c(y0Var);
            Ya.b<?> bVarC20 = Za.a.c(c1527h);
            Ya.b<?> bVarC21 = Za.a.c(c1527h);
            Ya.b<?> bVarC22 = Za.a.c(c1527h);
            Ya.b<?> bVarC23 = Za.a.c(c1527h);
            B.a aVar2 = B.a.f48432a;
            return new Ya.b[]{y0Var, bVarC, y0Var, y0Var, bVarC2, bVarC3, i10, bVarC4, bVarC5, bVarC6, bVarC7, bVarC8, bVarC9, bVarC10, bVarC11, bVarC12, bVarC13, bVarC14, bVarC15, bVarC16, bVarC17, bVarC18, bVarC19, bVarC20, bVarC21, bVarC22, bVarC23, Za.a.c(aVar2), Za.a.c(aVar2), Za.a.c(C2822a.C0559a.f48545a), y0Var};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            int i10;
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Ya.b<Object>[] bVarArr = I.f48489F;
            C c10 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            B b10 = null;
            C2830i c2830i = null;
            Boolean bool3 = null;
            B b11 = null;
            Boolean bool4 = null;
            String str = null;
            Integer num = null;
            p292x9.a aVar = null;
            C2830i c2830i2 = null;
            C2822a c2822a = null;
            String str2 = null;
            String str3 = null;
            String strJ = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Integer num2 = null;
            Boolean bool5 = null;
            String str7 = null;
            Integer num3 = null;
            List list = null;
            y yVar = null;
            String str8 = null;
            List list2 = null;
            Integer num4 = null;
            Integer num5 = null;
            Integer num6 = null;
            int i11 = 0;
            int iH = 0;
            boolean z10 = true;
            while (z10) {
                c2830i = c2830i;
                int iO = aVarA.o(c1536l0);
                switch (iO) {
                    case -1:
                        Boolean bool6 = bool;
                        B b12 = b10;
                        C2822a c2822a2 = c2822a;
                        String str9 = str4;
                        str5 = str5;
                        Integer num7 = num2;
                        Boolean bool7 = bool5;
                        num = num;
                        C2830i c2830i3 = c2830i2;
                        y yVar2 = yVar;
                        str = str;
                        r rVar = r.f47939a;
                        str4 = str9;
                        yVar = yVar2;
                        c2830i2 = c2830i3;
                        bool5 = bool7;
                        c2830i = c2830i;
                        c2822a = c2822a2;
                        bool2 = bool2;
                        bool4 = bool4;
                        num2 = num7;
                        list2 = list2;
                        str7 = str7;
                        num3 = num3;
                        bool3 = bool3;
                        b10 = b12;
                        b11 = b11;
                        c10 = c10;
                        num4 = num4;
                        z10 = false;
                        bool = bool6;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 0:
                        bool = bool;
                        b10 = b10;
                        b11 = b11;
                        c2822a = c2822a;
                        String str10 = str4;
                        str5 = str5;
                        num2 = num2;
                        Boolean bool8 = bool5;
                        str7 = str7;
                        num4 = num4;
                        c10 = c10;
                        num = num;
                        c2830i2 = c2830i2;
                        num3 = num3;
                        yVar = yVar;
                        bool3 = bool3;
                        str = str;
                        list2 = list2;
                        strJ = aVarA.j(c1536l0, 0);
                        i11 |= 1;
                        r rVar2 = r.f47939a;
                        str4 = str10;
                        bool5 = bool8;
                        c2830i = c2830i;
                        bool2 = bool2;
                        bool4 = bool4;
                        num2 = num2;
                        list2 = list2;
                        str7 = str7;
                        num3 = num3;
                        bool3 = bool3;
                        b10 = b10;
                        b11 = b11;
                        c10 = c10;
                        num4 = num4;
                        bool = bool;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 1:
                        bool = bool;
                        b10 = b10;
                        b11 = b11;
                        c2822a = c2822a;
                        num2 = num2;
                        Boolean bool9 = bool5;
                        str7 = str7;
                        num4 = num4;
                        c10 = c10;
                        num = num;
                        c2830i2 = c2830i2;
                        num3 = num3;
                        yVar = yVar;
                        bool3 = bool3;
                        str = str;
                        list2 = list2;
                        str5 = str5;
                        String str11 = (String) aVarA.d(c1536l0, 1, y0.f22677a, str4);
                        i11 |= 2;
                        r rVar3 = r.f47939a;
                        str4 = str11;
                        bool5 = bool9;
                        c2830i = c2830i;
                        bool2 = bool2;
                        bool4 = bool4;
                        num2 = num2;
                        list2 = list2;
                        str7 = str7;
                        num3 = num3;
                        bool3 = bool3;
                        b10 = b10;
                        b11 = b11;
                        c10 = c10;
                        num4 = num4;
                        bool = bool;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 2:
                        String strJ2 = aVarA.j(c1536l0, 2);
                        i11 |= 4;
                        r rVar4 = r.f47939a;
                        str5 = str5;
                        str3 = strJ2;
                        bool5 = bool5;
                        c2830i = c2830i;
                        bool2 = bool2;
                        bool4 = bool4;
                        num2 = num2;
                        list2 = list2;
                        str7 = str7;
                        num3 = num3;
                        bool3 = bool3;
                        b10 = b10;
                        b11 = b11;
                        c10 = c10;
                        num4 = num4;
                        bool = bool;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 3:
                        String strJ3 = aVarA.j(c1536l0, 3);
                        i11 |= 8;
                        r rVar5 = r.f47939a;
                        str2 = strJ3;
                        str5 = str5;
                        bool5 = bool5;
                        c2830i = c2830i;
                        bool2 = bool2;
                        bool4 = bool4;
                        num2 = num2;
                        list2 = list2;
                        str7 = str7;
                        num3 = num3;
                        bool3 = bool3;
                        b10 = b10;
                        b11 = b11;
                        c10 = c10;
                        num4 = num4;
                        bool = bool;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 4:
                        bool = bool;
                        b10 = b10;
                        b11 = b11;
                        c2822a = c2822a;
                        num2 = num2;
                        Boolean bool10 = bool5;
                        str7 = str7;
                        num4 = num4;
                        c10 = c10;
                        num = num;
                        c2830i2 = c2830i2;
                        num3 = num3;
                        yVar = yVar;
                        bool3 = bool3;
                        str = str;
                        list2 = list2;
                        String str12 = (String) aVarA.d(c1536l0, 4, y0.f22677a, str5);
                        i11 |= 16;
                        r rVar6 = r.f47939a;
                        str5 = str12;
                        str6 = str6;
                        bool5 = bool10;
                        c2830i = c2830i;
                        bool2 = bool2;
                        bool4 = bool4;
                        num2 = num2;
                        list2 = list2;
                        str7 = str7;
                        num3 = num3;
                        bool3 = bool3;
                        b10 = b10;
                        b11 = b11;
                        c10 = c10;
                        num4 = num4;
                        bool = bool;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 5:
                        bool = bool;
                        b10 = b10;
                        b11 = b11;
                        c2822a = c2822a;
                        num2 = num2;
                        str7 = str7;
                        num4 = num4;
                        c10 = c10;
                        c2830i2 = c2830i2;
                        num3 = num3;
                        yVar = yVar;
                        bool3 = bool3;
                        str = str;
                        Boolean bool11 = bool5;
                        list2 = list2;
                        num = num;
                        String str13 = (String) aVarA.d(c1536l0, 5, y0.f22677a, str6);
                        i11 |= 32;
                        r rVar7 = r.f47939a;
                        str6 = str13;
                        str5 = str5;
                        bool5 = bool11;
                        c2830i = c2830i;
                        bool2 = bool2;
                        bool4 = bool4;
                        num2 = num2;
                        list2 = list2;
                        str7 = str7;
                        num3 = num3;
                        bool3 = bool3;
                        b10 = b10;
                        b11 = b11;
                        c10 = c10;
                        num4 = num4;
                        bool = bool;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 6:
                        iH = aVarA.h(c1536l0, 6);
                        i11 |= 64;
                        r rVar8 = r.f47939a;
                        bool5 = bool5;
                        c2830i = c2830i;
                        b10 = b10;
                        bool2 = bool2;
                        bool4 = bool4;
                        list2 = list2;
                        str7 = str7;
                        num3 = num3;
                        bool3 = bool3;
                        b11 = b11;
                        c10 = c10;
                        num4 = num4;
                        bool = bool;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 7:
                        Integer num8 = (Integer) aVarA.d(c1536l0, 7, p037cb.I.f22555a, num2);
                        i11 |= 128;
                        r rVar9 = r.f47939a;
                        num2 = num8;
                        bool5 = bool5;
                        num6 = num6;
                        c2830i = c2830i;
                        b10 = b10;
                        bool2 = bool2;
                        bool4 = bool4;
                        list2 = list2;
                        str7 = str7;
                        num3 = num3;
                        bool3 = bool3;
                        b11 = b11;
                        c10 = c10;
                        num4 = num4;
                        bool = bool;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 8:
                        bool = bool;
                        c2822a = c2822a;
                        num4 = num4;
                        c10 = c10;
                        c2830i2 = c2830i2;
                        yVar = yVar;
                        str = str;
                        Boolean bool12 = bool5;
                        num = num;
                        Boolean bool13 = (Boolean) aVarA.d(c1536l0, 8, C1527h.f22612a, bool12);
                        i11 |= 256;
                        r rVar10 = r.f47939a;
                        bool5 = bool13;
                        str5 = str5;
                        c2830i = c2830i;
                        b10 = b10;
                        b11 = b11;
                        bool2 = bool2;
                        bool4 = bool4;
                        list2 = list2;
                        num3 = num3;
                        bool3 = bool3;
                        c10 = c10;
                        num4 = num4;
                        bool = bool;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 9:
                        bool = bool;
                        B b13 = b11;
                        c2822a = c2822a;
                        num4 = num4;
                        c2830i2 = c2830i2;
                        yVar = yVar;
                        str = str;
                        String str14 = (String) aVarA.d(c1536l0, 9, y0.f22677a, str7);
                        i11 |= 512;
                        r rVar11 = r.f47939a;
                        str7 = str14;
                        str5 = str5;
                        bool5 = bool5;
                        c2830i = c2830i;
                        b10 = b10;
                        b11 = b13;
                        bool2 = bool2;
                        bool4 = bool4;
                        list2 = list2;
                        num3 = num3;
                        num = num;
                        bool3 = bool3;
                        c10 = c10;
                        num4 = num4;
                        bool = bool;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 10:
                        Boolean bool14 = bool;
                        Integer num9 = num4;
                        C c11 = c10;
                        Integer num10 = (Integer) aVarA.d(c1536l0, 10, p037cb.I.f22555a, num3);
                        i11 |= 1024;
                        r rVar12 = r.f47939a;
                        num3 = num10;
                        c2830i = c2830i;
                        b10 = b10;
                        b11 = b11;
                        bool2 = bool2;
                        bool4 = bool4;
                        c10 = c11;
                        num4 = num9;
                        list2 = list2;
                        bool3 = bool3;
                        bool = bool14;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 11:
                        Boolean bool15 = bool3;
                        List list3 = list2;
                        Boolean bool16 = bool4;
                        List list4 = (List) aVarA.d(c1536l0, 11, bVarArr[11], list);
                        i11 |= 2048;
                        r rVar13 = r.f47939a;
                        list = list4;
                        c2830i = c2830i;
                        bool = bool;
                        b10 = b10;
                        b11 = b11;
                        bool2 = bool2;
                        bool4 = bool16;
                        list2 = list3;
                        bool3 = bool15;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 12:
                        c2822a = c2822a;
                        c2830i2 = c2830i2;
                        yVar = yVar;
                        str = str;
                        Boolean bool17 = bool3;
                        List list5 = (List) aVarA.d(c1536l0, 12, bVarArr[12], list2);
                        i11 |= 4096;
                        r rVar14 = r.f47939a;
                        list2 = list5;
                        c2830i = c2830i;
                        str5 = str5;
                        bool5 = bool5;
                        bool3 = bool17;
                        bool = bool;
                        b10 = b10;
                        b11 = b11;
                        bool2 = bool2;
                        num = num;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 13:
                        Boolean bool18 = bool;
                        Integer num11 = (Integer) aVarA.d(c1536l0, 13, p037cb.I.f22555a, num4);
                        i11 |= 8192;
                        r rVar15 = r.f47939a;
                        num4 = num11;
                        c2830i = c2830i;
                        bool = bool18;
                        b10 = b10;
                        b11 = b11;
                        bool2 = bool2;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 14:
                        Integer num12 = (Integer) aVarA.d(c1536l0, 14, p037cb.I.f22555a, num5);
                        i11 |= 16384;
                        r rVar16 = r.f47939a;
                        num5 = num12;
                        c2830i = c2830i;
                        b10 = b10;
                        b11 = b11;
                        bool2 = bool2;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 15:
                        c2822a = c2822a;
                        c2830i2 = c2830i2;
                        yVar = yVar;
                        str = str;
                        B b14 = b10;
                        Integer num13 = (Integer) aVarA.d(c1536l0, 15, p037cb.I.f22555a, num6);
                        i11 |= 32768;
                        r rVar17 = r.f47939a;
                        num6 = num13;
                        c2830i = c2830i;
                        str5 = str5;
                        bool5 = bool5;
                        z10 = z10;
                        b10 = b14;
                        b11 = b11;
                        yVar = yVar;
                        c2830i2 = c2830i2;
                        c2822a = c2822a;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 16:
                        C2822a c2822a3 = c2822a;
                        C2830i c2830i4 = c2830i2;
                        y yVar3 = yVar;
                        str = str;
                        y yVar4 = (y) aVarA.d(c1536l0, 16, y.a.f48669a, yVar3);
                        i11 |= 65536;
                        r rVar18 = r.f47939a;
                        c2830i2 = c2830i4;
                        str5 = str5;
                        bool5 = bool5;
                        z10 = z10;
                        c2822a = c2822a3;
                        yVar = yVar4;
                        c2830i = c2830i;
                        b11 = b11;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 17:
                        B b15 = b11;
                        c2830i = (C2830i) aVarA.d(c1536l0, 17, C2830i.a.f48584a, c2830i);
                        i11 |= 131072;
                        r rVar19 = r.f47939a;
                        c2830i2 = c2830i2;
                        str5 = str5;
                        bool5 = bool5;
                        z10 = z10;
                        c2822a = c2822a;
                        b11 = b15;
                        num = num;
                        str = str;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 18:
                        C2830i c2830i5 = (C2830i) aVarA.d(c1536l0, 18, C2830i.a.f48584a, c2830i2);
                        i11 |= 262144;
                        r rVar20 = r.f47939a;
                        c2830i2 = c2830i5;
                        c2822a = c2822a;
                        num = num;
                        str = str;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 19:
                        Integer num14 = (Integer) aVarA.d(c1536l0, 19, p037cb.I.f22555a, num);
                        i11 |= 524288;
                        r rVar21 = r.f47939a;
                        str5 = str5;
                        bool5 = bool5;
                        c2830i2 = c2830i2;
                        num = num14;
                        c2830i = c2830i;
                        str = str;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 20:
                        c2830i2 = c2830i2;
                        p292x9.a aVar2 = (p292x9.a) aVarA.d(c1536l0, 20, p292x9.a.C0551a.f47914a, aVar);
                        i11 |= 1048576;
                        r rVar22 = r.f47939a;
                        aVar = aVar2;
                        c2830i2 = c2830i2;
                        num = num;
                        str = str;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 21:
                        c2830i2 = c2830i2;
                        C c12 = (C) aVarA.d(c1536l0, 21, C.a.f48435a, c10);
                        i11 |= 2097152;
                        r rVar23 = r.f47939a;
                        c10 = c12;
                        c2830i2 = c2830i2;
                        num = num;
                        str = str;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 22:
                        String str15 = (String) aVarA.d(c1536l0, 22, y0.f22677a, str);
                        i11 |= 4194304;
                        r rVar24 = r.f47939a;
                        str5 = str5;
                        bool5 = bool5;
                        c2830i2 = c2830i2;
                        num = num;
                        y yVar5 = yVar;
                        str = str15;
                        c2830i = c2830i;
                        z10 = z10;
                        yVar = yVar5;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 23:
                        c2830i2 = c2830i2;
                        Boolean bool19 = (Boolean) aVarA.d(c1536l0, 23, C1527h.f22612a, bool4);
                        i11 |= 8388608;
                        r rVar25 = r.f47939a;
                        bool4 = bool19;
                        c2830i2 = c2830i2;
                        num = num;
                        str = str;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 24:
                        c2830i2 = c2830i2;
                        Boolean bool20 = (Boolean) aVarA.d(c1536l0, 24, C1527h.f22612a, bool3);
                        i11 |= 16777216;
                        r rVar26 = r.f47939a;
                        bool3 = bool20;
                        c2830i2 = c2830i2;
                        num = num;
                        str = str;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 25:
                        bool = (Boolean) aVarA.d(c1536l0, 25, C1527h.f22612a, bool);
                        i10 = 33554432;
                        i11 |= i10;
                        r rVar27 = r.f47939a;
                        c2830i2 = c2830i2;
                        num = num;
                        str = str;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 26:
                        bool2 = (Boolean) aVarA.d(c1536l0, 26, C1527h.f22612a, bool2);
                        i10 = 67108864;
                        i11 |= i10;
                        r rVar28 = r.f47939a;
                        c2830i2 = c2830i2;
                        num = num;
                        str = str;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 27:
                        b10 = (B) aVarA.d(c1536l0, 27, B.a.f48432a, b10);
                        i10 = 134217728;
                        i11 |= i10;
                        r rVar29 = r.f47939a;
                        c2830i2 = c2830i2;
                        num = num;
                        str = str;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 28:
                        c2830i2 = c2830i2;
                        B b16 = (B) aVarA.d(c1536l0, 28, B.a.f48432a, b11);
                        i11 |= 268435456;
                        r rVar30 = r.f47939a;
                        b11 = b16;
                        c2830i2 = c2830i2;
                        num = num;
                        str = str;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case 29:
                        c2830i2 = c2830i2;
                        C2822a c2822a4 = (C2822a) aVarA.d(c1536l0, 29, C2822a.C0559a.f48545a, c2822a);
                        i11 |= 536870912;
                        r rVar31 = r.f47939a;
                        c2822a = c2822a4;
                        c2830i2 = c2830i2;
                        num = num;
                        str = str;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        String strJ4 = aVarA.j(c1536l0, 30);
                        i11 |= 1073741824;
                        r rVar32 = r.f47939a;
                        str8 = strJ4;
                        num = num;
                        str = str;
                        str5 = str5;
                        num = num;
                        str = str;
                        yVar = yVar;
                        z10 = z10;
                        bool5 = bool5;
                        break;
                    default:
                        throw new UnknownFieldException(iO);
                }
            }
            Boolean bool21 = bool;
            Boolean bool22 = bool2;
            B b17 = b10;
            Boolean bool23 = bool3;
            B b18 = b11;
            C2822a c2822a5 = c2822a;
            Boolean bool24 = bool4;
            C c13 = c10;
            C2830i c2830i6 = c2830i2;
            Integer num15 = num3;
            List list6 = list;
            y yVar6 = yVar;
            C2830i c2830i7 = c2830i;
            String str16 = str4;
            aVarA.c(c1536l0);
            return new I(i11, strJ, str16, str3, str2, str5, str6, iH, num2, bool5, str7, num15, list6, list2, num4, num5, num6, yVar6, c2830i7, c2830i6, num, aVar, c13, str, bool24, bool23, bool21, bool22, b17, b18, c2822a5, str8);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            I value = (I) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48495a);
            boolean zV = bVarA.v(c1536l0);
            String str = value.f48496b;
            if (zV || str != null) {
                bVarA.q(c1536l0, 1, y0.f22677a, str);
            }
            boolean zV2 = bVarA.v(c1536l0);
            String str2 = value.f48497c;
            if (zV2 || !i.a(str2, "")) {
                bVarA.p(c1536l0, 2, str2);
            }
            bVarA.p(c1536l0, 3, value.f48498d);
            boolean zV3 = bVarA.v(c1536l0);
            String str3 = value.f48499e;
            if (zV3 || str3 != null) {
                bVarA.q(c1536l0, 4, y0.f22677a, str3);
            }
            boolean zV4 = bVarA.v(c1536l0);
            String str4 = value.f48500f;
            if (zV4 || str4 != null) {
                bVarA.q(c1536l0, 5, y0.f22677a, str4);
            }
            bVarA.g(6, value.f48501g, c1536l0);
            boolean zV5 = bVarA.v(c1536l0);
            Integer num = value.f48502h;
            if (zV5 || num != null) {
                bVarA.q(c1536l0, 7, p037cb.I.f22555a, num);
            }
            boolean zV6 = bVarA.v(c1536l0);
            Boolean bool = value.f48503i;
            if (zV6 || bool != null) {
                bVarA.q(c1536l0, 8, C1527h.f22612a, bool);
            }
            boolean zV7 = bVarA.v(c1536l0);
            String str5 = value.j;
            if (zV7 || str5 != null) {
                bVarA.q(c1536l0, 9, y0.f22677a, str5);
            }
            boolean zV8 = bVarA.v(c1536l0);
            Integer num2 = value.f48504k;
            if (zV8 || num2 != null) {
                bVarA.q(c1536l0, 10, p037cb.I.f22555a, num2);
            }
            boolean zV9 = bVarA.v(c1536l0);
            Ya.b<Object>[] bVarArr = I.f48489F;
            List<C2833l> list = value.f48505l;
            if (zV9 || list != null) {
                bVarA.q(c1536l0, 11, bVarArr[11], list);
            }
            boolean zV10 = bVarA.v(c1536l0);
            List<String> list2 = value.f48506m;
            if (zV10 || list2 != null) {
                bVarA.q(c1536l0, 12, bVarArr[12], list2);
            }
            boolean zV11 = bVarA.v(c1536l0);
            Integer num3 = value.f48507n;
            if (zV11 || num3 != null) {
                bVarA.q(c1536l0, 13, p037cb.I.f22555a, num3);
            }
            boolean zV12 = bVarA.v(c1536l0);
            Integer num4 = value.f48508o;
            if (zV12 || num4 != null) {
                bVarA.q(c1536l0, 14, p037cb.I.f22555a, num4);
            }
            boolean zV13 = bVarA.v(c1536l0);
            Integer num5 = value.f48509p;
            if (zV13 || num5 != null) {
                bVarA.q(c1536l0, 15, p037cb.I.f22555a, num5);
            }
            boolean zV14 = bVarA.v(c1536l0);
            y yVar = value.f48510q;
            if (zV14 || yVar != null) {
                bVarA.q(c1536l0, 16, y.a.f48669a, yVar);
            }
            boolean zV15 = bVarA.v(c1536l0);
            C2830i c2830i = value.f48511r;
            if (zV15 || c2830i != null) {
                bVarA.q(c1536l0, 17, C2830i.a.f48584a, c2830i);
            }
            boolean zV16 = bVarA.v(c1536l0);
            C2830i c2830i2 = value.f48512s;
            if (zV16 || c2830i2 != null) {
                bVarA.q(c1536l0, 18, C2830i.a.f48584a, c2830i2);
            }
            boolean zV17 = bVarA.v(c1536l0);
            Integer num6 = value.f48513t;
            if (zV17 || num6 != null) {
                bVarA.q(c1536l0, 19, p037cb.I.f22555a, num6);
            }
            boolean zV18 = bVarA.v(c1536l0);
            p292x9.a aVar = value.f48514u;
            if (zV18 || aVar != null) {
                bVarA.q(c1536l0, 20, p292x9.a.C0551a.f47914a, aVar);
            }
            boolean zV19 = bVarA.v(c1536l0);
            C c10 = value.f48515v;
            if (zV19 || c10 != null) {
                bVarA.q(c1536l0, 21, C.a.f48435a, c10);
            }
            boolean zV20 = bVarA.v(c1536l0);
            String str6 = value.f48516w;
            if (zV20 || str6 != null) {
                bVarA.q(c1536l0, 22, y0.f22677a, str6);
            }
            boolean zV21 = bVarA.v(c1536l0);
            Boolean bool2 = value.f48517x;
            if (zV21 || bool2 != null) {
                bVarA.q(c1536l0, 23, C1527h.f22612a, bool2);
            }
            boolean zV22 = bVarA.v(c1536l0);
            Boolean bool3 = value.f48518y;
            if (zV22 || bool3 != null) {
                bVarA.q(c1536l0, 24, C1527h.f22612a, bool3);
            }
            boolean zV23 = bVarA.v(c1536l0);
            Boolean bool4 = value.f48519z;
            if (zV23 || bool4 != null) {
                bVarA.q(c1536l0, 25, C1527h.f22612a, bool4);
            }
            boolean zV24 = bVarA.v(c1536l0);
            Boolean bool5 = value.f48490A;
            if (zV24 || bool5 != null) {
                bVarA.q(c1536l0, 26, C1527h.f22612a, bool5);
            }
            boolean zV25 = bVarA.v(c1536l0);
            B b10 = value.f48491B;
            if (zV25 || b10 != null) {
                bVarA.q(c1536l0, 27, B.a.f48432a, b10);
            }
            boolean zV26 = bVarA.v(c1536l0);
            B b11 = value.f48492C;
            if (zV26 || b11 != null) {
                bVarA.q(c1536l0, 28, B.a.f48432a, b11);
            }
            boolean zV27 = bVarA.v(c1536l0);
            C2822a c2822a = value.f48493D;
            if (zV27 || c2822a != null) {
                bVarA.q(c1536l0, 29, C2822a.C0559a.f48545a, c2822a);
            }
            bVarA.p(c1536l0, 30, value.f48494E);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: UserDTO.kt */
    public static final class b {
        public final Ya.b<I> serializer() {
            return a.f48520a;
        }
    }

    @d
    public /* synthetic */ I(int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, Integer num, Boolean bool, String str7, Integer num2, List list, List list2, Integer num3, Integer num4, Integer num5, y yVar, C2830i c2830i, C2830i c2830i2, Integer num6, p292x9.a aVar, C c10, String str8, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, B b10, B b11, C2822a c2822a, String str9) {
        if (1073741897 != (i10 & 1073741897)) {
            p241t7.b.w(i10, 1073741897, a.f48520a.getDescriptor());
            throw null;
        }
        this.f48495a = str;
        if ((i10 & 2) == 0) {
            this.f48496b = null;
        } else {
            this.f48496b = str2;
        }
        this.f48497c = (i10 & 4) == 0 ? "" : str3;
        this.f48498d = str4;
        if ((i10 & 16) == 0) {
            this.f48499e = null;
        } else {
            this.f48499e = str5;
        }
        if ((i10 & 32) == 0) {
            this.f48500f = null;
        } else {
            this.f48500f = str6;
        }
        this.f48501g = i11;
        if ((i10 & 128) == 0) {
            this.f48502h = null;
        } else {
            this.f48502h = num;
        }
        if ((i10 & 256) == 0) {
            this.f48503i = null;
        } else {
            this.f48503i = bool;
        }
        if ((i10 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str7;
        }
        if ((i10 & 1024) == 0) {
            this.f48504k = null;
        } else {
            this.f48504k = num2;
        }
        if ((i10 & 2048) == 0) {
            this.f48505l = null;
        } else {
            this.f48505l = list;
        }
        if ((i10 & 4096) == 0) {
            this.f48506m = null;
        } else {
            this.f48506m = list2;
        }
        if ((i10 & 8192) == 0) {
            this.f48507n = null;
        } else {
            this.f48507n = num3;
        }
        if ((i10 & 16384) == 0) {
            this.f48508o = null;
        } else {
            this.f48508o = num4;
        }
        if ((32768 & i10) == 0) {
            this.f48509p = null;
        } else {
            this.f48509p = num5;
        }
        if ((65536 & i10) == 0) {
            this.f48510q = null;
        } else {
            this.f48510q = yVar;
        }
        if ((131072 & i10) == 0) {
            this.f48511r = null;
        } else {
            this.f48511r = c2830i;
        }
        if ((262144 & i10) == 0) {
            this.f48512s = null;
        } else {
            this.f48512s = c2830i2;
        }
        if ((524288 & i10) == 0) {
            this.f48513t = null;
        } else {
            this.f48513t = num6;
        }
        if ((1048576 & i10) == 0) {
            this.f48514u = null;
        } else {
            this.f48514u = aVar;
        }
        if ((2097152 & i10) == 0) {
            this.f48515v = null;
        } else {
            this.f48515v = c10;
        }
        if ((4194304 & i10) == 0) {
            this.f48516w = null;
        } else {
            this.f48516w = str8;
        }
        if ((8388608 & i10) == 0) {
            this.f48517x = null;
        } else {
            this.f48517x = bool2;
        }
        if ((16777216 & i10) == 0) {
            this.f48518y = null;
        } else {
            this.f48518y = bool3;
        }
        if ((33554432 & i10) == 0) {
            this.f48519z = null;
        } else {
            this.f48519z = bool4;
        }
        if ((67108864 & i10) == 0) {
            this.f48490A = null;
        } else {
            this.f48490A = bool5;
        }
        if ((134217728 & i10) == 0) {
            this.f48491B = null;
        } else {
            this.f48491B = b10;
        }
        if ((268435456 & i10) == 0) {
            this.f48492C = null;
        } else {
            this.f48492C = b11;
        }
        if ((i10 & 536870912) == 0) {
            this.f48493D = null;
        } else {
            this.f48493D = c2822a;
        }
        this.f48494E = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return i.a(this.f48495a, i10.f48495a) && i.a(this.f48496b, i10.f48496b) && i.a(this.f48497c, i10.f48497c) && i.a(this.f48498d, i10.f48498d) && i.a(this.f48499e, i10.f48499e) && i.a(this.f48500f, i10.f48500f) && this.f48501g == i10.f48501g && i.a(this.f48502h, i10.f48502h) && i.a(this.f48503i, i10.f48503i) && i.a(this.j, i10.j) && i.a(this.f48504k, i10.f48504k) && i.a(this.f48505l, i10.f48505l) && i.a(this.f48506m, i10.f48506m) && i.a(this.f48507n, i10.f48507n) && i.a(this.f48508o, i10.f48508o) && i.a(this.f48509p, i10.f48509p) && i.a(this.f48510q, i10.f48510q) && i.a(this.f48511r, i10.f48511r) && i.a(this.f48512s, i10.f48512s) && i.a(this.f48513t, i10.f48513t) && i.a(this.f48514u, i10.f48514u) && i.a(this.f48515v, i10.f48515v) && i.a(this.f48516w, i10.f48516w) && i.a(this.f48517x, i10.f48517x) && i.a(this.f48518y, i10.f48518y) && i.a(this.f48519z, i10.f48519z) && i.a(this.f48490A, i10.f48490A) && i.a(this.f48491B, i10.f48491B) && i.a(this.f48492C, i10.f48492C) && i.a(this.f48493D, i10.f48493D) && i.a(this.f48494E, i10.f48494E);
    }

    public final int hashCode() {
        int iHashCode = this.f48495a.hashCode() * 31;
        String str = this.f48496b;
        int iB = B1.a.b(this.f48498d, B1.a.b(this.f48497c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.f48499e;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f48500f;
        int iB2 = q.b(this.f48501g, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Integer num = this.f48502h;
        int iHashCode3 = (iB2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f48503i;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.j;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f48504k;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<C2833l> list = this.f48505l;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f48506m;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num3 = this.f48507n;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f48508o;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f48509p;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        y yVar = this.f48510q;
        int iHashCode12 = (iHashCode11 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        C2830i c2830i = this.f48511r;
        int iHashCode13 = (iHashCode12 + (c2830i == null ? 0 : c2830i.hashCode())) * 31;
        C2830i c2830i2 = this.f48512s;
        int iHashCode14 = (iHashCode13 + (c2830i2 == null ? 0 : c2830i2.hashCode())) * 31;
        Integer num6 = this.f48513t;
        int iHashCode15 = (iHashCode14 + (num6 == null ? 0 : num6.hashCode())) * 31;
        p292x9.a aVar = this.f48514u;
        int iHashCode16 = (iHashCode15 + (aVar == null ? 0 : aVar.f47913a.hashCode())) * 31;
        C c10 = this.f48515v;
        int iHashCode17 = (iHashCode16 + (c10 == null ? 0 : c10.hashCode())) * 31;
        String str5 = this.f48516w;
        int iHashCode18 = (iHashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.f48517x;
        int iHashCode19 = (iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f48518y;
        int iHashCode20 = (iHashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f48519z;
        int iHashCode21 = (iHashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f48490A;
        int iHashCode22 = (iHashCode21 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        B b10 = this.f48491B;
        int iHashCode23 = (iHashCode22 + (b10 == null ? 0 : b10.hashCode())) * 31;
        B b11 = this.f48492C;
        int iHashCode24 = (iHashCode23 + (b11 == null ? 0 : b11.hashCode())) * 31;
        C2822a c2822a = this.f48493D;
        return this.f48494E.hashCode() + ((iHashCode24 + (c2822a != null ? c2822a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserDTO(id=");
        sb2.append(this.f48495a);
        sb2.append(", account=");
        sb2.append(this.f48496b);
        sb2.append(", username=");
        sb2.append(this.f48497c);
        sb2.append(", createdAt=");
        sb2.append(this.f48498d);
        sb2.append(", updatedAt=");
        sb2.append(this.f48499e);
        sb2.append(", name=");
        sb2.append(this.f48500f);
        sb2.append(", credits=");
        sb2.append(this.f48501g);
        sb2.append(", appVersion=");
        sb2.append(this.f48502h);
        sb2.append(", pro=");
        sb2.append(this.f48503i);
        sb2.append(", userEmail=");
        sb2.append(this.j);
        sb2.append(", role=");
        sb2.append(this.f48504k);
        sb2.append(", devices=");
        sb2.append(this.f48505l);
        sb2.append(", roles=");
        sb2.append(this.f48506m);
        sb2.append(", spentCredits=");
        sb2.append(this.f48507n);
        sb2.append(", gotFreeCredits=");
        sb2.append(this.f48508o);
        sb2.append(", purchasedCredits=");
        sb2.append(this.f48509p);
        sb2.append(", picture=");
        sb2.append(this.f48510q);
        sb2.append(", agreementSigned=");
        sb2.append(this.f48511r);
        sb2.append(", bonusTime=");
        sb2.append(this.f48512s);
        sb2.append(", adsWatched=");
        sb2.append(this.f48513t);
        sb2.append(", countryCode=");
        sb2.append(this.f48514u);
        sb2.append(", settings=");
        sb2.append(this.f48515v);
        sb2.append(", email=");
        sb2.append(this.f48516w);
        sb2.append(", emailVerified=");
        sb2.append(this.f48517x);
        sb2.append(", allowResetPassword=");
        sb2.append(this.f48518y);
        sb2.append(", reportEnabled=");
        sb2.append(this.f48519z);
        sb2.append(", is2FAEnabled=");
        sb2.append(this.f48490A);
        sb2.append(", vehicles=");
        sb2.append(this.f48491B);
        sb2.append(", userRoles=");
        sb2.append(this.f48492C);
        sb2.append(", acl=");
        sb2.append(this.f48493D);
        sb2.append(", sessionToken=");
        return Q8.d.a(sb2, this.f48494E, ")");
    }
}
