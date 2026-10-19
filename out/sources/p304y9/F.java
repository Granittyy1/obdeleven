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

/* JADX INFO: compiled from: SubscriptionProductDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class F {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H f48451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f48454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f48455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f48456i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f48457k;

    /* JADX INFO: compiled from: SubscriptionProductDTO.kt */
    @d
    public static final class a implements D<F> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48458a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48458a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.SubscriptionProductDTO", aVar, 11);
            c1536l0.k("objectId", false);
            c1536l0.k("subscriptionType", false);
            c1536l0.k("actionType", false);
            c1536l0.k("translations", false);
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
            return new Ya.b[]{y0Var, y0Var, y0Var, H.a.f48488a, y0Var, y0Var, C1527h.f22612a, y0Var, y0Var, I.f22555a, y0Var};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
            String strJ2 = null;
            String strJ3 = null;
            H h8 = null;
            String strJ4 = null;
            String strJ5 = null;
            String strJ6 = null;
            String strJ7 = null;
            String strJ8 = null;
            int i10 = 0;
            boolean zL = false;
            int iH = 0;
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
                        h8 = (H) aVarA.e(c1536l0, 3, H.a.f48488a, h8);
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
                        zL = aVarA.l(c1536l0, 6);
                        i10 |= 64;
                        break;
                    case 7:
                        strJ6 = aVarA.j(c1536l0, 7);
                        i10 |= 128;
                        break;
                    case 8:
                        strJ7 = aVarA.j(c1536l0, 8);
                        i10 |= 256;
                        break;
                    case 9:
                        iH = aVarA.h(c1536l0, 9);
                        i10 |= 512;
                        break;
                    case 10:
                        strJ8 = aVarA.j(c1536l0, 10);
                        i10 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iO);
                }
            }
            aVarA.c(c1536l0);
            return new F(i10, strJ, strJ2, strJ3, h8, strJ4, strJ5, zL, strJ6, strJ7, iH, strJ8);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            F value = (F) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48448a);
            bVarA.p(c1536l0, 1, value.f48449b);
            bVarA.p(c1536l0, 2, value.f48450c);
            bVarA.s(c1536l0, 3, H.a.f48488a, value.f48451d);
            bVarA.p(c1536l0, 4, value.f48452e);
            bVarA.p(c1536l0, 5, value.f48453f);
            bVarA.e(c1536l0, 6, value.f48454g);
            bVarA.p(c1536l0, 7, value.f48455h);
            bVarA.p(c1536l0, 8, value.f48456i);
            boolean zV = bVarA.v(c1536l0);
            int i10 = value.j;
            if (zV || i10 != 0) {
                bVarA.g(9, i10, c1536l0);
            }
            boolean zV2 = bVarA.v(c1536l0);
            String str = value.f48457k;
            if (zV2 || !i.a(str, "")) {
                bVarA.p(c1536l0, 10, str);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: SubscriptionProductDTO.kt */
    public static final class b {
        public final Ya.b<F> serializer() {
            return a.f48458a;
        }
    }

    @d
    public /* synthetic */ F(int i10, String str, String str2, String str3, H h8, String str4, String str5, boolean z10, String str6, String str7, int i11, String str8) {
        if (511 != (i10 & 511)) {
            p241t7.b.w(i10, 511, a.f48458a.getDescriptor());
            throw null;
        }
        this.f48448a = str;
        this.f48449b = str2;
        this.f48450c = str3;
        this.f48451d = h8;
        this.f48452e = str4;
        this.f48453f = str5;
        this.f48454g = z10;
        this.f48455h = str6;
        this.f48456i = str7;
        if ((i10 & 512) == 0) {
            this.j = 0;
        } else {
            this.j = i11;
        }
        if ((i10 & 1024) == 0) {
            this.f48457k = "";
        } else {
            this.f48457k = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return i.a(this.f48448a, f10.f48448a) && i.a(this.f48449b, f10.f48449b) && i.a(this.f48450c, f10.f48450c) && i.a(this.f48451d, f10.f48451d) && i.a(this.f48452e, f10.f48452e) && i.a(this.f48453f, f10.f48453f) && this.f48454g == f10.f48454g && i.a(this.f48455h, f10.f48455h) && i.a(this.f48456i, f10.f48456i) && this.j == f10.j && i.a(this.f48457k, f10.f48457k);
    }

    public final int hashCode() {
        return this.f48457k.hashCode() + q.b(this.j, B1.a.b(this.f48456i, B1.a.b(this.f48455h, androidx.compose.animation.D.b(B1.a.b(this.f48453f, B1.a.b(this.f48452e, (this.f48451d.hashCode() + B1.a.b(this.f48450c, B1.a.b(this.f48449b, this.f48448a.hashCode() * 31, 31), 31)) * 31, 31), 31), 31, this.f48454g), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubscriptionProductDTO(objectId=");
        sb2.append(this.f48448a);
        sb2.append(", subscriptionType=");
        sb2.append(this.f48449b);
        sb2.append(", actionType=");
        sb2.append(this.f48450c);
        sb2.append(", translations=");
        sb2.append(this.f48451d);
        sb2.append(", androidProductId=");
        sb2.append(this.f48452e);
        sb2.append(", iosProductId=");
        sb2.append(this.f48453f);
        sb2.append(", isDefault=");
        sb2.append(this.f48454g);
        sb2.append(", title=");
        sb2.append(this.f48455h);
        sb2.append(", type=");
        sb2.append(this.f48456i);
        sb2.append(", creditsAmount=");
        sb2.append(this.j);
        sb2.append(", url=");
        return Q8.d.a(sb2, this.f48457k, ")");
    }
}
