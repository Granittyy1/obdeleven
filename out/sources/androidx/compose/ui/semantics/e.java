package androidx.compose.ui.semantics;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lambda f15198b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(String str, Ia.a<Boolean> aVar) {
        this.f15197a = str;
        this.f15198b = (Lambda) aVar;
    }

    public final String a() {
        return this.f15197a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.i.a(this.f15197a, eVar.f15197a) && this.f15198b == eVar.f15198b;
    }

    public final int hashCode() {
        return this.f15198b.hashCode() + (this.f15197a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.f15197a + ", action=" + this.f15198b + ')';
    }
}
