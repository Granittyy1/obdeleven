package p316z9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p293xa.d;

/* JADX INFO: compiled from: FacebookAuthDataDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class f {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f48971a;

    /* JADX INFO: compiled from: FacebookAuthDataDTO.kt */
    @d
    public static final class a implements D<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48972a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48972a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.FacebookAuthDataDTO", aVar, 1);
            c1536l0.k("facebook", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{Za.a.c(g.a.f48976a)};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            g gVar = null;
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
                    gVar = (g) aVarA.d(c1536l0, 0, g.a.f48976a, gVar);
                    i10 = 1;
                }
            }
            aVarA.c(c1536l0);
            return new f(i10, gVar);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            f value = (f) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = f.Companion;
            bVarA.q(c1536l0, 0, g.a.f48976a, value.f48971a);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: FacebookAuthDataDTO.kt */
    public static final class b {
        public final Ya.b<f> serializer() {
            return a.f48972a;
        }
    }

    @d
    public /* synthetic */ f(int i10, g gVar) {
        if (1 == (i10 & 1)) {
            this.f48971a = gVar;
        } else {
            p241t7.b.w(i10, 1, a.f48972a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && i.a(this.f48971a, ((f) obj).f48971a);
    }

    public final int hashCode() {
        g gVar = this.f48971a;
        if (gVar == null) {
            return 0;
        }
        return gVar.hashCode();
    }

    public final String toString() {
        return "FacebookAuthDataDTO(facebook=" + this.f48971a + ")";
    }

    public f(g gVar) {
        this.f48971a = gVar;
    }
}
