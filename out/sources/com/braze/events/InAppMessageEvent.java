package com.braze.events;

import bo.app.c3;
import bo.app.x2;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageEvent {
    private final IInAppMessage inAppMessage;
    private final c3 triggerAction;
    private final x2 triggerEvent;
    private final String userId;

    public InAppMessageEvent(x2 triggerEvent, c3 triggerAction, IInAppMessage inAppMessage, String str) {
        i.e(triggerEvent, "triggerEvent");
        i.e(triggerAction, "triggerAction");
        i.e(inAppMessage, "inAppMessage");
        this.triggerEvent = triggerEvent;
        this.triggerAction = triggerAction;
        this.inAppMessage = inAppMessage;
        this.userId = str;
    }

    public static /* synthetic */ InAppMessageEvent copy$default(InAppMessageEvent inAppMessageEvent, x2 x2Var, c3 c3Var, IInAppMessage iInAppMessage, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            x2Var = inAppMessageEvent.triggerEvent;
        }
        if ((i10 & 2) != 0) {
            c3Var = inAppMessageEvent.triggerAction;
        }
        if ((i10 & 4) != 0) {
            iInAppMessage = inAppMessageEvent.inAppMessage;
        }
        if ((i10 & 8) != 0) {
            str = inAppMessageEvent.userId;
        }
        return inAppMessageEvent.copy(x2Var, c3Var, iInAppMessage, str);
    }

    public final x2 component1() {
        return this.triggerEvent;
    }

    public final c3 component2() {
        return this.triggerAction;
    }

    public final IInAppMessage component3() {
        return this.inAppMessage;
    }

    public final String component4() {
        return this.userId;
    }

    public final InAppMessageEvent copy(x2 triggerEvent, c3 triggerAction, IInAppMessage inAppMessage, String str) {
        i.e(triggerEvent, "triggerEvent");
        i.e(triggerAction, "triggerAction");
        i.e(inAppMessage, "inAppMessage");
        return new InAppMessageEvent(triggerEvent, triggerAction, inAppMessage, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppMessageEvent)) {
            return false;
        }
        InAppMessageEvent inAppMessageEvent = (InAppMessageEvent) obj;
        return i.a(this.triggerEvent, inAppMessageEvent.triggerEvent) && i.a(this.triggerAction, inAppMessageEvent.triggerAction) && i.a(this.inAppMessage, inAppMessageEvent.inAppMessage) && i.a(this.userId, inAppMessageEvent.userId);
    }

    public final IInAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    public final c3 getTriggerAction() {
        return this.triggerAction;
    }

    public final x2 getTriggerEvent() {
        return this.triggerEvent;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = (this.inAppMessage.hashCode() + ((this.triggerAction.hashCode() + (this.triggerEvent.hashCode() * 31)) * 31)) * 31;
        String str = this.userId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return JsonUtils.getPrettyPrintedString(this.inAppMessage.forJsonPut());
    }
}
