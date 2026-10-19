package androidx.compose.foundation.contextmenu;

import Ia.l;
import Ia.p;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.InterfaceC1152c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ContextMenuGestures.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2", f = "ContextMenuGestures.android.kt", l = {R.styleable.AppCompatTheme_colorPrimaryDark, R.styleable.AppCompatTheme_dialogCornerRadius}, m = "invokeSuspend")
final class ContextMenuGestures_androidKt$onRightClickDown$2 extends RestrictedSuspendLambda implements p<InterfaceC1152c, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ l<I.d, r> $onDown;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContextMenuGestures_androidKt$onRightClickDown$2(l<? super I.d, r> lVar, kotlin.coroutines.c<? super ContextMenuGestures_androidKt$onRightClickDown$2> cVar) {
        super(2, cVar);
        this.$onDown = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ContextMenuGestures_androidKt$onRightClickDown$2 contextMenuGestures_androidKt$onRightClickDown$2 = new ContextMenuGestures_androidKt$onRightClickDown$2(this.$onDown, cVar);
        contextMenuGestures_androidKt$onRightClickDown$2.L$0 = obj;
        return contextMenuGestures_androidKt$onRightClickDown$2;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC1152c interfaceC1152c, kotlin.coroutines.c<? super r> cVar) {
        return ((ContextMenuGestures_androidKt$onRightClickDown$2) create(interfaceC1152c, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC1152c interfaceC1152c;
        q qVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC1152c = (InterfaceC1152c) this.L$0;
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            qVar = (q) obj;
            if (qVar != null) {
                qVar.a();
            }
            return r.f47939a;
        }
        kotlin.b.b(obj);
        interfaceC1152c = (InterfaceC1152c) this.L$0;
        this.L$0 = interfaceC1152c;
        this.label = 1;
        obj = c.a(interfaceC1152c, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        q qVar2 = (q) obj;
        qVar2.a();
        this.$onDown.invoke(new I.d(qVar2.f14102c));
        this.L$0 = null;
        this.label = 2;
        Ia.q<androidx.compose.foundation.gestures.p, I.d, kotlin.coroutines.c<? super r>, Object> qVar3 = TapGestureDetectorKt.f9999a;
        obj = TapGestureDetectorKt.i(interfaceC1152c, PointerEventPass.f14030c, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        qVar = (q) obj;
        if (qVar != null) {
            qVar.a();
        }
        return r.f47939a;
    }
}
