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

/* JADX INFO: compiled from: OcaAndVehicleBaseIdsDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class r {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48617b;

    /* JADX INFO: compiled from: OcaAndVehicleBaseIdsDTO.kt */
    @d
    public static final class a implements D<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48618a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48618a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.OcaAndVehicleBaseIdsDTO", aVar, 2);
            c1536l0.k("ocaId", false);
            c1536l0.k("vehicleBaseId", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
            boolean z10 = true;
            String strJ2 = null;
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
                    strJ2 = aVarA.j(c1536l0, 1);
                    i10 |= 2;
                }
            }
            aVarA.c(c1536l0);
            return new r(i10, strJ, strJ2);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            r value = (r) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48616a);
            bVarA.p(c1536l0, 1, value.f48617b);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: OcaAndVehicleBaseIdsDTO.kt */
    public static final class b {
        public final Ya.b<r> serializer() {
            return a.f48618a;
        }
    }

    @d
    public /* synthetic */ r(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            p241t7.b.w(i10, 3, a.f48618a.getDescriptor());
            throw null;
        }
        this.f48616a = str;
        this.f48617b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return i.a(this.f48616a, rVar.f48616a) && i.a(this.f48617b, rVar.f48617b);
    }

    public final int hashCode() {
        return this.f48617b.hashCode() + (this.f48616a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OcaAndVehicleBaseIdsDTO(ocaId=");
        sb2.append(this.f48616a);
        sb2.append(", vehicleBaseId=");
        return Q8.d.a(sb2, this.f48617b, ")");
    }

    public r(String ocaId, String vehicleBaseId) {
        i.e(ocaId, "ocaId");
        i.e(vehicleBaseId, "vehicleBaseId");
        this.f48616a = ocaId;
        this.f48617b = vehicleBaseId;
    }
}
