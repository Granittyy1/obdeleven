package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements Ia.l<ViewParent, ViewParent> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ViewKt$ancestors$1 f16882b = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // Ia.l
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}
