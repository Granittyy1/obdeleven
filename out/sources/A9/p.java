package A9;

import C4.v;
import kotlinx.serialization.UnknownFieldException;
import p037cb.C1527h;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;

/* JADX INFO: compiled from: UserDetailsDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class p {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1034e;

    /* JADX INFO: compiled from: UserDetailsDTO.kt */
    @p293xa.d
    public static final class a implements D<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1035a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f1035a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.responses.UserDetailsDTO", aVar, 5);
            c1536l0.k("subscriptionType", false);
            c1536l0.k("expirationDate", true);
            c1536l0.k("personalInfoUpdateSoon", true);
            c1536l0.k("personalInfoUpdateRequired", true);
            c1536l0.k("usingWeakPassword", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            Ya.b<?> bVarC = Za.a.c(y0Var);
            C1527h c1527h = C1527h.f22612a;
            return new Ya.b[]{y0Var, bVarC, c1527h, c1527h, c1527h};
        }

        @Override // Ya.a
        public final Object deserialize(p024bb.c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
            String str = null;
            int i10 = 0;
            boolean zL = false;
            boolean zL2 = false;
            boolean zL3 = false;
            boolean z10 = true;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    strJ = aVarA.j(c1536l0, 0);
                    i10 |= 1;
                } else if (iO == 1) {
                    str = (String) aVarA.d(c1536l0, 1, y0.f22677a, str);
                    i10 |= 2;
                } else if (iO == 2) {
                    zL = aVarA.l(c1536l0, 2);
                    i10 |= 4;
                } else if (iO == 3) {
                    zL2 = aVarA.l(c1536l0, 3);
                    i10 |= 8;
                } else {
                    if (iO != 4) {
                        throw new UnknownFieldException(iO);
                    }
                    zL3 = aVarA.l(c1536l0, 4);
                    i10 |= 16;
                }
            }
            aVarA.c(c1536l0);
            return new p(i10, strJ, str, zL, zL2, zL3);
        }

        @Override // Ya.l, Ya.a
        public final p011ab.e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            p value = (p) obj;
            kotlin.jvm.internal.i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f1030a);
            boolean zV = bVarA.v(c1536l0);
            String str = value.f1031b;
            if (zV || str != null) {
                bVarA.q(c1536l0, 1, y0.f22677a, str);
            }
            boolean zV2 = bVarA.v(c1536l0);
            boolean z10 = value.f1032c;
            if (zV2 || z10) {
                bVarA.e(c1536l0, 2, z10);
            }
            boolean zV3 = bVarA.v(c1536l0);
            boolean z11 = value.f1033d;
            if (zV3 || z11) {
                bVarA.e(c1536l0, 3, z11);
            }
            boolean zV4 = bVarA.v(c1536l0);
            boolean z12 = value.f1034e;
            if (zV4 || z12) {
                bVarA.e(c1536l0, 4, z12);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: UserDetailsDTO.kt */
    public static final class b {
        public final Ya.b<p> serializer() {
            return a.f1035a;
        }
    }

    @p293xa.d
    public /* synthetic */ p(int i10, String str, String str2, boolean z10, boolean z11, boolean z12) {
        if (1 != (i10 & 1)) {
            p241t7.b.w(i10, 1, a.f1035a.getDescriptor());
            throw null;
        }
        this.f1030a = str;
        if ((i10 & 2) == 0) {
            this.f1031b = null;
        } else {
            this.f1031b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f1032c = false;
        } else {
            this.f1032c = z10;
        }
        if ((i10 & 8) == 0) {
            this.f1033d = false;
        } else {
            this.f1033d = z11;
        }
        if ((i10 & 16) == 0) {
            this.f1034e = false;
        } else {
            this.f1034e = z12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.i.a(this.f1030a, pVar.f1030a) && kotlin.jvm.internal.i.a(this.f1031b, pVar.f1031b) && this.f1032c == pVar.f1032c && this.f1033d == pVar.f1033d && this.f1034e == pVar.f1034e;
    }

    public final int hashCode() {
        int iHashCode = this.f1030a.hashCode() * 31;
        String str = this.f1031b;
        return Boolean.hashCode(this.f1034e) + androidx.compose.animation.D.b(androidx.compose.animation.D.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f1032c), 31, this.f1033d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserDetailsDTO(subscriptionType=");
        sb2.append(this.f1030a);
        sb2.append(", expirationDate=");
        sb2.append(this.f1031b);
        sb2.append(", personalInfoUpdateSoon=");
        sb2.append(this.f1032c);
        sb2.append(", personalInfoUpdateRequired=");
        sb2.append(this.f1033d);
        sb2.append(", usingWeakPassword=");
        return v.f(sb2, this.f1034e, ")");
    }
}
