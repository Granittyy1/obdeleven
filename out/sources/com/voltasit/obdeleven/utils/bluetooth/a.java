package com.voltasit.obdeleven.utils.bluetooth;

import com.obdeleven.service.interfaces.IDevice;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt;
import com.voltasit.obdeleven.presentation.deviceupdate.VagFirmwareRedirectDialogFragment;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34326c;

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f34324a = i10;
        this.f34325b = obj;
        this.f34326c = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f34324a) {
            case 0:
                final BluetoothConnectionHelper this$0 = (BluetoothConnectionHelper) this.f34325b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                final IDevice device = (IDevice) this.f34326c;
                kotlin.jvm.internal.i.e(device, "$device");
                kotlin.jvm.internal.i.e(task, "task");
                Integer num = (Integer) task.getResult();
                if (num != null && num.intValue() == 0) {
                    return Task.forResult(Boolean.TRUE);
                }
                if ((num == null || num.intValue() != 3) && ((num == null || num.intValue() != 1) && (num == null || num.intValue() != 4))) {
                    O.e.j("BluetoothConnectionHelper", "Showing device not responding snackbar. Result: " + task.getResult());
                    P.b(this$0.f34294a, R.string.snackbar_device_not_responding);
                    return Task.forResult(Boolean.FALSE);
                }
                final Integer num2 = (Integer) task.getResult();
                if (((num2 != null && num2.intValue() == 1) || (num2 != null && num2.intValue() == 4)) && this$0.f34303k.f()) {
                    return ParseTaskExtensionsKt.a(new BluetoothConnectionHelper$connectDevice$1$1(device, null)).continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.utils.bluetooth.d
                        @Override // com.parse.boltsinternal.Continuation
                        public final Object then(Task task2) {
                            BluetoothConnectionHelper this$1 = this$0;
                            kotlin.jvm.internal.i.e(this$1, "this$0");
                            IDevice device2 = device;
                            kotlin.jvm.internal.i.e(device2, "$device");
                            if (kotlin.jvm.internal.i.a(task2.getResult(), Boolean.TRUE)) {
                                O.e.j("BluetoothConnectionHelper", "Showing firmware redirect dialog");
                                return new VagFirmwareRedirectDialogFragment().w(this$1.f34294a, this$1.j);
                            }
                            Integer num3 = num2;
                            kotlin.jvm.internal.i.b(num3);
                            return this$1.c(device2, num3.intValue());
                        }
                    }, Task.UI_THREAD_EXECUTOR);
                }
                kotlin.jvm.internal.i.b(num2);
                return this$0.c(device, num2.intValue());
            default:
                n nVar = (n) this.f34325b;
                nVar.getClass();
                return nVar.n(Float.parseFloat((String) this.f34326c) / ((Float) task.getResult()).floatValue());
        }
    }
}
