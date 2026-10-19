package p304y9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p005a4.q;
import p011ab.e;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.I;
import p293xa.d;

/* JADX INFO: compiled from: UserPermissionDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class J {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48521a;

    /* JADX INFO: compiled from: UserPermissionDTO.kt */
    @d
    public static final class a implements D<J> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48522a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48522a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.UserPermissionDTO", aVar, 1);
            c1536l0.k("id", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{I.f22555a};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            boolean z10 = true;
            int i10 = 0;
            int iH = 0;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else {
                    if (iO != 0) {
                        throw new UnknownFieldException(iO);
                    }
                    iH = aVarA.h(c1536l0, 0);
                    i10 = 1;
                }
            }
            aVarA.c(c1536l0);
            return new J(i10, iH);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            J value = (J) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = J.Companion;
            boolean zV = bVarA.v(c1536l0);
            int i10 = value.f48521a;
            if (zV || i10 != 0) {
                bVarA.g(0, i10, c1536l0);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: UserPermissionDTO.kt */
    public static final class b {
        public final Ya.b<J> serializer() {
            return a.f48522a;
        }
    }

    public J() {
        this.f48521a = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && this.f48521a == ((J) obj).f48521a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48521a);
    }

    public final String toString() {
        return q.c(new StringBuilder("UserPermissionDTO(id="), this.f48521a, ")");
    }

    @d
    public /* synthetic */ J(int i10, int i11) {
        if ((i10 & 1) == 0) {
            this.f48521a = 0;
        } else {
            this.f48521a = i11;
        }
    }
}
