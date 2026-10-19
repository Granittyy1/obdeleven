package com.obdeleven.feature.boomboarding.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: BoomboardingUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BoomboardingVideoType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BoomboardingVideoType f29228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BoomboardingVideoType f29229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BoomboardingVideoType f29230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BoomboardingVideoType[] f29231e;

    static {
        BoomboardingVideoType boomboardingVideoType = new BoomboardingVideoType("WelcomeLights", 0);
        f29228b = boomboardingVideoType;
        BoomboardingVideoType boomboardingVideoType2 = new BoomboardingVideoType("UrbanJoke", 1);
        f29229c = boomboardingVideoType2;
        BoomboardingVideoType boomboardingVideoType3 = new BoomboardingVideoType("VideoInMotion", 2);
        f29230d = boomboardingVideoType3;
        BoomboardingVideoType[] boomboardingVideoTypeArr = {boomboardingVideoType, boomboardingVideoType2, boomboardingVideoType3};
        f29231e = boomboardingVideoTypeArr;
        kotlin.enums.a.a(boomboardingVideoTypeArr);
    }

    public BoomboardingVideoType() {
        throw null;
    }

    public static BoomboardingVideoType valueOf(String str) {
        return (BoomboardingVideoType) Enum.valueOf(BoomboardingVideoType.class, str);
    }

    public static BoomboardingVideoType[] values() {
        return (BoomboardingVideoType[]) f29231e.clone();
    }
}
