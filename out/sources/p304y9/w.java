package p304y9;

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

/* JADX INFO: compiled from: ParseErrorDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class w {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48659c;

    /* JADX INFO: compiled from: ParseErrorDTO.kt */
    @d
    public static final class a implements D<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48660a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48660a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.ParseErrorDTO", aVar, 3);
            c1536l0.k("code", false);
            c1536l0.k("error", true);
            c1536l0.k("message", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{I.f22555a, Za.a.c(y0Var), Za.a.c(y0Var)};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String str = null;
            boolean z10 = true;
            String str2 = null;
            int i10 = 0;
            int iH = 0;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    iH = aVarA.h(c1536l0, 0);
                    i10 |= 1;
                } else if (iO == 1) {
                    str = (String) aVarA.d(c1536l0, 1, y0.f22677a, str);
                    i10 |= 2;
                } else {
                    if (iO != 2) {
                        throw new UnknownFieldException(iO);
                    }
                    str2 = (String) aVarA.d(c1536l0, 2, y0.f22677a, str2);
                    i10 |= 4;
                }
            }
            aVarA.c(c1536l0);
            return new w(i10, iH, str, str2);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            w value = (w) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.g(0, value.f48657a, c1536l0);
            boolean zV = bVarA.v(c1536l0);
            String str = value.f48658b;
            if (zV || str != null) {
                bVarA.q(c1536l0, 1, y0.f22677a, str);
            }
            boolean zV2 = bVarA.v(c1536l0);
            String str2 = value.f48659c;
            if (zV2 || str2 != null) {
                bVarA.q(c1536l0, 2, y0.f22677a, str2);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: ParseErrorDTO.kt */
    public static final class b {
        public final Ya.b<w> serializer() {
            return a.f48660a;
        }
    }

    @d
    public /* synthetic */ w(int i10, int i11, String str, String str2) {
        if (1 != (i10 & 1)) {
            p241t7.b.w(i10, 1, a.f48660a.getDescriptor());
            throw null;
        }
        this.f48657a = i11;
        if ((i10 & 2) == 0) {
            this.f48658b = null;
        } else {
            this.f48658b = str;
        }
        if ((i10 & 4) == 0) {
            this.f48659c = null;
        } else {
            this.f48659c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f48657a == wVar.f48657a && i.a(this.f48658b, wVar.f48658b) && i.a(this.f48659c, wVar.f48659c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f48657a) * 31;
        String str = this.f48658b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f48659c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParseErrorDTO(code=");
        sb2.append(this.f48657a);
        sb2.append(", error=");
        sb2.append(this.f48658b);
        sb2.append(", message=");
        return Q8.d.a(sb2, this.f48659c, ")");
    }
}
