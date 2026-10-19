package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.ui.text.AbstractC1266g;
import androidx.compose.ui.text.InterfaceC1267h;

/* JADX INFO: compiled from: URLSpanCache.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1266g f15626a;

    public b(AbstractC1266g abstractC1266g) {
        this.f15626a = abstractC1266g;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        AbstractC1266g abstractC1266g = this.f15626a;
        InterfaceC1267h interfaceC1267hA = abstractC1266g.a();
        if (interfaceC1267hA != null) {
            interfaceC1267hA.a(abstractC1266g);
        }
    }
}
