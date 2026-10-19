package B8;

import android.view.View;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* JADX INFO: compiled from: ListDialogItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u1 extends M0.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CheckedTextView f2165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f2166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f2167t;

    public u1(M0.d dVar, View view, CheckedTextView checkedTextView, TextView textView) {
        super(view, 0, dVar);
        this.f2165r = checkedTextView;
        this.f2166s = textView;
    }

    public abstract void t(String str);
}
