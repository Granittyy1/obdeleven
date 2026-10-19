package coil.size;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Precision.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Precision {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Precision f23139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Precision f23140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Precision f23141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Precision[] f23142e;

    static {
        Precision precision = new Precision("EXACT", 0);
        f23139b = precision;
        Precision precision2 = new Precision("INEXACT", 1);
        f23140c = precision2;
        Precision precision3 = new Precision("AUTOMATIC", 2);
        f23141d = precision3;
        Precision[] precisionArr = {precision, precision2, precision3};
        f23142e = precisionArr;
        a.a(precisionArr);
    }

    public Precision() {
        throw null;
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) f23142e.clone();
    }
}
