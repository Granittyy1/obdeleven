package androidx.appcompat.widget;

import android.content.Context;
import android.widget.TextView;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: PopupMenu.java */
/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.view.menu.f f8759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.view.menu.i f8760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.o f8761c;

    public O(Context context, TextView textView) {
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
        this.f8759a = fVar;
        fVar.f8462e = new M(this);
        androidx.appcompat.view.menu.i iVar = new androidx.appcompat.view.menu.i(R.attr.popupMenuStyle, context, textView, fVar, false);
        this.f8760b = iVar;
        iVar.f8518f = 0;
        iVar.j = new N(this);
    }
}
