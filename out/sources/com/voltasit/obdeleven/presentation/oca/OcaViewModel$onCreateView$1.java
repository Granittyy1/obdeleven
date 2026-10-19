package com.voltasit.obdeleven.presentation.oca;

import Ia.p;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.n;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: OcaViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.oca.OcaViewModel$onCreateView$1", f = "OcaViewModel.kt", l = {206}, m = "invokeSuspend")
final class OcaViewModel$onCreateView$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcaViewModel$onCreateView$1(k kVar, kotlin.coroutines.c<? super OcaViewModel$onCreateView$1> cVar) {
        super(2, cVar);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OcaViewModel$onCreateView$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((OcaViewModel$onCreateView$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            CharSequence charSequence = (CharSequence) this.this$0.f32721J.d();
            if (charSequence == null || n.S(charSequence)) {
                this.this$0.f32763r.b("OcaViewModel", "No app id specified");
                k kVar = this.this$0;
                kVar.j.j(kVar.f32771v.a(R.string.common_something_went_wrong, new Object[0]));
                this.this$0.f32115d.j(Boolean.TRUE);
                return r.f47939a;
            }
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            k kVar2 = this.this$0;
            com.voltasit.obdeleven.domain.usecases.oca.e eVar = kVar2.f32769u;
            T tD = kVar2.f32721J.d();
            kotlin.jvm.internal.i.b(tD);
            String str = (String) tD;
            eVar.getClass();
            I8.a aVar = (I8.a) eVar.f30875a.a(p279w9.a.f47812i).get(str);
            C8.a c0024a = aVar == null ? new C8.a.C0024a(new Exception("No oca found with id: ".concat(str))) : new C8.a.b(aVar);
            if (c0024a instanceof C8.a.b) {
                this.this$0.f32725L.j(((C8.a.b) c0024a).f2463a);
            } else if (c0024a instanceof C8.a.C0024a) {
                this.this$0.f32113b.j(PreloaderState.d.f32643a);
                this.this$0.f32763r.d(((C8.a.C0024a) c0024a).f2462a, false);
                k kVar3 = this.this$0;
                kVar3.j.j(kVar3.f32771v.a(R.string.common_something_went_wrong, new Object[0]));
                this.this$0.f32115d.j(Boolean.TRUE);
                return r.f47939a;
            }
            if (this.this$0.f32774x.b()) {
                k kVar4 = this.this$0;
                this.label = 1;
                if (k.b(kVar4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        U7.a<r> aVar2 = this.this$0.f32751i0;
        r rVar = r.f47939a;
        aVar2.j(rVar);
        return rVar;
    }
}
