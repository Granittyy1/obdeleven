package com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation;

import Ia.p;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: UdsAdaptationViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.UdsAdaptationViewModel$getOfflineAdaptation$1", f = "UdsAdaptationViewModel.kt", l = {R.styleable.AppCompatTheme_radioButtonStyle}, m = "invokeSuspend")
final class UdsAdaptationViewModel$getOfflineAdaptation$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ int $channel;
    final /* synthetic */ String $value;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UdsAdaptationViewModel$getOfflineAdaptation$1(i iVar, int i10, String str, kotlin.coroutines.c<? super UdsAdaptationViewModel$getOfflineAdaptation$1> cVar) {
        super(2, cVar);
        this.this$0 = iVar;
        this.$channel = i10;
        this.$value = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UdsAdaptationViewModel$getOfflineAdaptation$1(this.this$0, this.$channel, this.$value, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((UdsAdaptationViewModel$getOfflineAdaptation$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

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
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            i iVar = this.this$0;
            com.obdeleven.service.odx.e.g gVar = iVar.f31938C;
            if (gVar == null) {
                return r.f47939a;
            }
            com.obdeleven.service.odx.e eVar = iVar.f31939D;
            if (eVar == null) {
                return r.f47939a;
            }
            iVar.f32113b.j(PreloaderState.c.f32642a);
            com.voltasit.obdeleven.domain.usecases.controlUnit.adaptation.a aVar = this.this$0.f31946r;
            int i11 = this.$channel;
            String str = this.$value;
            this.label = 1;
            obj = aVar.a(i11, str, gVar, eVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        C8.a aVar2 = (C8.a) obj;
        if (aVar2 instanceof C8.a.b) {
            this.this$0.f31948t.j(((C8.a.b) aVar2).f2463a);
        } else if (aVar2 instanceof C8.a.C0024a) {
            this.this$0.f31950v.j(r.f47939a);
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
