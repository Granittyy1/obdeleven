package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: ContentInViewNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {215}, m = "invokeSuspend")
public final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ z $animationState;
    final /* synthetic */ c $bringIntoViewSpec;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewNode this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: ContentInViewNode.kt */
    @Aa.c(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {221}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<o, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ InterfaceC2694i0 $animationJob;
        final /* synthetic */ z $animationState;
        final /* synthetic */ c $bringIntoViewSpec;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ContentInViewNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(z zVar, ContentInViewNode contentInViewNode, c cVar, InterfaceC2694i0 interfaceC2694i0, kotlin.coroutines.c<? super AnonymousClass1> cVar2) {
            super(2, cVar2);
            this.$animationState = zVar;
            this.this$0 = contentInViewNode;
            this.$bringIntoViewSpec = cVar;
            this.$animationJob = interfaceC2694i0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$animationJob, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(o oVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(oVar, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                final o oVar = (o) this.L$0;
                this.$animationState.f10063e = ContentInViewNode.Q1(this.this$0, this.$bringIntoViewSpec);
                final z zVar = this.$animationState;
                final ContentInViewNode contentInViewNode = this.this$0;
                final InterfaceC2694i0 interfaceC2694i0 = this.$animationJob;
                Ia.l<Float, p293xa.r> lVar = new Ia.l<Float, p293xa.r>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(Float f10) {
                        float fFloatValue = f10.floatValue();
                        ContentInViewNode contentInViewNode2 = contentInViewNode;
                        float f11 = contentInViewNode2.f9910r ? 1.0f : -1.0f;
                        o oVar2 = oVar;
                        ScrollingLogic scrollingLogic = contentInViewNode2.f9909q;
                        float fG = scrollingLogic.g(scrollingLogic.e(oVar2.a(scrollingLogic.e(scrollingLogic.h(f11 * fFloatValue))))) * f11;
                        if (Math.abs(fG) < Math.abs(fFloatValue)) {
                            interfaceC2694i0.i(kotlin.jvm.internal.h.b("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')', null));
                        }
                        return p293xa.r.f47939a;
                    }
                };
                final ContentInViewNode contentInViewNode2 = this.this$0;
                final z zVar2 = this.$animationState;
                final c cVar = this.$bringIntoViewSpec;
                Ia.a<p293xa.r> aVar = new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        boolean z10;
                        ContentInViewNode contentInViewNode3 = contentInViewNode2;
                        b bVar = contentInViewNode3.f9912t;
                        while (true) {
                            androidx.compose.runtime.collection.c<ContentInViewNode.a> cVar2 = bVar.f10003a;
                            int i11 = cVar2.f12945d;
                            if (i11 == 0) {
                                break;
                            }
                            if (i11 == 0) {
                                throw new NoSuchElementException("MutableVector is empty.");
                            }
                            I.f fVarInvoke = cVar2.f12943b[i11 - 1].f9918a.invoke();
                            if (!(fVarInvoke == null ? true : contentInViewNode3.T1(fVarInvoke, contentInViewNode3.f9916x))) {
                                break;
                            }
                            androidx.compose.runtime.collection.c<ContentInViewNode.a> cVar3 = bVar.f10003a;
                            cVar3.p(cVar3.f12945d - 1).f9919b.resumeWith(p293xa.r.f47939a);
                        }
                        ContentInViewNode contentInViewNode4 = contentInViewNode2;
                        if (contentInViewNode4.f9914v) {
                            I.f fVarS1 = contentInViewNode4.S1();
                            if (fVarS1 != null) {
                                ContentInViewNode contentInViewNode5 = contentInViewNode2;
                                z10 = contentInViewNode5.T1(fVarS1, contentInViewNode5.f9916x);
                            }
                            if (z10) {
                                contentInViewNode2.f9914v = false;
                            }
                        }
                        zVar2.f10063e = ContentInViewNode.Q1(contentInViewNode2, cVar);
                        return p293xa.r.f47939a;
                    }
                };
                this.label = 1;
                if (zVar.a(lVar, aVar, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(ContentInViewNode contentInViewNode, z zVar, c cVar, kotlin.coroutines.c<? super ContentInViewNode$launchAnimation$2> cVar2) {
        super(2, cVar2);
        this.this$0 = contentInViewNode;
        this.$animationState = zVar;
        this.$bringIntoViewSpec = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.this$0, this.$animationState, this.$bringIntoViewSpec, cVar);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ContentInViewNode$launchAnimation$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        CancellationException cancellationException = null;
        try {
            try {
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    InterfaceC2694i0 interfaceC2694i0F = C2702l0.f(((A) this.L$0).getCoroutineContext());
                    ContentInViewNode contentInViewNode = this.this$0;
                    contentInViewNode.f9917y = true;
                    ScrollingLogic scrollingLogic = contentInViewNode.f9909q;
                    MutatePriority mutatePriority = MutatePriority.f9810b;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, contentInViewNode, this.$bringIntoViewSpec, interfaceC2694i0F, null);
                    this.label = 1;
                    if (scrollingLogic.f(mutatePriority, anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                this.this$0.f9912t.b();
                ContentInViewNode contentInViewNode2 = this.this$0;
                contentInViewNode2.f9917y = false;
                contentInViewNode2.f9912t.a(null);
                this.this$0.f9914v = false;
                return p293xa.r.f47939a;
            } catch (CancellationException e10) {
                cancellationException = e10;
                throw cancellationException;
            }
        } catch (Throwable th) {
            ContentInViewNode contentInViewNode3 = this.this$0;
            contentInViewNode3.f9917y = false;
            contentInViewNode3.f9912t.a(cancellationException);
            this.this$0.f9914v = false;
            throw th;
        }
    }
}
