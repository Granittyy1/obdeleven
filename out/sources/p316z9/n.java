package p316z9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.D;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: SocialLoginRequestDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class n<T> {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1536l0 f49000e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f49001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49004d;

    /* JADX INFO: compiled from: SocialLoginRequestDTO.kt */
    @d
    public static final class a<T> implements D<n<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ya.b<?> f49005a;
        private final /* synthetic */ C1536l0 descriptor;

        @d
        public a(Ya.b typeSerial0) {
            i.e(typeSerial0, "typeSerial0");
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.SocialLoginRequestDTO", this, 4);
            c1536l0.k("authData", false);
            c1536l0.k("name", false);
            c1536l0.k("username", false);
            c1536l0.k("email", false);
            this.descriptor = c1536l0;
            this.f49005a = typeSerial0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{this.f49005a, y0Var, y0Var, y0Var};
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = this.descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Object objE = null;
            String strJ = null;
            String strJ2 = null;
            String strJ3 = null;
            int i10 = 0;
            boolean z10 = true;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    objE = aVarA.e(c1536l0, 0, this.f49005a, objE);
                    i10 |= 1;
                } else if (iO == 1) {
                    strJ = aVarA.j(c1536l0, 1);
                    i10 |= 2;
                } else if (iO == 2) {
                    strJ2 = aVarA.j(c1536l0, 2);
                    i10 |= 4;
                } else {
                    if (iO != 3) {
                        throw new UnknownFieldException(iO);
                    }
                    strJ3 = aVarA.j(c1536l0, 3);
                    i10 |= 8;
                }
            }
            aVarA.c(c1536l0);
            return new n(i10, objE, strJ, strJ2, strJ3);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return this.descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            n value = (n) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = this.descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.s(c1536l0, 0, this.f49005a, value.f49001a);
            bVarA.p(c1536l0, 1, value.f49002b);
            bVarA.p(c1536l0, 2, value.f49003c);
            bVarA.p(c1536l0, 3, value.f49004d);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return new Ya.b[]{this.f49005a};
        }
    }

    /* JADX INFO: compiled from: SocialLoginRequestDTO.kt */
    public static final class b {
        public final <T0> Ya.b<n<T0>> serializer(Ya.b<T0> typeSerial0) {
            i.e(typeSerial0, "typeSerial0");
            return new a(typeSerial0);
        }
    }

    static {
        C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.SocialLoginRequestDTO", null, 4);
        c1536l0.k("authData", false);
        c1536l0.k("name", false);
        c1536l0.k("username", false);
        c1536l0.k("email", false);
        f49000e = c1536l0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d
    public /* synthetic */ n(int i10, Object obj, String str, String str2, String str3) {
        if (15 != (i10 & 15)) {
            p241t7.b.w(i10, 15, f49000e);
            throw null;
        }
        this.f49001a = obj;
        this.f49002b = str;
        this.f49003c = str2;
        this.f49004d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return i.a(this.f49001a, nVar.f49001a) && i.a(this.f49002b, nVar.f49002b) && i.a(this.f49003c, nVar.f49003c) && i.a(this.f49004d, nVar.f49004d);
    }

    public final int hashCode() {
        T t8 = this.f49001a;
        return this.f49004d.hashCode() + B1.a.b(this.f49003c, B1.a.b(this.f49002b, (t8 == null ? 0 : t8.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "SocialLoginRequestDTO(authData=" + this.f49001a + ", name=" + this.f49002b + ", username=" + this.f49003c + ", email=" + this.f49004d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(f fVar, String name, String username, String email) {
        i.e(name, "name");
        i.e(username, "username");
        i.e(email, "email");
        this.f49001a = fVar;
        this.f49002b = name;
        this.f49003c = username;
        this.f49004d = email;
    }
}
