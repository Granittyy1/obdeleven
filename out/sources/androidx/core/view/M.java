package androidx.core.view;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: ViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class M extends O.b<CharSequence> {
    @Override // androidx.core.view.O.b
    public final CharSequence a(View view) {
        return O.h.b(view);
    }

    @Override // androidx.core.view.O.b
    public final void b(View view, CharSequence charSequence) {
        O.h.h(view, charSequence);
    }

    @Override // androidx.core.view.O.b
    public final boolean d(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
