package com.voltasit.obdeleven.core.app;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.CodingType;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2097l implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30113c;

    public /* synthetic */ C2097l(Object obj, int i10, Object obj2) {
        this.f30111a = i10;
        this.f30112b = obj;
        this.f30113c = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task writeTask) {
        Integer num;
        switch (this.f30111a) {
            case 0:
                C2098m this$0 = (C2098m) this.f30112b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                AbstractC2107w command = (AbstractC2107w) this.f30113c;
                kotlin.jvm.internal.i.e(command, "$command");
                kotlin.jvm.internal.i.e(writeTask, "writeTask");
                if ((writeTask.isFaulted() || (num = (Integer) writeTask.getResult()) == null || num.intValue() != 0) && this$0.f30124i == null) {
                    this$0.f30124i = command;
                }
                Integer num2 = (Integer) writeTask.getResult();
                if (num2 != null && num2.intValue() == 0) {
                    if (command instanceof Y) {
                        AbstractC2107w.f30176i.x0(CodingType.f34406f, ((Y) command).a());
                    }
                    if (command instanceof C2106v) {
                        AbstractC2107w.f30176i.x0(CodingType.f34405e, ((C2106v) command).a());
                    }
                }
                return writeTask;
            default:
                p122j9.a aVar = (p122j9.a) this.f30112b;
                aVar.getClass();
                p122j9.a.ViewOnClickListenerC0470a viewOnClickListenerC0470a = (p122j9.a.ViewOnClickListenerC0470a) this.f30113c;
                viewOnClickListenerC0470a.f41172i.setVisibility(8);
                aVar.notifyItemChanged(viewOnClickListenerC0470a.getAdapterPosition());
                return null;
        }
    }
}
