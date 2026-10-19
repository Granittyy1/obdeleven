package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: ClickableMessageRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ClickableMessageRowKt$ClickableMessageRow$1$1 implements PointerInputEventHandler {
    final /* synthetic */ Ia.a<p293xa.r> $onClick;
    final /* synthetic */ Ia.a<p293xa.r> $onLongClick;

    public ClickableMessageRowKt$ClickableMessageRow$1$1(Ia.a<p293xa.r> aVar, Ia.a<p293xa.r> aVar2) {
        this.$onLongClick = aVar;
        this.$onClick = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$0(Ia.a onLongClick, I.d dVar) {
        kotlin.jvm.internal.i.e(onLongClick, "$onLongClick");
        onLongClick.invoke();
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$1(Ia.a onClick, I.d dVar) {
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        onClick.invoke();
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [io.intercom.android.sdk.m5.conversation.ui.components.row.i] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        final Ia.a<p293xa.r> aVar = this.$onLongClick;
        Object objF = TapGestureDetectorKt.f(wVar, new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.i
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return ClickableMessageRowKt$ClickableMessageRow$1$1.invoke$lambda$0(aVar, (I.d) obj);
            }
        }, null, new C2378j(0, this.$onClick), cVar, 5);
        return objF == CoroutineSingletons.f43038b ? objF : p293xa.r.f47939a;
    }
}
