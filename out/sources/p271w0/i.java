package p271w0;

import android.os.LocaleList;

/* JADX INFO: compiled from: LocaleListPlatformWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f47685a;

    public i(LocaleList localeList) {
        this.f47685a = localeList;
    }

    @Override // p271w0.h
    public final Object a() {
        return this.f47685a;
    }

    public final boolean equals(Object obj) {
        return this.f47685a.equals(((h) obj).a());
    }

    public final int hashCode() {
        return this.f47685a.hashCode();
    }

    public final String toString() {
        return this.f47685a.toString();
    }
}
