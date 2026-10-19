package androidx.compose.ui.input.pointer;

import androidx.compose.ui.viewinterop.AndroidViewHolder;

/* JADX INFO: compiled from: PointerInteropFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PointerInteropFilter_androidKt {
    public static final androidx.compose.ui.h a(androidx.compose.ui.h hVar, AndroidViewHolder androidViewHolder) {
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.f14035b = new PointerInteropFilter_androidKt$pointerInteropFilter$3(androidViewHolder);
        z zVar = new z();
        z zVar2 = pointerInteropFilter.f14036c;
        if (zVar2 != null) {
            zVar2.f14150b = null;
        }
        pointerInteropFilter.f14036c = zVar;
        zVar.f14150b = pointerInteropFilter;
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(zVar);
        return hVar.i(pointerInteropFilter);
    }
}
