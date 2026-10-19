package io.intercom.android.sdk.models;

import I7.b;
import androidx.compose.animation.D;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ComposerState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposerState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ComposerState NULL = new ComposerState("visible_and_enabled", false, "");

    @b("workflow_active")
    private final boolean isWorkflowActive;

    @b("placeholder")
    private final String placeholder;

    @b("visibility")
    private final String visibility;

    /* JADX INFO: compiled from: ComposerState.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final ComposerState getNULL() {
            return ComposerState.NULL;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: ComposerState.kt */
    public interface ComposerVisibility {

        /* JADX INFO: compiled from: ComposerState.kt */
        public static final class Hidden implements ComposerVisibility {
            public static final int $stable = 0;
            public static final Hidden INSTANCE = new Hidden();

            private Hidden() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Hidden);
            }

            public int hashCode() {
                return 421902457;
            }

            public String toString() {
                return "Hidden";
            }
        }

        /* JADX INFO: compiled from: ComposerState.kt */
        public static final class VisibleAndDisabled implements ComposerVisibility {
            public static final int $stable = 0;
            public static final VisibleAndDisabled INSTANCE = new VisibleAndDisabled();

            private VisibleAndDisabled() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof VisibleAndDisabled);
            }

            public int hashCode() {
                return 1977747952;
            }

            public String toString() {
                return "VisibleAndDisabled";
            }
        }

        /* JADX INFO: compiled from: ComposerState.kt */
        public static final class VisibleAndEnabled implements ComposerVisibility {
            public static final int $stable = 0;
            public static final VisibleAndEnabled INSTANCE = new VisibleAndEnabled();

            private VisibleAndEnabled() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof VisibleAndEnabled);
            }

            public int hashCode() {
                return -861799091;
            }

            public String toString() {
                return "VisibleAndEnabled";
            }
        }
    }

    public ComposerState(String visibility, boolean z10, String placeholder) {
        i.e(visibility, "visibility");
        i.e(placeholder, "placeholder");
        this.visibility = visibility;
        this.isWorkflowActive = z10;
        this.placeholder = placeholder;
    }

    private final String component1() {
        return this.visibility;
    }

    public static /* synthetic */ ComposerState copy$default(ComposerState composerState, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = composerState.visibility;
        }
        if ((i10 & 2) != 0) {
            z10 = composerState.isWorkflowActive;
        }
        if ((i10 & 4) != 0) {
            str2 = composerState.placeholder;
        }
        return composerState.copy(str, z10, str2);
    }

    private final ComposerVisibility getComposerVisibility() {
        String str = this.visibility;
        int iHashCode = str.hashCode();
        if (iHashCode != -1217487446) {
            if (iHashCode != -888711535) {
                if (iHashCode == 1262491788 && str.equals("visible_and_enabled")) {
                    return ComposerVisibility.VisibleAndEnabled.INSTANCE;
                }
            } else if (str.equals("visible_and_disabled")) {
                return ComposerVisibility.VisibleAndDisabled.INSTANCE;
            }
        } else if (str.equals("hidden")) {
            return ComposerVisibility.Hidden.INSTANCE;
        }
        return ComposerVisibility.VisibleAndEnabled.INSTANCE;
    }

    public final boolean component2() {
        return this.isWorkflowActive;
    }

    public final String component3() {
        return this.placeholder;
    }

    public final ComposerState copy(String visibility, boolean z10, String placeholder) {
        i.e(visibility, "visibility");
        i.e(placeholder, "placeholder");
        return new ComposerState(visibility, z10, placeholder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerState)) {
            return false;
        }
        ComposerState composerState = (ComposerState) obj;
        return i.a(this.visibility, composerState.visibility) && this.isWorkflowActive == composerState.isWorkflowActive && i.a(this.placeholder, composerState.placeholder);
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public int hashCode() {
        return this.placeholder.hashCode() + D.b(this.visibility.hashCode() * 31, 31, this.isWorkflowActive);
    }

    public final boolean isDisabled() {
        return i.a(getComposerVisibility(), ComposerVisibility.VisibleAndDisabled.INSTANCE);
    }

    public final boolean isVisible() {
        return !i.a(getComposerVisibility(), ComposerVisibility.Hidden.INSTANCE);
    }

    public final boolean isWorkflowActive() {
        return this.isWorkflowActive;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ComposerState(visibility=");
        sb2.append(this.visibility);
        sb2.append(", isWorkflowActive=");
        sb2.append(this.isWorkflowActive);
        sb2.append(", placeholder=");
        return B7.b.g(sb2, this.placeholder, ')');
    }
}
