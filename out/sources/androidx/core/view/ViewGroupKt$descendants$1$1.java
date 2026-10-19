package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes.dex */
final class ViewGroupKt$descendants$1$1 extends Lambda implements Ia.l<View, Iterator<? extends View>> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ViewGroupKt$descendants$1$1 f16881h = new ViewGroupKt$descendants$1$1();

    public ViewGroupKt$descendants$1$1() {
        super(1);
    }

    @Override // Ia.l
    public final Iterator<? extends View> invoke(View view) {
        View view2 = view;
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup != null) {
            return new V(viewGroup);
        }
        return null;
    }
}
