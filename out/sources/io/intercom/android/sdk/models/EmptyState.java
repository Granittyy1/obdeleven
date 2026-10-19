package io.intercom.android.sdk.models;

import B1.a;
import I7.b;
import com.braze.models.inappmessage.InAppMessageBase;
import io.intercom.android.sdk.m5.home.data.IconType;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: EmptyState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptyState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final EmptyState NULL = new EmptyState(null, null, null, 7, null);

    @b("action")
    private final Action action;

    @b(AttributeType.TEXT)
    private final String text;

    @b("title")
    private final String title;

    /* JADX INFO: compiled from: EmptyState.kt */
    public static final class Action {
        public static final int $stable = 0;

        @b(InAppMessageBase.ICON)
        private final IconType icon;

        @b("label")
        private final String label;

        @b("type")
        private final ActionType type;

        public Action() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Action copy$default(Action action, ActionType actionType, String str, IconType iconType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                actionType = action.type;
            }
            if ((i10 & 2) != 0) {
                str = action.label;
            }
            if ((i10 & 4) != 0) {
                iconType = action.icon;
            }
            return action.copy(actionType, str, iconType);
        }

        public final ActionType component1() {
            return this.type;
        }

        public final String component2() {
            return this.label;
        }

        public final IconType component3() {
            return this.icon;
        }

        public final Action copy(ActionType type, String label, IconType iconType) {
            i.e(type, "type");
            i.e(label, "label");
            return new Action(type, label, iconType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.type == action.type && i.a(this.label, action.label) && this.icon == action.icon;
        }

        public final IconType getIcon() {
            return this.icon;
        }

        public final String getLabel() {
            return this.label;
        }

        public final ActionType getType() {
            return this.type;
        }

        public int hashCode() {
            int iB = a.b(this.label, this.type.hashCode() * 31, 31);
            IconType iconType = this.icon;
            return iB + (iconType == null ? 0 : iconType.hashCode());
        }

        public String toString() {
            return "Action(type=" + this.type + ", label=" + this.label + ", icon=" + this.icon + ')';
        }

        public Action(ActionType type, String label, IconType iconType) {
            i.e(type, "type");
            i.e(label, "label");
            this.type = type;
            this.label = label;
            this.icon = iconType;
        }

        public /* synthetic */ Action(ActionType actionType, String str, IconType iconType, int i10, e eVar) {
            this((i10 & 1) != 0 ? ActionType.MESSAGE : actionType, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? null : iconType);
        }
    }

    /* JADX INFO: compiled from: EmptyState.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final EmptyState getNULL() {
            return EmptyState.NULL;
        }

        private Companion() {
        }
    }

    public EmptyState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ EmptyState copy$default(EmptyState emptyState, String str, String str2, Action action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emptyState.title;
        }
        if ((i10 & 2) != 0) {
            str2 = emptyState.text;
        }
        if ((i10 & 4) != 0) {
            action = emptyState.action;
        }
        return emptyState.copy(str, str2, action);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.text;
    }

    public final Action component3() {
        return this.action;
    }

    public final EmptyState copy(String title, String text, Action action) {
        i.e(title, "title");
        i.e(text, "text");
        i.e(action, "action");
        return new EmptyState(title, text, action);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmptyState)) {
            return false;
        }
        EmptyState emptyState = (EmptyState) obj;
        return i.a(this.title, emptyState.title) && i.a(this.text, emptyState.text) && i.a(this.action, emptyState.action);
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.action.hashCode() + a.b(this.text, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        return "EmptyState(title=" + this.title + ", text=" + this.text + ", action=" + this.action + ')';
    }

    public EmptyState(String title, String text, Action action) {
        i.e(title, "title");
        i.e(text, "text");
        i.e(action, "action");
        this.title = title;
        this.text = text;
        this.action = action;
    }

    public /* synthetic */ EmptyState(String str, String str2, Action action, int i10, e eVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? new Action(null, null, null, 7, null) : action);
    }
}
