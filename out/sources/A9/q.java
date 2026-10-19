package A9;

import kotlinx.serialization.UnknownFieldException;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;

/* JADX INFO: compiled from: Validate2FaKeyResultDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class q {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1036a;

    /* JADX INFO: compiled from: Validate2FaKeyResultDTO.kt */
    @p293xa.d
    public static final class a implements D<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1037a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f1037a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.responses.Validate2FaKeyResultDTO", aVar, 1);
            c1536l0.k("recoveryCode", false);
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
            return new q(i10, strJ);
        }

        @Override // Ya.l, Ya.a
        public final p011ab.e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            q value = (q) obj;
            kotlin.jvm.internal.i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f1036a);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: Validate2FaKeyResultDTO.kt */
    public static final class b {
        public final Ya.b<q> serializer() {
            return a.f1037a;
        }
    }

    @p293xa.d
    public /* synthetic */ q(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f1036a = str;
        } else {
            p241t7.b.w(i10, 1, a.f1037a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && kotlin.jvm.internal.i.a(this.f1036a, ((q) obj).f1036a);
    }

    public final int hashCode() {
        return this.f1036a.hashCode();
    }

    public final String toString() {
        return Q8.d.a(new StringBuilder("Validate2FaKeyResultDTO(recoveryCode="), this.f1036a, ")");
    }
}
