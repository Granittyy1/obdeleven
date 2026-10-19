package p042d3;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* JADX INFO: compiled from: DialogBase.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends Dialog implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MDRootLayout f34552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DialogInterface.OnShowListener f34553c;

    public final void a() {
        super.setOnShowListener(this);
    }

    public final void b(View view) {
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) {
        return this.f34552b.findViewById(i10);
    }

    public void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.f34553c;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // android.app.Dialog
    @Deprecated
    public final void setContentView(int i10) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f34553c = onShowListener;
    }

    @Override // android.app.Dialog
    @Deprecated
    public final void setContentView(View view) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    @Deprecated
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }
}
