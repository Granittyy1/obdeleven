package p316z9;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1521e;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: OriginalAppValueRequestDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class k {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Ya.b<Object>[] f48987d = {null, null, new C1521e(l.a.f48994a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<l> f48990c;

    /* JADX INFO: compiled from: OriginalAppValueRequestDTO.kt */
    @d
    public static final class a implements D<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48991a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48991a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.OriginalAppValueRequestDTO", aVar, 3);
            c1536l0.k("ocaId", false);
            c1536l0.k("vehicleId", false);
            c1536l0.k("commands", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            Ya.b<?> bVar = k.f48987d[2];
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var, bVar};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Ya.b<Object>[] bVarArr = k.f48987d;
            String strJ = null;
            boolean z10 = true;
            String strJ2 = null;
            List list = null;
            int i10 = 0;
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
                    list = (List) aVarA.e(c1536l0, 2, bVarArr[2], list);
                    i10 |= 4;
                }
            }
            aVarA.c(c1536l0);
            return new k(i10, strJ, strJ2, list);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            k value = (k) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48988a);
            bVarA.p(c1536l0, 1, value.f48989b);
            bVarA.s(c1536l0, 2, k.f48987d[2], value.f48990c);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: OriginalAppValueRequestDTO.kt */
    public static final class b {
        public final Ya.b<k> serializer() {
            return a.f48991a;
        }
    }

    @d
    public /* synthetic */ k(int i10, String str, String str2, List list) {
        if (7 != (i10 & 7)) {
            p241t7.b.w(i10, 7, a.f48991a.getDescriptor());
            throw null;
        }
        this.f48988a = str;
        this.f48989b = str2;
        this.f48990c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return i.a(this.f48988a, kVar.f48988a) && i.a(this.f48989b, kVar.f48989b) && i.a(this.f48990c, kVar.f48990c);
    }

    public final int hashCode() {
        return this.f48990c.hashCode() + B1.a.b(this.f48989b, this.f48988a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "OriginalAppValueRequestDTO(ocaId=" + this.f48988a + ", vehicleId=" + this.f48989b + ", commands=" + this.f48990c + ")";
    }

    public k(String ocaId, String vehicleId, ArrayList arrayList) {
        i.e(ocaId, "ocaId");
        i.e(vehicleId, "vehicleId");
        this.f48988a = ocaId;
        this.f48989b = vehicleId;
        this.f48990c = arrayList;
    }
}
