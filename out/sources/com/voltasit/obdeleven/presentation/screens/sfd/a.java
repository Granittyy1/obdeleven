package com.voltasit.obdeleven.presentation.screens.sfd;

import G8.G;
import androidx.compose.animation.D;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PersonalInfoFormState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f33037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f33040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f33041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f33042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f33043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f33044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f33045i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f33046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f33047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f33048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f33049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f33050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f33051p;

    public a(G g10, String str, boolean z10, boolean z11, Integer num, Integer num2, Integer num3, Integer num4, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.f33037a = g10;
        this.f33038b = str;
        this.f33039c = z10;
        this.f33040d = z11;
        this.f33041e = num;
        this.f33042f = num2;
        this.f33043g = num3;
        this.f33044h = num4;
        this.f33045i = z12;
        this.j = z13;
        this.f33046k = z14;
        this.f33047l = z15;
        this.f33048m = z16;
        this.f33049n = z17;
        this.f33050o = z18;
        this.f33051p = z19;
    }

    public static a a(a aVar, G g10, String str, boolean z10, boolean z11, Integer num, Integer num2, Integer num3, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i10) {
        G personalInfo = (i10 & 1) != 0 ? aVar.f33037a : g10;
        String countryDisplayName = (i10 & 2) != 0 ? aVar.f33038b : str;
        boolean z20 = (i10 & 4) != 0 ? aVar.f33039c : z10;
        boolean z21 = (i10 & 8) != 0 ? aVar.f33040d : z11;
        Integer num4 = (i10 & 16) != 0 ? aVar.f33041e : num;
        Integer num5 = aVar.f33042f;
        Integer num6 = (i10 & 64) != 0 ? aVar.f33043g : num2;
        Integer num7 = (i10 & 128) != 0 ? aVar.f33044h : num3;
        boolean z22 = (i10 & 256) != 0 ? aVar.f33045i : z12;
        boolean z23 = (i10 & 512) != 0 ? aVar.j : z13;
        boolean z24 = (i10 & 1024) != 0 ? aVar.f33046k : z14;
        boolean z25 = (i10 & 2048) != 0 ? aVar.f33047l : z15;
        boolean z26 = (i10 & 4096) != 0 ? aVar.f33048m : z16;
        boolean z27 = (i10 & 8192) != 0 ? aVar.f33049n : z17;
        boolean z28 = (i10 & 16384) != 0 ? aVar.f33050o : z18;
        boolean z29 = (i10 & 32768) != 0 ? aVar.f33051p : z19;
        aVar.getClass();
        i.e(personalInfo, "personalInfo");
        i.e(countryDisplayName, "countryDisplayName");
        return new a(personalInfo, countryDisplayName, z20, z21, num4, num5, num6, num7, z22, z23, z24, z25, z26, z27, z28, z29);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f33037a, aVar.f33037a) && i.a(this.f33038b, aVar.f33038b) && this.f33039c == aVar.f33039c && this.f33040d == aVar.f33040d && i.a(this.f33041e, aVar.f33041e) && i.a(this.f33042f, aVar.f33042f) && i.a(this.f33043g, aVar.f33043g) && i.a(this.f33044h, aVar.f33044h) && this.f33045i == aVar.f33045i && this.j == aVar.j && this.f33046k == aVar.f33046k && this.f33047l == aVar.f33047l && this.f33048m == aVar.f33048m && this.f33049n == aVar.f33049n && this.f33050o == aVar.f33050o && this.f33051p == aVar.f33051p;
    }

    public final int hashCode() {
        int iB = D.b(D.b(B1.a.b(this.f33038b, this.f33037a.hashCode() * 31, 31), 31, this.f33039c), 31, this.f33040d);
        Integer num = this.f33041e;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f33042f;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f33043g;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f33044h;
        return Boolean.hashCode(this.f33051p) + D.b(D.b(D.b(D.b(D.b(D.b(D.b((iHashCode3 + (num4 != null ? num4.hashCode() : 0)) * 31, 31, this.f33045i), 31, this.j), 31, this.f33046k), 31, this.f33047l), 31, this.f33048m), 31, this.f33049n), 31, this.f33050o);
    }

    public final String toString() {
        return "PersonalInfoFormState(personalInfo=" + this.f33037a + ", countryDisplayName=" + this.f33038b + ", showWorkshopInformation=" + this.f33039c + ", isSaveEnabled=" + this.f33040d + ", nameErrorId=" + this.f33041e + ", emailErrorId=" + this.f33042f + ", surnameErrorId=" + this.f33043g + ", phoneNumberErrorId=" + this.f33044h + ", showPrivacyPolicy=" + this.f33045i + ", showCountryDialog=" + this.j + ", showPhoneCodeDialog=" + this.f33046k + ", showCountryDialogWithFocus=" + this.f33047l + ", isPrivacyPolicyChecked=" + this.f33048m + ", isDataLoading=" + this.f33049n + ", showFormFields=" + this.f33050o + ", showUpdateInformation=" + this.f33051p + ")";
    }
}
