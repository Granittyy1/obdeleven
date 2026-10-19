package K5;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: compiled from: VisibilityAwareImageButton.java */
/* JADX INFO: loaded from: classes3.dex */
public class u extends ImageButton {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4366b;

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f4366b = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f4366b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }

    public u(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4366b = getVisibility();
    }
}
