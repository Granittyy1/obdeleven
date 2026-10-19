package com.google.gson;

/* JADX INFO: compiled from: FormattingStyle.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f28820d = new c("", "", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28823c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f28821a = str;
        this.f28822b = str2;
        this.f28823c = z10;
    }
}
