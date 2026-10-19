package X5;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: EndIconDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f7275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.material.textfield.a f7276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f7277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f7278d;

    public s(com.google.android.material.textfield.a aVar) {
        this.f7275a = aVar.f27613b;
        this.f7276b = aVar;
        this.f7277c = aVar.getContext();
        this.f7278d = aVar.f27619h;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public p h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof r;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.f7276b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }

    public void m(EditText editText) {
    }

    public void n(B0.s sVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z10) {
    }
}
