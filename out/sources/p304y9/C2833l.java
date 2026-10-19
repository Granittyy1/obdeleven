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

/* JADX INFO: renamed from: y9.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DevicePointerDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class C2833l {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48599c;

    /* JADX INFO: renamed from: y9.l$a */
    /* JADX INFO: compiled from: DevicePointerDTO.kt */
    @d
    public static final class a implements D<C2833l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48600a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48600a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.DevicePointerDTO", aVar, 3);
            c1536l0.k("objectId", false);
            c1536l0.k("__type", true);
            c1536l0.k("className", true);
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
            return new C2833l(strJ, i10, strJ2, strJ3);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            C2833l value = (C2833l) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48597a);
            boolean zV = bVarA.v(c1536l0);
            String str = value.f48598b;
            if (zV || !i.a(str, "Pointer")) {
                bVarA.p(c1536l0, 1, str);
            }
            boolean zV2 = bVarA.v(c1536l0);
            String str2 = value.f48599c;
            if (zV2 || !i.a(str2, "Devices")) {
                bVarA.p(c1536l0, 2, str2);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: renamed from: y9.l$b */
    /* JADX INFO: compiled from: DevicePointerDTO.kt */
    public static final class b {
        public final Ya.b<C2833l> serializer() {
            return a.f48600a;
        }
    }

    @d
    public /* synthetic */ C2833l(String str, int i10, String str2, String str3) {
        if (1 != (i10 & 1)) {
            p241t7.b.w(i10, 1, a.f48600a.getDescriptor());
            throw null;
        }
        this.f48597a = str;
        if ((i10 & 2) == 0) {
            this.f48598b = "Pointer";
        } else {
            this.f48598b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f48599c = "Devices";
        } else {
            this.f48599c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2833l)) {
            return false;
        }
        C2833l c2833l = (C2833l) obj;
        return i.a(this.f48597a, c2833l.f48597a) && i.a(this.f48598b, c2833l.f48598b) && i.a(this.f48599c, c2833l.f48599c);
    }

    public final int hashCode() {
        return this.f48599c.hashCode() + B1.a.b(this.f48598b, this.f48597a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DevicePointerDTO(id=");
        sb2.append(this.f48597a);
        sb2.append(", type=");
        sb2.append(this.f48598b);
        sb2.append(", className=");
        return Q8.d.a(sb2, this.f48599c, ")");
    }
}
