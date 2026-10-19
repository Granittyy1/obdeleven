package com.voltasit.obdeleven.interfaces;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Positionable$Transition {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Positionable$Transition f31110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Positionable$Transition f31111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Positionable$Transition f31112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Positionable$Transition[] f31113e;

    static {
        Positionable$Transition positionable$Transition = new Positionable$Transition("POP_FRAGMENT", 0);
        f31110b = positionable$Transition;
        Positionable$Transition positionable$Transition2 = new Positionable$Transition("JUMP_TO_LAST_MENU", 1);
        f31111c = positionable$Transition2;
        Positionable$Transition positionable$Transition3 = new Positionable$Transition("JUMP_BEFORE_LAST_MENU", 2);
        f31112d = positionable$Transition3;
        f31113e = new Positionable$Transition[]{positionable$Transition, positionable$Transition2, positionable$Transition3};
    }

    public Positionable$Transition() {
        throw null;
    }

    public static Positionable$Transition valueOf(String str) {
        return (Positionable$Transition) Enum.valueOf(Positionable$Transition.class, str);
    }

    public static Positionable$Transition[] values() {
        return (Positionable$Transition[]) f31113e.clone();
    }
}
