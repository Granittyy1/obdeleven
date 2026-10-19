package com.voltasit.obdeleven.domain.models;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: NavigationType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NavigationType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NavigationType f30487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final NavigationType f30488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final NavigationType f30489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ NavigationType[] f30490e;

    static {
        NavigationType navigationType = new NavigationType("Navigate", 0);
        f30487b = navigationType;
        NavigationType navigationType2 = new NavigationType("PopBackTo", 1);
        f30488c = navigationType2;
        NavigationType navigationType3 = new NavigationType("PopBackToInclusive", 2);
        f30489d = navigationType3;
        NavigationType[] navigationTypeArr = {navigationType, navigationType2, navigationType3};
        f30490e = navigationTypeArr;
        a.a(navigationTypeArr);
    }

    public NavigationType() {
        throw null;
    }

    public static NavigationType valueOf(String str) {
        return (NavigationType) Enum.valueOf(NavigationType.class, str);
    }

    public static NavigationType[] values() {
        return (NavigationType[]) f30490e.clone();
    }
}
