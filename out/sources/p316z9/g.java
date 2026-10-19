package p316z9;

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

/* JADX INFO: compiled from: FacebookDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class g {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48975c;

    /* JADX INFO: compiled from: FacebookDTO.kt */
    @d
    public static final class a implements D<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48976a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48976a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.FacebookDTO", aVar, 3);
            c1536l0.k("id", false);
            c1536l0.k("access_token", false);
            c1536l0.k("expiration_date", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var, y0Var};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
            boolean z10 = true;
            int i10 = 0;
            String strJ2 = null;
            String strJ3 = null;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    strJ = aVarA.j(c1536l0, 0);
                    i10 |= 1;
                } else if (iO == 1) {
                    strJ2 = aVarA.j(c1536l0, 1);
                    i10 |= 2;
                } else {
                    if (iO != 2) {
                        throw new UnknownFieldException(iO);
                    }
                    strJ3 = aVarA.j(c1536l0, 2);
                    i10 |= 4;
                }
            }
            aVarA.c(c1536l0);
            return new g(strJ, i10, strJ2, strJ3);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            g value = (g) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48973a);
            bVarA.p(c1536l0, 1, value.f48974b);
            bVarA.p(c1536l0, 2, value.f48975c);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: FacebookDTO.kt */
    public static final class b {
        public final Ya.b<g> serializer() {
            return a.f48976a;
        }
    }

    @d
    public /* synthetic */ g(String str, int i10, String str2, String str3) {
        if (7 != (i10 & 7)) {
            p241t7.b.w(i10, 7, a.f48976a.getDescriptor());
            throw null;
        }
        this.f48973a = str;
        this.f48974b = str2;
        this.f48975c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return i.a(this.f48973a, gVar.f48973a) && i.a(this.f48974b, gVar.f48974b) && i.a(this.f48975c, gVar.f48975c);
    }

    public final int hashCode() {
        return this.f48975c.hashCode() + B1.a.b(this.f48974b, this.f48973a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FacebookDTO(id=");
        sb2.append(this.f48973a);
        sb2.append(", accessToken=");
        sb2.append(this.f48974b);
        sb2.append(", expirationDate=");
        return Q8.d.a(sb2, this.f48975c, ")");
    }

    public g(String id, String accessToken, String expirationDate) {
        i.e(id, "id");
        i.e(accessToken, "accessToken");
        i.e(expirationDate, "expirationDate");
        this.f48973a = id;
        this.f48974b = accessToken;
        this.f48975c = expirationDate;
    }
}
