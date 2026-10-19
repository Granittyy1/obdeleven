package p316z9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1527h;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p293xa.d;

/* JADX INFO: compiled from: GetControlUnitBasesRequestDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class h {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48977a;

    /* JADX INFO: compiled from: GetControlUnitBasesRequestDTO.kt */
    @d
    public static final class a implements D<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48978a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48978a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.GetControlUnitBasesRequestDTO", aVar, 1);
            c1536l0.k("includeOnlyWithKlineId", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{C1527h.f22612a};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
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
            return new h(i10, zL);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            h value = (h) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.e(c1536l0, 0, value.f48977a);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: GetControlUnitBasesRequestDTO.kt */
    public static final class b {
        public final Ya.b<h> serializer() {
            return a.f48978a;
        }
    }

    public h() {
        this.f48977a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f48977a == ((h) obj).f48977a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48977a);
    }

    public final String toString() {
        return "GetControlUnitBasesRequestDTO(includeOnlyWithKlineId=" + this.f48977a + ")";
    }

    @d
    public /* synthetic */ h(int i10, boolean z10) {
        if (1 == (i10 & 1)) {
            this.f48977a = z10;
        } else {
            p241t7.b.w(i10, 1, a.f48978a.getDescriptor());
            throw null;
        }
    }
}
