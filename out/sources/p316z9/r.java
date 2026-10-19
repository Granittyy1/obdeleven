package p316z9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: VerifyDeviceMacRequestDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class r {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49022a;

    /* JADX INFO: compiled from: VerifyDeviceMacRequestDTO.kt */
    @d
    public static final class a implements D<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f49023a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f49023a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.VerifyDeviceMacRequestDTO", aVar, 1);
            c1536l0.k("mac", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{y0.f22677a};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
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
            return new r(i10, strJ);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            r value = (r) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f49022a);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: VerifyDeviceMacRequestDTO.kt */
    public static final class b {
        public final Ya.b<r> serializer() {
            return a.f49023a;
        }
    }

    @d
    public /* synthetic */ r(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f49022a = str;
        } else {
            p241t7.b.w(i10, 1, a.f49023a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && i.a(this.f49022a, ((r) obj).f49022a);
    }

    public final int hashCode() {
        return this.f49022a.hashCode();
    }

    public final String toString() {
        return Q8.d.a(new StringBuilder("VerifyDeviceMacRequestDTO(mac="), this.f49022a, ")");
    }

    public r(String mac) {
        i.e(mac, "mac");
        this.f49022a = mac;
    }
}
