package p304y9;

import Ya.k;
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

/* JADX INFO: compiled from: VehicleDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class L {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Ya.b<Object>[] f48540c = {null, new C1521e(y0.f22677a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f48542b;

    /* JADX INFO: compiled from: VehicleDTO.kt */
    @d
    public static final class a implements D<L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48543a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48543a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.VehicleDTO", aVar, 2);
            c1536l0.k("objectId", false);
            c1536l0.k("backupFunctions", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{y0.f22677a, Za.a.c(L.f48540c[1])};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Ya.b<Object>[] bVarArr = L.f48540c;
            String strJ = null;
            boolean z10 = true;
            List list = null;
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
                    list = (List) aVarA.d(c1536l0, 1, bVarArr[1], list);
                    i10 |= 2;
                }
            }
            aVarA.c(c1536l0);
            return new L(i10, strJ, list);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            L value = (L) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48541a);
            boolean zV = bVarA.v(c1536l0);
            List<String> list = value.f48542b;
            if (zV || list != null) {
                bVarA.q(c1536l0, 1, L.f48540c[1], list);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: VehicleDTO.kt */
    public static final class b {
        public final Ya.b<L> serializer() {
            return a.f48543a;
        }
    }

    @d
    public /* synthetic */ L(int i10, String str, List list) {
        if (1 != (i10 & 1)) {
            p241t7.b.w(i10, 1, a.f48543a.getDescriptor());
            throw null;
        }
        this.f48541a = str;
        if ((i10 & 2) == 0) {
            this.f48542b = null;
        } else {
            this.f48542b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return i.a(this.f48541a, l10.f48541a) && i.a(this.f48542b, l10.f48542b);
    }

    public final int hashCode() {
        int iHashCode = this.f48541a.hashCode() * 31;
        List<String> list = this.f48542b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "VehicleDTO(id=" + this.f48541a + ", backupFunctions=" + this.f48542b + ")";
    }

    public L(String id, List<String> list) {
        i.e(id, "id");
        this.f48541a = id;
        this.f48542b = list;
    }
}
