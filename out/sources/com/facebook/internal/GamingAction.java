package com.facebook.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: FacebookGamingAction.kt */
/* JADX INFO: loaded from: classes.dex */
public enum GamingAction {
    /* JADX INFO: Fake field, exist only in values array */
    ContextChoose("context_choose"),
    /* JADX INFO: Fake field, exist only in values array */
    JoinTournament("join_tournament");

    private final String rawValue;

    GamingAction(String str) {
        this.rawValue = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static GamingAction[] valuesCustom() {
        return (GamingAction[]) Arrays.copyOf(values(), 2);
    }

    public final String a() {
        return this.rawValue;
    }
}
