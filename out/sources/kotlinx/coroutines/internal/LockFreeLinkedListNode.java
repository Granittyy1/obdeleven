package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.C;
import kotlinx.coroutines.InterfaceC2677c0;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
public class LockFreeLinkedListNode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43455b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43456c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43457d = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    public static abstract class a extends AbstractC2696b<LockFreeLinkedListNode> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m0 f43458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r0 f43459c;

        public a(m0 m0Var) {
            this.f43458b = m0Var;
        }

        @Override // kotlinx.coroutines.internal.AbstractC2696b
        public final void b(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj) {
            LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            boolean z10 = obj == null;
            m0 m0Var = this.f43458b;
            InterfaceC2677c0 interfaceC2677c0 = z10 ? m0Var : this.f43459c;
            if (interfaceC2677c0 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f43455b;
                while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode2, this, interfaceC2677c0)) {
                    if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode2) != this) {
                        return;
                    }
                }
                if (z10) {
                    r0 r0Var = this.f43459c;
                    kotlin.jvm.internal.i.b(r0Var);
                    m0Var.f(r0Var);
                }
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1, reason: invalid class name */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    public /* synthetic */ class AnonymousClass1 extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, Oa.i
        public final Object get() {
            return this.receiver.getClass().getSimpleName();
        }
    }

    public void dispose() {
        j();
    }

    public final LockFreeLinkedListNode e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43456c;
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) atomicReferenceFieldUpdater2.get(this);
            LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f43455b;
                    obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNode2);
                    if (obj == this) {
                        if (lockFreeLinkedListNode == lockFreeLinkedListNode2) {
                            return lockFreeLinkedListNode2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, lockFreeLinkedListNode, lockFreeLinkedListNode2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != lockFreeLinkedListNode) {
                                break;
                            }
                        }
                        return lockFreeLinkedListNode2;
                    }
                    if (i()) {
                        return null;
                    }
                    if (obj == null) {
                        return lockFreeLinkedListNode2;
                    }
                    if (obj instanceof r) {
                        ((r) obj).a(lockFreeLinkedListNode2);
                        break;
                    }
                    if (!(obj instanceof s)) {
                        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        lockFreeLinkedListNode3 = lockFreeLinkedListNode2;
                        lockFreeLinkedListNode2 = (LockFreeLinkedListNode) obj;
                    } else {
                        if (lockFreeLinkedListNode3 != null) {
                            break;
                        }
                        lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode2);
                    }
                }
                LockFreeLinkedListNode lockFreeLinkedListNode4 = ((s) obj).f43501a;
                while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode3, lockFreeLinkedListNode2, lockFreeLinkedListNode4)) {
                    if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode3) != lockFreeLinkedListNode2) {
                        break;
                    }
                }
                lockFreeLinkedListNode2 = lockFreeLinkedListNode3;
            }
        }
    }

    public final void f(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43456c;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (g() != lockFreeLinkedListNode) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, lockFreeLinkedListNode2, this)) {
                    if (i()) {
                        lockFreeLinkedListNode.e();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) == lockFreeLinkedListNode2);
        }
    }

    public final Object g() {
        while (true) {
            Object obj = f43455b.get(this);
            if (!(obj instanceof r)) {
                return obj;
            }
            ((r) obj).a(this);
        }
    }

    public final LockFreeLinkedListNode h() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object objG = g();
        s sVar = objG instanceof s ? (s) objG : null;
        if (sVar != null && (lockFreeLinkedListNode = sVar.f43501a) != null) {
            return lockFreeLinkedListNode;
        }
        kotlin.jvm.internal.i.c(objG, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (LockFreeLinkedListNode) objG;
    }

    public boolean i() {
        return g() instanceof s;
    }

    public final void j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            Object objG = g();
            if (objG instanceof s) {
                LockFreeLinkedListNode lockFreeLinkedListNode = ((s) objG).f43501a;
                return;
            }
            if (objG == this) {
                return;
            }
            kotlin.jvm.internal.i.c(objG, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) objG;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43457d;
            s sVar = (s) atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode2);
            if (sVar == null) {
                sVar = new s(lockFreeLinkedListNode2);
                atomicReferenceFieldUpdater2.set(lockFreeLinkedListNode2, sVar);
            }
            do {
                atomicReferenceFieldUpdater = f43455b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, objG, sVar)) {
                    lockFreeLinkedListNode2.e();
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == objG);
        }
    }

    public String toString() {
        return new AnonymousClass1(this, C.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + C.l(this);
    }
}
