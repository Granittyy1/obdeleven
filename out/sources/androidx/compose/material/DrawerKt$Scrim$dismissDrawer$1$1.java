package androidx.compose.material;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1", f = "Drawer.kt", l = {760}, m = "invokeSuspend")
final class DrawerKt$Scrim$dismissDrawer$1$1 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.a<p293xa.r> $onClose;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$Scrim$dismissDrawer$1$1(Ia.a<p293xa.r> aVar, kotlin.coroutines.c<? super DrawerKt$Scrim$dismissDrawer$1$1> cVar) {
        super(2, cVar);
        this.$onClose = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        DrawerKt$Scrim$dismissDrawer$1$1 drawerKt$Scrim$dismissDrawer$1$1 = new DrawerKt$Scrim$dismissDrawer$1$1(this.$onClose, cVar);
        drawerKt$Scrim$dismissDrawer$1$1.L$0 = obj;
        return drawerKt$Scrim$dismissDrawer$1$1;
    }

    @Override // Ia.p
    public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((DrawerKt$Scrim$dismissDrawer$1$1) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            androidx.compose.ui.input.pointer.w wVar = (androidx.compose.ui.input.pointer.w) this.L$0;
            final Ia.a<p293xa.r> aVar = this.$onClose;
            Ia.l<I.d, p293xa.r> lVar = new Ia.l<I.d, p293xa.r>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(I.d dVar) {
                    long j = dVar.f3754a;
                    aVar.invoke();
                    return p293xa.r.f47939a;
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.f(wVar, null, null, lVar, this, 7) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
