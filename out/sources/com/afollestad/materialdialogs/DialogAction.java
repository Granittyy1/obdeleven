package com.afollestad.materialdialogs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DialogAction {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DialogAction f23184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DialogAction f23185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DialogAction f23186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ DialogAction[] f23187e;

    static {
        DialogAction dialogAction = new DialogAction("POSITIVE", 0);
        f23184b = dialogAction;
        DialogAction dialogAction2 = new DialogAction("NEUTRAL", 1);
        f23185c = dialogAction2;
        DialogAction dialogAction3 = new DialogAction("NEGATIVE", 2);
        f23186d = dialogAction3;
        f23187e = new DialogAction[]{dialogAction, dialogAction2, dialogAction3};
    }

    public DialogAction() {
        throw null;
    }

    public static DialogAction valueOf(String str) {
        return (DialogAction) Enum.valueOf(DialogAction.class, str);
    }

    public static DialogAction[] values() {
        return (DialogAction[]) f23187e.clone();
    }
}
