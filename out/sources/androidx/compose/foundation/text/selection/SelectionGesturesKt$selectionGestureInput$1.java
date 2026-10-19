package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.InterfaceC1152c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Collection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SelectionGestures.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SelectionGesturesKt$selectionGestureInput$1 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f11534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.text.t f11535c;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @Aa.c(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", l = {R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_toolbarStyle, R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Ia.p<InterfaceC1152c, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ c $clicksCounter;
        final /* synthetic */ e $mouseSelectionObserver;
        final /* synthetic */ androidx.compose.foundation.text.t $textDragObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, c cVar, androidx.compose.foundation.text.t tVar, kotlin.coroutines.c<? super AnonymousClass1> cVar2) {
            super(2, cVar2);
            this.$mouseSelectionObserver = eVar;
            this.$clicksCounter = cVar;
            this.$textDragObserver = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseSelectionObserver, this.$clicksCounter, this.$textDragObserver, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(InterfaceC1152c interfaceC1152c, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(interfaceC1152c, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0077  */
        /* JADX WARN: Code duplicated, block: B:32:0x0083 A[RETURN] */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC1152c interfaceC1152c;
            androidx.compose.foundation.text.t tVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC1152c = (InterfaceC1152c) this.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return p293xa.r.f47939a;
            }
            kotlin.b.b(obj);
            interfaceC1152c = (InterfaceC1152c) this.L$0;
            this.L$0 = interfaceC1152c;
            this.label = 1;
            obj = l.a(interfaceC1152c, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            androidx.compose.ui.input.pointer.j jVar = (androidx.compose.ui.input.pointer.j) obj;
            if (l.d(jVar) && (jVar.f14093c & 33) != 0) {
                ?? r10 = jVar.f14091a;
                int size = ((Collection) r10).size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        e eVar = this.$mouseSelectionObserver;
                        c cVar = this.$clicksCounter;
                        this.L$0 = null;
                        this.label = 2;
                        if (l.b(interfaceC1152c, eVar, cVar, jVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (((androidx.compose.ui.input.pointer.q) r10.get(i11)).b()) {
                            break;
                        }
                        i11++;
                    }
                }
                if (!l.d(jVar)) {
                    tVar = this.$textDragObserver;
                    this.L$0 = null;
                    this.label = 3;
                    if (l.c(interfaceC1152c, tVar, jVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (!l.d(jVar)) {
                tVar = this.$textDragObserver;
                this.L$0 = null;
                this.label = 3;
                if (l.c(interfaceC1152c, tVar, jVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return p293xa.r.f47939a;
        }
    }

    public SelectionGesturesKt$selectionGestureInput$1(e eVar, androidx.compose.foundation.text.t tVar) {
        this.f11534b = eVar;
        this.f11535c = tVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objB = ForEachGestureKt.b(wVar, new AnonymousClass1(this.f11534b, new c(wVar.getViewConfiguration()), this.f11535c, null), cVar);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }
}
