package A9;

import kotlinx.serialization.UnknownFieldException;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;

/* JADX INFO: compiled from: OcaSessionTokenDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class i {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1010a;

    /* JADX INFO: compiled from: OcaSessionTokenDTO.kt */
    @p293xa.d
    public static final class a implements D<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1011a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f1011a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.responses.OcaSessionTokenDTO", aVar, 1);
            c1536l0.k("ocaSessionToken", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{y0.f22677a};
        }

        @Override // Ya.a
        public final Object deserialize(p024bb.c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
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
                    strJ = aVarA.j(c1536l0, 0);
                    i10 = 1;
                }
            }
            aVarA.c(c1536l0);
            return new i(i10, strJ);
        }

        @Override // Ya.l, Ya.a
        public final p011ab.e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            i value = (i) obj;
            kotlin.jvm.internal.i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f1010a);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: OcaSessionTokenDTO.kt */
    public static final class b {
        public final Ya.b<i> serializer() {
            return a.f1011a;
        }
    }

    @p293xa.d
    public /* synthetic */ i(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f1010a = str;
        } else {
            p241t7.b.w(i10, 1, a.f1011a.getDescriptor());
            throw null;
        }
    }

    public i(String ocaSessionToken) {
        kotlin.jvm.internal.i.e(ocaSessionToken, "ocaSessionToken");
        this.f1010a = ocaSessionToken;
    }
}
