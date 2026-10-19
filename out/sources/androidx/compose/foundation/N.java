package androidx.compose.foundation;

import androidx.compose.ui.graphics.b0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: ClipScrollableContainer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class N implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f9814a = new N();

    @Override // androidx.compose.ui.graphics.l0
    /* JADX INFO: renamed from: createOutline-Pq9zytI, reason: not valid java name */
    public final b0 mo0createOutlinePq9zytI(long j, LayoutDirection layoutDirection, p013b0.c cVar) {
        float fE1 = cVar.e1(C0940l.f10079a);
        return new b0.b(new I.f(-fE1, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fE1, Float.intBitsToFloat((int) (j & 4294967295L))));
    }
}
