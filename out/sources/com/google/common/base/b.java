package com.google.common.base;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: Charsets.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f27790a = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f27791b;

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        f27791b = StandardCharsets.UTF_8;
        Charset charset2 = StandardCharsets.UTF_16BE;
        Charset charset3 = StandardCharsets.UTF_16LE;
        Charset charset4 = StandardCharsets.UTF_16;
    }
}
