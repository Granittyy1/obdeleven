package com.voltasit.obdeleven.presentation.controlunitlist.online;

import Aa.c;
import Ia.p;
import Na.i;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.vehicle.e;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: OnlineControlUnitListViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListViewModel$showGatewayCodingIfPossible$1", f = "OnlineControlUnitListViewModel.kt", l = {251, 257}, m = "invokeSuspend")
final class OnlineControlUnitListViewModel$showGatewayCodingIfPossible$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ OnlineControlUnitListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineControlUnitListViewModel$showGatewayCodingIfPossible$1(OnlineControlUnitListViewModel onlineControlUnitListViewModel, kotlin.coroutines.c<? super OnlineControlUnitListViewModel$showGatewayCodingIfPossible$1> cVar) {
        super(2, cVar);
        this.this$0 = onlineControlUnitListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OnlineControlUnitListViewModel$showGatewayCodingIfPossible$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((OnlineControlUnitListViewModel$showGatewayCodingIfPossible$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            aVar = (C8.a) obj;
            if (aVar instanceof C8.a.b) {
                this.this$0.f32081P.j(((C8.a.b) aVar).f2463a);
            } else {
                if (aVar instanceof C8.a.C0024a) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.f32096t.d(((C8.a.C0024a) aVar).f2462a, false);
            }
            r rVar = r.f47939a;
            i iVar = E8.a.f3126a;
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            return rVar;
        }
        kotlin.b.b(obj);
        this.this$0.f32113b.j(new PreloaderState.a(R.string.common_loading));
        OnlineControlUnitListViewModel onlineControlUnitListViewModel = this.this$0;
        this.label = 1;
        obj = OnlineControlUnitListViewModel.f(onlineControlUnitListViewModel, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (((Boolean) obj).booleanValue()) {
            U7.a<r> aVar2 = this.this$0.f32091Z;
            r rVar2 = r.f47939a;
            aVar2.j(rVar2);
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            return rVar2;
        }
        e eVar = this.this$0.f32099w;
        r rVar3 = r.f47939a;
        this.label = 2;
        obj = eVar.i0(this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            this.this$0.f32081P.j(((C8.a.b) aVar).f2463a);
        } else {
            if (aVar instanceof C8.a.C0024a) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f32096t.d(((C8.a.C0024a) aVar).f2462a, false);
        }
        r rVar4 = r.f47939a;
        i iVar2 = E8.a.f3126a;
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return rVar4;
    }
}
