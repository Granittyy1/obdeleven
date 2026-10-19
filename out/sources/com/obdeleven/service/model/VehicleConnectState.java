package com.obdeleven.service.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: VehicleConnectState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class VehicleConnectState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ VehicleConnectState[] f29419b;

    /* JADX INFO: Fake field, exist only in values array */
    VehicleConnectState EF5;

    static {
        VehicleConnectState[] vehicleConnectStateArr = {new VehicleConnectState("DETECTING_VEHICLE", 0), new VehicleConnectState("READING_CONTROL_UNITS", 1)};
        f29419b = vehicleConnectStateArr;
        kotlin.enums.a.a(vehicleConnectStateArr);
    }

    public VehicleConnectState() {
        throw null;
    }

    public static VehicleConnectState valueOf(String str) {
        return (VehicleConnectState) Enum.valueOf(VehicleConnectState.class, str);
    }

    public static VehicleConnectState[] values() {
        return (VehicleConnectState[]) f29419b.clone();
    }
}
