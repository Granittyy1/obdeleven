package com.voltasit.obdeleven.domain.models;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ControlUnitStatus.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ControlUnitStatus {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ControlUnitStatus f30454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ControlUnitStatus f30455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ControlUnitStatus f30456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ControlUnitStatus f30457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ControlUnitStatus f30458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ControlUnitStatus[] f30459g;

    static {
        ControlUnitStatus controlUnitStatus = new ControlUnitStatus("Faulty", 0);
        f30454b = controlUnitStatus;
        ControlUnitStatus controlUnitStatus2 = new ControlUnitStatus("Uncoded", 1);
        f30455c = controlUnitStatus2;
        ControlUnitStatus controlUnitStatus3 = new ControlUnitStatus("Uninstalled", 2);
        f30456d = controlUnitStatus3;
        ControlUnitStatus controlUnitStatus4 = new ControlUnitStatus("Unknown", 3);
        f30457e = controlUnitStatus4;
        ControlUnitStatus controlUnitStatus5 = new ControlUnitStatus("Ok", 4);
        f30458f = controlUnitStatus5;
        ControlUnitStatus[] controlUnitStatusArr = {controlUnitStatus, controlUnitStatus2, controlUnitStatus3, controlUnitStatus4, controlUnitStatus5};
        f30459g = controlUnitStatusArr;
        a.a(controlUnitStatusArr);
    }

    public ControlUnitStatus() {
        throw null;
    }

    public static ControlUnitStatus valueOf(String str) {
        return (ControlUnitStatus) Enum.valueOf(ControlUnitStatus.class, str);
    }

    public static ControlUnitStatus[] values() {
        return (ControlUnitStatus[]) f30459g.clone();
    }
}
