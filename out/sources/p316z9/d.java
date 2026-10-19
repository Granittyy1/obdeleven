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

/* JADX INFO: compiled from: DeviceEmailRequestDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class d {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48964a;

    /* JADX INFO: compiled from: DeviceEmailRequestDTO.kt */
    @p293xa.d
    public static final class a implements D<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48965a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48965a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.DeviceEmailRequestDTO", aVar, 1);
            c1536l0.k("deviceId", false);
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
            return new d(i10, strJ);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            d value = (d) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48964a);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: DeviceEmailRequestDTO.kt */
    public static final class b {
        public final Ya.b<d> serializer() {
            return a.f48965a;
        }
    }

    @p293xa.d
    public /* synthetic */ d(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f48964a = str;
        } else {
            p241t7.b.w(i10, 1, a.f48965a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && i.a(this.f48964a, ((d) obj).f48964a);
    }

    public final int hashCode() {
        return this.f48964a.hashCode();
    }

    public final String toString() {
        return Q8.d.a(new StringBuilder("DeviceEmailRequestDTO(deviceId="), this.f48964a, ")");
    }

    public d(String deviceId) {
        i.e(deviceId, "deviceId");
        this.f48964a = deviceId;
    }
}
