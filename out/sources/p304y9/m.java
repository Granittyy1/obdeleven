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

/* JADX INFO: compiled from: FileDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class m {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48602b;

    /* JADX INFO: compiled from: FileDTO.kt */
    @d
    public static final class a implements D<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48603a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48603a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.FileDTO", aVar, 2);
            c1536l0.k("name", true);
            c1536l0.k(Constants.BRAZE_WEBVIEW_URL_EXTRA, false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{Za.a.c(y0Var), y0Var};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String str = null;
            boolean z10 = true;
            String strJ = null;
            int i10 = 0;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    str = (String) aVarA.d(c1536l0, 0, y0.f22677a, str);
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
            return new m(i10, str, strJ);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            m value = (m) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = m.Companion;
            boolean zV = bVarA.v(c1536l0);
            String str = value.f48601a;
            if (zV || str != null) {
                bVarA.q(c1536l0, 0, y0.f22677a, str);
            }
            bVarA.p(c1536l0, 1, value.f48602b);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: FileDTO.kt */
    public static final class b {
        public final Ya.b<m> serializer() {
            return a.f48603a;
        }
    }

    @d
    public /* synthetic */ m(int i10, String str, String str2) {
        if (2 != (i10 & 2)) {
            p241t7.b.w(i10, 2, a.f48603a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f48601a = null;
        } else {
            this.f48601a = str;
        }
        this.f48602b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return i.a(this.f48601a, mVar.f48601a) && i.a(this.f48602b, mVar.f48602b);
    }

    public final int hashCode() {
        String str = this.f48601a;
        return this.f48602b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileDTO(name=");
        sb2.append(this.f48601a);
        sb2.append(", url=");
        return Q8.d.a(sb2, this.f48602b, ")");
    }
}
