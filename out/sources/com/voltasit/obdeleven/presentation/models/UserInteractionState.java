package com.voltasit.obdeleven.presentation.models;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: UserInteractionState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UserInteractionState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UserInteractionState f32649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final UserInteractionState f32650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final UserInteractionState f32651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ UserInteractionState[] f32652e;

    static {
        UserInteractionState userInteractionState = new UserInteractionState("ENABLED", 0);
        f32649b = userInteractionState;
        UserInteractionState userInteractionState2 = new UserInteractionState("PARTIAL", 1);
        f32650c = userInteractionState2;
        UserInteractionState userInteractionState3 = new UserInteractionState("DISABLED", 2);
        f32651d = userInteractionState3;
        UserInteractionState[] userInteractionStateArr = {userInteractionState, userInteractionState2, userInteractionState3};
        f32652e = userInteractionStateArr;
        a.a(userInteractionStateArr);
    }

    public UserInteractionState() {
        throw null;
    }

    public static UserInteractionState valueOf(String str) {
        return (UserInteractionState) Enum.valueOf(UserInteractionState.class, str);
    }

    public static UserInteractionState[] values() {
        return (UserInteractionState[]) f32652e.clone();
    }
}
