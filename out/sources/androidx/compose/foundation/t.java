package androidx.compose.foundation;

import androidx.compose.ui.graphics.b0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: ClipScrollableContainer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f11054a = new t();

    @Override // androidx.compose.ui.graphics.l0
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final b0 mo0createOutlinePq9zytI(long j, LayoutDirection layoutDirection, p013b0.c cVar) {
        float fE1 = cVar.e1(C0940l.f10079a);
        return new b0.b(new I.f(0.0f, -fE1, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fE1));
    }
}
