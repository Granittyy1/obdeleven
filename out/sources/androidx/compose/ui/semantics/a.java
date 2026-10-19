package androidx.compose.ui.semantics;

import p293xa.e;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a<T extends p293xa.e<? extends Boolean>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f15191b;

    public a(String str, T t8) {
        this.f15190a = str;
        this.f15191b = t8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.i.a(this.f15190a, aVar.f15190a) && kotlin.jvm.internal.i.a(this.f15191b, aVar.f15191b);
    }

    public final int hashCode() {
        String str = this.f15190a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t8 = this.f15191b;
        return iHashCode + (t8 != null ? t8.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f15190a + ", action=" + this.f15191b + ')';
    }
}
