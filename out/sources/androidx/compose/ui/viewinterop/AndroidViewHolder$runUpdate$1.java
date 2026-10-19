package androidx.compose.ui.viewinterop;

import android.view.ViewParent;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import kotlin.jvm.internal.Lambda;
import p293xa.r;

/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidViewHolder$runUpdate$1 extends Lambda implements Ia.a<r> {
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$runUpdate$1(AndroidViewHolder androidViewHolder) {
        super(0);
        this.this$0 = androidViewHolder;
    }

    @Override // Ia.a
    public final r invoke() {
        AndroidViewHolder androidViewHolder = this.this$0;
        if (androidViewHolder.f15725f && androidViewHolder.isAttachedToWindow()) {
            ViewParent parent = this.this$0.getView().getParent();
            AndroidViewHolder androidViewHolder2 = this.this$0;
            if (parent == androidViewHolder2) {
                OwnerSnapshotObserver snapshotObserver = androidViewHolder2.getSnapshotObserver();
                AndroidViewHolder androidViewHolder3 = this.this$0;
                snapshotObserver.b(androidViewHolder3, AndroidViewHolder.f15720A, androidViewHolder3.getUpdate());
            }
        }
        return r.f47939a;
    }
}
