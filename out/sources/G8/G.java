package G8;

/* JADX INFO: compiled from: UserPersonalInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f3425i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f3426k;

    public G() {
        this(null, null, null, null, null, null, null, null, 2047);
    }

    public static G a(G g10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10) {
        String firstName = (i10 & 1) != 0 ? g10.f3417a : str;
        String lastName = (i10 & 2) != 0 ? g10.f3418b : str2;
        String email = (i10 & 4) != 0 ? g10.f3419c : str3;
        String phoneCountryCode = (i10 & 8) != 0 ? g10.f3420d : str4;
        String phoneNumber = (i10 & 16) != 0 ? g10.f3421e : str5;
        String countryCode = (i10 & 32) != 0 ? g10.f3422f : str6;
        String workshopId = (i10 & 64) != 0 ? g10.f3423g : str7;
        String workshopAddress = (i10 & 128) != 0 ? g10.f3424h : str8;
        long j = g10.f3425i;
        boolean z10 = g10.j;
        long j10 = g10.f3426k;
        g10.getClass();
        kotlin.jvm.internal.i.e(firstName, "firstName");
        kotlin.jvm.internal.i.e(lastName, "lastName");
        kotlin.jvm.internal.i.e(email, "email");
        kotlin.jvm.internal.i.e(phoneCountryCode, "phoneCountryCode");
        kotlin.jvm.internal.i.e(phoneNumber, "phoneNumber");
        kotlin.jvm.internal.i.e(countryCode, "countryCode");
        kotlin.jvm.internal.i.e(workshopId, "workshopId");
        kotlin.jvm.internal.i.e(workshopAddress, "workshopAddress");
        return new G(firstName, lastName, email, phoneCountryCode, phoneNumber, countryCode, workshopId, workshopAddress, j, z10, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return kotlin.jvm.internal.i.a(this.f3417a, g10.f3417a) && kotlin.jvm.internal.i.a(this.f3418b, g10.f3418b) && kotlin.jvm.internal.i.a(this.f3419c, g10.f3419c) && kotlin.jvm.internal.i.a(this.f3420d, g10.f3420d) && kotlin.jvm.internal.i.a(this.f3421e, g10.f3421e) && kotlin.jvm.internal.i.a(this.f3422f, g10.f3422f) && kotlin.jvm.internal.i.a(this.f3423g, g10.f3423g) && kotlin.jvm.internal.i.a(this.f3424h, g10.f3424h) && this.f3425i == g10.f3425i && this.j == g10.j && this.f3426k == g10.f3426k;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3426k) + androidx.compose.animation.D.b(C4.b.c(this.f3425i, B1.a.b(this.f3424h, B1.a.b(this.f3423g, B1.a.b(this.f3422f, B1.a.b(this.f3421e, B1.a.b(this.f3420d, B1.a.b(this.f3419c, B1.a.b(this.f3418b, this.f3417a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserPersonalInfo(firstName=");
        sb2.append(this.f3417a);
        sb2.append(", lastName=");
        sb2.append(this.f3418b);
        sb2.append(", email=");
        sb2.append(this.f3419c);
        sb2.append(", phoneCountryCode=");
        sb2.append(this.f3420d);
        sb2.append(", phoneNumber=");
        sb2.append(this.f3421e);
        sb2.append(", countryCode=");
        sb2.append(this.f3422f);
        sb2.append(", workshopId=");
        sb2.append(this.f3423g);
        sb2.append(", workshopAddress=");
        sb2.append(this.f3424h);
        sb2.append(", createdAtTimeStamp=");
        sb2.append(this.f3425i);
        sb2.append(", isPhoneNumberValidated=");
        sb2.append(this.j);
        sb2.append(", phoneNumberValidationTimeStamp=");
        return p005a4.o.d(this.f3426k, ")", sb2);
    }

    public /* synthetic */ G(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5, (i10 & 32) != 0 ? "" : str6, (i10 & 64) != 0 ? "" : str7, (i10 & 128) != 0 ? "" : str8, 0L, false, 0L);
    }

    public G(String firstName, String lastName, String email, String phoneCountryCode, String phoneNumber, String countryCode, String workshopId, String workshopAddress, long j, boolean z10, long j10) {
        kotlin.jvm.internal.i.e(firstName, "firstName");
        kotlin.jvm.internal.i.e(lastName, "lastName");
        kotlin.jvm.internal.i.e(email, "email");
        kotlin.jvm.internal.i.e(phoneCountryCode, "phoneCountryCode");
        kotlin.jvm.internal.i.e(phoneNumber, "phoneNumber");
        kotlin.jvm.internal.i.e(countryCode, "countryCode");
        kotlin.jvm.internal.i.e(workshopId, "workshopId");
        kotlin.jvm.internal.i.e(workshopAddress, "workshopAddress");
        this.f3417a = firstName;
        this.f3418b = lastName;
        this.f3419c = email;
        this.f3420d = phoneCountryCode;
        this.f3421e = phoneNumber;
        this.f3422f = countryCode;
        this.f3423g = workshopId;
        this.f3424h = workshopAddress;
        this.f3425i = j;
        this.j = z10;
        this.f3426k = j10;
    }
}
