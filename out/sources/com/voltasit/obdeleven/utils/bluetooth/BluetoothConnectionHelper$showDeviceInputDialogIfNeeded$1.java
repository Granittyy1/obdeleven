package com.voltasit.obdeleven.utils.bluetooth;

import com.obdeleven.service.interfaces.IDevice;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.domain.exceptions.DeviceNotConnectedException;
import com.voltasit.obdeleven.domain.exceptions.DevicePinNotSetException;
import com.voltasit.obdeleven.domain.exceptions.InvalidPinException;
import com.voltasit.obdeleven.domain.models.UserPermission;
import com.voltasit.obdeleven.domain.usecases.device.C2117b;
import com.voltasit.obdeleven.presentation.dialogs.devicePassword.PasswordEnterDialog;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: BluetoothConnectionHelper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper$showDeviceInputDialogIfNeeded$1", f = "BluetoothConnectionHelper.kt", l = {342, 350}, m = "invokeSuspend")
final class BluetoothConnectionHelper$showDeviceInputDialogIfNeeded$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ IDevice $device;
    final /* synthetic */ TaskCompletionSource<Boolean> $manager;
    int label;
    final /* synthetic */ BluetoothConnectionHelper this$0;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper$showDeviceInputDialogIfNeeded$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: BluetoothConnectionHelper.kt */
    @Aa.c(c = "com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper$showDeviceInputDialogIfNeeded$1$1", f = "BluetoothConnectionHelper.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ IDevice $device;
        final /* synthetic */ TaskCompletionSource<Boolean> $manager;
        final /* synthetic */ Throwable $throwable;
        int label;
        final /* synthetic */ BluetoothConnectionHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Throwable th, BluetoothConnectionHelper bluetoothConnectionHelper, IDevice iDevice, TaskCompletionSource<Boolean> taskCompletionSource, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$throwable = th;
            this.this$0 = bluetoothConnectionHelper;
            this.$device = iDevice;
            this.$manager = taskCompletionSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$throwable, this.this$0, this.$device, this.$manager, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            Throwable th = this.$throwable;
            if (th instanceof DevicePinNotSetException) {
                com.voltasit.obdeleven.presentation.dialogs.devicePassword.c cVar = new com.voltasit.obdeleven.presentation.dialogs.devicePassword.c(this.this$0.f34294a);
                final TaskCompletionSource<Boolean> taskCompletionSource = this.$manager;
                cVar.f32254f = new Ia.l<Boolean, p293xa.r>() { // from class: com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper.showDeviceInputDialogIfNeeded.1.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        taskCompletionSource.trySetResult(bool2);
                        return p293xa.r.f47939a;
                    }
                };
                cVar.show();
            } else if (th instanceof InvalidPinException) {
                PasswordEnterDialog passwordEnterDialog = new PasswordEnterDialog(this.this$0.f34294a, this.$device);
                final TaskCompletionSource<Boolean> taskCompletionSource2 = this.$manager;
                passwordEnterDialog.f32245g = new Ia.l<Boolean, p293xa.r>() { // from class: com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper.showDeviceInputDialogIfNeeded.1.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        taskCompletionSource2.trySetResult(bool2);
                        return p293xa.r.f47939a;
                    }
                };
                MainActivity mainActivity = this.this$0.f34294a;
                mainActivity.getClass();
                if (mainActivity.f33534C) {
                    passwordEnterDialog.show();
                } else {
                    mainActivity.f33538G = passwordEnterDialog;
                }
            } else {
                this.$manager.setResult(Boolean.FALSE);
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothConnectionHelper$showDeviceInputDialogIfNeeded$1(BluetoothConnectionHelper bluetoothConnectionHelper, TaskCompletionSource<Boolean> taskCompletionSource, IDevice iDevice, kotlin.coroutines.c<? super BluetoothConnectionHelper$showDeviceInputDialogIfNeeded$1> cVar) {
        super(2, cVar);
        this.this$0 = bluetoothConnectionHelper;
        this.$manager = taskCompletionSource;
        this.$device = iDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BluetoothConnectionHelper$showDeviceInputDialogIfNeeded$1(this.this$0, this.$manager, this.$device, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((BluetoothConnectionHelper$showDeviceInputDialogIfNeeded$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        C2117b c2117b = this.this$0.f34301h;
        this.label = 1;
        J8.p pVar = c2117b.f30771d;
        pVar.f("AuthoriseDeviceUC", "AuthoriseDeviceUC()");
        if (c2117b.f30770c.C(UserPermission.SKIP_DEVICE_PASSWORD)) {
            pVar.e("AuthoriseDeviceUC", "skipping device pin");
            obj = E8.a.j(p293xa.r.f47939a);
        } else {
            IDevice iDeviceD = c2117b.f30769b.d();
            if (iDeviceD == null) {
                obj = E8.a.i(new DeviceNotConnectedException());
            } else if (iDeviceD.e().f3519d) {
                pVar.e("AuthoriseDeviceUC", "authorizing device");
                obj = c2117b.f30768a.p(iDeviceD.e().f3516a, null, this);
            } else {
                pVar.e("AuthoriseDeviceUC", "device pin is not set");
                obj = E8.a.i(new DevicePinNotSetException());
            }
        }
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar = (C8.a) obj;
        if (!(aVar instanceof C8.a.C0024a)) {
            if (!(aVar instanceof C8.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.$manager.setResult(Boolean.TRUE);
            return p293xa.r.f47939a;
        }
        Throwable th = ((C8.a.C0024a) aVar).f2462a;
        Sa.b bVar = N.f43198a;
        q0 q0Var = kotlinx.coroutines.internal.q.f43500a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(th, this.this$0, this.$device, this.$manager, null);
        this.label = 2;
        if (C2680e.f(q0Var, anonymousClass1, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
    }
}
