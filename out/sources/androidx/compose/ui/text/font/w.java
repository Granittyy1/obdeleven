package androidx.compose.ui.text.font;

import androidx.compose.runtime.N0;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
public interface w extends N0<Object> {

    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    public static final class a implements w {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f15462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f15463c;

        public a(Object obj, boolean z10) {
            this.f15462b = obj;
            this.f15463c = z10;
        }

        @Override // androidx.compose.ui.text.font.w
        public final boolean c() {
            return this.f15463c;
        }

        @Override // androidx.compose.runtime.N0
        public final Object getValue() {
            return this.f15462b;
        }
    }

    boolean c();
}
