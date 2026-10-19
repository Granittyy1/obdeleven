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

/* JADX INFO: compiled from: SfdTokenRequestDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class m {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48998d;

    /* JADX INFO: compiled from: SfdTokenRequestDTO.kt */
    @d
    public static final class a implements D<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48999a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48999a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.SfdTokenRequestDTO", aVar, 4);
            c1536l0.k("vehicleId", false);
            c1536l0.k("ecuBaseId", false);
            c1536l0.k("activationData", false);
            c1536l0.k("iv", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var, y0Var, y0Var};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            int i10 = 0;
            String strJ = null;
            String strJ2 = null;
            String strJ3 = null;
            String strJ4 = null;
            boolean z10 = true;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    strJ = aVarA.j(c1536l0, 0);
                    i10 |= 1;
                } else if (iO == 1) {
                    strJ2 = aVarA.j(c1536l0, 1);
                    i10 |= 2;
                } else if (iO == 2) {
                    strJ3 = aVarA.j(c1536l0, 2);
                    i10 |= 4;
                } else {
                    if (iO != 3) {
                        throw new UnknownFieldException(iO);
                    }
                    strJ4 = aVarA.j(c1536l0, 3);
                    i10 |= 8;
                }
            }
            aVarA.c(c1536l0);
            return new m(i10, strJ, strJ2, strJ3, strJ4);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            m value = (m) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48995a);
            bVarA.p(c1536l0, 1, value.f48996b);
            bVarA.p(c1536l0, 2, value.f48997c);
            bVarA.p(c1536l0, 3, value.f48998d);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: SfdTokenRequestDTO.kt */
    public static final class b {
        public final Ya.b<m> serializer() {
            return a.f48999a;
        }
    }

    @d
    public /* synthetic */ m(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            p241t7.b.w(i10, 15, a.f48999a.getDescriptor());
            throw null;
        }
        this.f48995a = str;
        this.f48996b = str2;
        this.f48997c = str3;
        this.f48998d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return i.a(this.f48995a, mVar.f48995a) && i.a(this.f48996b, mVar.f48996b) && i.a(this.f48997c, mVar.f48997c) && i.a(this.f48998d, mVar.f48998d);
    }

    public final int hashCode() {
        return this.f48998d.hashCode() + B1.a.b(this.f48997c, B1.a.b(this.f48996b, this.f48995a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SfdTokenRequestDTO(vehicleId=");
        sb2.append(this.f48995a);
        sb2.append(", ecuBaseId=");
        sb2.append(this.f48996b);
        sb2.append(", activationData=");
        sb2.append(this.f48997c);
        sb2.append(", iv=");
        return Q8.d.a(sb2, this.f48998d, ")");
    }

    public m(String vehicleId, String ecuBaseId, String activationData, String iv) {
        i.e(vehicleId, "vehicleId");
        i.e(ecuBaseId, "ecuBaseId");
        i.e(activationData, "activationData");
        i.e(iv, "iv");
        this.f48995a = vehicleId;
        this.f48996b = ecuBaseId;
        this.f48997c = activationData;
        this.f48998d = iv;
    }
}
