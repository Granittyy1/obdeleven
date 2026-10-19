package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C0908h;
import androidx.compose.animation.core.C0909i;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: LazyLayoutScrollScope.kt */
/* JADX INFO: loaded from: classes.dex */
final class ItemFoundInScroll extends CancellationException {
    private final int itemOffset;
    private final C0908h<Float, C0909i> previousAnimation;

    public ItemFoundInScroll(int i10, C0908h<Float, C0909i> c0908h) {
        this.itemOffset = i10;
        this.previousAnimation = c0908h;
    }

    public final int a() {
        return this.itemOffset;
    }

    public final C0908h<Float, C0909i> b() {
        return this.previousAnimation;
    }
}
