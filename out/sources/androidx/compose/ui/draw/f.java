package androidx.compose.ui.draw;

import Ia.l;
import p293xa.r;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final androidx.compose.ui.h a(androidx.compose.ui.h hVar, l<? super J.e, r> lVar) {
        return hVar.i(new DrawBehindElement(lVar));
    }

    public static final androidx.compose.ui.h b(androidx.compose.ui.h hVar, l<? super CacheDrawScope, g> lVar) {
        return hVar.i(new DrawWithCacheElement(lVar));
    }

    public static final androidx.compose.ui.h c(androidx.compose.ui.h hVar, l<? super J.c, r> lVar) {
        return hVar.i(new DrawWithContentElement(lVar));
    }
}
