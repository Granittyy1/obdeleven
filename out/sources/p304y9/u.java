package p304y9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p005a4.q;
import p011ab.e;
import p024bb.c;
import p037cb.C1527h;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.I;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: OcaWriteSessionDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class u {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f48644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f48646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f48647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f48648i;

    /* JADX INFO: compiled from: OcaWriteSessionDTO.kt */
    @d
    public static final class a implements D<u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48649a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48649a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.OcaWriteSessionDTO", aVar, 9);
            c1536l0.k("ocaId", false);
            c1536l0.k("vehicleId", false);
            c1536l0.k("currentValueIndex", false);
            c1536l0.k("newValueIndex", false);
            c1536l0.k("hasOriginal", false);
            c1536l0.k("os", false);
            c1536l0.k("appVersion", false);
            c1536l0.k("mileage", false);
            c1536l0.k("languageCode", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            I i10 = I.f22555a;
            return new Ya.b[]{y0Var, y0Var, i10, i10, C1527h.f22612a, y0Var, y0Var, i10, y0Var};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            int i10 = 0;
            int iH = 0;
            int iH2 = 0;
            boolean zL = false;
            int iH3 = 0;
            String strJ = null;
            String strJ2 = null;
            String strJ3 = null;
            String strJ4 = null;
            String strJ5 = null;
            boolean z10 = true;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                switch (iO) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        strJ = aVarA.j(c1536l0, 0);
                        i10 |= 1;
                        break;
                    case 1:
                        strJ2 = aVarA.j(c1536l0, 1);
                        i10 |= 2;
                        break;
                    case 2:
                        iH = aVarA.h(c1536l0, 2);
                        i10 |= 4;
                        break;
                    case 3:
                        iH2 = aVarA.h(c1536l0, 3);
                        i10 |= 8;
                        break;
                    case 4:
                        zL = aVarA.l(c1536l0, 4);
                        i10 |= 16;
                        break;
                    case 5:
                        strJ3 = aVarA.j(c1536l0, 5);
                        i10 |= 32;
                        break;
                    case 6:
                        strJ4 = aVarA.j(c1536l0, 6);
                        i10 |= 64;
                        break;
                    case 7:
                        iH3 = aVarA.h(c1536l0, 7);
                        i10 |= 128;
                        break;
                    case 8:
                        strJ5 = aVarA.j(c1536l0, 8);
                        i10 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iO);
                }
            }
            aVarA.c(c1536l0);
            return new u(i10, strJ, strJ2, iH, iH2, zL, strJ3, strJ4, iH3, strJ5);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            u value = (u) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48640a);
            bVarA.p(c1536l0, 1, value.f48641b);
            bVarA.g(2, value.f48642c, c1536l0);
            bVarA.g(3, value.f48643d, c1536l0);
            bVarA.e(c1536l0, 4, value.f48644e);
            bVarA.p(c1536l0, 5, value.f48645f);
            bVarA.p(c1536l0, 6, value.f48646g);
            bVarA.g(7, value.f48647h, c1536l0);
            bVarA.p(c1536l0, 8, value.f48648i);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: OcaWriteSessionDTO.kt */
    public static final class b {
        public final Ya.b<u> serializer() {
            return a.f48649a;
        }
    }

    @d
    public /* synthetic */ u(int i10, String str, String str2, int i11, int i12, boolean z10, String str3, String str4, int i13, String str5) {
        if (511 != (i10 & 511)) {
            p241t7.b.w(i10, 511, a.f48649a.getDescriptor());
            throw null;
        }
        this.f48640a = str;
        this.f48641b = str2;
        this.f48642c = i11;
        this.f48643d = i12;
        this.f48644e = z10;
        this.f48645f = str3;
        this.f48646g = str4;
        this.f48647h = i13;
        this.f48648i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return i.a(this.f48640a, uVar.f48640a) && i.a(this.f48641b, uVar.f48641b) && this.f48642c == uVar.f48642c && this.f48643d == uVar.f48643d && this.f48644e == uVar.f48644e && i.a(this.f48645f, uVar.f48645f) && i.a(this.f48646g, uVar.f48646g) && this.f48647h == uVar.f48647h && i.a(this.f48648i, uVar.f48648i);
    }

    public final int hashCode() {
        return this.f48648i.hashCode() + q.b(this.f48647h, B1.a.b(this.f48646g, B1.a.b(this.f48645f, androidx.compose.animation.D.b(q.b(this.f48643d, q.b(this.f48642c, B1.a.b(this.f48641b, this.f48640a.hashCode() * 31, 31), 31), 31), 31, this.f48644e), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OcaWriteSessionDTO(ocaId=");
        sb2.append(this.f48640a);
        sb2.append(", vehicleId=");
        sb2.append(this.f48641b);
        sb2.append(", currentValueIndex=");
        sb2.append(this.f48642c);
        sb2.append(", newValueIndex=");
        sb2.append(this.f48643d);
        sb2.append(", hasOriginal=");
        sb2.append(this.f48644e);
        sb2.append(", os=");
        sb2.append(this.f48645f);
        sb2.append(", appVersion=");
        sb2.append(this.f48646g);
        sb2.append(", mileage=");
        sb2.append(this.f48647h);
        sb2.append(", languageCode=");
        return Q8.d.a(sb2, this.f48648i, ")");
    }

    public u(String ocaId, String str, int i10, int i11, boolean z10, String os, int i12, String str2) {
        i.e(ocaId, "ocaId");
        i.e(os, "os");
        this.f48640a = ocaId;
        this.f48641b = str;
        this.f48642c = i10;
        this.f48643d = i11;
        this.f48644e = z10;
        this.f48645f = os;
        this.f48646g = "0.107.1(10800)";
        this.f48647h = i12;
        this.f48648i = str2;
    }
}
