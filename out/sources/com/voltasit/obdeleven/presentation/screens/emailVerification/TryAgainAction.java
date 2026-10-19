package com.voltasit.obdeleven.presentation.screens.emailVerification;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TryAgainAction.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TryAgainAction {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TryAgainAction f32944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TryAgainAction f32945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TryAgainAction f32946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TryAgainAction[] f32947e;

    static {
        TryAgainAction tryAgainAction = new TryAgainAction("NONE", 0);
        f32944b = tryAgainAction;
        TryAgainAction tryAgainAction2 = new TryAgainAction("RESEND", 1);
        TryAgainAction tryAgainAction3 = new TryAgainAction("MOVE_TO_EMAIL_CONFIRMATION_SCREEN", 2);
        f32945c = tryAgainAction3;
        TryAgainAction tryAgainAction4 = new TryAgainAction("MOVE_TO_PERSONAL_INFO_FORM", 3);
        f32946d = tryAgainAction4;
        TryAgainAction[] tryAgainActionArr = {tryAgainAction, tryAgainAction2, tryAgainAction3, tryAgainAction4};
        f32947e = tryAgainActionArr;
        kotlin.enums.a.a(tryAgainActionArr);
    }

    public TryAgainAction() {
        throw null;
    }

    public static TryAgainAction valueOf(String str) {
        return (TryAgainAction) Enum.valueOf(TryAgainAction.class, str);
    }

    public static TryAgainAction[] values() {
        return (TryAgainAction[]) f32947e.clone();
    }
}
