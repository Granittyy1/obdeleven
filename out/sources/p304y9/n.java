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
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: GetOcaListRequestDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class n {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48605b;

    /* JADX INFO: compiled from: GetOcaListRequestDTO.kt */
    @d
    public static final class a implements D<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48606a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48606a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.GetOcaListRequestDTO", aVar, 2);
            c1536l0.k("vehicleBaseId", false);
            c1536l0.k("includeTestApps", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{y0.f22677a, C1527h.f22612a};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
            boolean z10 = true;
            int i10 = 0;
            boolean zL = false;
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
                    zL = aVarA.l(c1536l0, 1);
                    i10 |= 2;
                }
            }
            aVarA.c(c1536l0);
            return new n(i10, strJ, zL);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            n value = (n) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48604a);
            bVarA.e(c1536l0, 1, value.f48605b);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: GetOcaListRequestDTO.kt */
    public static final class b {
        public final Ya.b<n> serializer() {
            return a.f48606a;
        }
    }

    @d
    public /* synthetic */ n(int i10, String str, boolean z10) {
        if (3 != (i10 & 3)) {
            p241t7.b.w(i10, 3, a.f48606a.getDescriptor());
            throw null;
        }
        this.f48604a = str;
        this.f48605b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return i.a(this.f48604a, nVar.f48604a) && this.f48605b == nVar.f48605b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48605b) + (this.f48604a.hashCode() * 31);
    }

    public final String toString() {
        return "GetOcaListRequestDTO(vehicleBaseId=" + this.f48604a + ", includeTestApps=" + this.f48605b + ")";
    }

    public n(String vehicleBaseId, boolean z10) {
        i.e(vehicleBaseId, "vehicleBaseId");
        this.f48604a = vehicleBaseId;
        this.f48605b = z10;
    }
}
