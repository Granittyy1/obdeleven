package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1195p;

/* JADX INFO: compiled from: DragAndDropNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final boolean a(DragAndDropNode dragAndDropNode, long j) {
        if (!dragAndDropNode.f13985b.f13997o) {
            return false;
        }
        C1195p c1195p = C1185f.f(dragAndDropNode).f14389G.f14365b;
        if (!c1195p.f14602S.f13997o) {
            return false;
        }
        long jG0 = c1195p.g0(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jG0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jG0 & 4294967295L));
        long j10 = dragAndDropNode.f13359u;
        float f10 = ((int) (j10 >> 32)) + fIntBitsToFloat;
        float f11 = ((int) (j10 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f10) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f11;
    }
}
