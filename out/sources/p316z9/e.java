package p316z9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: EmailLoginDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class e {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48969d;

    /* JADX INFO: compiled from: EmailLoginDTO.kt */
    @d
    public static final class a implements D<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48970a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48970a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.EmailLoginDTO", aVar, 4);
            c1536l0.k("username", false);
            c1536l0.k("password", false);
            c1536l0.k("temporaryPassword", false);
            c1536l0.k("backupCode", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var, Za.a.c(y0Var), Za.a.c(y0Var)};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
            String strJ2 = null;
            String str = null;
            String str2 = null;
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
                    strJ2 = aVarA.j(c1536l0, 1);
                    i10 |= 2;
                } else if (iO == 2) {
                    str = (String) aVarA.d(c1536l0, 2, y0.f22677a, str);
                    i10 |= 4;
                } else {
                    if (iO != 3) {
                        throw new UnknownFieldException(iO);
                    }
                    str2 = (String) aVarA.d(c1536l0, 3, y0.f22677a, str2);
                    i10 |= 8;
                }
            }
            aVarA.c(c1536l0);
            return new e(i10, strJ, strJ2, str, str2);
        }

        @Override // Ya.l, Ya.a
        public final p011ab.e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            e value = (e) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48966a);
            bVarA.p(c1536l0, 1, value.f48967b);
            y0 y0Var = y0.f22677a;
            bVarA.q(c1536l0, 2, y0Var, value.f48968c);
            bVarA.q(c1536l0, 3, y0Var, value.f48969d);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: EmailLoginDTO.kt */
    public static final class b {
        public final Ya.b<e> serializer() {
            return a.f48970a;
        }
    }

    @d
    public /* synthetic */ e(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            p241t7.b.w(i10, 15, a.f48970a.getDescriptor());
            throw null;
        }
        this.f48966a = str;
        this.f48967b = str2;
        this.f48968c = str3;
        this.f48969d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return i.a(this.f48966a, eVar.f48966a) && i.a(this.f48967b, eVar.f48967b) && i.a(this.f48968c, eVar.f48968c) && i.a(this.f48969d, eVar.f48969d);
    }

    public final int hashCode() {
        int iB = B1.a.b(this.f48967b, this.f48966a.hashCode() * 31, 31);
        String str = this.f48968c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f48969d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmailLoginDTO(username=");
        sb2.append(this.f48966a);
        sb2.append(", password=");
        sb2.append(this.f48967b);
        sb2.append(", temporaryPassword=");
        sb2.append(this.f48968c);
        sb2.append(", backupCode=");
        return Q8.d.a(sb2, this.f48969d, ")");
    }

    public e(String username, String password, String str, String str2) {
        i.e(username, "username");
        i.e(password, "password");
        this.f48966a = username;
        this.f48967b = password;
        this.f48968c = str;
        this.f48969d = str2;
    }
}
