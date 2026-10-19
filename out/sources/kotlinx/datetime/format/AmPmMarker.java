package kotlinx.datetime.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LocalTimeFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AmPmMarker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AmPmMarker f43630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AmPmMarker f43631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AmPmMarker[] f43632d;

    static {
        AmPmMarker amPmMarker = new AmPmMarker("AM", 0);
        f43630b = amPmMarker;
        AmPmMarker amPmMarker2 = new AmPmMarker("PM", 1);
        f43631c = amPmMarker2;
        AmPmMarker[] amPmMarkerArr = {amPmMarker, amPmMarker2};
        f43632d = amPmMarkerArr;
        kotlin.enums.a.a(amPmMarkerArr);
    }

    public AmPmMarker() {
        throw null;
    }

    public static AmPmMarker valueOf(String str) {
        return (AmPmMarker) Enum.valueOf(AmPmMarker.class, str);
    }

    public static AmPmMarker[] values() {
        return (AmPmMarker[]) f43632d.clone();
    }
}
