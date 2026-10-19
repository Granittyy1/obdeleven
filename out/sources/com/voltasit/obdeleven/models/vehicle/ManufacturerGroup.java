package com.voltasit.obdeleven.models.vehicle;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ManufacturerGroup.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ManufacturerGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ManufacturerGroup f31169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ManufacturerGroup f31170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ManufacturerGroup f31171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ManufacturerGroup[] f31172e;

    static {
        ManufacturerGroup manufacturerGroup = new ManufacturerGroup("Bmw", 0);
        f31169b = manufacturerGroup;
        ManufacturerGroup manufacturerGroup2 = new ManufacturerGroup("Vag", 1);
        f31170c = manufacturerGroup2;
        ManufacturerGroup manufacturerGroup3 = new ManufacturerGroup("Other", 2);
        f31171d = manufacturerGroup3;
        ManufacturerGroup[] manufacturerGroupArr = {manufacturerGroup, manufacturerGroup2, manufacturerGroup3};
        f31172e = manufacturerGroupArr;
        a.a(manufacturerGroupArr);
    }

    public ManufacturerGroup() {
        throw null;
    }

    public static ManufacturerGroup valueOf(String str) {
        return (ManufacturerGroup) Enum.valueOf(ManufacturerGroup.class, str);
    }

    public static ManufacturerGroup[] values() {
        return (ManufacturerGroup[]) f31172e.clone();
    }
}
