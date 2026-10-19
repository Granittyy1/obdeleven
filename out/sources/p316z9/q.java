package p316z9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1527h;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;
import p293xa.d;
import p304y9.C2830i;

/* JADX INFO: compiled from: UserPersonalInfoDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class q {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f49015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f49016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f49017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f49018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f49019i;
    public final Boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C2830i f49020k;

    /* JADX INFO: compiled from: UserPersonalInfoDTO.kt */
    @d
    public static final class a implements D<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f49021a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f49021a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.UserPersonalInfoDTO", aVar, 11);
            c1536l0.k("firstName", false);
            c1536l0.k("lastName", false);
            c1536l0.k("email", false);
            c1536l0.k("phoneCountryCode", false);
            c1536l0.k("phoneNumber", false);
            c1536l0.k("country", false);
            c1536l0.k("workshopId", true);
            c1536l0.k("workshopAddress", true);
            c1536l0.k("createdAt", true);
            c1536l0.k("isPhoneNumberValidated", true);
            c1536l0.k("phoneNumberValidationDate", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var, y0Var, y0Var, y0Var, y0Var, Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(y0Var), Za.a.c(C1527h.f22612a), Za.a.c(C2830i.a.f48584a)};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Boolean bool = null;
            C2830i c2830i = null;
            String strJ = null;
            String strJ2 = null;
            String strJ3 = null;
            String strJ4 = null;
            String strJ5 = null;
            String strJ6 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            int i10 = 0;
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
                        strJ3 = aVarA.j(c1536l0, 2);
                        i10 |= 4;
                        break;
                    case 3:
                        strJ4 = aVarA.j(c1536l0, 3);
                        i10 |= 8;
                        break;
                    case 4:
                        strJ5 = aVarA.j(c1536l0, 4);
                        i10 |= 16;
                        break;
                    case 5:
                        strJ6 = aVarA.j(c1536l0, 5);
                        i10 |= 32;
                        break;
                    case 6:
                        str = (String) aVarA.d(c1536l0, 6, y0.f22677a, str);
                        i10 |= 64;
                        break;
                    case 7:
                        str2 = (String) aVarA.d(c1536l0, 7, y0.f22677a, str2);
                        i10 |= 128;
                        break;
                    case 8:
                        str3 = (String) aVarA.d(c1536l0, 8, y0.f22677a, str3);
                        i10 |= 256;
                        break;
                    case 9:
                        bool = (Boolean) aVarA.d(c1536l0, 9, C1527h.f22612a, bool);
                        i10 |= 512;
                        break;
                    case 10:
                        c2830i = (C2830i) aVarA.d(c1536l0, 10, C2830i.a.f48584a, c2830i);
                        i10 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iO);
                }
            }
            aVarA.c(c1536l0);
            return new q(i10, strJ, strJ2, strJ3, strJ4, strJ5, strJ6, str, str2, str3, bool, c2830i);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            q value = (q) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f49011a);
            bVarA.p(c1536l0, 1, value.f49012b);
            bVarA.p(c1536l0, 2, value.f49013c);
            bVarA.p(c1536l0, 3, value.f49014d);
            bVarA.p(c1536l0, 4, value.f49015e);
            bVarA.p(c1536l0, 5, value.f49016f);
            boolean zV = bVarA.v(c1536l0);
            String str = value.f49017g;
            if (zV || !i.a(str, "")) {
                bVarA.q(c1536l0, 6, y0.f22677a, str);
            }
            boolean zV2 = bVarA.v(c1536l0);
            String str2 = value.f49018h;
            if (zV2 || !i.a(str2, "")) {
                bVarA.q(c1536l0, 7, y0.f22677a, str2);
            }
            boolean zV3 = bVarA.v(c1536l0);
            String str3 = value.f49019i;
            if (zV3 || !i.a(str3, "")) {
                bVarA.q(c1536l0, 8, y0.f22677a, str3);
            }
            boolean zV4 = bVarA.v(c1536l0);
            Boolean bool = value.j;
            if (zV4 || bool != null) {
                bVarA.q(c1536l0, 9, C1527h.f22612a, bool);
            }
            boolean zV5 = bVarA.v(c1536l0);
            C2830i c2830i = value.f49020k;
            if (zV5 || c2830i != null) {
                bVarA.q(c1536l0, 10, C2830i.a.f48584a, c2830i);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: UserPersonalInfoDTO.kt */
    public static final class b {
        public final Ya.b<q> serializer() {
            return a.f49021a;
        }
    }

    public q(String firstName, String lastName, String email, String phoneCountryCode, String phoneNumber, String country, String str, String str2) {
        i.e(firstName, "firstName");
        i.e(lastName, "lastName");
        i.e(email, "email");
        i.e(phoneCountryCode, "phoneCountryCode");
        i.e(phoneNumber, "phoneNumber");
        i.e(country, "country");
        this.f49011a = firstName;
        this.f49012b = lastName;
        this.f49013c = email;
        this.f49014d = phoneCountryCode;
        this.f49015e = phoneNumber;
        this.f49016f = country;
        this.f49017g = str;
        this.f49018h = str2;
        this.f49019i = "";
        this.j = null;
        this.f49020k = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return i.a(this.f49011a, qVar.f49011a) && i.a(this.f49012b, qVar.f49012b) && i.a(this.f49013c, qVar.f49013c) && i.a(this.f49014d, qVar.f49014d) && i.a(this.f49015e, qVar.f49015e) && i.a(this.f49016f, qVar.f49016f) && i.a(this.f49017g, qVar.f49017g) && i.a(this.f49018h, qVar.f49018h) && i.a(this.f49019i, qVar.f49019i) && i.a(this.j, qVar.j) && i.a(this.f49020k, qVar.f49020k);
    }

    public final int hashCode() {
        int iB = B1.a.b(this.f49016f, B1.a.b(this.f49015e, B1.a.b(this.f49014d, B1.a.b(this.f49013c, B1.a.b(this.f49012b, this.f49011a.hashCode() * 31, 31), 31), 31), 31), 31);
        String str = this.f49017g;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f49018h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f49019i;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.j;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        C2830i c2830i = this.f49020k;
        return iHashCode4 + (c2830i != null ? c2830i.hashCode() : 0);
    }

    public final String toString() {
        return "UserPersonalInfoDTO(firstName=" + this.f49011a + ", lastName=" + this.f49012b + ", email=" + this.f49013c + ", phoneCountryCode=" + this.f49014d + ", phoneNumber=" + this.f49015e + ", country=" + this.f49016f + ", workshopId=" + this.f49017g + ", workshopAddress=" + this.f49018h + ", createdAt=" + this.f49019i + ", isPhoneNumberValidated=" + this.j + ", phoneNumberValidationDate=" + this.f49020k + ")";
    }

    @d
    public /* synthetic */ q(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, C2830i c2830i) {
        if (63 != (i10 & 63)) {
            p241t7.b.w(i10, 63, a.f49021a.getDescriptor());
            throw null;
        }
        this.f49011a = str;
        this.f49012b = str2;
        this.f49013c = str3;
        this.f49014d = str4;
        this.f49015e = str5;
        this.f49016f = str6;
        if ((i10 & 64) == 0) {
            this.f49017g = "";
        } else {
            this.f49017g = str7;
        }
        if ((i10 & 128) == 0) {
            this.f49018h = "";
        } else {
            this.f49018h = str8;
        }
        if ((i10 & 256) == 0) {
            this.f49019i = "";
        } else {
            this.f49019i = str9;
        }
        if ((i10 & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool;
        }
        if ((i10 & 1024) == 0) {
            this.f49020k = null;
        } else {
            this.f49020k = c2830i;
        }
    }
}
