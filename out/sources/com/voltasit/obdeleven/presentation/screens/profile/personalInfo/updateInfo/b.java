package com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo;

import C4.v;
import G8.G;
import androidx.compose.animation.D;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PersonalInformationUpdateFormState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f32977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32981e;

    public b(G g10, String str, boolean z10, String str2, boolean z11) {
        this.f32977a = g10;
        this.f32978b = str;
        this.f32979c = z10;
        this.f32980d = str2;
        this.f32981e = z11;
    }

    public static b a(b bVar, G g10, String str, boolean z10, String str2, boolean z11, int i10) {
        if ((i10 & 1) != 0) {
            g10 = bVar.f32977a;
        }
        G userPersonalInfo = g10;
        if ((i10 & 2) != 0) {
            str = bVar.f32978b;
        }
        String countryDisplayName = str;
        if ((i10 & 4) != 0) {
            z10 = bVar.f32979c;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            str2 = bVar.f32980d;
        }
        String expirationDate = str2;
        if ((i10 & 16) != 0) {
            z11 = bVar.f32981e;
        }
        bVar.getClass();
        i.e(userPersonalInfo, "userPersonalInfo");
        i.e(countryDisplayName, "countryDisplayName");
        i.e(expirationDate, "expirationDate");
        return new b(userPersonalInfo, countryDisplayName, z12, expirationDate, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return i.a(this.f32977a, bVar.f32977a) && i.a(this.f32978b, bVar.f32978b) && this.f32979c == bVar.f32979c && i.a(this.f32980d, bVar.f32980d) && this.f32981e == bVar.f32981e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32981e) + B1.a.b(this.f32980d, D.b(B1.a.b(this.f32978b, this.f32977a.hashCode() * 31, 31), 31, this.f32979c), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersonalInformationUpdateFormState(userPersonalInfo=");
        sb2.append(this.f32977a);
        sb2.append(", countryDisplayName=");
        sb2.append(this.f32978b);
        sb2.append(", isDataLoading=");
        sb2.append(this.f32979c);
        sb2.append(", expirationDate=");
        sb2.append(this.f32980d);
        sb2.append(", isTryAgainDialogVisible=");
        return v.f(sb2, this.f32981e, ")");
    }
}
