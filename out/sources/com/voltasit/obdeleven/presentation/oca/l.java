package com.voltasit.obdeleven.presentation.oca;

/* JADX INFO: compiled from: TryAgainDialogData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32785b;

    public l(int i10, String str) {
        this.f32784a = i10;
        this.f32785b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f32784a == lVar.f32784a && kotlin.jvm.internal.i.a(this.f32785b, lVar.f32785b);
    }

    public final int hashCode() {
        return this.f32785b.hashCode() + (Integer.hashCode(this.f32784a) * 31);
    }

    public final String toString() {
        return "TryAgainDialogData(textId=" + this.f32784a + ", tag=" + this.f32785b + ")";
    }
}
