package p138l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0850c;
import java.lang.ref.WeakReference;
import p100i.g;

/* JADX INFO: compiled from: StandaloneActionMode.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a implements f.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f44047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContextView f44048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g.d f44049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference<View> f44050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f44052i;

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(f fVar, MenuItem menuItem) {
        return this.f44049f.f36352a.b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(f fVar) {
        i();
        C0850c c0850c = this.f44048e.f8890e;
        if (c0850c != null) {
            c0850c.n();
        }
    }

    @Override // p138l.a
    public final void c() {
        if (this.f44051h) {
            return;
        }
        this.f44051h = true;
        this.f44049f.a(this);
    }

    @Override // p138l.a
    public final View d() {
        WeakReference<View> weakReference = this.f44050g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p138l.a
    public final f e() {
        return this.f44052i;
    }

    @Override // p138l.a
    public final MenuInflater f() {
        return new f(this.f44048e.getContext());
    }

    @Override // p138l.a
    public final CharSequence g() {
        return this.f44048e.getSubtitle();
    }

    @Override // p138l.a
    public final CharSequence h() {
        return this.f44048e.getTitle();
    }

    @Override // p138l.a
    public final void i() {
        this.f44049f.c(this, this.f44052i);
    }

    @Override // p138l.a
    public final boolean j() {
        return this.f44048e.f8567t;
    }

    @Override // p138l.a
    public final void k(View view) {
        this.f44048e.setCustomView(view);
        this.f44050g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p138l.a
    public final void l(int i10) {
        m(this.f44047d.getString(i10));
    }

    @Override // p138l.a
    public final void m(CharSequence charSequence) {
        this.f44048e.setSubtitle(charSequence);
    }

    @Override // p138l.a
    public final void n(int i10) {
        o(this.f44047d.getString(i10));
    }

    @Override // p138l.a
    public final void o(CharSequence charSequence) {
        this.f44048e.setTitle(charSequence);
    }

    @Override // p138l.a
    public final void p(boolean z10) {
        this.f44040c = z10;
        this.f44048e.setTitleOptional(z10);
    }
}
