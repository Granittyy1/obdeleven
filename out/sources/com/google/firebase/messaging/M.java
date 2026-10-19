package com.google.firebase.messaging;

import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: TopicOperation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class M {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f28301d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28304c;

    public M(String str, String str2) {
        String strSubstring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (strSubstring == null || !f28301d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f28302a = strSubstring;
        this.f28303b = str;
        this.f28304c = O.a.f(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        M m7 = (M) obj;
        return this.f28302a.equals(m7.f28302a) && this.f28303b.equals(m7.f28303b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28303b, this.f28302a});
    }
}
