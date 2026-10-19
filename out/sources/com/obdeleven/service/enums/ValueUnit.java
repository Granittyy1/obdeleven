package com.obdeleven.service.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ValueUnit {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ValueUnit f29310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ValueUnit f29311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ValueUnit[] f29312d;

    static {
        ValueUnit valueUnit = new ValueUnit("METRIC", 0);
        f29310b = valueUnit;
        ValueUnit valueUnit2 = new ValueUnit("IMPERIAL", 1);
        f29311c = valueUnit2;
        f29312d = new ValueUnit[]{valueUnit, valueUnit2};
    }

    public ValueUnit() {
        throw null;
    }

    public static ValueUnit valueOf(String str) {
        return (ValueUnit) Enum.valueOf(ValueUnit.class, str);
    }

    public static ValueUnit[] values() {
        return (ValueUnit[]) f29312d.clone();
    }
}
