package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.OnlineControlUnitAdaptationFragment;
import com.voltasit.obdeleven.utils.AbstractControlUnitBackupUtil;
import java.util.Arrays;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2090e implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30086c;

    public /* synthetic */ C2090e(Object obj, int i10, Object obj2) {
        this.f30084a = i10;
        this.f30085b = obj;
        this.f30086c = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        Object obj = this.f30086c;
        Object obj2 = this.f30085b;
        switch (this.f30084a) {
            case 0:
                final C2098m this$0 = (C2098m) obj2;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                final J8.a analyticsProvider = (J8.a) obj;
                kotlin.jvm.internal.i.e(analyticsProvider, "$analyticsProvider");
                kotlin.jvm.internal.i.e(task, "task");
                if (task.isFaulted() || !((Boolean) task.getResult()).booleanValue()) {
                    if (task.isFaulted()) {
                        Exception error = task.getError();
                        kotlin.jvm.internal.i.d(error, "getError(...)");
                        this$0.f30121f.d(error, false);
                    }
                    return Task.forResult(-4);
                }
                Task taskForResult = Task.forResult(0);
                for (final AbstractC2107w abstractC2107w : this$0.f30122g) {
                    taskForResult = taskForResult.continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.core.app.h
                        @Override // com.parse.boltsinternal.Continuation
                        public final Object then(Task task2) {
                            Integer num;
                            final AbstractC2107w command = abstractC2107w;
                            kotlin.jvm.internal.i.e(command, "$command");
                            J8.a analyticsProvider2 = analyticsProvider;
                            kotlin.jvm.internal.i.e(analyticsProvider2, "$analyticsProvider");
                            final C2098m this$1 = this$0;
                            kotlin.jvm.internal.i.e(this$1, "this$0");
                            kotlin.jvm.internal.i.e(task2, "task");
                            if (task2.isFaulted() || (num = (Integer) task2.getResult()) == null || num.intValue() != 0) {
                                return task2;
                            }
                            if (command instanceof A) {
                                analyticsProvider2.g("OCA_READ_CURRENT_VALUE", "connect_count");
                            }
                            analyticsProvider2.g("OCA_READ_CURRENT_VALUE", "command_count");
                            String str = "getCurrentValueIndex(" + command.b() + ")";
                            p279w9.b bVar = Application.f29634b;
                            P8.c.a(3, "DeviceCommand", str, Arrays.copyOf(new Object[0], 0));
                            return ((!command.f30178b || AbstractC2107w.f30174g.containsKey(command.b())) ? Task.forResult(0) : command.g(AbstractC2107w.f30176i)).continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.core.app.i
                                @Override // com.parse.boltsinternal.Continuation
                                public final Object then(Task task3) {
                                    Integer num2;
                                    C2098m this$2 = this$1;
                                    kotlin.jvm.internal.i.e(this$2, "this$0");
                                    AbstractC2107w command2 = command;
                                    kotlin.jvm.internal.i.e(command2, "$command");
                                    kotlin.jvm.internal.i.b(task3);
                                    if ((task3.isFaulted() || (num2 = (Integer) task3.getResult()) == null || num2.intValue() != 0) && this$2.f30124i == null) {
                                        this$2.f30124i = command2;
                                    }
                                    return task3;
                                }
                            });
                        }
                    });
                }
                kotlin.jvm.internal.i.b(taskForResult);
                return taskForResult;
            case 1:
                OnlineControlUnitAdaptationFragment this$1 = (OnlineControlUnitAdaptationFragment) obj2;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                String login = (String) obj;
                kotlin.jvm.internal.i.e(login, "$login");
                kotlin.jvm.internal.i.e(task, "task");
                Object result = task.getResult();
                kotlin.jvm.internal.i.d(result, "getResult(...)");
                if (!((Boolean) result).booleanValue()) {
                    return Task.forResult(-1);
                }
                ControlUnit controlUnit = this$1.f31668B;
                kotlin.jvm.internal.i.b(controlUnit);
                return controlUnit.K(login, true);
            default:
                ((AbstractControlUnitBackupUtil) obj2).getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return Task.forError(new CommandException(-1));
                }
                p279w9.b bVar = Application.f29634b;
                P8.c.a(3, "ControlUnitBackupUtil", "read()", Arrays.copyOf(new Object[0], 0));
                return ((p146l8.a) obj).f(false);
        }
    }
}
