package io.intercom.android.sdk.m5.home.ui.header;

import Ia.p;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.H;
import androidx.recyclerview.widget.t;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.m;
import p293xa.r;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderBackdropKt$lambda-6$1, reason: invalid class name */
/* JADX INFO: compiled from: HomeHeaderBackdrop.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HomeHeaderBackdropKt$lambda6$1 implements p<InterfaceC1084f, Integer, r> {
    public static final ComposableSingletons$HomeHeaderBackdropKt$lambda6$1 INSTANCE = new ComposableSingletons$HomeHeaderBackdropKt$lambda6$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        float f10 = t.d.DEFAULT_DRAG_ANIMATION_DURATION;
        List listS = kotlin.collections.l.s("#142C4D", "#0057FF", "#CAF4F7");
        ArrayList arrayList = new ArrayList(m.y(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(new H(Q3.d.d(ColorUtils.parseColor((String) it.next()))));
        }
        HomeHeaderBackdropKt.m323HomeHeaderBackdropAjpBEmI(f10, new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient(arrayList, true), new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(Q3.d.d(ColorUtils.parseColor("#8B0000")), true, null), new f(), interfaceC1084f, 3142, 0);
    }
}
