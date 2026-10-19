package androidx.compose.ui.text.input;

import androidx.compose.ui.text.C1260a;

/* JADX INFO: compiled from: VisualTransformation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1260a f15484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f15485b;

    public D(C1260a c1260a, r rVar) {
        this.f15484a = c1260a;
        this.f15485b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return kotlin.jvm.internal.i.a(this.f15484a, d10.f15484a) && kotlin.jvm.internal.i.a(this.f15485b, d10.f15485b);
    }

    public final int hashCode() {
        return this.f15485b.hashCode() + (this.f15484a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f15484a) + ", offsetMapping=" + this.f15485b + ')';
    }
}
