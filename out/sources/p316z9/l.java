package p316z9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.I;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: OriginalValueCommandDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class l {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48993b;

    /* JADX INFO: compiled from: OriginalValueCommandDTO.kt */
    @d
    public static final class a implements D<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48994a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48994a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.OriginalValueCommandDTO", aVar, 2);
            c1536l0.k("index", false);
            c1536l0.k("value", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{I.f22555a, y0.f22677a};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
            boolean z10 = true;
            int i10 = 0;
            int iH = 0;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    iH = aVarA.h(c1536l0, 0);
                    i10 |= 1;
                } else {
                    if (iO != 1) {
                        throw new UnknownFieldException(iO);
                    }
                    strJ = aVarA.j(c1536l0, 1);
                    i10 |= 2;
                }
            }
            aVarA.c(c1536l0);
            return new l(strJ, i10, iH);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            l value = (l) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.g(0, value.f48992a, c1536l0);
            bVarA.p(c1536l0, 1, value.f48993b);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: OriginalValueCommandDTO.kt */
    public static final class b {
        public final Ya.b<l> serializer() {
            return a.f48994a;
        }
    }

    public l(int i10, String value) {
        i.e(value, "value");
        this.f48992a = i10;
        this.f48993b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f48992a == lVar.f48992a && i.a(this.f48993b, lVar.f48993b);
    }

    public final int hashCode() {
        return this.f48993b.hashCode() + (Integer.hashCode(this.f48992a) * 31);
    }

    public final String toString() {
        return "OriginalValueCommandDTO(index=" + this.f48992a + ", value=" + this.f48993b + ")";
    }

    @d
    public /* synthetic */ l(String str, int i10, int i11) {
        if (3 != (i10 & 3)) {
            p241t7.b.w(i10, 3, a.f48994a.getDescriptor());
            throw null;
        }
        this.f48992a = i11;
        this.f48993b = str;
    }
}
