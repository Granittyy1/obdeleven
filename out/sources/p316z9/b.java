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

/* JADX INFO: compiled from: CreateFirstGenDeviceRequestDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class b {
    public static final C0564b Companion = new C0564b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48956b;

    /* JADX INFO: compiled from: CreateFirstGenDeviceRequestDTO.kt */
    @d
    public static final class a implements D<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48957a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48957a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.CreateFirstGenDeviceRequestDTO", aVar, 2);
            c1536l0.k("mac", false);
            c1536l0.k("version", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
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
            return new b(i10, strJ, strJ2);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            b value = (b) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48955a);
            bVarA.p(c1536l0, 1, value.f48956b);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: renamed from: z9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CreateFirstGenDeviceRequestDTO.kt */
    public static final class C0564b {
        public final Ya.b<b> serializer() {
            return a.f48957a;
        }
    }

    @d
    public /* synthetic */ b(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            p241t7.b.w(i10, 3, a.f48957a.getDescriptor());
            throw null;
        }
        this.f48955a = str;
        this.f48956b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return i.a(this.f48955a, bVar.f48955a) && i.a(this.f48956b, bVar.f48956b);
    }

    public final int hashCode() {
        return this.f48956b.hashCode() + (this.f48955a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateFirstGenDeviceRequestDTO(mac=");
        sb2.append(this.f48955a);
        sb2.append(", version=");
        return Q8.d.a(sb2, this.f48956b, ")");
    }

    public b(String mac, String version) {
        i.e(mac, "mac");
        i.e(version, "version");
        this.f48955a = mac;
        this.f48956b = version;
    }
}
