package com.voltasit.obdeleven.ui.activity;

import androidx.lifecycle.Z;
import com.obdeleven.service.interfaces.IDevice;
import com.parse.ParseUser;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.C2110z;
import com.voltasit.obdeleven.core.app.q0;
import com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt;
import com.voltasit.obdeleven.domain.exceptions.BluetoothException;
import com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper;
import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import p255u9.z;

/* JADX INFO: compiled from: MainActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$onBluetoothStateChanged$1", f = "MainActivityViewModel.kt", l = {}, m = "invokeSuspend")
final class MainActivityViewModel$onBluetoothStateChanged$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ IDevice $device;
    final /* synthetic */ Throwable $exception;
    final /* synthetic */ int $state;
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$onBluetoothStateChanged$1(int i10, MainActivityViewModel mainActivityViewModel, IDevice iDevice, Throwable th, kotlin.coroutines.c<? super MainActivityViewModel$onBluetoothStateChanged$1> cVar) {
        super(2, cVar);
        this.$state = i10;
        this.this$0 = mainActivityViewModel;
        this.$device = iDevice;
        this.$exception = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainActivityViewModel$onBluetoothStateChanged$1(this.$state, this.this$0, this.$device, this.$exception, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MainActivityViewModel$onBluetoothStateChanged$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Task<Integer> taskContinueWith;
        int i10 = 1;
        int i11 = 2;
        int i12 = 0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        int i13 = this.$state;
        if (i13 == 0) {
            W7.c.g(0);
            W7.c.h(null);
            W7.c.f7066d = null;
            this.this$0.f33587F0.j(p293xa.r.f47939a);
        } else if (i13 == 2) {
            final BluetoothConnectionHelper bluetoothConnectionHelper = this.this$0.f33628a0;
            if (bluetoothConnectionHelper == null) {
                kotlin.jvm.internal.i.m("bluetoothConnectionHelper");
                throw null;
            }
            final IDevice device = this.$device;
            kotlin.jvm.internal.i.e(device, "device");
            O.e.s("BluetoothConnectionHelper", "connectDevice(device: " + device.f() + ")");
            MainActivity mainActivity = bluetoothConnectionHelper.f34294a;
            mainActivity.getClass();
            mainActivity.T();
            int i14 = z.f47484b;
            final z zVar = (z) ParseUser.getCurrentUser();
            if (device instanceof com.voltasit.obdeleven.utils.bluetooth.m) {
                taskContinueWith = ((com.voltasit.obdeleven.utils.bluetooth.m) device).p();
                kotlin.jvm.internal.i.b(taskContinueWith);
            } else {
                O.e.j("Device", "connectDevice()");
                taskContinueWith = new p047d8.j(10000L, "05", false).a().onSuccess(new C2110z(i10)).onSuccessTask(new S8.a(6, (com.voltasit.obdeleven.utils.bluetooth.o) device)).continueWith(new com.voltasit.obdeleven.utils.bluetooth.f());
                kotlin.jvm.internal.i.b(taskContinueWith);
            }
            Task<TContinuationResult> taskContinueWithTask = taskContinueWith.continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.utils.bluetooth.e
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task) {
                    BluetoothConnectionHelper this$0 = bluetoothConnectionHelper;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    IDevice device2 = device;
                    kotlin.jvm.internal.i.e(device2, "$device");
                    Integer num = (Integer) task.getResult();
                    return (num != null && num.intValue() == 0) ? ParseTaskExtensionsKt.a(new BluetoothConnectionHelper$setupAndCheckIfFwUpdateIsRequired$1$1(this$0, device2, null)) : Task.forResult(task.getResult());
                }
            });
            kotlin.jvm.internal.i.d(taskContinueWithTask, "continueWithTask(...)");
            com.voltasit.obdeleven.utils.bluetooth.a aVar = new com.voltasit.obdeleven.utils.bluetooth.a(bluetoothConnectionHelper, i12, device);
            Executor executor = Task.UI_THREAD_EXECUTOR;
            taskContinueWithTask.continueWithTask(aVar, executor).continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.utils.bluetooth.b
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task) {
                    IDevice device2 = device;
                    kotlin.jvm.internal.i.e(device2, "$device");
                    BluetoothConnectionHelper this$0 = bluetoothConnectionHelper;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    kotlin.jvm.internal.i.e(task, "task");
                    if (!((Boolean) task.getResult()).booleanValue()) {
                        return Task.forResult(Boolean.FALSE);
                    }
                    return (Task) C2680e.d(EmptyCoroutineContext.f43032b, new BluetoothConnectionHelper$connectDevice$2$1(device2, this$0, zVar, null));
                }
            }, Task.BACKGROUND_EXECUTOR).continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.utils.bluetooth.c
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task) {
                    BluetoothConnectionHelper this$0 = bluetoothConnectionHelper;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    IDevice device2 = device;
                    kotlin.jvm.internal.i.e(device2, "$device");
                    kotlin.jvm.internal.i.e(task, "task");
                    O.e.j("BluetoothConnectionHelper", "continueWithTask(" + task.getResult() + ")");
                    if (!kotlin.jvm.internal.i.a(task.getResult(), Boolean.TRUE)) {
                        return Task.forResult(Boolean.FALSE);
                    }
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    C2680e.c(C2673a0.f43223b, null, null, new BluetoothConnectionHelper$showDeviceInputDialogIfNeeded$1(this$0, taskCompletionSource, device2, null), 3);
                    Task task2 = taskCompletionSource.getTask();
                    kotlin.jvm.internal.i.d(task2, "getTask(...)");
                    return task2;
                }
            }, executor).continueWithTask(new q0(zVar, device, bluetoothConnectionHelper, i10)).continueWith(new V8.f(bluetoothConnectionHelper, i11, device));
        } else if (i13 == 3) {
            MainActivityViewModel mainActivityViewModel = this.this$0;
            IDevice iDevice = this.$device;
            Throwable th = this.$exception;
            mainActivityViewModel.f33652t.f("MainActivityViewModel", "handleConnectionFailed()");
            if (th != null && (th instanceof BluetoothException) && ((BluetoothException) th).a()) {
                C2680e.c(Z.a(mainActivityViewModel), null, null, new MainActivityViewModel$handleConnectionFailed$1(mainActivityViewModel, iDevice, th, null), 3);
            } else {
                if (th != null) {
                    mainActivityViewModel.f33652t.d(th, false);
                }
                mainActivityViewModel.f32119h.j(Integer.valueOf(R.string.common_unable_to_connect));
                W7.c.g(0);
            }
        } else if (i13 == 4) {
            W7.c.g(0);
            W7.c.h(null);
            W7.c.f7066d = null;
            if (this.this$0.f33644p.o()) {
                this.this$0.f33583D0.j(p293xa.r.f47939a);
            }
            B7.b.h(R.string.dialog_password_status_connection_lost, this.this$0.f32119h);
            this.this$0.f33587F0.j(p293xa.r.f47939a);
        }
        return p293xa.r.f47939a;
    }
}
