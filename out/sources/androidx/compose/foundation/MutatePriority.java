package androidx.compose.foundation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: MutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MutatePriority {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MutatePriority f9810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MutatePriority f9811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final MutatePriority f9812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ MutatePriority[] f9813e;

    static {
        MutatePriority mutatePriority = new MutatePriority("Default", 0);
        f9810b = mutatePriority;
        MutatePriority mutatePriority2 = new MutatePriority("UserInput", 1);
        f9811c = mutatePriority2;
        MutatePriority mutatePriority3 = new MutatePriority("PreventUserInput", 2);
        f9812d = mutatePriority3;
        MutatePriority[] mutatePriorityArr = {mutatePriority, mutatePriority2, mutatePriority3};
        f9813e = mutatePriorityArr;
        kotlin.enums.a.a(mutatePriorityArr);
    }

    public MutatePriority() {
        throw null;
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) f9813e.clone();
    }
}
