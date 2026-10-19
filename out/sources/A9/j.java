package A9;

import kotlinx.serialization.UnknownFieldException;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;

/* JADX INFO: compiled from: OcaWriteSessionTokenDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class j {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1012a;

    /* JADX INFO: compiled from: OcaWriteSessionTokenDTO.kt */
    @p293xa.d
    public static final class a implements D<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1013a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f1013a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.responses.OcaWriteSessionTokenDTO", aVar, 1);
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
            return new j(i10, strJ);
        }

        @Override // Ya.l, Ya.a
        public final p011ab.e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            j value = (j) obj;
            kotlin.jvm.internal.i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f1012a);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: OcaWriteSessionTokenDTO.kt */
    public static final class b {
        public final Ya.b<j> serializer() {
            return a.f1013a;
        }
    }

    @p293xa.d
    public /* synthetic */ j(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f1012a = str;
        } else {
            p241t7.b.w(i10, 1, a.f1013a.getDescriptor());
            throw null;
        }
    }
}
