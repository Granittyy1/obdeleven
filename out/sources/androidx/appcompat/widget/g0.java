package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p150m.a f8955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f8956c;

    public g0(h0 h0Var) {
        this.f8956c = h0Var;
        Context context = h0Var.f8963a.getContext();
        CharSequence charSequence = h0Var.f8970h;
        p150m.a aVar = new p150m.a();
        aVar.f44523e = 4096;
        aVar.f44525g = 4096;
        aVar.f44529l = null;
        aVar.f44530m = null;
        aVar.f44531n = false;
        aVar.f44532o = false;
        aVar.f44533p = 16;
        aVar.f44527i = context;
        aVar.f44519a = charSequence;
        this.f8955b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h0 h0Var = this.f8956c;
        Window.Callback callback = h0Var.f8972k;
        if (callback == null || !h0Var.f8973l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f8955b);
    }
}
