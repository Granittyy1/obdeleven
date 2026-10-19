package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.n0;
import java.util.List;

/* JADX INFO: compiled from: WindowInsets.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C extends androidx.core.view.c0.b implements Runnable, InterfaceC1309y, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f10103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n0 f10106g;

    public C(c0 c0Var) {
        super(!c0Var.f10272s ? 1 : 0);
        this.f10103d = c0Var;
    }

    @Override // androidx.core.view.c0.b
    public final void a(androidx.core.view.c0 c0Var) {
        this.f10104e = false;
        this.f10105f = false;
        n0 n0Var = this.f10106g;
        if (c0Var.f16889a.a() != 0 && n0Var != null) {
            c0 c0Var2 = this.f10103d;
            c0Var2.getClass();
            n0.k kVar = n0Var.f16948a;
            c0Var2.f10271r.f(e0.a(kVar.g(8)));
            c0Var2.f10270q.f(e0.a(kVar.g(8)));
            c0.a(c0Var2, n0Var);
        }
        this.f10106g = null;
    }

    @Override // androidx.core.view.c0.b
    public final void b() {
        this.f10104e = true;
        this.f10105f = true;
    }

    @Override // androidx.core.view.c0.b
    public final n0 c(n0 n0Var, List<androidx.core.view.c0> list) {
        c0 c0Var = this.f10103d;
        c0.a(c0Var, n0Var);
        return c0Var.f10272s ? n0.f16947b : n0Var;
    }

    @Override // androidx.core.view.c0.b
    public final androidx.core.view.c0.a d(androidx.core.view.c0.a aVar) {
        this.f10104e = false;
        return aVar;
    }

    @Override // androidx.core.view.InterfaceC1309y
    public final n0 g(View view, n0 n0Var) {
        this.f10106g = n0Var;
        c0 c0Var = this.f10103d;
        c0Var.getClass();
        n0.k kVar = n0Var.f16948a;
        c0Var.f10270q.f(e0.a(kVar.g(8)));
        if (this.f10104e) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f10105f) {
            c0Var.f10271r.f(e0.a(kVar.g(8)));
            c0.a(c0Var, n0Var);
        }
        return c0Var.f10272s ? n0.f16947b : n0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10104e) {
            this.f10104e = false;
            this.f10105f = false;
            n0 n0Var = this.f10106g;
            if (n0Var != null) {
                c0 c0Var = this.f10103d;
                c0Var.getClass();
                c0Var.f10271r.f(e0.a(n0Var.f16948a.g(8)));
                c0.a(c0Var, n0Var);
                this.f10106g = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
