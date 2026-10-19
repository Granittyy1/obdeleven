package com.google.firebase.sessions.settings;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SettingsCache.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f28765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f28766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f28767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f28768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f28769e;

    public c(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.f28765a = bool;
        this.f28766b = d10;
        this.f28767c = num;
        this.f28768d = num2;
        this.f28769e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.f28765a, cVar.f28765a) && i.a(this.f28766b, cVar.f28766b) && i.a(this.f28767c, cVar.f28767c) && i.a(this.f28768d, cVar.f28768d) && i.a(this.f28769e, cVar.f28769e);
    }

    public final int hashCode() {
        Boolean bool = this.f28765a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f28766b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f28767c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f28768d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f28769e;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f28765a + ", sessionSamplingRate=" + this.f28766b + ", sessionRestartTimeout=" + this.f28767c + ", cacheDuration=" + this.f28768d + ", cacheUpdatedTime=" + this.f28769e + ')';
    }
}
