package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Strictness {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Strictness f28812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Strictness f28813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Strictness f28814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Strictness[] f28815e;

    static {
        Strictness strictness = new Strictness("LENIENT", 0);
        f28812b = strictness;
        Strictness strictness2 = new Strictness("LEGACY_STRICT", 1);
        f28813c = strictness2;
        Strictness strictness3 = new Strictness("STRICT", 2);
        f28814d = strictness3;
        f28815e = new Strictness[]{strictness, strictness2, strictness3};
    }

    public Strictness() {
        throw null;
    }

    public static Strictness valueOf(String str) {
        return (Strictness) Enum.valueOf(Strictness.class, str);
    }

    public static Strictness[] values() {
        return (Strictness[]) f28815e.clone();
    }
}
