package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: SoftwareKeyboardControllerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f16846a;

    /* JADX INFO: compiled from: SoftwareKeyboardControllerCompat.java */
    public static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f16847a;

        public a(View view) {
            this.f16847a = view;
        }

        public void a() {
            View view = this.f16847a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        public void b() {
            View viewFindViewById;
            View view = this.f16847a;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
                viewFindViewById = view;
            } else {
                viewFindViewById = view.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = view.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new androidx.compose.material.ripple.k(2, viewFindViewById));
        }
    }

    /* JADX INFO: compiled from: SoftwareKeyboardControllerCompat.java */
    public static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f16848b;

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.core.view.G] */
        @Override // androidx.core.view.D.a
        public final void a() {
            View view = this.f16848b;
            WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r10 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.G
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    atomicBoolean.set((i10 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r10);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r10);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.D.a
        public final void b() {
            View view = this.f16848b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }
    }

    /* JADX INFO: compiled from: SoftwareKeyboardControllerCompat.java */
    public static class c {
    }

    public D(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.f16846a = new a(view);
            return;
        }
        b bVar = new b(view);
        bVar.f16848b = view;
        this.f16846a = bVar;
    }
}
