package p304y9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: SfdSupportedCountryDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class D {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48438c;

    /* JADX INFO: compiled from: SfdSupportedCountryDTO.kt */
    @d
    public static final class a implements p037cb.D<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48439a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48439a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.SfdSupportedCountryDTO", aVar, 3);
            c1536l0.k("phoneCode", false);
            c1536l0.k("countryCode", false);
            c1536l0.k("countryName", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var, y0Var};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
            boolean z10 = true;
            int i10 = 0;
            String strJ2 = null;
            String strJ3 = null;
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
                } else {
                    if (iO != 2) {
                        throw new UnknownFieldException(iO);
                    }
                    strJ3 = aVarA.j(c1536l0, 2);
                    i10 |= 4;
                }
            }
            aVarA.c(c1536l0);
            return new D(strJ, i10, strJ2, strJ3);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            D value = (D) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48436a);
            bVarA.p(c1536l0, 1, value.f48437b);
            bVarA.p(c1536l0, 2, value.f48438c);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: SfdSupportedCountryDTO.kt */
    public static final class b {
        public final Ya.b<D> serializer() {
            return a.f48439a;
        }
    }

    @d
    public /* synthetic */ D(String str, int i10, String str2, String str3) {
        if (7 != (i10 & 7)) {
            p241t7.b.w(i10, 7, a.f48439a.getDescriptor());
            throw null;
        }
        this.f48436a = str;
        this.f48437b = str2;
        this.f48438c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return i.a(this.f48436a, d10.f48436a) && i.a(this.f48437b, d10.f48437b) && i.a(this.f48438c, d10.f48438c);
    }

    public final int hashCode() {
        return this.f48438c.hashCode() + B1.a.b(this.f48437b, this.f48436a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SfdSupportedCountryDTO(phoneCode=");
        sb2.append(this.f48436a);
        sb2.append(", countryCode=");
        sb2.append(this.f48437b);
        sb2.append(", countryName=");
        return Q8.d.a(sb2, this.f48438c, ")");
    }
}
