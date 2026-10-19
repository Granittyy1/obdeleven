package R8;

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

/* JADX INFO: compiled from: PhoneNumberDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class a {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5331b;

    /* JADX INFO: renamed from: R8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PhoneNumberDTO.kt */
    @d
    public static final class C0075a implements D<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0075a f5332a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            C0075a c0075a = new C0075a();
            f5332a = c0075a;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.obdeleven.network.models.request.PhoneNumberDTO", c0075a, 2);
            c1536l0.k("countryCode", false);
            c1536l0.k("phoneNumber", false);
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
            return new a(i10, strJ, strJ2);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            a value = (a) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = a.Companion;
            bVarA.p(c1536l0, 0, value.f5330a);
            bVarA.p(c1536l0, 1, value.f5331b);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: PhoneNumberDTO.kt */
    public static final class b {
        public final Ya.b<a> serializer() {
            return C0075a.f5332a;
        }
    }

    @d
    public /* synthetic */ a(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            p241t7.b.w(i10, 3, C0075a.f5332a.getDescriptor());
            throw null;
        }
        this.f5330a = str;
        this.f5331b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f5330a, aVar.f5330a) && i.a(this.f5331b, aVar.f5331b);
    }

    public final int hashCode() {
        return this.f5331b.hashCode() + (this.f5330a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneNumberDTO(countryCode=");
        sb2.append(this.f5330a);
        sb2.append(", phoneNumber=");
        return Q8.d.a(sb2, this.f5331b, ")");
    }

    public a(String countryCode, String phoneNumber) {
        i.e(countryCode, "countryCode");
        i.e(phoneNumber, "phoneNumber");
        this.f5330a = countryCode;
        this.f5331b = phoneNumber;
    }
}
