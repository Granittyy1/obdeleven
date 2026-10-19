package p316z9;

import Ya.k;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1521e;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: OriginalAppValueDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class j {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Ya.b<Object>[] f48983c = {null, new C1521e(p316z9.a.C0563a.f48954a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<p316z9.a> f48985b;

    /* JADX INFO: compiled from: OriginalAppValueDTO.kt */
    @d
    public static final class a implements D<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48986a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48986a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.OriginalAppValueDTO", aVar, 2);
            c1536l0.k("id", false);
            c1536l0.k("commands", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{y0.f22677a, j.f48983c[1]};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Ya.b<Object>[] bVarArr = j.f48983c;
            String strJ = null;
            boolean z10 = true;
            List list = null;
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
                    list = (List) aVarA.e(c1536l0, 1, bVarArr[1], list);
                    i10 |= 2;
                }
            }
            aVarA.c(c1536l0);
            return new j(i10, strJ, list);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            j value = (j) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48984a);
            bVarA.s(c1536l0, 1, j.f48983c[1], value.f48985b);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: OriginalAppValueDTO.kt */
    public static final class b {
        public final Ya.b<j> serializer() {
            return a.f48986a;
        }
    }

    @d
    public /* synthetic */ j(int i10, String str, List list) {
        if (3 != (i10 & 3)) {
            p241t7.b.w(i10, 3, a.f48986a.getDescriptor());
            throw null;
        }
        this.f48984a = str;
        this.f48985b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i.a(this.f48984a, jVar.f48984a) && i.a(this.f48985b, jVar.f48985b);
    }

    public final int hashCode() {
        return this.f48985b.hashCode() + (this.f48984a.hashCode() * 31);
    }

    public final String toString() {
        return "OriginalAppValueDTO(id=" + this.f48984a + ", commands=" + this.f48985b + ")";
    }
}
