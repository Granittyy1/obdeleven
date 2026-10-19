package p097h9;

import android.text.Editable;
import android.text.TextWatcher;
import p255u9.j;

/* JADX INFO: compiled from: ManualEditorAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements TextWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f36198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f36199c;

    public g(j jVar, j jVar2) {
        this.f36199c = jVar;
        this.f36198b = jVar2;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String strValueOf = String.valueOf(charSequence);
        j jVar = this.f36198b;
        if (jVar.getString("description") != null && !jVar.getString("description").equals(strValueOf)) {
            this.f36199c.f36207i = true;
        }
        jVar.put("description", strValueOf);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
