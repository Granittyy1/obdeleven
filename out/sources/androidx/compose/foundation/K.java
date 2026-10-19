package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: compiled from: ScrollingContainer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class K {
    public static final androidx.compose.ui.h a(androidx.compose.ui.h hVar, androidx.compose.foundation.gestures.u uVar, Orientation orientation, boolean z10, boolean z11, androidx.compose.foundation.gestures.j jVar, androidx.compose.foundation.interaction.l lVar, boolean z12, E e10, androidx.compose.foundation.gestures.c cVar) {
        float f10 = C0940l.f10079a;
        Orientation orientation2 = Orientation.f9957b;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        return hVar.i(orientation == orientation2 ? A8.p.r(aVar, N.f9814a) : A8.p.r(aVar, t.f11054a)).i(new ScrollingContainerElement(e10, cVar, jVar, orientation, uVar, lVar, z10, z11, z12));
    }
}
