package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;

/* JADX INFO: compiled from: PointerInteropFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PointerInteropFilter implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ia.l<? super MotionEvent, Boolean> f14035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f14036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PointerInteropFilter$pointerInputFilter$1 f14038e = new PointerInteropFilter$pointerInputFilter$1(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: PointerInteropFilter.android.kt */
    public static final class DispatchToViewState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final DispatchToViewState f14039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final DispatchToViewState f14040c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final DispatchToViewState f14041d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ DispatchToViewState[] f14042e;

        static {
            DispatchToViewState dispatchToViewState = new DispatchToViewState("Unknown", 0);
            f14039b = dispatchToViewState;
            DispatchToViewState dispatchToViewState2 = new DispatchToViewState("Dispatching", 1);
            f14040c = dispatchToViewState2;
            DispatchToViewState dispatchToViewState3 = new DispatchToViewState("NotDispatching", 2);
            f14041d = dispatchToViewState3;
            DispatchToViewState[] dispatchToViewStateArr = {dispatchToViewState, dispatchToViewState2, dispatchToViewState3};
            f14042e = dispatchToViewStateArr;
            kotlin.enums.a.a(dispatchToViewStateArr);
        }

        public DispatchToViewState() {
            throw null;
        }

        public static DispatchToViewState valueOf(String str) {
            return (DispatchToViewState) Enum.valueOf(DispatchToViewState.class, str);
        }

        public static DispatchToViewState[] values() {
            return (DispatchToViewState[]) f14042e.clone();
        }
    }

    @Override // androidx.compose.ui.input.pointer.v
    public final PointerInteropFilter$pointerInputFilter$1 p() {
        return this.f14038e;
    }
}
