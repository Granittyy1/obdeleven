package p316z9;

import Ya.k;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1521e;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: GetUdsFaultDescriptionsRequestDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class i {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Ya.b<Object>[] f48979c = {null, new C1521e(y0.f22677a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f48981b;

    /* JADX INFO: compiled from: GetUdsFaultDescriptionsRequestDTO.kt */
    @d
    public static final class a implements D<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48982a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48982a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.GetUdsFaultDescriptionsRequestDTO", aVar, 2);
            c1536l0.k("odxName", false);
            c1536l0.k("faults", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{y0.f22677a, i.f48979c[1]};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Ya.b<Object>[] bVarArr = i.f48979c;
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
                    list = (List) aVarA.e(c1536l0, 1, bVarArr[1], list);
                    i10 |= 2;
                }
            }
            aVarA.c(c1536l0);
            return new i(i10, strJ, list);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            i value = (i) obj;
            kotlin.jvm.internal.i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48980a);
            bVarA.s(c1536l0, 1, i.f48979c[1], value.f48981b);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: GetUdsFaultDescriptionsRequestDTO.kt */
    public static final class b {
        public final Ya.b<i> serializer() {
            return a.f48982a;
        }
    }

    @d
    public /* synthetic */ i(int i10, String str, List list) {
        if (3 != (i10 & 3)) {
            p241t7.b.w(i10, 3, a.f48982a.getDescriptor());
            throw null;
        }
        this.f48980a = str;
        this.f48981b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.i.a(this.f48980a, iVar.f48980a) && kotlin.jvm.internal.i.a(this.f48981b, iVar.f48981b);
    }

    public final int hashCode() {
        return this.f48981b.hashCode() + (this.f48980a.hashCode() * 31);
    }

    public final String toString() {
        return "GetUdsFaultDescriptionsRequestDTO(odxName=" + this.f48980a + ", faults=" + this.f48981b + ")";
    }

    public i(String odxName, List<String> faults) {
        kotlin.jvm.internal.i.e(odxName, "odxName");
        kotlin.jvm.internal.i.e(faults, "faults");
        this.f48980a = odxName;
        this.f48981b = faults;
    }
}
