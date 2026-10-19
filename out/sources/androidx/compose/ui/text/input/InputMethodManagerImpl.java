package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: compiled from: InputMethodManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@p293xa.d
public final class InputMethodManagerImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f15487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15488b = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<InputMethodManager>() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        @Override // Ia.a
        public final InputMethodManager invoke() {
            Object systemService = this.this$0.f15487a.getContext().getSystemService("input_method");
            kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.core.view.D f15489c;

    public InputMethodManagerImpl(View view) {
        this.f15487a = view;
        this.f15489c = new androidx.core.view.D(view);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final void a(int i10, int i11, int i12, int i13) {
        ((InputMethodManager) this.f15488b.getValue()).updateSelection(this.f15487a, i10, i11, i12, i13);
    }
}
