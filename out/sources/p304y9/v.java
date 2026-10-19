package p304y9;

import Ya.k;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p005a4.p;
import p011ab.e;
import p024bb.c;
import p037cb.C1521e;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: OdxDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class v {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Ya.b<Object>[] f48650f = {null, new C1521e(y0.f22677a), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f48652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f48655e;

    /* JADX INFO: compiled from: OdxDTO.kt */
    @d
    public static final class a implements D<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48656a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48656a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.OdxDTO", aVar, 5);
            c1536l0.k("objectId", false);
            c1536l0.k("values", false);
            c1536l0.k("fileName", false);
            c1536l0.k("platform", false);
            c1536l0.k("file", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            Ya.b<?> bVar = v.f48650f[1];
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, bVar, y0Var, y0Var, m.a.f48603a};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Ya.b<Object>[] bVarArr = v.f48650f;
            int i10 = 0;
            String strJ = null;
            List list = null;
            String strJ2 = null;
            String strJ3 = null;
            m mVar = null;
            boolean z10 = true;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    strJ = aVarA.j(c1536l0, 0);
                    i10 |= 1;
                } else if (iO == 1) {
                    list = (List) aVarA.e(c1536l0, 1, bVarArr[1], list);
                    i10 |= 2;
                } else if (iO == 2) {
                    strJ2 = aVarA.j(c1536l0, 2);
                    i10 |= 4;
                } else if (iO == 3) {
                    strJ3 = aVarA.j(c1536l0, 3);
                    i10 |= 8;
                } else {
                    if (iO != 4) {
                        throw new UnknownFieldException(iO);
                    }
                    mVar = (m) aVarA.e(c1536l0, 4, m.a.f48603a, mVar);
                    i10 |= 16;
                }
            }
            aVarA.c(c1536l0);
            return new v(i10, strJ, list, strJ2, strJ3, mVar);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            v value = (v) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48651a);
            bVarA.s(c1536l0, 1, v.f48650f[1], value.f48652b);
            bVarA.p(c1536l0, 2, value.f48653c);
            bVarA.p(c1536l0, 3, value.f48654d);
            bVarA.s(c1536l0, 4, m.a.f48603a, value.f48655e);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: OdxDTO.kt */
    public static final class b {
        public final Ya.b<v> serializer() {
            return a.f48656a;
        }
    }

    @d
    public /* synthetic */ v(int i10, String str, List list, String str2, String str3, m mVar) {
        if (31 != (i10 & 31)) {
            p241t7.b.w(i10, 31, a.f48656a.getDescriptor());
            throw null;
        }
        this.f48651a = str;
        this.f48652b = list;
        this.f48653c = str2;
        this.f48654d = str3;
        this.f48655e = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return i.a(this.f48651a, vVar.f48651a) && i.a(this.f48652b, vVar.f48652b) && i.a(this.f48653c, vVar.f48653c) && i.a(this.f48654d, vVar.f48654d) && i.a(this.f48655e, vVar.f48655e);
    }

    public final int hashCode() {
        return this.f48655e.hashCode() + B1.a.b(this.f48654d, B1.a.b(this.f48653c, p.d(this.f48651a.hashCode() * 31, 31, this.f48652b), 31), 31);
    }

    public final String toString() {
        return "OdxDTO(objectId=" + this.f48651a + ", values=" + this.f48652b + ", fileName=" + this.f48653c + ", platform=" + this.f48654d + ", file=" + this.f48655e + ")";
    }
}
