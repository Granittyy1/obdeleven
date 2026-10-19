package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LockFreeLinkedListNode f43501a;

    public s(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f43501a = lockFreeLinkedListNode;
    }

    public final String toString() {
        return "Removed[" + this.f43501a + ']';
    }
}
