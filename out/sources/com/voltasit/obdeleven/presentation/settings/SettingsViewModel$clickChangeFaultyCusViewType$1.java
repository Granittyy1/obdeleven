package com.voltasit.obdeleven.presentation.settings;

import Ia.p;
import K8.o;
import com.voltasit.obdeleven.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: SettingsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.settings.SettingsViewModel$clickChangeFaultyCusViewType$1", f = "SettingsViewModel.kt", l = {297}, m = "invokeSuspend")
final class SettingsViewModel$clickChangeFaultyCusViewType$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int I$0;
    int label;
    final /* synthetic */ SettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$clickChangeFaultyCusViewType$1(SettingsViewModel settingsViewModel, kotlin.coroutines.c<? super SettingsViewModel$clickChangeFaultyCusViewType$1> cVar) {
        super(2, cVar);
        this.this$0 = settingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SettingsViewModel$clickChangeFaultyCusViewType$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SettingsViewModel$clickChangeFaultyCusViewType$1) create(a10, cVar)).invokeSuspend(r.f47939a);
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
    public final Object invokeSuspend(Object obj) {
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            boolean z10 = !((Boolean) this.this$0.f33160o.F().getValue()).booleanValue();
            o oVar = this.this$0.f33160o;
            this.I$0 = z10 ? 1 : 0;
            this.label = 1;
            if (oVar.b(z10) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i10 = z10 ? 1 : 0;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.I$0;
            kotlin.b.b(obj);
        }
        this.this$0.f33118N.j(Y8.c.a(i10 != 0 ? R.string.common_list : R.string.common_icons, true));
        return r.f47939a;
    }
}
