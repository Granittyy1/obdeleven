package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: InternalMutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MutatePriority {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MutatePriority f9387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ MutatePriority[] f9388c;

    static {
        MutatePriority mutatePriority = new MutatePriority("Default", 0);
        f9387b = mutatePriority;
        MutatePriority[] mutatePriorityArr = {mutatePriority, new MutatePriority("UserInput", 1), new MutatePriority("PreventUserInput", 2)};
        f9388c = mutatePriorityArr;
        kotlin.enums.a.a(mutatePriorityArr);
    }

    public MutatePriority() {
        throw null;
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) f9388c.clone();
    }
}
