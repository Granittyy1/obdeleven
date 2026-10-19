package androidx.activity.compose;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f8214a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(ComponentActivity componentActivity, ComposableLambdaImpl composableLambdaImpl) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(composableLambdaImpl);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(composableLambdaImpl);
        View decorView = componentActivity.getWindow().getDecorView();
        if (P3.d.g(decorView) == null) {
            P3.d.u(decorView, componentActivity);
        }
        if (kotlin.jvm.internal.h.f(decorView) == null) {
            kotlin.jvm.internal.h.h(decorView, componentActivity);
        }
        if (I2.e.i(decorView) == null) {
            I2.e.p(decorView, componentActivity);
        }
        componentActivity.setContentView(composeView2, f8214a);
    }
}
