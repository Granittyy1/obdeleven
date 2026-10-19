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

/* JADX INFO: renamed from: y9.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppTranslationDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class C2824c {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48552d;

    /* JADX INFO: renamed from: y9.c$a */
    /* JADX INFO: compiled from: AppTranslationDTO.kt */
    @d
    public static final class a implements D<C2824c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48553a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48553a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.AppTranslationDTO", aVar, 4);
            c1536l0.k("ocaId", false);
            c1536l0.k("language", false);
            c1536l0.k("type", false);
            c1536l0.k("translation", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var, y0Var, Za.a.c(y0Var)};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
            String strJ2 = null;
            String strJ3 = null;
            String str = null;
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
                    strJ3 = aVarA.j(c1536l0, 2);
                    i10 |= 4;
                } else {
                    if (iO != 3) {
                        throw new UnknownFieldException(iO);
                    }
                    str = (String) aVarA.d(c1536l0, 3, y0.f22677a, str);
                    i10 |= 8;
                }
            }
            aVarA.c(c1536l0);
            return new C2824c(i10, strJ, strJ2, strJ3, str);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            C2824c value = (C2824c) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48549a);
            bVarA.p(c1536l0, 1, value.f48550b);
            bVarA.p(c1536l0, 2, value.f48551c);
            boolean zV = bVarA.v(c1536l0);
            String str = value.f48552d;
            if (zV || !i.a(str, "")) {
                bVarA.q(c1536l0, 3, y0.f22677a, str);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: renamed from: y9.c$b */
    /* JADX INFO: compiled from: AppTranslationDTO.kt */
    public static final class b {
        public final Ya.b<C2824c> serializer() {
            return a.f48553a;
        }
    }

    @d
    public /* synthetic */ C2824c(int i10, String str, String str2, String str3, String str4) {
        if (7 != (i10 & 7)) {
            p241t7.b.w(i10, 7, a.f48553a.getDescriptor());
            throw null;
        }
        this.f48549a = str;
        this.f48550b = str2;
        this.f48551c = str3;
        if ((i10 & 8) == 0) {
            this.f48552d = "";
        } else {
            this.f48552d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2824c)) {
            return false;
        }
        C2824c c2824c = (C2824c) obj;
        return i.a(this.f48549a, c2824c.f48549a) && i.a(this.f48550b, c2824c.f48550b) && i.a(this.f48551c, c2824c.f48551c) && i.a(this.f48552d, c2824c.f48552d);
    }

    public final int hashCode() {
        int iB = B1.a.b(this.f48551c, B1.a.b(this.f48550b, this.f48549a.hashCode() * 31, 31), 31);
        String str = this.f48552d;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppTranslationDTO(ocaId=");
        sb2.append(this.f48549a);
        sb2.append(", language=");
        sb2.append(this.f48550b);
        sb2.append(", type=");
        sb2.append(this.f48551c);
        sb2.append(", translation=");
        return Q8.d.a(sb2, this.f48552d, ")");
    }
}
