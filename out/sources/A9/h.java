package A9;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p037cb.C1521e;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p304y9.t;

/* JADX INFO: compiled from: OcaListDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class h {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ya.b<Object>[] f1007b = {new C1521e(t.a.f48639a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<t> f1008a;

    /* JADX INFO: compiled from: OcaListDTO.kt */
    @p293xa.d
    public static final class a implements D<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1009a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f1009a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.responses.OcaListDTO", aVar, 1);
            c1536l0.k("applications", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{h.f1007b[0]};
        }

        @Override // Ya.a
        public final Object deserialize(p024bb.c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Ya.b<Object>[] bVarArr = h.f1007b;
            List list = null;
            boolean z10 = true;
            int i10 = 0;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else {
                    if (iO != 0) {
                        throw new UnknownFieldException(iO);
                    }
                    list = (List) aVarA.e(c1536l0, 0, bVarArr[0], list);
                    i10 = 1;
                }
            }
            aVarA.c(c1536l0);
            return new h(i10, list);
        }

        @Override // Ya.l, Ya.a
        public final p011ab.e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            h value = (h) obj;
            kotlin.jvm.internal.i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.s(c1536l0, 0, h.f1007b[0], value.f1008a);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: OcaListDTO.kt */
    public static final class b {
        public final Ya.b<h> serializer() {
            return a.f1009a;
        }
    }

    @p293xa.d
    public /* synthetic */ h(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f1008a = list;
        } else {
            p241t7.b.w(i10, 1, a.f1009a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && kotlin.jvm.internal.i.a(this.f1008a, ((h) obj).f1008a);
    }

    public final int hashCode() {
        return this.f1008a.hashCode();
    }

    public final String toString() {
        return "OcaListDTO(applications=" + this.f1008a + ")";
    }
}
