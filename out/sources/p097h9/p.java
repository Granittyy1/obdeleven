package p097h9;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: compiled from: ManualEditorFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements TextWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f36224b;

    public p(r rVar) {
        this.f36224b = rVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String strValueOf = String.valueOf(charSequence);
        r rVar = this.f36224b;
        if (strValueOf.equals(rVar.f36227m.getText().toString())) {
            return;
        }
        rVar.f36234t = true;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
