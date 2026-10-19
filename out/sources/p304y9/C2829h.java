package p304y9;

import Ya.k;
import com.braze.Constants;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p005a4.q;
import p011ab.e;
import p024bb.c;
import p037cb.C1527h;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.I;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: renamed from: y9.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CreditProductDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class C2829h {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f48579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f48580h;

    /* JADX INFO: renamed from: y9.h$a */
    /* JADX INFO: compiled from: CreditProductDTO.kt */
    @d
    public static final class a implements D<C2829h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48581a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48581a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.CreditProductDTO", aVar, 8);
            c1536l0.k("objectId", false);
            c1536l0.k("androidProductId", false);
            c1536l0.k("iosProductId", false);
            c1536l0.k("isDefault", false);
            c1536l0.k("title", false);
            c1536l0.k("type", false);
            c1536l0.k("creditsAmount", true);
            c1536l0.k(Constants.BRAZE_WEBVIEW_URL_EXTRA, true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var, y0Var, C1527h.f22612a, y0Var, y0Var, I.f22555a, y0Var};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            int i10 = 0;
            boolean zL = false;
            int iH = 0;
            String strJ = null;
            String strJ2 = null;
            String strJ3 = null;
            String strJ4 = null;
            String strJ5 = null;
            String strJ6 = null;
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
                        strJ2 = aVarA.j(c1536l0, 1);
                        i10 |= 2;
                        break;
                    case 2:
                        strJ3 = aVarA.j(c1536l0, 2);
                        i10 |= 4;
                        break;
                    case 3:
                        zL = aVarA.l(c1536l0, 3);
                        i10 |= 8;
                        break;
                    case 4:
                        strJ4 = aVarA.j(c1536l0, 4);
                        i10 |= 16;
                        break;
                    case 5:
                        strJ5 = aVarA.j(c1536l0, 5);
                        i10 |= 32;
                        break;
                    case 6:
                        iH = aVarA.h(c1536l0, 6);
                        i10 |= 64;
                        break;
                    case 7:
                        strJ6 = aVarA.j(c1536l0, 7);
                        i10 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iO);
                }
            }
            aVarA.c(c1536l0);
            return new C2829h(i10, strJ, strJ2, strJ3, zL, strJ4, strJ5, iH, strJ6);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            C2829h value = (C2829h) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48573a);
            bVarA.p(c1536l0, 1, value.f48574b);
            bVarA.p(c1536l0, 2, value.f48575c);
            bVarA.e(c1536l0, 3, value.f48576d);
            bVarA.p(c1536l0, 4, value.f48577e);
            bVarA.p(c1536l0, 5, value.f48578f);
            boolean zV = bVarA.v(c1536l0);
            int i10 = value.f48579g;
            if (zV || i10 != 0) {
                bVarA.g(6, i10, c1536l0);
            }
            boolean zV2 = bVarA.v(c1536l0);
            String str = value.f48580h;
            if (zV2 || !i.a(str, "")) {
                bVarA.p(c1536l0, 7, str);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: renamed from: y9.h$b */
    /* JADX INFO: compiled from: CreditProductDTO.kt */
    public static final class b {
        public final Ya.b<C2829h> serializer() {
            return a.f48581a;
        }
    }

    @d
    public /* synthetic */ C2829h(int i10, String str, String str2, String str3, boolean z10, String str4, String str5, int i11, String str6) {
        if (63 != (i10 & 63)) {
            p241t7.b.w(i10, 63, a.f48581a.getDescriptor());
            throw null;
        }
        this.f48573a = str;
        this.f48574b = str2;
        this.f48575c = str3;
        this.f48576d = z10;
        this.f48577e = str4;
        this.f48578f = str5;
        if ((i10 & 64) == 0) {
            this.f48579g = 0;
        } else {
            this.f48579g = i11;
        }
        if ((i10 & 128) == 0) {
            this.f48580h = "";
        } else {
            this.f48580h = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2829h)) {
            return false;
        }
        C2829h c2829h = (C2829h) obj;
        return i.a(this.f48573a, c2829h.f48573a) && i.a(this.f48574b, c2829h.f48574b) && i.a(this.f48575c, c2829h.f48575c) && this.f48576d == c2829h.f48576d && i.a(this.f48577e, c2829h.f48577e) && i.a(this.f48578f, c2829h.f48578f) && this.f48579g == c2829h.f48579g && i.a(this.f48580h, c2829h.f48580h);
    }

    public final int hashCode() {
        return this.f48580h.hashCode() + q.b(this.f48579g, B1.a.b(this.f48578f, B1.a.b(this.f48577e, androidx.compose.animation.D.b(B1.a.b(this.f48575c, B1.a.b(this.f48574b, this.f48573a.hashCode() * 31, 31), 31), 31, this.f48576d), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreditProductDTO(objectId=");
        sb2.append(this.f48573a);
        sb2.append(", androidProductId=");
        sb2.append(this.f48574b);
        sb2.append(", iosProductId=");
        sb2.append(this.f48575c);
        sb2.append(", isDefault=");
        sb2.append(this.f48576d);
        sb2.append(", title=");
        sb2.append(this.f48577e);
        sb2.append(", type=");
        sb2.append(this.f48578f);
        sb2.append(", creditsAmount=");
        sb2.append(this.f48579g);
        sb2.append(", url=");
        return Q8.d.a(sb2, this.f48580h, ")");
    }
}
