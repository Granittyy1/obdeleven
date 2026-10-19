package B8;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: B8.a1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ItemEditTextBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0614a1 extends M0.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final EditText f1857r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextInputLayout f1858s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f1859t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public N8.e f1860u;

    public AbstractC0614a1(M0.d dVar, View view, EditText editText, TextInputLayout textInputLayout) {
        super(view, 0, dVar);
        this.f1857r = editText;
        this.f1858s = textInputLayout;
    }

    public abstract void t(N8.e eVar);

    public abstract void u(String str);
}
