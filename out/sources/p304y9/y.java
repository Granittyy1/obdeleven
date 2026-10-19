package p304y9;

import Ya.k;
import com.braze.Constants;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: PictureDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class y {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48668c;

    /* JADX INFO: compiled from: PictureDTO.kt */
    @d
    public static final class a implements D<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48669a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48669a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.PictureDTO", aVar, 3);
            c1536l0.k("__type", true);
            c1536l0.k("name", false);
            c1536l0.k(Constants.BRAZE_WEBVIEW_URL_EXTRA, false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var, y0Var};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
            boolean z10 = true;
            int i10 = 0;
            String strJ2 = null;
            String strJ3 = null;
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
                } else {
                    if (iO != 2) {
                        throw new UnknownFieldException(iO);
                    }
                    strJ3 = aVarA.j(c1536l0, 2);
                    i10 |= 4;
                }
            }
            aVarA.c(c1536l0);
            return new y(strJ, i10, strJ2, strJ3);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            y value = (y) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = y.Companion;
            boolean zV = bVarA.v(c1536l0);
            String str = value.f48666a;
            if (zV || !i.a(str, "File")) {
                bVarA.p(c1536l0, 0, str);
            }
            bVarA.p(c1536l0, 1, value.f48667b);
            bVarA.p(c1536l0, 2, value.f48668c);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: PictureDTO.kt */
    public static final class b {
        public final Ya.b<y> serializer() {
            return a.f48669a;
        }
    }

    @d
    public /* synthetic */ y(String str, int i10, String str2, String str3) {
        if (6 != (i10 & 6)) {
            p241t7.b.w(i10, 6, a.f48669a.getDescriptor());
            throw null;
        }
        this.f48666a = (i10 & 1) == 0 ? "File" : str;
        this.f48667b = str2;
        this.f48668c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return i.a(this.f48666a, yVar.f48666a) && i.a(this.f48667b, yVar.f48667b) && i.a(this.f48668c, yVar.f48668c);
    }

    public final int hashCode() {
        return this.f48668c.hashCode() + B1.a.b(this.f48667b, this.f48666a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PictureDTO(type=");
        sb2.append(this.f48666a);
        sb2.append(", name=");
        sb2.append(this.f48667b);
        sb2.append(", url=");
        return Q8.d.a(sb2, this.f48668c, ")");
    }
}
