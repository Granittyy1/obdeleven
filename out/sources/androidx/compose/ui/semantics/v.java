package androidx.compose.ui.semantics;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.p<T, T, T> f15254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15255c;

    public /* synthetic */ v(String str) {
        this(str, new Ia.p<Object, Object, Object>() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey$1
            @Override // Ia.p
            public final Object invoke(Object obj, Object obj2) {
                return obj == null ? obj2 : obj;
            }
        });
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f15253a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(String str, Ia.p<? super T, ? super T, ? extends T> pVar) {
        this.f15253a = str;
        this.f15254b = pVar;
    }

    public v(String str, boolean z10, Ia.p<? super T, ? super T, ? extends T> pVar) {
        this(str, pVar);
        this.f15255c = z10;
    }
}
