package A9;

import kotlinx.serialization.UnknownFieldException;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;

/* JADX INFO: compiled from: AuthResponseDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class a {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f988d;

    /* JADX INFO: renamed from: A9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AuthResponseDTO.kt */
    @p293xa.d
    public static final class C0017a implements D<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0017a f989a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            C0017a c0017a = new C0017a();
            f989a = c0017a;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.responses.AuthResponseDTO", c0017a, 4);
            c1536l0.k("account", false);
            c1536l0.k("sessionToken", true);
            c1536l0.k("userEmail", true);
            c1536l0.k("updatedAt", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var)};
        }

        @Override // Ya.a
        public final Object deserialize(p024bb.c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            int i10 = 0;
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
                    str2 = (String) aVarA.d(c1536l0, 2, y0.f22677a, str2);
                    i10 |= 4;
                } else {
                    if (iO != 3) {
                        throw new UnknownFieldException(iO);
                    }
                    str3 = (String) aVarA.d(c1536l0, 3, y0.f22677a, str3);
                    i10 |= 8;
                }
            }
            aVarA.c(c1536l0);
            return new a(i10, strJ, str, str2, str3);
        }

        @Override // Ya.l, Ya.a
        public final p011ab.e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            a value = (a) obj;
            kotlin.jvm.internal.i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f985a);
            boolean zV = bVarA.v(c1536l0);
            String str = value.f986b;
            if (zV || str != null) {
                bVarA.q(c1536l0, 1, y0.f22677a, str);
            }
            boolean zV2 = bVarA.v(c1536l0);
            String str2 = value.f987c;
            if (zV2 || str2 != null) {
                bVarA.q(c1536l0, 2, y0.f22677a, str2);
            }
            boolean zV3 = bVarA.v(c1536l0);
            String str3 = value.f988d;
            if (zV3 || str3 != null) {
                bVarA.q(c1536l0, 3, y0.f22677a, str3);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: AuthResponseDTO.kt */
    public static final class b {
        public final Ya.b<a> serializer() {
            return C0017a.f989a;
        }
    }

    @p293xa.d
    public /* synthetic */ a(int i10, String str, String str2, String str3, String str4) {
        if (1 != (i10 & 1)) {
            p241t7.b.w(i10, 1, C0017a.f989a.getDescriptor());
            throw null;
        }
        this.f985a = str;
        if ((i10 & 2) == 0) {
            this.f986b = null;
        } else {
            this.f986b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f987c = null;
        } else {
            this.f987c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f988d = null;
        } else {
            this.f988d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.i.a(this.f985a, aVar.f985a) && kotlin.jvm.internal.i.a(this.f986b, aVar.f986b) && kotlin.jvm.internal.i.a(this.f987c, aVar.f987c) && kotlin.jvm.internal.i.a(this.f988d, aVar.f988d);
    }

    public final int hashCode() {
        int iHashCode = this.f985a.hashCode() * 31;
        String str = this.f986b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f987c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f988d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuthResponseDTO(account=");
        sb2.append(this.f985a);
        sb2.append(", sessionToken=");
        sb2.append(this.f986b);
        sb2.append(", userEmail=");
        sb2.append(this.f987c);
        sb2.append(", updatedAt=");
        return Q8.d.a(sb2, this.f988d, ")");
    }
}
