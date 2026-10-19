package androidx.compose.ui.input.pointer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PointerEventPass {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PointerEventPass f14029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final PointerEventPass f14030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PointerEventPass f14031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PointerEventPass[] f14032e;

    static {
        PointerEventPass pointerEventPass = new PointerEventPass("Initial", 0);
        f14029b = pointerEventPass;
        PointerEventPass pointerEventPass2 = new PointerEventPass("Main", 1);
        f14030c = pointerEventPass2;
        PointerEventPass pointerEventPass3 = new PointerEventPass("Final", 2);
        f14031d = pointerEventPass3;
        PointerEventPass[] pointerEventPassArr = {pointerEventPass, pointerEventPass2, pointerEventPass3};
        f14032e = pointerEventPassArr;
        kotlin.enums.a.a(pointerEventPassArr);
    }

    public PointerEventPass() {
        throw null;
    }

    public static PointerEventPass valueOf(String str) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, str);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) f14032e.clone();
    }
}
