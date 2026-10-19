package A9;

import kotlinx.serialization.UnknownFieldException;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;

/* JADX INFO: compiled from: DeviceEmailResponseDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class c {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f996b;

    /* JADX INFO: compiled from: DeviceEmailResponseDTO.kt */
    @p293xa.d
    public static final class a implements D<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f997a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f997a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.responses.DeviceEmailResponseDTO", aVar, 2);
            c1536l0.k("id", false);
            c1536l0.k("email", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var};
        }

        @Override // Ya.a
        public final Object deserialize(p024bb.c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
            boolean z10 = true;
            String strJ2 = null;
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
                    strJ2 = aVarA.j(c1536l0, 1);
                    i10 |= 2;
                }
            }
            aVarA.c(c1536l0);
            return new c(i10, strJ, strJ2);
        }

        @Override // Ya.l, Ya.a
        public final p011ab.e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            c value = (c) obj;
            kotlin.jvm.internal.i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f995a);
            bVarA.p(c1536l0, 1, value.f996b);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: DeviceEmailResponseDTO.kt */
    public static final class b {
        public final Ya.b<c> serializer() {
            return a.f997a;
        }
    }

    @p293xa.d
    public /* synthetic */ c(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            p241t7.b.w(i10, 3, a.f997a.getDescriptor());
            throw null;
        }
        this.f995a = str;
        this.f996b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.i.a(this.f995a, cVar.f995a) && kotlin.jvm.internal.i.a(this.f996b, cVar.f996b);
    }

    public final int hashCode() {
        return this.f996b.hashCode() + (this.f995a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceEmailResponseDTO(id=");
        sb2.append(this.f995a);
        sb2.append(", email=");
        return Q8.d.a(sb2, this.f996b, ")");
    }
}
