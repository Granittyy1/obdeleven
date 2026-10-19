package p304y9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1527h;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.I;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: OcaAgreementResultDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class q {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48614c;

    /* JADX INFO: compiled from: OcaAgreementResultDTO.kt */
    @d
    public static final class a implements D<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48615a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48615a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.OcaAgreementResultDTO", aVar, 3);
            c1536l0.k("type", false);
            c1536l0.k("isAgreementSigned", false);
            c1536l0.k("agreementUrl", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{I.f22555a, C1527h.f22612a, y0.f22677a};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
            boolean z10 = true;
            int i10 = 0;
            int iH = 0;
            boolean zL = false;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    iH = aVarA.h(c1536l0, 0);
                    i10 |= 1;
                } else if (iO == 1) {
                    zL = aVarA.l(c1536l0, 1);
                    i10 |= 2;
                } else {
                    if (iO != 2) {
                        throw new UnknownFieldException(iO);
                    }
                    strJ = aVarA.j(c1536l0, 2);
                    i10 |= 4;
                }
            }
            aVarA.c(c1536l0);
            return new q(i10, iH, strJ, zL);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            q value = (q) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.g(0, value.f48612a, c1536l0);
            bVarA.e(c1536l0, 1, value.f48613b);
            bVarA.p(c1536l0, 2, value.f48614c);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: OcaAgreementResultDTO.kt */
    public static final class b {
        public final Ya.b<q> serializer() {
            return a.f48615a;
        }
    }

    @d
    public /* synthetic */ q(int i10, int i11, String str, boolean z10) {
        if (7 != (i10 & 7)) {
            p241t7.b.w(i10, 7, a.f48615a.getDescriptor());
            throw null;
        }
        this.f48612a = i11;
        this.f48613b = z10;
        this.f48614c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f48612a == qVar.f48612a && this.f48613b == qVar.f48613b && i.a(this.f48614c, qVar.f48614c);
    }

    public final int hashCode() {
        return this.f48614c.hashCode() + androidx.compose.animation.D.b(Integer.hashCode(this.f48612a) * 31, 31, this.f48613b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OcaAgreementResultDTO(type=");
        sb2.append(this.f48612a);
        sb2.append(", isAgreementSigned=");
        sb2.append(this.f48613b);
        sb2.append(", agreementUrl=");
        return Q8.d.a(sb2, this.f48614c, ")");
    }
}
