package androidx.compose.ui.platform;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2693i;

/* JADX INFO: compiled from: AndroidPlatformTextInputSession.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend")
final class AndroidPlatformTextInputSession$startInputMethod$3 extends SuspendLambda implements Ia.p<C1233m0, kotlin.coroutines.c<?>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ H this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(H h8, kotlin.coroutines.c<? super AndroidPlatformTextInputSession$startInputMethod$3> cVar) {
        super(2, cVar);
        this.this$0 = h8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.this$0, cVar);
        androidPlatformTextInputSession$startInputMethod$3.L$0 = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    @Override // Ia.p
    public final Object invoke(C1233m0 c1233m0, kotlin.coroutines.c<?> cVar) {
        ((AndroidPlatformTextInputSession$startInputMethod$3) create(c1233m0, cVar)).invokeSuspend(p293xa.r.f47939a);
        return CoroutineSingletons.f43038b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final C1233m0 c1233m0 = (C1233m0) this.L$0;
            final H h8 = this.this$0;
            this.L$0 = c1233m0;
            this.L$1 = h8;
            this.label = 1;
            C2693i c2693i = new C2693i(1, A8.p.y(this));
            c2693i.s();
            androidx.compose.ui.text.input.y yVar = h8.f14914c;
            androidx.compose.ui.text.input.t tVar = yVar.f15579a;
            tVar.b();
            yVar.f15580b.set(new androidx.compose.ui.text.input.C(yVar, tVar));
            c2693i.u(new Ia.l<Throwable, p293xa.r>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Throwable th) {
                    C1233m0 c1233m1 = c1233m0;
                    synchronized (c1233m1.f15065c) {
                        try {
                            c1233m1.f15067e = true;
                            androidx.compose.runtime.collection.c<androidx.compose.ui.node.g0<androidx.compose.ui.text.input.o>> cVar = c1233m1.f15066d;
                            androidx.compose.ui.node.g0<androidx.compose.ui.text.input.o>[] g0VarArr = cVar.f12943b;
                            int i11 = cVar.f12945d;
                            for (int i12 = 0; i12 < i11; i12++) {
                                androidx.compose.ui.text.input.o oVar = g0VarArr[i12].get();
                                if (oVar != null) {
                                    oVar.a();
                                }
                            }
                            c1233m1.f15066d.j();
                            p293xa.r rVar = p293xa.r.f47939a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    androidx.compose.ui.text.input.y yVar2 = h8.f14914c;
                    yVar2.f15580b.set(null);
                    yVar2.f15579a.d();
                    return p293xa.r.f47939a;
                }
            });
            if (c2693i.p() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
