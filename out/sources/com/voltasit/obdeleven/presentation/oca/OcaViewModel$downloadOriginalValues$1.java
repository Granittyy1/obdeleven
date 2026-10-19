package com.voltasit.obdeleven.presentation.oca;

import Ia.p;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.C2098m;
import com.voltasit.obdeleven.core.app.C2108x;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.n;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.v;
import p293xa.r;

/* JADX INFO: compiled from: OcaViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.oca.OcaViewModel$downloadOriginalValues$1", f = "OcaViewModel.kt", l = {555}, m = "invokeSuspend")
final class OcaViewModel$downloadOriginalValues$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcaViewModel$downloadOriginalValues$1(k kVar, kotlin.coroutines.c<? super OcaViewModel$downloadOriginalValues$1> cVar) {
        super(2, cVar);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OcaViewModel$downloadOriginalValues$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((OcaViewModel$downloadOriginalValues$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        I8.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            I8.a aVar2 = (I8.a) this.this$0.f32727M.d();
            if (aVar2 == null) {
                return r.f47939a;
            }
            if (!this.this$0.f32774x.b() || (charSequence = (CharSequence) this.this$0.f32723K.d()) == null || n.S(charSequence)) {
                this.this$0.i(4);
                v vVar = this.this$0.f32770u0;
                r rVar = r.f47939a;
                vVar.f(rVar);
                return rVar;
            }
            this.this$0.f32113b.j(new PreloaderState.a(R.string.common_loading));
            k kVar = this.this$0;
            com.voltasit.obdeleven.domain.usecases.oca.f fVar = kVar.f32713F;
            T tD = kVar.f32723K.d();
            kotlin.jvm.internal.i.b(tD);
            this.L$0 = aVar2;
            this.label = 1;
            Object objA = fVar.a(aVar2.f3901a, (String) tD, this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar2;
            obj = objA;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I8.a aVar3 = (I8.a) this.L$0;
            kotlin.b.b(obj);
            aVar = aVar3;
        }
        C8.a aVar4 = (C8.a) obj;
        if (!(aVar4 instanceof C8.a.b)) {
            if (!(aVar4 instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            C8.a.C0024a c0024a = (C8.a.C0024a) aVar4;
            this.this$0.f32763r.d(c0024a.f2462a, false);
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            this.this$0.f32762q0.f(new l(E8.b.a(c0024a.f2462a), "tag_download_values"));
            this.this$0.i(4);
            return r.f47939a;
        }
        List list = (List) ((C8.a.b) aVar4).f2463a;
        k kVar2 = this.this$0;
        List list2 = (List) kVar2.f32731O.d();
        ArrayList arrayListP0 = list2 != null ? q.p0(list2) : new ArrayList();
        ArrayList arrayListP1 = q.p0(list);
        k kVar3 = this.this$0;
        kVar2.f32734R = new C2098m(aVar, arrayListP0, arrayListP1, kVar3.f32715G, new C2108x(), kVar3.f32763r);
        this.this$0.f32766s0.f(Boolean.TRUE);
        this.this$0.h();
        return r.f47939a;
    }
}
