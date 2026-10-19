package p100i;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.q;
import androidx.core.view.C1298m;
import com.voltasit.obdeleven.R;
import p138l.a;

/* JADX INFO: compiled from: AppCompatDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class m extends q implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f36389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f36390f;

    /* JADX WARN: Type inference failed for: r2v2, types: [i.l] */
    public m(Context context, int i10) {
        int i11;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = i10;
        }
        super(context, i11);
        this.f36390f = new C1298m.a() { // from class: i.l
            @Override // androidx.core.view.C1298m.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f36388b.e(keyEvent);
            }
        };
        f fVarD = d();
        if (i10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i10 = typedValue2.resourceId;
        }
        ((g) fVarD).f36320V = i10;
        fVarD.o();
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        d().c(view, layoutParams);
    }

    public final f d() {
        if (this.f36389e == null) {
            f.c cVar = f.f36284b;
            this.f36389e = new g(getContext(), getWindow(), this, this);
        }
        return this.f36389e;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().p();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1298m.b(this.f36390f, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i10) {
        return (T) d().e(i10);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().l();
    }

    @Override // androidx.activity.q, android.app.Dialog
    public void onCreate(Bundle bundle) {
        d().k();
        super.onCreate(bundle);
        d().o();
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void onStop() {
        super.onStop();
        d().t();
    }

    @Override // p100i.e
    public final a onWindowStartingSupportActionMode(a.InterfaceC0502a interfaceC0502a) {
        return null;
    }

    @Override // androidx.activity.q, android.app.Dialog
    public void setContentView(int i10) {
        c();
        d().w(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().B(charSequence);
    }

    @Override // androidx.activity.q, android.app.Dialog
    public void setContentView(View view) {
        c();
        d().x(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        d().B(getContext().getString(i10));
    }

    @Override // androidx.activity.q, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        d().y(view, layoutParams);
    }

    @Override // p100i.e
    public final void onSupportActionModeFinished(a aVar) {
    }

    @Override // p100i.e
    public final void onSupportActionModeStarted(a aVar) {
    }
}
