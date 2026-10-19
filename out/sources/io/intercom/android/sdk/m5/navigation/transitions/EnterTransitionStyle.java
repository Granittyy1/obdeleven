package io.intercom.android.sdk.m5.navigation.transitions;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TransitionStyle.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnterTransitionStyle {
    private static final /* synthetic */ Ba.a $ENTRIES;
    private static final /* synthetic */ EnterTransitionStyle[] $VALUES;
    public static final EnterTransitionStyle SLIDE_UP = new SLIDE_UP("SLIDE_UP", 0);
    public static final EnterTransitionStyle SLIDE_IN_LEFT = new SLIDE_IN_LEFT("SLIDE_IN_LEFT", 1);
    public static final EnterTransitionStyle SLIDE_IN_RIGHT = new SLIDE_IN_RIGHT("SLIDE_IN_RIGHT", 2);
    public static final EnterTransitionStyle NONE = new EnterTransitionStyle("NONE", 3) { // from class: io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle.NONE
        {
            kotlin.jvm.internal.e eVar = null;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public m transition() {
            return m.f9657a;
        }
    };
    public static final EnterTransitionStyle NULL = new EnterTransitionStyle("NULL", 4) { // from class: io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle.NULL
        {
            kotlin.jvm.internal.e eVar = null;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public m transition() {
            return null;
        }
    };

    /* JADX INFO: compiled from: TransitionStyle.kt */
    public static final class SLIDE_IN_RIGHT extends EnterTransitionStyle {
        public SLIDE_IN_RIGHT(String str, int i10) {
            super(str, i10, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return -i10;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public m transition() {
            return EnterExitTransitionKt.l(new b(), C0907g.d(0, 0, null, 7));
        }
    }

    private static final /* synthetic */ EnterTransitionStyle[] $values() {
        return new EnterTransitionStyle[]{SLIDE_UP, SLIDE_IN_LEFT, SLIDE_IN_RIGHT, NONE, NULL};
    }

    static {
        EnterTransitionStyle[] enterTransitionStyleArr$values = $values();
        $VALUES = enterTransitionStyleArr$values;
        $ENTRIES = kotlin.enums.a.a(enterTransitionStyleArr$values);
    }

    public /* synthetic */ EnterTransitionStyle(String str, int i10, kotlin.jvm.internal.e eVar) {
        this(str, i10);
    }

    public static Ba.a<EnterTransitionStyle> getEntries() {
        return $ENTRIES;
    }

    public static EnterTransitionStyle valueOf(String str) {
        return (EnterTransitionStyle) Enum.valueOf(EnterTransitionStyle.class, str);
    }

    public static EnterTransitionStyle[] values() {
        return (EnterTransitionStyle[]) $VALUES.clone();
    }

    public abstract m transition();

    private EnterTransitionStyle(String str, int i10) {
        super(str, i10);
    }

    /* JADX INFO: compiled from: TransitionStyle.kt */
    public static final class SLIDE_IN_LEFT extends EnterTransitionStyle {
        public SLIDE_IN_LEFT(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public m transition() {
            return EnterExitTransitionKt.l(new a(), C0907g.d(0, 0, null, 7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return i10;
        }
    }

    /* JADX INFO: compiled from: TransitionStyle.kt */
    public static final class SLIDE_UP extends EnterTransitionStyle {
        public SLIDE_UP(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public m transition() {
            return EnterExitTransitionKt.m(new c(), C0907g.d(0, 0, null, 7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return i10;
        }
    }
}
