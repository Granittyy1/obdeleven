package p292x9;

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

/* JADX INFO: compiled from: CountryCodeDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class a {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47913a;

    /* JADX INFO: renamed from: x9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CountryCodeDTO.kt */
    @d
    public static final class C0551a implements D<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0551a f47914a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            C0551a c0551a = new C0551a();
            f47914a = c0551a;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.CountryCodeDTO", c0551a, 1);
            c1536l0.k("country", false);
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
            return new a(i10, strJ);
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
            bVarA.p(c1536l0, 0, value.f47913a);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: CountryCodeDTO.kt */
    public static final class b {
        public final Ya.b<a> serializer() {
            return C0551a.f47914a;
        }
    }

    @d
    public /* synthetic */ a(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f47913a = str;
        } else {
            p241t7.b.w(i10, 1, C0551a.f47914a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && i.a(this.f47913a, ((a) obj).f47913a);
    }

    public final int hashCode() {
        return this.f47913a.hashCode();
    }

    public final String toString() {
        return Q8.d.a(new StringBuilder("CountryCodeDTO(country="), this.f47913a, ")");
    }
}
