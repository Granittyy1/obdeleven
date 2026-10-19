package p304y9;

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

/* JADX INFO: compiled from: OcaCommandDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class s {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48622d;

    /* JADX INFO: compiled from: OcaCommandDTO.kt */
    @d
    public static final class a implements D<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48623a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48623a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.OcaCommandDTO", aVar, 4);
            c1536l0.k("command", false);
            c1536l0.k("data", true);
            c1536l0.k("type", true);
            c1536l0.k("values", true);
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
            return new s(i10, strJ, strJ2, strJ3, strJ4);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            s value = (s) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48619a);
            boolean zV = bVarA.v(c1536l0);
            String str = value.f48620b;
            if (zV || !i.a(str, "")) {
                bVarA.p(c1536l0, 1, str);
            }
            boolean zV2 = bVarA.v(c1536l0);
            String str2 = value.f48621c;
            if (zV2 || !i.a(str2, "")) {
                bVarA.p(c1536l0, 2, str2);
            }
            boolean zV3 = bVarA.v(c1536l0);
            String str3 = value.f48622d;
            if (zV3 || !i.a(str3, "")) {
                bVarA.p(c1536l0, 3, str3);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: OcaCommandDTO.kt */
    public static final class b {
        public final Ya.b<s> serializer() {
            return a.f48623a;
        }
    }

    @d
    public /* synthetic */ s(int i10, String str, String str2, String str3, String str4) {
        if (1 != (i10 & 1)) {
            p241t7.b.w(i10, 1, a.f48623a.getDescriptor());
            throw null;
        }
        this.f48619a = str;
        if ((i10 & 2) == 0) {
            this.f48620b = "";
        } else {
            this.f48620b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f48621c = "";
        } else {
            this.f48621c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f48622d = "";
        } else {
            this.f48622d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return i.a(this.f48619a, sVar.f48619a) && i.a(this.f48620b, sVar.f48620b) && i.a(this.f48621c, sVar.f48621c) && i.a(this.f48622d, sVar.f48622d);
    }

    public final int hashCode() {
        return this.f48622d.hashCode() + B1.a.b(this.f48621c, B1.a.b(this.f48620b, this.f48619a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OcaCommandDTO(command=");
        sb2.append(this.f48619a);
        sb2.append(", data=");
        sb2.append(this.f48620b);
        sb2.append(", type=");
        sb2.append(this.f48621c);
        sb2.append(", values=");
        return Q8.d.a(sb2, this.f48622d, ")");
    }
}
