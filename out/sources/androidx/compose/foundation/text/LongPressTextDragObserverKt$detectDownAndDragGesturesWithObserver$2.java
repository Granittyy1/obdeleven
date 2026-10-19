package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC2694i0;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LongPressTextDragObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend")
public final class LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super InterfaceC2694i0>, Object> {
    final /* synthetic */ t $observer;
    final /* synthetic */ androidx.compose.ui.input.pointer.w $this_detectDownAndDragGesturesWithObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
    @Aa.c(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {R.styleable.AppCompatTheme_listMenuViewStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ t $observer;
        final /* synthetic */ androidx.compose.ui.input.pointer.w $this_detectDownAndDragGesturesWithObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(androidx.compose.ui.input.pointer.w wVar, t tVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_detectDownAndDragGesturesWithObserver = wVar;
            this.$observer = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, cVar);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                androidx.compose.ui.input.pointer.w wVar = this.$this_detectDownAndDragGesturesWithObserver;
                t tVar = this.$observer;
                this.label = 1;
                Object objB = ForEachGestureKt.b(wVar, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(tVar, null), this);
                if (objB != obj2) {
                    objB = p293xa.r.f47939a;
                }
                if (objB == obj2) {
                    return obj2;
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

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
    @Aa.c(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {R.styleable.AppCompatTheme_listPopupWindowStyle}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ t $observer;
        final /* synthetic */ androidx.compose.ui.input.pointer.w $this_detectDownAndDragGesturesWithObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(androidx.compose.ui.input.pointer.w wVar, t tVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$this_detectDownAndDragGesturesWithObserver = wVar;
            this.$observer = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, cVar);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                androidx.compose.ui.input.pointer.w wVar = this.$this_detectDownAndDragGesturesWithObserver;
                final t tVar = this.$observer;
                this.label = 1;
                Object objC = androidx.compose.foundation.gestures.g.c(wVar, new Ia.l<I.d, p293xa.r>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$2
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(I.d dVar) {
                        tVar.b(dVar.f3754a);
                        return p293xa.r.f47939a;
                    }
                }, new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$3
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        tVar.a();
                        return p293xa.r.f47939a;
                    }
                }, new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$4
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        tVar.onCancel();
                        return p293xa.r.f47939a;
                    }
                }, new Ia.p<androidx.compose.ui.input.pointer.q, I.d, p293xa.r>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$5
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(androidx.compose.ui.input.pointer.q qVar, I.d dVar) {
                        tVar.e(dVar.f3754a);
                        return p293xa.r.f47939a;
                    }
                }, this);
                if (objC != obj2) {
                    objC = p293xa.r.f47939a;
                }
                if (objC == obj2) {
                    return obj2;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(androidx.compose.ui.input.pointer.w wVar, t tVar, kotlin.coroutines.c<? super LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2> cVar) {
        super(2, cVar);
        this.$this_detectDownAndDragGesturesWithObserver = wVar;
        this.$observer = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, cVar);
        longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super InterfaceC2694i0> cVar) {
        return ((LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
        CoroutineStart coroutineStart = CoroutineStart.f43169e;
        C2680e.c(a10, null, coroutineStart, new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1);
        return C2680e.c(a10, null, coroutineStart, new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1);
    }
}
