package androidx.compose.foundation.contextmenu;

import Ia.l;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.w;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p293xa.r;

/* JADX INFO: compiled from: ContextMenuGestures.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements PointerInputEventHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<I.d, r> f9873b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super I.d, r> lVar) {
        this.f9873b = lVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, kotlin.coroutines.c<? super r> cVar) {
        Object objB = ForEachGestureKt.b(wVar, new ContextMenuGestures_androidKt$onRightClickDown$2(this.f9873b, null), cVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (objB != coroutineSingletons) {
            objB = r.f47939a;
        }
        return objB == coroutineSingletons ? objB : r.f47939a;
    }
}
