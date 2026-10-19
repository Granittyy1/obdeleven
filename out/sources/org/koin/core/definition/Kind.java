package org.koin.core.definition;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: BeanDefinition.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Kind {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Kind f45760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Kind f45761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Kind[] f45762d;

    static {
        Kind kind = new Kind("Singleton", 0);
        f45760b = kind;
        Kind kind2 = new Kind("Factory", 1);
        f45761c = kind2;
        Kind[] kindArr = {kind, kind2, new Kind("Scoped", 2)};
        f45762d = kindArr;
        a.a(kindArr);
    }

    public Kind() {
        throw null;
    }

    public static Kind valueOf(String str) {
        return (Kind) Enum.valueOf(Kind.class, str);
    }

    public static Kind[] values() {
        return (Kind[]) f45762d.clone();
    }
}
