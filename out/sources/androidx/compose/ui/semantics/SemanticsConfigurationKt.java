package androidx.compose.ui.semantics;

/* JADX INFO: compiled from: SemanticsConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SemanticsConfigurationKt {
    public static final <T> T a(l lVar, v<T> vVar) {
        T t8 = (T) lVar.f15234b.d(vVar);
        return t8 == null ? new Ia.a<T>() { // from class: androidx.compose.ui.semantics.SemanticsConfigurationKt$getOrNull$1
            @Override // Ia.a
            public final T invoke() {
                return null;
            }
        }.invoke() : t8;
    }
}
