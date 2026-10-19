package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.InterfaceC0906f;
import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: compiled from: ScrollExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(u uVar, float f10, InterfaceC0906f interfaceC0906f, ContinuationImpl continuationImpl) {
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof ScrollExtensionsKt$animateScrollBy$1) {
            scrollExtensionsKt$animateScrollBy$1 = (ScrollExtensionsKt$animateScrollBy$1) continuationImpl;
            int i10 = scrollExtensionsKt$animateScrollBy$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$animateScrollBy$1.label = i10 - Integer.MIN_VALUE;
            } else {
                scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(continuationImpl);
            }
        } else {
            scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(continuationImpl);
        }
        Object obj = scrollExtensionsKt$animateScrollBy$1.result;
        Object obj2 = CoroutineSingletons.f43038b;
        int i11 = scrollExtensionsKt$animateScrollBy$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            Ia.p<? super s, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(f10, interfaceC0906f, ref$FloatRef2, null);
            scrollExtensionsKt$animateScrollBy$1.L$0 = ref$FloatRef2;
            scrollExtensionsKt$animateScrollBy$1.label = 1;
            if (uVar.b(MutatePriority.f9810b, scrollExtensionsKt$animateScrollBy$2, scrollExtensionsKt$animateScrollBy$1) == obj2) {
                return obj2;
            }
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$FloatRef = (Ref$FloatRef) scrollExtensionsKt$animateScrollBy$1.L$0;
            kotlin.b.b(obj);
        }
        return new Float(ref$FloatRef.element);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(u uVar, float f10, ContinuationImpl continuationImpl) {
        ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$1;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof ScrollExtensionsKt$scrollBy$1) {
            scrollExtensionsKt$scrollBy$1 = (ScrollExtensionsKt$scrollBy$1) continuationImpl;
            int i10 = scrollExtensionsKt$scrollBy$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$scrollBy$1.label = i10 - Integer.MIN_VALUE;
            } else {
                scrollExtensionsKt$scrollBy$1 = new ScrollExtensionsKt$scrollBy$1(continuationImpl);
            }
        } else {
            scrollExtensionsKt$scrollBy$1 = new ScrollExtensionsKt$scrollBy$1(continuationImpl);
        }
        Object obj = scrollExtensionsKt$scrollBy$1.result;
        Object obj2 = CoroutineSingletons.f43038b;
        int i11 = scrollExtensionsKt$scrollBy$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            Ia.p<? super s, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(ref$FloatRef2, f10, null);
            scrollExtensionsKt$scrollBy$1.L$0 = ref$FloatRef2;
            scrollExtensionsKt$scrollBy$1.label = 1;
            if (uVar.b(MutatePriority.f9810b, scrollExtensionsKt$scrollBy$2, scrollExtensionsKt$scrollBy$1) == obj2) {
                return obj2;
            }
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$FloatRef = (Ref$FloatRef) scrollExtensionsKt$scrollBy$1.L$0;
            kotlin.b.b(obj);
        }
        return new Float(ref$FloatRef.element);
    }

    public static Object c(u uVar, kotlin.coroutines.c cVar) {
        Object objB = uVar.b(MutatePriority.f9810b, new ScrollExtensionsKt$stopScroll$2(2, null), cVar);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }
}
