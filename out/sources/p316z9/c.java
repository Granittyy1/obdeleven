package p316z9;

import C4.v;
import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p037cb.C1527h;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: DeviceBonusRequestDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class c {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f48962e;

    /* JADX INFO: compiled from: DeviceBonusRequestDTO.kt */
    @d
    public static final class a implements D<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48963a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48963a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.DeviceBonusRequestDTO", aVar, 5);
            c1536l0.k("cpuId", false);
            c1536l0.k("serialNumber", false);
            c1536l0.k("mac", false);
            c1536l0.k("consumePro", false);
            c1536l0.k("consumeCredits", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            C1527h c1527h = C1527h.f22612a;
            return new Ya.b[]{y0Var, y0Var, y0Var, c1527h, c1527h};
        }

        @Override // Ya.a
        public final Object deserialize(p024bb.c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            int i10 = 0;
            boolean zL = false;
            boolean zL2 = false;
            String strJ = null;
            String strJ2 = null;
            String strJ3 = null;
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
                } else if (iO == 3) {
                    zL = aVarA.l(c1536l0, 3);
                    i10 |= 8;
                } else {
                    if (iO != 4) {
                        throw new UnknownFieldException(iO);
                    }
                    zL2 = aVarA.l(c1536l0, 4);
                    i10 |= 16;
                }
            }
            aVarA.c(c1536l0);
            return new c(i10, strJ, strJ2, strJ3, zL, zL2);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            c value = (c) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48958a);
            bVarA.p(c1536l0, 1, value.f48959b);
            bVarA.p(c1536l0, 2, value.f48960c);
            bVarA.e(c1536l0, 3, value.f48961d);
            bVarA.e(c1536l0, 4, value.f48962e);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: DeviceBonusRequestDTO.kt */
    public static final class b {
        public final Ya.b<c> serializer() {
            return a.f48963a;
        }
    }

    @d
    public /* synthetic */ c(int i10, String str, String str2, String str3, boolean z10, boolean z11) {
        if (31 != (i10 & 31)) {
            p241t7.b.w(i10, 31, a.f48963a.getDescriptor());
            throw null;
        }
        this.f48958a = str;
        this.f48959b = str2;
        this.f48960c = str3;
        this.f48961d = z10;
        this.f48962e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.f48958a, cVar.f48958a) && i.a(this.f48959b, cVar.f48959b) && i.a(this.f48960c, cVar.f48960c) && this.f48961d == cVar.f48961d && this.f48962e == cVar.f48962e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48962e) + androidx.compose.animation.D.b(B1.a.b(this.f48960c, B1.a.b(this.f48959b, this.f48958a.hashCode() * 31, 31), 31), 31, this.f48961d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceBonusRequestDTO(cpuId=");
        sb2.append(this.f48958a);
        sb2.append(", serialNumber=");
        sb2.append(this.f48959b);
        sb2.append(", mac=");
        sb2.append(this.f48960c);
        sb2.append(", consumePro=");
        sb2.append(this.f48961d);
        sb2.append(", consumeCredits=");
        return v.f(sb2, this.f48962e, ")");
    }

    public c(String cpuId, String serialNumber, String str, boolean z10, boolean z11) {
        i.e(cpuId, "cpuId");
        i.e(serialNumber, "serialNumber");
        this.f48958a = cpuId;
        this.f48959b = serialNumber;
        this.f48960c = str;
        this.f48961d = z10;
        this.f48962e = z11;
    }
}
