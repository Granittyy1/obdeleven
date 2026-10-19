package com.facebook;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: HttpMethod.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HttpMethod {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HttpMethod f24771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HttpMethod f24772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ HttpMethod[] f24773d;

    static {
        HttpMethod httpMethod = new HttpMethod("GET", 0);
        f24771b = httpMethod;
        HttpMethod httpMethod2 = new HttpMethod("POST", 1);
        f24772c = httpMethod2;
        f24773d = new HttpMethod[]{httpMethod, httpMethod2, new HttpMethod("DELETE", 2)};
    }

    public HttpMethod() {
        throw null;
    }

    public static HttpMethod valueOf(String value) {
        i.e(value, "value");
        return (HttpMethod) Enum.valueOf(HttpMethod.class, value);
    }

    public static HttpMethod[] values() {
        return (HttpMethod[]) Arrays.copyOf(f24773d, 3);
    }
}
