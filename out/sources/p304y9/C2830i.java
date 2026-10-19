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

/* JADX INFO: renamed from: y9.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DateDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class C2830i {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48583b;

    /* JADX INFO: renamed from: y9.i$a */
    /* JADX INFO: compiled from: DateDTO.kt */
    @d
    public static final class a implements D<C2830i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48584a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48584a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.DateDTO", aVar, 2);
            c1536l0.k("__type", true);
            c1536l0.k("iso", false);
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
            return new C2830i(i10, strJ, strJ2);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            C2830i value = (C2830i) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = C2830i.Companion;
            boolean zV = bVarA.v(c1536l0);
            String str = value.f48582a;
            if (zV || !i.a(str, "Date")) {
                bVarA.p(c1536l0, 0, str);
            }
            bVarA.p(c1536l0, 1, value.f48583b);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: renamed from: y9.i$b */
    /* JADX INFO: compiled from: DateDTO.kt */
    public static final class b {
        public final Ya.b<C2830i> serializer() {
            return a.f48584a;
        }
    }

    @d
    public /* synthetic */ C2830i(int i10, String str, String str2) {
        if (2 != (i10 & 2)) {
            p241t7.b.w(i10, 2, a.f48584a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f48582a = "Date";
        } else {
            this.f48582a = str;
        }
        this.f48583b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2830i)) {
            return false;
        }
        C2830i c2830i = (C2830i) obj;
        return i.a(this.f48582a, c2830i.f48582a) && i.a(this.f48583b, c2830i.f48583b);
    }

    public final int hashCode() {
        return this.f48583b.hashCode() + (this.f48582a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DateDTO(type=");
        sb2.append(this.f48582a);
        sb2.append(", iso=");
        return Q8.d.a(sb2, this.f48583b, ")");
    }
}
