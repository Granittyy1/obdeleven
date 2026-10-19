package com.voltasit.obdeleven.presentation.controlUnit;

import android.widget.LinearLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.Param;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoFragment;
import com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import p134k8.D1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class E implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31461b;

    public /* synthetic */ E(int i10, Object obj) {
        this.f31460a = i10;
        this.f31461b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task151) {
        switch (this.f31460a) {
            case 0:
                OnlineControlUnitFragment this$0 = (OnlineControlUnitFragment) this.f31461b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task151, "task151");
                Object result = task151.getResult();
                kotlin.jvm.internal.i.d(result, "getResult(...)");
                if (((Boolean) result).booleanValue()) {
                    this$0.e0();
                    return null;
                }
                this$0.q().getSupportFragmentManager().R();
                return null;
            case 1:
                ControlUnitInfoFragment this$1 = (ControlUnitInfoFragment) this.f31461b;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                kotlin.jvm.internal.i.e(task151, "task");
                Object result2 = task151.getResult();
                kotlin.jvm.internal.i.b(result2);
                if (((Boolean) result2).booleanValue()) {
                    return Task.forResult(Boolean.TRUE);
                }
                ControlUnit controlUnit = this$1.f31619o;
                kotlin.jvm.internal.i.b(controlUnit);
                return controlUnit.e();
            case 2:
                UDSOutputTestFragment this$2 = (UDSOutputTestFragment) this.f31461b;
                kotlin.jvm.internal.i.e(this$2, "this$0");
                kotlin.jvm.internal.i.e(task151, "task");
                C2134a0.a();
                if (task151.isFaulted()) {
                    task151.getError().printStackTrace();
                    return null;
                }
                p135k9.a aVar = this$2.f31970r;
                kotlin.jvm.internal.i.b(aVar);
                aVar.b();
                p135k9.a aVar2 = this$2.f31970r;
                kotlin.jvm.internal.i.b(aVar2);
                Param param = this$2.f31975w;
                kotlin.jvm.internal.i.b(param);
                aVar2.a(param.c(false));
                p135k9.a aVar3 = this$2.f31970r;
                kotlin.jvm.internal.i.b(aVar3);
                aVar3.notifyDataSetChanged();
                LinearLayout linearLayout = this$2.f31966n;
                kotlin.jvm.internal.i.b(linearLayout);
                linearLayout.setVisibility(0);
                if (this$2.f31960F) {
                    FloatingActionButton floatingActionButton = this$2.f31968p;
                    kotlin.jvm.internal.i.b(floatingActionButton);
                    floatingActionButton.h();
                    return null;
                }
                FloatingActionButton floatingActionButton2 = this$2.f31968p;
                kotlin.jvm.internal.i.b(floatingActionButton2);
                floatingActionButton2.n();
                return null;
            case 3:
                return (String) ((Capture) this.f31461b).get();
            case 4:
                return !((Boolean) task151.getResult()).booleanValue() ? ((D1) this.f31461b).e() : Task.forResult(Boolean.TRUE);
            default:
                p219r8.b bVar = (p219r8.b) this.f31461b;
                return bVar.f46400a.f29335r.d(bVar.k()).continueWith(new com.parse.a(9, bVar));
        }
    }
}
