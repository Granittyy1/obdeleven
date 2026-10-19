package org.koin.core.logger;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Level {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Level f45768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Level f45769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Level f45770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Level f45771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Level f45772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Level[] f45773g;

    static {
        Level level = new Level("DEBUG", 0);
        f45768b = level;
        Level level2 = new Level("INFO", 1);
        f45769c = level2;
        Level level3 = new Level("WARNING", 2);
        f45770d = level3;
        Level level4 = new Level("ERROR", 3);
        f45771e = level4;
        Level level5 = new Level("NONE", 4);
        f45772f = level5;
        Level[] levelArr = {level, level2, level3, level4, level5};
        f45773g = levelArr;
        a.a(levelArr);
    }

    public Level() {
        throw null;
    }

    public static Level valueOf(String str) {
        return (Level) Enum.valueOf(Level.class, str);
    }

    public static Level[] values() {
        return (Level[]) f45773g.clone();
    }
}
