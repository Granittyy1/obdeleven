package com.voltasit.obdeleven.presentation.controlUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ProCuFunction.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ProCuScreen {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ProCuScreen f31479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ProCuScreen f31480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProCuScreen f31481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProCuScreen f31482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProCuScreen f31483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProCuScreen f31484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ProCuScreen f31485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ProCuScreen f31486i;
    public static final /* synthetic */ ProCuScreen[] j;

    static {
        ProCuScreen proCuScreen = new ProCuScreen("Coding2", 0);
        f31479b = proCuScreen;
        ProCuScreen proCuScreen2 = new ProCuScreen("SecurityAccess", 1);
        f31480c = proCuScreen2;
        ProCuScreen proCuScreen3 = new ProCuScreen("Reset", 2);
        f31481d = proCuScreen3;
        ProCuScreen proCuScreen4 = new ProCuScreen("DiagnosticService", 3);
        f31482e = proCuScreen4;
        ProCuScreen proCuScreen5 = new ProCuScreen("Eeprom", 4);
        f31483f = proCuScreen5;
        ProCuScreen proCuScreen6 = new ProCuScreen("Backup", 5);
        f31484g = proCuScreen6;
        ProCuScreen proCuScreen7 = new ProCuScreen("Sfd", 6);
        f31485h = proCuScreen7;
        ProCuScreen proCuScreen8 = new ProCuScreen("KwpBasicSettings", 7);
        f31486i = proCuScreen8;
        ProCuScreen[] proCuScreenArr = {proCuScreen, proCuScreen2, proCuScreen3, proCuScreen4, proCuScreen5, proCuScreen6, proCuScreen7, proCuScreen8};
        j = proCuScreenArr;
        kotlin.enums.a.a(proCuScreenArr);
    }

    public ProCuScreen() {
        throw null;
    }

    public static ProCuScreen valueOf(String str) {
        return (ProCuScreen) Enum.valueOf(ProCuScreen.class, str);
    }

    public static ProCuScreen[] values() {
        return (ProCuScreen[]) j.clone();
    }
}
