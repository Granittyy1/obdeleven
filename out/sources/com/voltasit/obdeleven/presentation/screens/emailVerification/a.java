package com.voltasit.obdeleven.presentation.screens.emailVerification;

import androidx.compose.animation.D;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: EmailVerificationState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f32949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f32951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TryAgainAction f32952e;

    public a(String str, Integer num, boolean z10, boolean z11, TryAgainAction tryAgainDialogAction) {
        i.e(tryAgainDialogAction, "tryAgainDialogAction");
        this.f32948a = str;
        this.f32949b = num;
        this.f32950c = z10;
        this.f32951d = z11;
        this.f32952e = tryAgainDialogAction;
    }

    public static a a(a aVar, String str, Integer num, boolean z10, boolean z11, TryAgainAction tryAgainAction, int i10) {
        if ((i10 & 1) != 0) {
            str = aVar.f32948a;
        }
        String email = str;
        if ((i10 & 2) != 0) {
            num = aVar.f32949b;
        }
        Integer num2 = num;
        if ((i10 & 4) != 0) {
            z10 = aVar.f32950c;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = aVar.f32951d;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            tryAgainAction = aVar.f32952e;
        }
        TryAgainAction tryAgainDialogAction = tryAgainAction;
        aVar.getClass();
        i.e(email, "email");
        i.e(tryAgainDialogAction, "tryAgainDialogAction");
        return new a(email, num2, z12, z13, tryAgainDialogAction);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f32948a, aVar.f32948a) && i.a(this.f32949b, aVar.f32949b) && this.f32950c == aVar.f32950c && this.f32951d == aVar.f32951d && this.f32952e == aVar.f32952e;
    }

    public final int hashCode() {
        int iHashCode = this.f32948a.hashCode() * 31;
        Integer num = this.f32949b;
        return this.f32952e.hashCode() + D.b(D.b((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f32950c), 31, this.f32951d);
    }

    public final String toString() {
        return "EmailVerificationState(email=" + this.f32948a + ", emailErrorId=" + this.f32949b + ", isEmailValid=" + this.f32950c + ", isLoading=" + this.f32951d + ", tryAgainDialogAction=" + this.f32952e + ")";
    }
}
