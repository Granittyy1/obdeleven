package androidx.compose.foundation.gestures;

import D2.V;
import androidx.compose.animation.core.C0905e;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.C0908h;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.C0922w;
import androidx.compose.animation.core.T;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: MouseWheelScrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", l = {253, 266, 283}, m = "invokeSuspend")
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 extends SuspendLambda implements Ia.p<o, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ref$ObjectRef<C0908h<Float, C0909i>> $animationState;
    final /* synthetic */ float $speed;
    final /* synthetic */ Ref$ObjectRef<m.a> $targetScrollDelta;
    final /* synthetic */ Ref$FloatRef $targetValue;
    final /* synthetic */ ScrollingLogic $this_dispatchMouseWheelScroll;
    final /* synthetic */ float $threshold;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(Ref$FloatRef ref$FloatRef, Ref$ObjectRef<C0908h<Float, C0909i>> ref$ObjectRef, Ref$ObjectRef<m.a> ref$ObjectRef2, float f10, m mVar, float f11, ScrollingLogic scrollingLogic, kotlin.coroutines.c<? super MouseWheelScrollingLogic$dispatchMouseWheelScroll$3> cVar) {
        super(2, cVar);
        this.$targetValue = ref$FloatRef;
        this.$animationState = ref$ObjectRef;
        this.$targetScrollDelta = ref$ObjectRef2;
        this.$threshold = f10;
        this.this$0 = mVar;
        this.$speed = f11;
        this.$this_dispatchMouseWheelScroll = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, cVar);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = obj;
        return mouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
    }

    @Override // Ia.p
    public final Object invoke(o oVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$3) create(oVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x015c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0181 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0182  */
    /* JADX WARN: Code duplicated, block: B:39:0x0191  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, androidx.compose.animation.core.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0182 -> B:37:0x0183). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0191 -> B:38:0x018e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final o oVar;
        Ref$BooleanRef ref$BooleanRef;
        int i10;
        char c10;
        Object objC;
        Ref$BooleanRef ref$BooleanRef2;
        char c11;
        Object objC2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = this.label;
        char c12 = 3;
        int i12 = 2;
        if (i11 != 0) {
            if (i11 == 1) {
                Ref$BooleanRef ref$BooleanRef3 = (Ref$BooleanRef) this.L$2;
                Ref$BooleanRef ref$BooleanRef4 = (Ref$BooleanRef) this.L$1;
                o oVar2 = (o) this.L$0;
                kotlin.b.b(obj);
                oVar = oVar2;
                ref$BooleanRef3.element = ((Boolean) obj).booleanValue();
                ref$BooleanRef = ref$BooleanRef4;
                c12 = 3;
                i12 = 2;
            } else if (i11 == 2) {
                i10 = this.I$0;
                Ref$BooleanRef ref$BooleanRef5 = (Ref$BooleanRef) this.L$1;
                o oVar3 = (o) this.L$0;
                kotlin.b.b(obj);
                ref$BooleanRef = ref$BooleanRef5;
                oVar = oVar3;
                if (ref$BooleanRef.element) {
                    c12 = 3;
                } else {
                    this.L$0 = oVar;
                    this.L$1 = ref$BooleanRef;
                    this.L$2 = ref$BooleanRef;
                    c10 = 3;
                    this.label = 3;
                    objC = m.c(this.this$0, this.$targetScrollDelta, this.$targetValue, this.$this_dispatchMouseWheelScroll, this.$animationState, 50 - ((long) i10), this);
                    if (objC == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$BooleanRef2 = ref$BooleanRef;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ref$BooleanRef ref$BooleanRef6 = (Ref$BooleanRef) this.L$2;
                ref$BooleanRef2 = (Ref$BooleanRef) this.L$1;
                o oVar4 = (o) this.L$0;
                kotlin.b.b(obj);
                ref$BooleanRef = ref$BooleanRef6;
                oVar = oVar4;
                c10 = 3;
                objC = obj;
            }
            ref$BooleanRef.element = ((Boolean) objC).booleanValue();
            ref$BooleanRef = ref$BooleanRef2;
            c12 = c10;
            i12 = 2;
        } else {
            kotlin.b.b(obj);
            o oVar5 = (o) this.L$0;
            Ref$BooleanRef ref$BooleanRef7 = new Ref$BooleanRef();
            ref$BooleanRef7.element = true;
            oVar = oVar5;
            ref$BooleanRef = ref$BooleanRef7;
        }
        while (ref$BooleanRef.element) {
            ref$BooleanRef.element = false;
            float fFloatValue = this.$targetValue.element - ((Number) this.$animationState.element.f9544c.getValue()).floatValue();
            if (!this.$targetScrollDelta.element.f10030c || Math.abs(fFloatValue) < this.$threshold) {
                c11 = c12;
                m.a(this.this$0, oVar, fFloatValue);
                m mVar = this.this$0;
                Ref$ObjectRef<m.a> ref$ObjectRef = this.$targetScrollDelta;
                Ref$FloatRef ref$FloatRef = this.$targetValue;
                ScrollingLogic scrollingLogic = this.$this_dispatchMouseWheelScroll;
                Ref$ObjectRef<C0908h<Float, C0909i>> ref$ObjectRef2 = this.$animationState;
                this.L$0 = oVar;
                this.L$1 = ref$BooleanRef;
                this.L$2 = ref$BooleanRef;
                this.label = 1;
                objC2 = m.c(mVar, ref$ObjectRef, ref$FloatRef, scrollingLogic, ref$ObjectRef2, 50L, this);
                if (objC2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                Ref$BooleanRef ref$BooleanRef8 = ref$BooleanRef;
                ref$BooleanRef.element = ((Boolean) objC2).booleanValue();
                ref$BooleanRef = ref$BooleanRef8;
                c12 = c11;
                i12 = 2;
            } else {
                float fSignum = Math.signum(fFloatValue) * this.$threshold;
                m.a(this.this$0, oVar, fSignum);
                Ref$ObjectRef<C0908h<Float, C0909i>> ref$ObjectRef3 = this.$animationState;
                C0908h<Float, C0909i> c0908h = ref$ObjectRef3.element;
                ref$ObjectRef3.element = V.h(c0908h, ((Number) c0908h.f9544c.getValue()).floatValue() + fSignum, 0.0f, 30);
                int iB = Ka.a.b(Math.abs(this.$targetValue.element - ((Number) this.$animationState.element.f9544c.getValue()).floatValue()) / this.$speed);
                int i13 = iB > 100 ? 100 : iB;
                final m mVar2 = this.this$0;
                C0908h<Float, C0909i> c0908h2 = this.$animationState.element;
                final Ref$FloatRef ref$FloatRef2 = this.$targetValue;
                float f10 = ref$FloatRef2.element;
                final Ref$ObjectRef<m.a> ref$ObjectRef4 = this.$targetScrollDelta;
                final ScrollingLogic scrollingLogic2 = this.$this_dispatchMouseWheelScroll;
                final Ref$BooleanRef ref$BooleanRef9 = ref$BooleanRef;
                final Ia.l<Float, Boolean> lVar = new Ia.l<Float, Boolean>() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.compose.foundation.gestures.m$a] */
                    @Override // Ia.l
                    public final Boolean invoke(Float f11) {
                        float fFloatValue2 = f11.floatValue();
                        m.a aVarD = m.d(mVar2.f10024e);
                        if (aVarD != null) {
                            mVar2.e(aVarD);
                            Ref$ObjectRef<m.a> ref$ObjectRef5 = ref$ObjectRef4;
                            ref$ObjectRef5.element = ref$ObjectRef5.element.a(aVarD);
                            Ref$FloatRef ref$FloatRef3 = ref$FloatRef2;
                            ScrollingLogic scrollingLogic3 = scrollingLogic2;
                            ref$FloatRef3.element = scrollingLogic3.g(scrollingLogic3.e(ref$ObjectRef4.element.f10028a));
                            ref$BooleanRef9.element = !l.a(ref$FloatRef2.element - fFloatValue2);
                        }
                        return Boolean.valueOf(aVarD != null);
                    }
                };
                this.L$0 = oVar;
                this.L$1 = ref$BooleanRef;
                this.L$2 = null;
                this.I$0 = i13;
                this.label = i12;
                mVar2.getClass();
                final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                ref$FloatRef3.element = ((Number) c0908h2.f9544c.getValue()).floatValue();
                Object objE = T.e(c0908h2, new Float(f10), C0907g.d(i13, 0, C0922w.f9638d, i12), true, new Ia.l<C0905e<Float, C0909i>, p293xa.r>() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$animateMouseWheelScroll$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x004a  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // Ia.l
                    public final p293xa.r invoke(C0905e<Float, C0909i> c0905e) {
                        C0905e<Float, C0909i> c0905e2 = c0905e;
                        float fFloatValue2 = ((Number) c0905e2.f9535e.getValue()).floatValue() - ref$FloatRef3.element;
                        if (l.a(fFloatValue2)) {
                            if (lVar.invoke(Float.valueOf(ref$FloatRef3.element)).booleanValue()) {
                                c0905e2.a();
                            }
                        } else if (l.a(fFloatValue2 - m.a(mVar2, oVar, fFloatValue2))) {
                            ref$FloatRef3.element += fFloatValue2;
                            if (lVar.invoke(Float.valueOf(ref$FloatRef3.element)).booleanValue()) {
                                c0905e2.a();
                            }
                        } else {
                            c0905e2.a();
                        }
                        return p293xa.r.f47939a;
                    }
                }, this);
                if (objE != CoroutineSingletons.f43038b) {
                    objE = p293xa.r.f47939a;
                }
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i10 = i13;
                if (ref$BooleanRef.element) {
                    this.L$0 = oVar;
                    this.L$1 = ref$BooleanRef;
                    this.L$2 = ref$BooleanRef;
                    c10 = 3;
                    this.label = 3;
                    objC = m.c(this.this$0, this.$targetScrollDelta, this.$targetValue, this.$this_dispatchMouseWheelScroll, this.$animationState, 50 - ((long) i10), this);
                    if (objC == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$BooleanRef2 = ref$BooleanRef;
                    ref$BooleanRef.element = ((Boolean) objC).booleanValue();
                    ref$BooleanRef = ref$BooleanRef2;
                    c12 = c10;
                    i12 = 2;
                } else {
                    c12 = 3;
                }
            }
            while (ref$BooleanRef.element) {
                ref$BooleanRef.element = false;
                float fFloatValue2 = this.$targetValue.element - ((Number) this.$animationState.element.f9544c.getValue()).floatValue();
                if (this.$targetScrollDelta.element.f10030c) {
                }
                c11 = c12;
                m.a(this.this$0, oVar, fFloatValue2);
                m mVar3 = this.this$0;
                Ref$ObjectRef<m.a> ref$ObjectRef5 = this.$targetScrollDelta;
                Ref$FloatRef ref$FloatRef4 = this.$targetValue;
                ScrollingLogic scrollingLogic3 = this.$this_dispatchMouseWheelScroll;
                Ref$ObjectRef<C0908h<Float, C0909i>> ref$ObjectRef6 = this.$animationState;
                this.L$0 = oVar;
                this.L$1 = ref$BooleanRef;
                this.L$2 = ref$BooleanRef;
                this.label = 1;
                objC2 = m.c(mVar3, ref$ObjectRef5, ref$FloatRef4, scrollingLogic3, ref$ObjectRef6, 50L, this);
                if (objC2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                Ref$BooleanRef ref$BooleanRef10 = ref$BooleanRef;
                ref$BooleanRef.element = ((Boolean) objC2).booleanValue();
                ref$BooleanRef = ref$BooleanRef10;
                c12 = c11;
                i12 = 2;
            }
        }
        return p293xa.r.f47939a;
    }
}
