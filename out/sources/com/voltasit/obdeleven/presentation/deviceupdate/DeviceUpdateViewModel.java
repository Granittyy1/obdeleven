package com.voltasit.obdeleven.presentation.deviceupdate;

import androidx.lifecycle.C;
import com.obdeleven.service.interfaces.IDevice;
import com.voltasit.obdeleven.domain.usecases.device.ForceDeviceUpdateUC;
import com.voltasit.obdeleven.domain.usecases.device.l;
import com.voltasit.obdeleven.domain.usecases.device.x;
import com.voltasit.obdeleven.domain.usecases.device.y;
import com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice;
import com.voltasit.obdeleven.utils.bluetooth.g;
import com.voltasit.obdeleven.utils.bluetooth.o;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: DeviceUpdateViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DeviceUpdateViewModel extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ForceDeviceUpdateUC f32135o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f32136p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f32137q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f32138r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C<State> f32139s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C f32140t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final U7.a<Boolean> f32141u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final U7.a<Boolean> f32142v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f32143w;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: DeviceUpdateViewModel.kt */
    public static final class State {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final State f32144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final State f32145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final State f32146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final State f32147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final State f32148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ State[] f32149g;

        static {
            State state = new State("Initial", 0);
            f32144b = state;
            State state2 = new State("Updating", 1);
            f32145c = state2;
            State state3 = new State("ForceUpdate", 2);
            f32146d = state3;
            State state4 = new State("Success", 3);
            f32147e = state4;
            State state5 = new State("FailedGeneric", 4);
            f32148f = state5;
            State[] stateArr = {state, state2, state3, state4, state5};
            f32149g = stateArr;
            kotlin.enums.a.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f32149g.clone();
        }
    }

    public DeviceUpdateViewModel(ForceDeviceUpdateUC forceDeviceUpdateUC, y yVar, x xVar, l lVar) {
        this.f32135o = forceDeviceUpdateUC;
        this.f32136p = yVar;
        this.f32137q = xVar;
        this.f32138r = lVar;
        C<State> c10 = new C<>(State.f32144b);
        this.f32139s = c10;
        this.f32140t = c10;
        U7.a<Boolean> aVar = new U7.a<>();
        this.f32141u = aVar;
        this.f32142v = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(DeviceUpdateViewModel deviceUpdateViewModel, IDevice iDevice, ContinuationImpl continuationImpl) {
        DeviceUpdateViewModel$runFirmwareUpdate$1 deviceUpdateViewModel$runFirmwareUpdate$1;
        Object objA;
        State state;
        deviceUpdateViewModel.getClass();
        if (continuationImpl instanceof DeviceUpdateViewModel$runFirmwareUpdate$1) {
            deviceUpdateViewModel$runFirmwareUpdate$1 = (DeviceUpdateViewModel$runFirmwareUpdate$1) continuationImpl;
            int i10 = deviceUpdateViewModel$runFirmwareUpdate$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deviceUpdateViewModel$runFirmwareUpdate$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deviceUpdateViewModel$runFirmwareUpdate$1 = new DeviceUpdateViewModel$runFirmwareUpdate$1(deviceUpdateViewModel, continuationImpl);
            }
        } else {
            deviceUpdateViewModel$runFirmwareUpdate$1 = new DeviceUpdateViewModel$runFirmwareUpdate$1(deviceUpdateViewModel, continuationImpl);
        }
        Object obj = deviceUpdateViewModel$runFirmwareUpdate$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = deviceUpdateViewModel$runFirmwareUpdate$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                iDevice = (IDevice) deviceUpdateViewModel$runFirmwareUpdate$1.L$1;
                deviceUpdateViewModel = (DeviceUpdateViewModel) deviceUpdateViewModel$runFirmwareUpdate$1.L$0;
                kotlin.b.b(obj);
                objA = ((Result) obj).b();
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }
        kotlin.b.b(obj);
        deviceUpdateViewModel$runFirmwareUpdate$1.L$0 = deviceUpdateViewModel;
        deviceUpdateViewModel$runFirmwareUpdate$1.L$1 = iDevice;
        deviceUpdateViewModel$runFirmwareUpdate$1.label = 1;
        objA = deviceUpdateViewModel.f32136p.a(iDevice, deviceUpdateViewModel$runFirmwareUpdate$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (Result.a(objA) == null) {
            deviceUpdateViewModel$runFirmwareUpdate$1.L$0 = null;
            deviceUpdateViewModel$runFirmwareUpdate$1.L$1 = null;
            deviceUpdateViewModel$runFirmwareUpdate$1.label = 2;
            if (deviceUpdateViewModel.c(iDevice, deviceUpdateViewModel$runFirmwareUpdate$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            C<State> c10 = deviceUpdateViewModel.f32139s;
            if (iDevice instanceof o) {
                g gVar = W7.c.f7065c;
                i.c(gVar, "null cannot be cast to non-null type com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice");
                ((LeBluetoothDevice) gVar).f34323z = false;
                deviceUpdateViewModel.f32143w = (o) iDevice;
                state = State.f32146d;
            } else {
                state = State.f32148f;
            }
            c10.k(state);
        }
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(IDevice iDevice, ContinuationImpl continuationImpl) throws Throwable {
        DeviceUpdateViewModel$handleFwUpdateComplete$1 deviceUpdateViewModel$handleFwUpdateComplete$1;
        DeviceUpdateViewModel deviceUpdateViewModel;
        IDevice iDevice2;
        C<State> c10;
        State state;
        if (continuationImpl instanceof DeviceUpdateViewModel$handleFwUpdateComplete$1) {
            deviceUpdateViewModel$handleFwUpdateComplete$1 = (DeviceUpdateViewModel$handleFwUpdateComplete$1) continuationImpl;
            int i10 = deviceUpdateViewModel$handleFwUpdateComplete$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deviceUpdateViewModel$handleFwUpdateComplete$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deviceUpdateViewModel$handleFwUpdateComplete$1 = new DeviceUpdateViewModel$handleFwUpdateComplete$1(this, continuationImpl);
            }
        } else {
            deviceUpdateViewModel$handleFwUpdateComplete$1 = new DeviceUpdateViewModel$handleFwUpdateComplete$1(this, continuationImpl);
        }
        Object objA = deviceUpdateViewModel$handleFwUpdateComplete$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = deviceUpdateViewModel$handleFwUpdateComplete$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                c10 = (C) deviceUpdateViewModel$handleFwUpdateComplete$1.L$2;
                iDevice2 = (IDevice) deviceUpdateViewModel$handleFwUpdateComplete$1.L$1;
                deviceUpdateViewModel = (DeviceUpdateViewModel) deviceUpdateViewModel$handleFwUpdateComplete$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c10 = (C) deviceUpdateViewModel$handleFwUpdateComplete$1.L$0;
                kotlin.b.b(objA);
            }
            if (((Boolean) objA).booleanValue()) {
                state = State.f32147e;
            } else {
                state = State.f32148f;
            }
            c10.k(state);
            return r.f47939a;
        }
        kotlin.b.b(objA);
        C<State> c11 = this.f32139s;
        deviceUpdateViewModel$handleFwUpdateComplete$1.L$0 = this;
        deviceUpdateViewModel$handleFwUpdateComplete$1.L$1 = iDevice;
        deviceUpdateViewModel$handleFwUpdateComplete$1.L$2 = c11;
        deviceUpdateViewModel$handleFwUpdateComplete$1.label = 1;
        Object objA2 = this.f32138r.a(iDevice, deviceUpdateViewModel$handleFwUpdateComplete$1);
        if (objA2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        deviceUpdateViewModel = this;
        iDevice2 = iDevice;
        c10 = c11;
        objA = objA2;
        if (((Boolean) objA).booleanValue()) {
            x xVar = deviceUpdateViewModel.f32137q;
            deviceUpdateViewModel$handleFwUpdateComplete$1.L$0 = c10;
            deviceUpdateViewModel$handleFwUpdateComplete$1.L$1 = null;
            deviceUpdateViewModel$handleFwUpdateComplete$1.L$2 = null;
            deviceUpdateViewModel$handleFwUpdateComplete$1.label = 2;
            objA = xVar.a(iDevice2, deviceUpdateViewModel$handleFwUpdateComplete$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            if (((Boolean) objA).booleanValue()) {
                state = State.f32147e;
            } else {
                state = State.f32148f;
            }
        } else {
            state = State.f32147e;
        }
        c10.k(state);
        return r.f47939a;
    }
}
