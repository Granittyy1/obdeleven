package androidx.compose.ui.focus;

import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: FocusState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FocusStateImpl implements y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FocusStateImpl f13434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FocusStateImpl f13435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FocusStateImpl f13436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FocusStateImpl f13437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ FocusStateImpl[] f13438f;

    static {
        FocusStateImpl focusStateImpl = new FocusStateImpl("Active", 0);
        f13434b = focusStateImpl;
        FocusStateImpl focusStateImpl2 = new FocusStateImpl("ActiveParent", 1);
        f13435c = focusStateImpl2;
        FocusStateImpl focusStateImpl3 = new FocusStateImpl("Captured", 2);
        f13436d = focusStateImpl3;
        FocusStateImpl focusStateImpl4 = new FocusStateImpl("Inactive", 3);
        f13437e = focusStateImpl4;
        FocusStateImpl[] focusStateImplArr = {focusStateImpl, focusStateImpl2, focusStateImpl3, focusStateImpl4};
        f13438f = focusStateImplArr;
        kotlin.enums.a.a(focusStateImplArr);
    }

    public FocusStateImpl() {
        throw null;
    }

    public static FocusStateImpl valueOf(String str) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, str);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) f13438f.clone();
    }

    @Override // androidx.compose.ui.focus.y
    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.focus.y
    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return true;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }
}
