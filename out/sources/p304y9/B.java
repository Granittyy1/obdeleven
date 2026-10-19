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

/* JADX INFO: compiled from: RelationDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class B {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48431b;

    /* JADX INFO: compiled from: RelationDTO.kt */
    @d
    public static final class a implements D<B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48432a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48432a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.RelationDTO", aVar, 2);
            c1536l0.k("__type", true);
            c1536l0.k("className", false);
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
            return new B(i10, strJ, strJ2);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            B value = (B) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = B.Companion;
            boolean zV = bVarA.v(c1536l0);
            String str = value.f48430a;
            if (zV || !i.a(str, "Relation")) {
                bVarA.p(c1536l0, 0, str);
            }
            bVarA.p(c1536l0, 1, value.f48431b);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: RelationDTO.kt */
    public static final class b {
        public final Ya.b<B> serializer() {
            return a.f48432a;
        }
    }

    @d
    public /* synthetic */ B(int i10, String str, String str2) {
        if (2 != (i10 & 2)) {
            p241t7.b.w(i10, 2, a.f48432a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f48430a = "Relation";
        } else {
            this.f48430a = str;
        }
        this.f48431b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return i.a(this.f48430a, b10.f48430a) && i.a(this.f48431b, b10.f48431b);
    }

    public final int hashCode() {
        return this.f48431b.hashCode() + (this.f48430a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelationDTO(type=");
        sb2.append(this.f48430a);
        sb2.append(", className=");
        return Q8.d.a(sb2, this.f48431b, ")");
    }
}
