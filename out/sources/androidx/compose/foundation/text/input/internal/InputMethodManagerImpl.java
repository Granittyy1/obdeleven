package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: compiled from: InputMethodManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InputMethodManagerImpl implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f11287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11288b = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<InputMethodManager>() { // from class: androidx.compose.foundation.text.input.internal.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        @Override // Ia.a
        public final InputMethodManager invoke() {
            Object systemService = this.this$0.f11287a.getContext().getSystemService("input_method");
            kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    });

    public InputMethodManagerImpl(View view) {
        this.f11287a = view;
    }

    @Override // androidx.compose.foundation.text.input.internal.S
    public final void a() {
        if (Build.VERSION.SDK_INT >= 34) {
            b().startStylusHandwriting(this.f11287a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final InputMethodManager b() {
        return (InputMethodManager) this.f11288b.getValue();
    }

    public final void c(int i10, int i11, int i12, int i13) {
        b().updateSelection(this.f11287a, i10, i11, i12, i13);
    }
}
