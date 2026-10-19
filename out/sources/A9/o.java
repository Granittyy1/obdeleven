package A9;

import kotlinx.serialization.UnknownFieldException;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;
import p304y9.G;

/* JADX INFO: compiled from: UdsDtcDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class o {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f1028b;

    /* JADX INFO: compiled from: UdsDtcDTO.kt */
    @p293xa.d
    public static final class a implements D<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1029a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f1029a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.responses.UdsDtcDTO", aVar, 2);
            c1536l0.k("code", false);
            c1536l0.k("dCode", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{y0.f22677a, G.a.f48481a};
        }

        @Override // Ya.a
        public final Object deserialize(p024bb.c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
            boolean z10 = true;
            G g10 = null;
            int i10 = 0;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    strJ = aVarA.j(c1536l0, 0);
                    i10 |= 1;
                } else {
                    if (iO != 1) {
                        throw new UnknownFieldException(iO);
                    }
                    g10 = (G) aVarA.e(c1536l0, 1, G.a.f48481a, g10);
                    i10 |= 2;
                }
            }
            aVarA.c(c1536l0);
            return new o(i10, strJ, g10);
        }

        @Override // Ya.l, Ya.a
        public final p011ab.e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            o value = (o) obj;
            kotlin.jvm.internal.i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f1027a);
            bVarA.s(c1536l0, 1, G.a.f48481a, value.f1028b);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: UdsDtcDTO.kt */
    public static final class b {
        public final Ya.b<o> serializer() {
            return a.f1029a;
        }
    }

    @p293xa.d
    public /* synthetic */ o(int i10, String str, G g10) {
        if (3 != (i10 & 3)) {
            p241t7.b.w(i10, 3, a.f1029a.getDescriptor());
            throw null;
        }
        this.f1027a = str;
        this.f1028b = g10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.i.a(this.f1027a, oVar.f1027a) && kotlin.jvm.internal.i.a(this.f1028b, oVar.f1028b);
    }

    public final int hashCode() {
        return this.f1028b.hashCode() + (this.f1027a.hashCode() * 31);
    }

    public final String toString() {
        return "UdsDtcDTO(code=" + this.f1027a + ", dCode=" + this.f1028b + ")";
    }
}
