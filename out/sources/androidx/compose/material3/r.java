package androidx.compose.material3;

import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC1065q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f12705d = new LinkedHashMap();

    public r(String str, String str2, String str3) {
        this.f12702a = str;
        this.f12703b = str2;
        this.f12704c = str3;
    }

    @Override // androidx.compose.material3.InterfaceC1065q
    public final String a(Long l10, Locale locale, boolean z10) {
        if (l10 == null) {
            return null;
        }
        return androidx.compose.material3.internal.m.a(l10.longValue(), z10 ? this.f12704c : this.f12703b, locale, this.f12705d);
    }

    @Override // androidx.compose.material3.InterfaceC1065q
    public final String b(Long l10, Locale locale) {
        return androidx.compose.material3.internal.m.a(l10.longValue(), this.f12702a, locale, this.f12705d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.i.a(this.f12702a, rVar.f12702a) && kotlin.jvm.internal.i.a(this.f12703b, rVar.f12703b) && kotlin.jvm.internal.i.a(this.f12704c, rVar.f12704c);
    }

    public final int hashCode() {
        return this.f12704c.hashCode() + B1.a.b(this.f12703b, this.f12702a.hashCode() * 31, 31);
    }
}
