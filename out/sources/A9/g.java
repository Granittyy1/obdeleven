package A9;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p037cb.C1521e;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p304y9.s;

/* JADX INFO: compiled from: OcaCommandsDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class g {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ya.b<Object>[] f1004b = {new C1521e(s.a.f48623a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<s> f1005a;

    /* JADX INFO: compiled from: OcaCommandsDTO.kt */
    @p293xa.d
    public static final class a implements D<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1006a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f1006a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.responses.OcaCommandsDTO", aVar, 1);
            c1536l0.k("commands", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{g.f1004b[0]};
        }

        @Override // Ya.a
        public final Object deserialize(p024bb.c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Ya.b<Object>[] bVarArr = g.f1004b;
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
            return new g(i10, list);
        }

        @Override // Ya.l, Ya.a
        public final p011ab.e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            g value = (g) obj;
            kotlin.jvm.internal.i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.s(c1536l0, 0, g.f1004b[0], value.f1005a);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: OcaCommandsDTO.kt */
    public static final class b {
        public final Ya.b<g> serializer() {
            return a.f1006a;
        }
    }

    @p293xa.d
    public /* synthetic */ g(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f1005a = list;
        } else {
            p241t7.b.w(i10, 1, a.f1006a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.i.a(this.f1005a, ((g) obj).f1005a);
    }

    public final int hashCode() {
        return this.f1005a.hashCode();
    }

    public final String toString() {
        return "OcaCommandsDTO(ocaCommands=" + this.f1005a + ")";
    }
}
