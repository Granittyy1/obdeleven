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

/* JADX INFO: renamed from: y9.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DeviceDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class C2832k {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f48594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48595f;

    /* JADX INFO: renamed from: y9.k$a */
    /* JADX INFO: compiled from: DeviceDTO.kt */
    @d
    public static final class a implements D<C2832k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48596a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48596a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.DeviceDTO", aVar, 6);
            c1536l0.k("mac", true);
            c1536l0.k("serialNumber", true);
            c1536l0.k("cpuId", true);
            c1536l0.k("version", true);
            c1536l0.k("gen", true);
            c1536l0.k("email", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(I.f22555a), Za.a.c(y0Var)};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            int i10 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num = null;
            String str5 = null;
            boolean z10 = true;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                switch (iO) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        str = (String) aVarA.d(c1536l0, 0, y0.f22677a, str);
                        i10 |= 1;
                        break;
                    case 1:
                        str2 = (String) aVarA.d(c1536l0, 1, y0.f22677a, str2);
                        i10 |= 2;
                        break;
                    case 2:
                        str3 = (String) aVarA.d(c1536l0, 2, y0.f22677a, str3);
                        i10 |= 4;
                        break;
                    case 3:
                        str4 = (String) aVarA.d(c1536l0, 3, y0.f22677a, str4);
                        i10 |= 8;
                        break;
                    case 4:
                        num = (Integer) aVarA.d(c1536l0, 4, I.f22555a, num);
                        i10 |= 16;
                        break;
                    case 5:
                        str5 = (String) aVarA.d(c1536l0, 5, y0.f22677a, str5);
                        i10 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iO);
                }
            }
            aVarA.c(c1536l0);
            return new C2832k(i10, str, str2, str3, str4, num, str5);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            C2832k value = (C2832k) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = C2832k.Companion;
            boolean zV = bVarA.v(c1536l0);
            String str = value.f48590a;
            if (zV || str != null) {
                bVarA.q(c1536l0, 0, y0.f22677a, str);
            }
            boolean zV2 = bVarA.v(c1536l0);
            String str2 = value.f48591b;
            if (zV2 || str2 != null) {
                bVarA.q(c1536l0, 1, y0.f22677a, str2);
            }
            boolean zV3 = bVarA.v(c1536l0);
            String str3 = value.f48592c;
            if (zV3 || str3 != null) {
                bVarA.q(c1536l0, 2, y0.f22677a, str3);
            }
            boolean zV4 = bVarA.v(c1536l0);
            String str4 = value.f48593d;
            if (zV4 || str4 != null) {
                bVarA.q(c1536l0, 3, y0.f22677a, str4);
            }
            boolean zV5 = bVarA.v(c1536l0);
            Integer num = value.f48594e;
            if (zV5 || num != null) {
                bVarA.q(c1536l0, 4, I.f22555a, num);
            }
            boolean zV6 = bVarA.v(c1536l0);
            String str5 = value.f48595f;
            if (zV6 || str5 != null) {
                bVarA.q(c1536l0, 5, y0.f22677a, str5);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: renamed from: y9.k$b */
    /* JADX INFO: compiled from: DeviceDTO.kt */
    public static final class b {
        public final Ya.b<C2832k> serializer() {
            return a.f48596a;
        }
    }

    public C2832k() {
        this(null, null, null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2832k)) {
            return false;
        }
        C2832k c2832k = (C2832k) obj;
        return i.a(this.f48590a, c2832k.f48590a) && i.a(this.f48591b, c2832k.f48591b) && i.a(this.f48592c, c2832k.f48592c) && i.a(this.f48593d, c2832k.f48593d) && i.a(this.f48594e, c2832k.f48594e) && i.a(this.f48595f, c2832k.f48595f);
    }

    public final int hashCode() {
        String str = this.f48590a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f48591b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f48592c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f48593d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f48594e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f48595f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceDTO(mac=");
        sb2.append(this.f48590a);
        sb2.append(", serialNumber=");
        sb2.append(this.f48591b);
        sb2.append(", cpuId=");
        sb2.append(this.f48592c);
        sb2.append(", version=");
        sb2.append(this.f48593d);
        sb2.append(", gen=");
        sb2.append(this.f48594e);
        sb2.append(", email=");
        return Q8.d.a(sb2, this.f48595f, ")");
    }

    @d
    public /* synthetic */ C2832k(int i10, String str, String str2, String str3, String str4, Integer num, String str5) {
        if ((i10 & 1) == 0) {
            this.f48590a = null;
        } else {
            this.f48590a = str;
        }
        if ((i10 & 2) == 0) {
            this.f48591b = null;
        } else {
            this.f48591b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f48592c = null;
        } else {
            this.f48592c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f48593d = null;
        } else {
            this.f48593d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f48594e = null;
        } else {
            this.f48594e = num;
        }
        if ((i10 & 32) == 0) {
            this.f48595f = null;
        } else {
            this.f48595f = str5;
        }
    }

    public C2832k(String str, String str2, String str3, String str4, Integer num, int i10) {
        str = (i10 & 1) != 0 ? null : str;
        str2 = (i10 & 2) != 0 ? null : str2;
        str3 = (i10 & 4) != 0 ? null : str3;
        str4 = (i10 & 8) != 0 ? null : str4;
        num = (i10 & 16) != 0 ? null : num;
        this.f48590a = str;
        this.f48591b = str2;
        this.f48592c = str3;
        this.f48593d = str4;
        this.f48594e = num;
        this.f48595f = null;
    }
}
