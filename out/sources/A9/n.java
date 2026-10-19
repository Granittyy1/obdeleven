package A9;

import kotlinx.serialization.UnknownFieldException;
import p037cb.C1527h;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;

/* JADX INFO: compiled from: ShouldRedirectDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class n {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1025a;

    /* JADX INFO: compiled from: ShouldRedirectDTO.kt */
    @p293xa.d
    public static final class a implements D<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1026a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f1026a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.responses.ShouldRedirectDTO", aVar, 1);
            c1536l0.k("shouldRedirect", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{C1527h.f22612a};
        }

        @Override // Ya.a
        public final Object deserialize(p024bb.c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            boolean z10 = true;
            int i10 = 0;
            boolean zL = false;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else {
                    if (iO != 0) {
                        throw new UnknownFieldException(iO);
                    }
                    zL = aVarA.l(c1536l0, 0);
                    i10 = 1;
                }
            }
            aVarA.c(c1536l0);
            return new n(i10, zL);
        }

        @Override // Ya.l, Ya.a
        public final p011ab.e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            n value = (n) obj;
            kotlin.jvm.internal.i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.e(c1536l0, 0, value.f1025a);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: ShouldRedirectDTO.kt */
    public static final class b {
        public final Ya.b<n> serializer() {
            return a.f1026a;
        }
    }

    @p293xa.d
    public /* synthetic */ n(int i10, boolean z10) {
        if (1 == (i10 & 1)) {
            this.f1025a = z10;
        } else {
            p241t7.b.w(i10, 1, a.f1026a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f1025a == ((n) obj).f1025a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1025a);
    }

    public final String toString() {
        return "ShouldRedirectDTO(shouldRedirect=" + this.f1025a + ")";
    }
}
