package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewKt;
import com.voltasit.obdeleven.R;
import java.util.Iterator;

/* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class V0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f14972b;

    public V0(AbstractComposeView abstractComposeView) {
        this.f14972b = abstractComposeView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z10;
        AbstractComposeView abstractComposeView = this.f14972b;
        kotlin.jvm.internal.i.e(abstractComposeView, "<this>");
        Iterator<ViewParent> it = ViewKt.b(abstractComposeView).iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            Object obj = (ViewParent) it.next();
            if (obj instanceof View) {
                View view2 = (View) obj;
                kotlin.jvm.internal.i.e(view2, "<this>");
                Object tag = view2.getTag(R.id.is_pooling_container_tag);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null ? bool.booleanValue() : false) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            return;
        }
        abstractComposeView.disposeComposition();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
