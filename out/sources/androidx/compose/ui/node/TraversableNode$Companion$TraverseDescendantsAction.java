package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TraversableNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TraversableNode$Companion$TraverseDescendantsAction {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TraversableNode$Companion$TraverseDescendantsAction f14569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TraversableNode$Companion$TraverseDescendantsAction f14570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TraversableNode$Companion$TraverseDescendantsAction f14571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TraversableNode$Companion$TraverseDescendantsAction[] f14572e;

    static {
        TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = new TraversableNode$Companion$TraverseDescendantsAction("ContinueTraversal", 0);
        f14569b = traversableNode$Companion$TraverseDescendantsAction;
        TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction2 = new TraversableNode$Companion$TraverseDescendantsAction("SkipSubtreeAndContinueTraversal", 1);
        f14570c = traversableNode$Companion$TraverseDescendantsAction2;
        TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction3 = new TraversableNode$Companion$TraverseDescendantsAction("CancelTraversal", 2);
        f14571d = traversableNode$Companion$TraverseDescendantsAction3;
        TraversableNode$Companion$TraverseDescendantsAction[] traversableNode$Companion$TraverseDescendantsActionArr = {traversableNode$Companion$TraverseDescendantsAction, traversableNode$Companion$TraverseDescendantsAction2, traversableNode$Companion$TraverseDescendantsAction3};
        f14572e = traversableNode$Companion$TraverseDescendantsActionArr;
        kotlin.enums.a.a(traversableNode$Companion$TraverseDescendantsActionArr);
    }

    public TraversableNode$Companion$TraverseDescendantsAction() {
        throw null;
    }

    public static TraversableNode$Companion$TraverseDescendantsAction valueOf(String str) {
        return (TraversableNode$Companion$TraverseDescendantsAction) Enum.valueOf(TraversableNode$Companion$TraverseDescendantsAction.class, str);
    }

    public static TraversableNode$Companion$TraverseDescendantsAction[] values() {
        return (TraversableNode$Companion$TraverseDescendantsAction[]) f14572e.clone();
    }
}
