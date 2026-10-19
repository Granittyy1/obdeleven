package androidx.compose.ui.input.key;

import Ia.l;
import O.c;
import androidx.compose.ui.h;

/* JADX INFO: compiled from: KeyInputModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final h a(l lVar) {
        return new KeyInputElement(lVar, null);
    }

    public static final h b(h hVar, l<? super c, Boolean> lVar) {
        return hVar.i(new KeyInputElement(null, lVar));
    }
}
