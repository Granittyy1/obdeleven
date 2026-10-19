package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ia.l<androidx.compose.ui.input.pointer.q, Boolean> f9967a = new Ia.l<androidx.compose.ui.input.pointer.q, Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$CanDragCalculation$1
        @Override // Ia.l
        public final Boolean invoke(androidx.compose.ui.input.pointer.q qVar) {
            return Boolean.valueOf(!androidx.compose.ui.input.pointer.y.a(qVar.f14108i, 2));
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f9968b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f9969c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f9970d = new c();

    /* JADX INFO: compiled from: Scrollable.kt */
    public static final class a implements androidx.compose.ui.j {
        @Override // androidx.compose.ui.j
        public final float U() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.e
        public final <R> R fold(R r10, Ia.p<? super R, ? super kotlin.coroutines.e.a, ? extends R> pVar) {
            return (R) kotlin.coroutines.e.a.C0479a.a(this, r10, pVar);
        }

        @Override // kotlin.coroutines.e
        public final <E extends kotlin.coroutines.e.a> E get(kotlin.coroutines.e.b<E> bVar) {
            return (E) kotlin.coroutines.e.a.C0479a.b(this, bVar);
        }

        @Override // kotlin.coroutines.e
        public final kotlin.coroutines.e minusKey(kotlin.coroutines.e.b<?> bVar) {
            return kotlin.coroutines.e.a.C0479a.c(this, bVar);
        }

        @Override // kotlin.coroutines.e
        public final kotlin.coroutines.e plus(kotlin.coroutines.e eVar) {
            return kotlin.coroutines.e.a.C0479a.d(this, eVar);
        }
    }

    /* JADX INFO: compiled from: Scrollable.kt */
    public static final class c implements p013b0.c {
        @Override // p013b0.c
        public final float P0() {
            return 1.0f;
        }

        @Override // p013b0.c
        public final float getDensity() {
            return 1.0f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ScrollingLogic scrollingLogic, long j, ContinuationImpl continuationImpl) {
        ScrollableKt$semanticsScrollBy$1 scrollableKt$semanticsScrollBy$1;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof ScrollableKt$semanticsScrollBy$1) {
            scrollableKt$semanticsScrollBy$1 = (ScrollableKt$semanticsScrollBy$1) continuationImpl;
            int i10 = scrollableKt$semanticsScrollBy$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scrollableKt$semanticsScrollBy$1.label = i10 - Integer.MIN_VALUE;
            } else {
                scrollableKt$semanticsScrollBy$1 = new ScrollableKt$semanticsScrollBy$1(continuationImpl);
            }
        } else {
            scrollableKt$semanticsScrollBy$1 = new ScrollableKt$semanticsScrollBy$1(continuationImpl);
        }
        Object obj = scrollableKt$semanticsScrollBy$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = scrollableKt$semanticsScrollBy$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            ref$FloatRef = new Ref$FloatRef();
            MutatePriority mutatePriority = MutatePriority.f9810b;
            ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(scrollingLogic, j, ref$FloatRef, null);
            scrollableKt$semanticsScrollBy$1.L$0 = scrollingLogic;
            scrollableKt$semanticsScrollBy$1.L$1 = ref$FloatRef;
            scrollableKt$semanticsScrollBy$1.label = 1;
            if (scrollingLogic.f(mutatePriority, scrollableKt$semanticsScrollBy$2, scrollableKt$semanticsScrollBy$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) scrollableKt$semanticsScrollBy$1.L$1;
            ScrollingLogic scrollingLogic2 = (ScrollingLogic) scrollableKt$semanticsScrollBy$1.L$0;
            kotlin.b.b(obj);
            ref$FloatRef = ref$FloatRef2;
            scrollingLogic = scrollingLogic2;
        }
        return new I.d(scrollingLogic.h(ref$FloatRef.element));
    }

    public static androidx.compose.ui.h b(TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1, Orientation orientation, boolean z10, boolean z11, androidx.compose.foundation.interaction.k kVar) {
        return new ScrollableElement(textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1, orientation, z10, z11, null, kVar, null);
    }

    /* JADX INFO: compiled from: Scrollable.kt */
    public static final class b implements s {
        @Override // androidx.compose.foundation.gestures.s
        public final float f(float f10) {
            return f10;
        }
    }
}
