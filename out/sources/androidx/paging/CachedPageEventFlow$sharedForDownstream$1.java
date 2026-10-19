package androidx.paging;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", l = {R.styleable.AppCompatTheme_dialogPreferredPadding, R.styleable.AppCompatTheme_dropdownListPreferredItemHeight}, m = "invokeSuspend")
public final class CachedPageEventFlow$sharedForDownstream$1<T> extends SuspendLambda implements Ia.p<InterfaceC2687d<? super kotlin.collections.s<? extends PageEvent<T>>>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CachedPageEventFlow<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$sharedForDownstream$1(CachedPageEventFlow<T> cachedPageEventFlow, kotlin.coroutines.c<? super CachedPageEventFlow$sharedForDownstream$1> cVar) {
        super(2, cVar);
        this.this$0 = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        CachedPageEventFlow$sharedForDownstream$1 cachedPageEventFlow$sharedForDownstream$1 = new CachedPageEventFlow$sharedForDownstream$1(this.this$0, cVar);
        cachedPageEventFlow$sharedForDownstream$1.L$0 = obj;
        return cachedPageEventFlow$sharedForDownstream$1;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((CachedPageEventFlow$sharedForDownstream$1) create((InterfaceC2687d) obj, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:14:0x0050->B:24:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2687d interfaceC2687d;
        InterfaceC2687d interfaceC2687d2;
        Iterator<T> it;
        kotlin.collections.s sVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2687d = (InterfaceC2687d) this.L$0;
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$1;
                interfaceC2687d2 = (InterfaceC2687d) this.L$0;
                kotlin.b.b(obj);
            }
            while (it.hasNext()) {
                sVar = (kotlin.collections.s) it.next();
                this.L$0 = interfaceC2687d2;
                this.L$1 = it;
                this.label = 2;
                if (interfaceC2687d2.emit(sVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        interfaceC2687d = (InterfaceC2687d) this.L$0;
        C1430f<T> c1430f = this.this$0.f19212a;
        this.L$0 = interfaceC2687d;
        this.label = 1;
        obj = c1430f.a(this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        this.this$0.f19215d.start();
        interfaceC2687d2 = interfaceC2687d;
        it = ((List) obj).iterator();
        while (it.hasNext()) {
            sVar = (kotlin.collections.s) it.next();
            this.L$0 = interfaceC2687d2;
            this.L$1 = it;
            this.label = 2;
            if (interfaceC2687d2.emit(sVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return p293xa.r.f47939a;
    }
}
