package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f16993a;

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    public static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Window f16994a;

        public a(Window window, D d10) {
            this.f16994a = window;
        }

        public final void d(int i10) {
            View decorView = this.f16994a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    public static class b extends a {
        @Override // androidx.core.view.v0.e
        public final boolean a() {
            return (this.f16994a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.v0.e
        public final void c(boolean z10) {
            if (!z10) {
                d(8192);
                return;
            }
            Window window = this.f16994a;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    public static class c extends b {
        @Override // androidx.core.view.v0.e
        public final void b(boolean z10) {
            if (!z10) {
                d(16);
                return;
            }
            Window window = this.f16994a;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsController f16995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Window f16996b;

        public d(WindowInsetsController windowInsetsController, D d10) {
            new androidx.collection.X();
            this.f16995a = windowInsetsController;
        }

        @Override // androidx.core.view.v0.e
        public final boolean a() {
            this.f16995a.setSystemBarsAppearance(0, 0);
            return (this.f16995a.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.v0.e
        public final void b(boolean z10) {
            Window window = this.f16996b;
            if (z10) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                this.f16995a.setSystemBarsAppearance(16, 16);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            }
            this.f16995a.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.v0.e
        public final void c(boolean z10) {
            Window window = this.f16996b;
            if (z10) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                this.f16995a.setSystemBarsAppearance(8, 8);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            this.f16995a.setSystemBarsAppearance(0, 8);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    public static class e {
        public boolean a() {
            throw null;
        }

        public void b(boolean z10) {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }
    }

    public v0(Window window, View view) {
        D d10 = new D(view);
        if (Build.VERSION.SDK_INT < 30) {
            this.f16993a = new c(window, d10);
            return;
        }
        d dVar = new d(window.getInsetsController(), d10);
        dVar.f16996b = window;
        this.f16993a = dVar;
    }
}
