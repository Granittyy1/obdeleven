package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Window;

/* JADX INFO: compiled from: DecorToolbar.java */
/* JADX INFO: loaded from: classes.dex */
public interface C {
    boolean a();

    void b();

    boolean c();

    void collapseActionView();

    void d(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.j.a aVar);

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    boolean i();

    void j(int i10);

    void k();

    void l(int i10);

    androidx.core.view.Z m(int i10, long j);

    int n();

    void o(int i10);

    void p(Drawable drawable);

    void q(boolean z10);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
