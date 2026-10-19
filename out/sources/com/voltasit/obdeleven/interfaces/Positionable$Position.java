package com.voltasit.obdeleven.interfaces;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Positionable$Position {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Positionable$Position f31106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Positionable$Position f31107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Positionable$Position f31108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Positionable$Position[] f31109e;

    static {
        Positionable$Position positionable$Position = new Positionable$Position("MENU", 0);
        f31106b = positionable$Position;
        Positionable$Position positionable$Position2 = new Positionable$Position("CONTENT", 1);
        f31107c = positionable$Position2;
        Positionable$Position positionable$Position3 = new Positionable$Position("CENTER", 2);
        f31108d = positionable$Position3;
        f31109e = new Positionable$Position[]{positionable$Position, positionable$Position2, positionable$Position3};
    }

    public Positionable$Position() {
        throw null;
    }

    public static Positionable$Position valueOf(String str) {
        return (Positionable$Position) Enum.valueOf(Positionable$Position.class, str);
    }

    public static Positionable$Position[] values() {
        return (Positionable$Position[]) f31109e.clone();
    }
}
