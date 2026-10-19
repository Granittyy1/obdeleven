package p304y9;

import C4.v;
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

/* JADX INFO: renamed from: y9.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DeviceBonusDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class C2831j {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48588d;

    /* JADX INFO: renamed from: y9.j$a */
    /* JADX INFO: compiled from: DeviceBonusDTO.kt */
    @d
    public static final class a implements D<C2831j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48589a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48589a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.DeviceBonusDTO", aVar, 4);
            c1536l0.k("deviceId", false);
            c1536l0.k("subscriptionBonusType", false);
            c1536l0.k("credits", false);
            c1536l0.k("isPinSet", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var, I.f22555a, C1527h.f22612a};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            int i10 = 0;
            int iH = 0;
            boolean zL = false;
            String strJ = null;
            String strJ2 = null;
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
                    iH = aVarA.h(c1536l0, 2);
                    i10 |= 4;
                } else {
                    if (iO != 3) {
                        throw new UnknownFieldException(iO);
                    }
                    zL = aVarA.l(c1536l0, 3);
                    i10 |= 8;
                }
            }
            aVarA.c(c1536l0);
            return new C2831j(i10, iH, strJ, strJ2, zL);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            C2831j value = (C2831j) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48585a);
            bVarA.p(c1536l0, 1, value.f48586b);
            bVarA.g(2, value.f48587c, c1536l0);
            bVarA.e(c1536l0, 3, value.f48588d);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: renamed from: y9.j$b */
    /* JADX INFO: compiled from: DeviceBonusDTO.kt */
    public static final class b {
        public final Ya.b<C2831j> serializer() {
            return a.f48589a;
        }
    }

    @d
    public /* synthetic */ C2831j(int i10, int i11, String str, String str2, boolean z10) {
        if (15 != (i10 & 15)) {
            p241t7.b.w(i10, 15, a.f48589a.getDescriptor());
            throw null;
        }
        this.f48585a = str;
        this.f48586b = str2;
        this.f48587c = i11;
        this.f48588d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2831j)) {
            return false;
        }
        C2831j c2831j = (C2831j) obj;
        return i.a(this.f48585a, c2831j.f48585a) && i.a(this.f48586b, c2831j.f48586b) && this.f48587c == c2831j.f48587c && this.f48588d == c2831j.f48588d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48588d) + q.b(this.f48587c, B1.a.b(this.f48586b, this.f48585a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceBonusDTO(deviceId=");
        sb2.append(this.f48585a);
        sb2.append(", subscriptionBonusType=");
        sb2.append(this.f48586b);
        sb2.append(", credits=");
        sb2.append(this.f48587c);
        sb2.append(", isPinSet=");
        return v.f(sb2, this.f48588d, ")");
    }
}
