package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0165a f15779a = new C0165a();

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    public static final class C0165a implements androidx.compose.ui.input.nestedscroll.a {
    }

    public static final void a(View view, LayoutNode layoutNode) {
        long jG0 = layoutNode.f14389G.f14365b.g0(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jG0 >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jG0 & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }
}
