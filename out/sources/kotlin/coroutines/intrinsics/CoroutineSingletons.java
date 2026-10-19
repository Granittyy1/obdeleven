package kotlin.coroutines.intrinsics;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Intrinsics.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutineSingletons {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CoroutineSingletons f43038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CoroutineSingletons f43039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CoroutineSingletons f43040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CoroutineSingletons[] f43041e;

    static {
        CoroutineSingletons coroutineSingletons = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
        f43038b = coroutineSingletons;
        CoroutineSingletons coroutineSingletons2 = new CoroutineSingletons("UNDECIDED", 1);
        f43039c = coroutineSingletons2;
        CoroutineSingletons coroutineSingletons3 = new CoroutineSingletons("RESUMED", 2);
        f43040d = coroutineSingletons3;
        CoroutineSingletons[] coroutineSingletonsArr = {coroutineSingletons, coroutineSingletons2, coroutineSingletons3};
        f43041e = coroutineSingletonsArr;
        a.a(coroutineSingletonsArr);
    }

    public CoroutineSingletons() {
        throw null;
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) f43041e.clone();
    }
}
