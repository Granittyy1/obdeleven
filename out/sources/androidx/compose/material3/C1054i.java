package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.compose.material3.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CalendarLocale.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1054i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap<String, NumberFormat> f12462a = new WeakHashMap<>();

    public static String a(int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        String str = i11 + ".40.false." + Locale.getDefault().toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = f12462a;
        NumberFormat integerInstance = weakHashMap.get(str);
        if (integerInstance == null) {
            integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(i11);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(str, integerInstance);
        }
        return integerInstance.format(Integer.valueOf(i10));
    }
}
