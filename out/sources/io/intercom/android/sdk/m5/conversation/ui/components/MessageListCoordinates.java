package io.intercom.android.sdk.m5.conversation.ui.components;

/* JADX INFO: compiled from: MessageList.kt */
/* JADX INFO: loaded from: classes3.dex */
final class MessageListCoordinates {
    private final I.f boundsInParent;
    private final I.f boundsInWindow;
    private final long size;

    public /* synthetic */ MessageListCoordinates(I.f fVar, I.f fVar2, long j, kotlin.jvm.internal.e eVar) {
        this(fVar, fVar2, j);
    }

    /* JADX INFO: renamed from: copy-cSwnlzA$default, reason: not valid java name */
    public static /* synthetic */ MessageListCoordinates m184copycSwnlzA$default(MessageListCoordinates messageListCoordinates, I.f fVar, I.f fVar2, long j, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = messageListCoordinates.boundsInParent;
        }
        if ((i10 & 2) != 0) {
            fVar2 = messageListCoordinates.boundsInWindow;
        }
        if ((i10 & 4) != 0) {
            j = messageListCoordinates.size;
        }
        return messageListCoordinates.m186copycSwnlzA(fVar, fVar2, j);
    }

    public final I.f component1() {
        return this.boundsInParent;
    }

    public final I.f component2() {
        return this.boundsInWindow;
    }

    /* JADX INFO: renamed from: component3-NH-jbRc, reason: not valid java name */
    public final long m185component3NHjbRc() {
        return this.size;
    }

    /* JADX INFO: renamed from: copy-cSwnlzA, reason: not valid java name */
    public final MessageListCoordinates m186copycSwnlzA(I.f boundsInParent, I.f boundsInWindow, long j) {
        kotlin.jvm.internal.i.e(boundsInParent, "boundsInParent");
        kotlin.jvm.internal.i.e(boundsInWindow, "boundsInWindow");
        return new MessageListCoordinates(boundsInParent, boundsInWindow, j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageListCoordinates)) {
            return false;
        }
        MessageListCoordinates messageListCoordinates = (MessageListCoordinates) obj;
        return kotlin.jvm.internal.i.a(this.boundsInParent, messageListCoordinates.boundsInParent) && kotlin.jvm.internal.i.a(this.boundsInWindow, messageListCoordinates.boundsInWindow) && I.h.a(this.size, messageListCoordinates.size);
    }

    public final I.f getBoundsInParent() {
        return this.boundsInParent;
    }

    public final I.f getBoundsInWindow() {
        return this.boundsInWindow;
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m187getSizeNHjbRc() {
        return this.size;
    }

    public int hashCode() {
        return Long.hashCode(this.size) + ((this.boundsInWindow.hashCode() + (this.boundsInParent.hashCode() * 31)) * 31);
    }

    public final boolean isZero() {
        return kotlin.jvm.internal.i.a(this.boundsInParent, I.f.f3756e) && I.h.a(this.size, 0L);
    }

    public String toString() {
        return "MessageListCoordinates(boundsInParent=" + this.boundsInParent + ", boundsInWindow=" + this.boundsInWindow + ", size=" + ((Object) I.h.f(this.size)) + ')';
    }

    private MessageListCoordinates(I.f boundsInParent, I.f boundsInWindow, long j) {
        kotlin.jvm.internal.i.e(boundsInParent, "boundsInParent");
        kotlin.jvm.internal.i.e(boundsInWindow, "boundsInWindow");
        this.boundsInParent = boundsInParent;
        this.boundsInWindow = boundsInWindow;
        this.size = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MessageListCoordinates(I.f fVar, I.f fVar2, long j, int i10, kotlin.jvm.internal.e eVar) {
        int i11 = i10 & 1;
        I.f fVar3 = I.f.f3756e;
        this(i11 != 0 ? fVar3 : fVar, (i10 & 2) != 0 ? fVar3 : fVar2, (i10 & 4) != 0 ? 0L : j, null);
    }
}
