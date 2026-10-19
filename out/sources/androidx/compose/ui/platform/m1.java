package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractC1094k;
import androidx.compose.runtime.C1100n;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotKt;
import com.voltasit.obdeleven.R;
import java.util.Collection;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f15068a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    public static final WrappedComposition a(AbstractComposeView abstractComposeView, AbstractC1094k abstractC1094k, ComposableLambdaImpl composableLambdaImpl) {
        AndroidComposeView androidComposeView;
        WrappedComposition wrappedComposition;
        if (C1227j0.f15053a.compareAndSet(false, true)) {
            final BufferedChannel bufferedChannelA = kotlinx.coroutines.channels.g.a(1, 6, null);
            C2680e.c(kotlinx.coroutines.B.a(AndroidUiDispatcher.f14804m.getValue()), null, null, new GlobalSnapshotManager$ensureStarted$1(bufferedChannelA, null), 3);
            Ia.l<Object, p293xa.r> lVar = new Ia.l<Object, p293xa.r>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Object obj) {
                    if (C1227j0.f15054b.compareAndSet(false, true)) {
                        bufferedChannelA.n(p293xa.r.f47939a);
                    }
                    return p293xa.r.f47939a;
                }
            };
            synchronized (SnapshotKt.f13154c) {
                SnapshotKt.f13160i = kotlin.collections.q.d0((Collection) SnapshotKt.f13160i, lVar);
                p293xa.r rVar = p293xa.r.f47939a;
            }
            SnapshotKt.a();
        }
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
            if (androidComposeView == null) {
                androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), abstractC1094k.i());
                abstractComposeView.addView(androidComposeView.getView(), f15068a);
            }
            Ia.l<C1235n0, p293xa.r> lVar2 = InspectableValueKt.f14929a;
            Object tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
            wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
            if (wrappedComposition == null) {
                wrappedComposition = new WrappedComposition(androidComposeView, new C1100n(abstractC1094k, new androidx.compose.ui.node.f0(androidComposeView.getRoot())));
                androidComposeView.getView().setTag(R.id.wrapped_composition_tag, wrappedComposition);
            }
            wrappedComposition.w(composableLambdaImpl);
            if (!kotlin.jvm.internal.i.a(androidComposeView.getCoroutineContext(), abstractC1094k.i())) {
                androidComposeView.setCoroutineContext(abstractC1094k.i());
            }
            return wrappedComposition;
        }
        abstractComposeView.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), abstractC1094k.i());
            abstractComposeView.addView(androidComposeView.getView(), f15068a);
        }
        Ia.l<C1235n0, p293xa.r> lVar3 = InspectableValueKt.f14929a;
        Object tag2 = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof WrappedComposition) {
        }
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, new C1100n(abstractC1094k, new androidx.compose.ui.node.f0(androidComposeView.getRoot())));
            androidComposeView.getView().setTag(R.id.wrapped_composition_tag, wrappedComposition);
        }
        wrappedComposition.w(composableLambdaImpl);
        if (!kotlin.jvm.internal.i.a(androidComposeView.getCoroutineContext(), abstractC1094k.i())) {
            androidComposeView.setCoroutineContext(abstractC1094k.i());
        }
        return wrappedComposition;
    }
}
