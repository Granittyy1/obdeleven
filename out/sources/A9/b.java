package A9;

import kotlinx.serialization.UnknownFieldException;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.I;
import p037cb.y0;

/* JADX INFO: compiled from: CreateFirstGenDeviceResponseDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class b {
    public static final C0018b Companion = new C0018b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f993d;

    /* JADX INFO: compiled from: CreateFirstGenDeviceResponseDTO.kt */
    @p293xa.d
    public static final class a implements D<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f994a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f994a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.responses.CreateFirstGenDeviceResponseDTO", aVar, 4);
            c1536l0.k("deviceId", false);
            c1536l0.k("subscriptionBonusType", false);
            c1536l0.k("credits", false);
            c1536l0.k("serialNumber", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var, I.f22555a, y0Var};
        }

        @Override // Ya.a
        public final Object deserialize(p024bb.c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            int i10 = 0;
            int iH = 0;
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
                    iH = aVarA.h(c1536l0, 2);
                    i10 |= 4;
                } else {
                    if (iO != 3) {
                        throw new UnknownFieldException(iO);
                    }
                    strJ3 = aVarA.j(c1536l0, 3);
                    i10 |= 8;
                }
            }
            aVarA.c(c1536l0);
            return new b(strJ, strJ2, strJ3, i10, iH);
        }

        @Override // Ya.l, Ya.a
        public final p011ab.e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            b value = (b) obj;
            kotlin.jvm.internal.i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f990a);
            bVarA.p(c1536l0, 1, value.f991b);
            bVarA.g(2, value.f992c, c1536l0);
            bVarA.p(c1536l0, 3, value.f993d);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: renamed from: A9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CreateFirstGenDeviceResponseDTO.kt */
    public static final class C0018b {
        public final Ya.b<b> serializer() {
            return a.f994a;
        }
    }

    @p293xa.d
    public /* synthetic */ b(String str, String str2, String str3, int i10, int i11) {
        if (15 != (i10 & 15)) {
            p241t7.b.w(i10, 15, a.f994a.getDescriptor());
            throw null;
        }
        this.f990a = str;
        this.f991b = str2;
        this.f992c = i11;
        this.f993d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.i.a(this.f990a, bVar.f990a) && kotlin.jvm.internal.i.a(this.f991b, bVar.f991b) && this.f992c == bVar.f992c && kotlin.jvm.internal.i.a(this.f993d, bVar.f993d);
    }

    public final int hashCode() {
        return this.f993d.hashCode() + p005a4.q.b(this.f992c, B1.a.b(this.f991b, this.f990a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateFirstGenDeviceResponseDTO(deviceId=");
        sb2.append(this.f990a);
        sb2.append(", subscriptionBonusType=");
        sb2.append(this.f991b);
        sb2.append(", credits=");
        sb2.append(this.f992c);
        sb2.append(", serialNumber=");
        return Q8.d.a(sb2, this.f993d, ")");
    }
}
