package B8;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: ViewSimpleYesNoDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class B1 extends M0.h {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f1624u = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f1625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f1626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f1627t;

    public B1(M0.d dVar, View view, TextView textView, TextView textView2) {
        super(view, 0, dVar);
        this.f1625r = textView;
        this.f1626s = textView2;
    }

    public abstract void t(String str);
}
