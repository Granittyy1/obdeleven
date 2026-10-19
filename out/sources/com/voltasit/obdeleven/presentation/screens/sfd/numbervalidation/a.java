package com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation;

import Q8.d;
import androidx.compose.animation.D;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: NumberConfirmationState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f33072d;

    public a(String number, String str, String str2, boolean z10) {
        i.e(number, "number");
        this.f33069a = number;
        this.f33070b = str;
        this.f33071c = z10;
        this.f33072d = str2;
    }

    public static a a(a aVar, String code, boolean z10, String error, int i10) {
        String number = aVar.f33069a;
        if ((i10 & 2) != 0) {
            code = aVar.f33070b;
        }
        if ((i10 & 4) != 0) {
            z10 = aVar.f33071c;
        }
        if ((i10 & 8) != 0) {
            error = aVar.f33072d;
        }
        aVar.getClass();
        i.e(number, "number");
        i.e(code, "code");
        i.e(error, "error");
        return new a(number, code, error, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f33069a, aVar.f33069a) && i.a(this.f33070b, aVar.f33070b) && this.f33071c == aVar.f33071c && i.a(this.f33072d, aVar.f33072d);
    }

    public final int hashCode() {
        return this.f33072d.hashCode() + D.b(B1.a.b(this.f33070b, this.f33069a.hashCode() * 31, 31), 31, this.f33071c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NumberConfirmationState(number=");
        sb2.append(this.f33069a);
        sb2.append(", code=");
        sb2.append(this.f33070b);
        sb2.append(", isLoading=");
        sb2.append(this.f33071c);
        sb2.append(", error=");
        return d.a(sb2, this.f33072d, ")");
    }
}
