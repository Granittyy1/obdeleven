package p067f3;

import android.view.inputmethod.InputMethodManager;
import com.afollestad.materialdialogs.MaterialDialog;

/* JADX INFO: compiled from: DialogUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDialog f34934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialDialog.a f34935c;

    public a(MaterialDialog materialDialog, MaterialDialog.a aVar) {
        this.f34934b = materialDialog;
        this.f34935c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MaterialDialog materialDialog = this.f34934b;
        materialDialog.f23196h.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.f34935c.f23232a.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(materialDialog.f23196h, 1);
        }
    }
}
