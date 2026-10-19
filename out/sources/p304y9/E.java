package p304y9;

import Ya.k;
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

/* JADX INFO: compiled from: ShadowCreditProductDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class E {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f48446g;

    /* JADX INFO: compiled from: ShadowCreditProductDTO.kt */
    @d
    public static final class a implements D<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48447a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48447a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.ShadowCreditProductDTO", aVar, 7);
            c1536l0.k("objectId", false);
            c1536l0.k("androidProductId", false);
            c1536l0.k("iosProductId", false);
            c1536l0.k("isDefault", false);
            c1536l0.k("title", false);
            c1536l0.k("type", false);
            c1536l0.k("creditsAmount", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var, y0Var, C1527h.f22612a, y0Var, y0Var, I.f22555a};
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
                    default:
                        throw new UnknownFieldException(iO);
                }
            }
            aVarA.c(c1536l0);
            return new E(i10, strJ, strJ2, strJ3, zL, strJ4, strJ5, iH);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            E value = (E) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48440a);
            bVarA.p(c1536l0, 1, value.f48441b);
            bVarA.p(c1536l0, 2, value.f48442c);
            bVarA.e(c1536l0, 3, value.f48443d);
            bVarA.p(c1536l0, 4, value.f48444e);
            bVarA.p(c1536l0, 5, value.f48445f);
            boolean zV = bVarA.v(c1536l0);
            int i10 = value.f48446g;
            if (zV || i10 != 0) {
                bVarA.g(6, i10, c1536l0);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: ShadowCreditProductDTO.kt */
    public static final class b {
        public final Ya.b<E> serializer() {
            return a.f48447a;
        }
    }

    @d
    public /* synthetic */ E(int i10, String str, String str2, String str3, boolean z10, String str4, String str5, int i11) {
        if (63 != (i10 & 63)) {
            p241t7.b.w(i10, 63, a.f48447a.getDescriptor());
            throw null;
        }
        this.f48440a = str;
        this.f48441b = str2;
        this.f48442c = str3;
        this.f48443d = z10;
        this.f48444e = str4;
        this.f48445f = str5;
        if ((i10 & 64) == 0) {
            this.f48446g = 0;
        } else {
            this.f48446g = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return i.a(this.f48440a, e10.f48440a) && i.a(this.f48441b, e10.f48441b) && i.a(this.f48442c, e10.f48442c) && this.f48443d == e10.f48443d && i.a(this.f48444e, e10.f48444e) && i.a(this.f48445f, e10.f48445f) && this.f48446g == e10.f48446g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48446g) + B1.a.b(this.f48445f, B1.a.b(this.f48444e, androidx.compose.animation.D.b(B1.a.b(this.f48442c, B1.a.b(this.f48441b, this.f48440a.hashCode() * 31, 31), 31), 31, this.f48443d), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowCreditProductDTO(objectId=");
        sb2.append(this.f48440a);
        sb2.append(", androidProductId=");
        sb2.append(this.f48441b);
        sb2.append(", iosProductId=");
        sb2.append(this.f48442c);
        sb2.append(", isDefault=");
        sb2.append(this.f48443d);
        sb2.append(", title=");
        sb2.append(this.f48444e);
        sb2.append(", type=");
        sb2.append(this.f48445f);
        sb2.append(", creditsAmount=");
        return q.c(sb2, this.f48446g, ")");
    }
}
