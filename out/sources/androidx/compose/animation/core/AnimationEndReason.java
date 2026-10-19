package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: AnimationEndReason.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationEndReason {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AnimationEndReason f9346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AnimationEndReason f9347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AnimationEndReason[] f9348d;

    static {
        AnimationEndReason animationEndReason = new AnimationEndReason("BoundReached", 0);
        f9346b = animationEndReason;
        AnimationEndReason animationEndReason2 = new AnimationEndReason("Finished", 1);
        f9347c = animationEndReason2;
        AnimationEndReason[] animationEndReasonArr = {animationEndReason, animationEndReason2};
        f9348d = animationEndReasonArr;
        kotlin.enums.a.a(animationEndReasonArr);
    }

    public AnimationEndReason() {
        throw null;
    }

    public static AnimationEndReason valueOf(String str) {
        return (AnimationEndReason) Enum.valueOf(AnimationEndReason.class, str);
    }

    public static AnimationEndReason[] values() {
        return (AnimationEndReason[]) f9348d.clone();
    }
}
