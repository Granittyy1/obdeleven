package io.intercom.android.sdk.m5.navigation.transitions;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TransitionStyle.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ExitTransitionStyle {
    private static final /* synthetic */ Ba.a $ENTRIES;
    private static final /* synthetic */ ExitTransitionStyle[] $VALUES;
    public static final ExitTransitionStyle SLIDE_DOWN = new SLIDE_DOWN("SLIDE_DOWN", 0);
    public static final ExitTransitionStyle SLIDE_OUT_RIGHT = new SLIDE_OUT_RIGHT("SLIDE_OUT_RIGHT", 1);
    public static final ExitTransitionStyle SLIDE_OUT_LEFT = new SLIDE_OUT_LEFT("SLIDE_OUT_LEFT", 2);
    public static final ExitTransitionStyle NONE = new ExitTransitionStyle("NONE", 3) { // from class: io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle.NONE
        {
            kotlin.jvm.internal.e eVar = null;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        public o transition() {
            return o.f9659a;
        }
    };
    public static final ExitTransitionStyle NULL = new ExitTransitionStyle("NULL", 4) { // from class: io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle.NULL
        {
            kotlin.jvm.internal.e eVar = null;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        public o transition() {
            return null;
        }
    };

    /* JADX INFO: compiled from: TransitionStyle.kt */
    public static final class SLIDE_OUT_LEFT extends ExitTransitionStyle {
        public SLIDE_OUT_LEFT(String str, int i10) {
            super(str, i10, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return -i10;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        public o transition() {
            return EnterExitTransitionKt.o(new e(), C0907g.d(0, 0, null, 7));
        }
    }

    private static final /* synthetic */ ExitTransitionStyle[] $values() {
        return new ExitTransitionStyle[]{SLIDE_DOWN, SLIDE_OUT_RIGHT, SLIDE_OUT_LEFT, NONE, NULL};
    }

    static {
        ExitTransitionStyle[] exitTransitionStyleArr$values = $values();
        $VALUES = exitTransitionStyleArr$values;
        $ENTRIES = kotlin.enums.a.a(exitTransitionStyleArr$values);
    }

    public /* synthetic */ ExitTransitionStyle(String str, int i10, kotlin.jvm.internal.e eVar) {
        this(str, i10);
    }

    public static Ba.a<ExitTransitionStyle> getEntries() {
        return $ENTRIES;
    }

    public static ExitTransitionStyle valueOf(String str) {
        return (ExitTransitionStyle) Enum.valueOf(ExitTransitionStyle.class, str);
    }

    public static ExitTransitionStyle[] values() {
        return (ExitTransitionStyle[]) $VALUES.clone();
    }

    public abstract o transition();

    private ExitTransitionStyle(String str, int i10) {
        super(str, i10);
    }

    /* JADX INFO: compiled from: TransitionStyle.kt */
    public static final class SLIDE_DOWN extends ExitTransitionStyle {
        public SLIDE_DOWN(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        public o transition() {
            return EnterExitTransitionKt.p(new d(), C0907g.d(0, 0, null, 7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return i10;
        }
    }

    /* JADX INFO: compiled from: TransitionStyle.kt */
    public static final class SLIDE_OUT_RIGHT extends ExitTransitionStyle {
        public SLIDE_OUT_RIGHT(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        public o transition() {
            return EnterExitTransitionKt.o(new f(), C0907g.d(0, 0, null, 7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return i10;
        }
    }
}
