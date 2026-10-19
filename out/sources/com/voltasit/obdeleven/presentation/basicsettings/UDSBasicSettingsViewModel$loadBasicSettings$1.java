package com.voltasit.obdeleven.presentation.basicsettings;

import Aa.c;
import Ia.p;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.domain.usecases.odx.GetBasicSettingsUC;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: UDSBasicSettingsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsViewModel$loadBasicSettings$1", f = "UDSBasicSettingsViewModel.kt", l = {R.styleable.AppCompatTheme_panelBackground}, m = "invokeSuspend")
final class UDSBasicSettingsViewModel$loadBasicSettings$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ ControlUnit $controlUnit;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDSBasicSettingsViewModel$loadBasicSettings$1(a aVar, ControlUnit controlUnit, kotlin.coroutines.c<? super UDSBasicSettingsViewModel$loadBasicSettings$1> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
        this.$controlUnit = controlUnit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UDSBasicSettingsViewModel$loadBasicSettings$1(this.this$0, this.$controlUnit, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((UDSBasicSettingsViewModel$loadBasicSettings$1) create(a10, cVar)).invokeSuspend(r.f47939a);
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
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            GetBasicSettingsUC getBasicSettingsUC = this.this$0.f31357o;
            ControlUnit controlUnit = this.$controlUnit;
            this.label = 1;
            obj = getBasicSettingsUC.b(controlUnit, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            this.this$0.f31365w.j(((C8.a.b) aVar).f2463a);
        } else if (aVar instanceof C8.a.C0024a) {
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            this.this$0.e(((C8.a.C0024a) aVar).f2462a, true);
        }
        return r.f47939a;
    }
}
