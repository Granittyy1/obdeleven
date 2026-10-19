package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.H;
import java.util.Arrays;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SuspendPointerInputElement extends H<SuspendingPointerInputModifierNodeImpl> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f14049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PointerInputEventHandler f14050e;

    public SuspendPointerInputElement(Object obj, androidx.compose.foundation.text.t tVar, PointerInputEventHandler pointerInputEventHandler, int i10) {
        tVar = (i10 & 2) != 0 ? null : tVar;
        this.f14047b = obj;
        this.f14048c = tVar;
        this.f14049d = null;
        this.f14050e = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new SuspendingPointerInputModifierNodeImpl(this.f14047b, this.f14048c, this.f14049d, this.f14050e);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = (SuspendingPointerInputModifierNodeImpl) cVar;
        Object obj = suspendingPointerInputModifierNodeImpl.f14052p;
        Object obj2 = this.f14047b;
        boolean z10 = !kotlin.jvm.internal.i.a(obj, obj2);
        suspendingPointerInputModifierNodeImpl.f14052p = obj2;
        Object obj3 = suspendingPointerInputModifierNodeImpl.f14053q;
        Object obj4 = this.f14048c;
        if (!kotlin.jvm.internal.i.a(obj3, obj4)) {
            z10 = true;
        }
        suspendingPointerInputModifierNodeImpl.f14053q = obj4;
        Object[] objArr = suspendingPointerInputModifierNodeImpl.f14054r;
        Object[] objArr2 = this.f14049d;
        if (objArr != null && objArr2 == null) {
            z10 = true;
        }
        if (objArr == null && objArr2 != null) {
            z10 = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z10 = true;
        }
        suspendingPointerInputModifierNodeImpl.f14054r = objArr2;
        Class<?> cls = suspendingPointerInputModifierNodeImpl.f14056t.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f14050e;
        if (cls == pointerInputEventHandler.getClass() ? z10 : true) {
            suspendingPointerInputModifierNodeImpl.D1();
        }
        suspendingPointerInputModifierNodeImpl.f14056t = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!kotlin.jvm.internal.i.a(this.f14047b, suspendPointerInputElement.f14047b) || !kotlin.jvm.internal.i.a(this.f14048c, suspendPointerInputElement.f14048c)) {
            return false;
        }
        Object[] objArr = this.f14049d;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f14049d;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f14049d != null) {
            return false;
        }
        return this.f14050e == suspendPointerInputElement.f14050e;
    }

    public final int hashCode() {
        Object obj = this.f14047b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f14048c;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f14049d;
        return this.f14050e.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }
}
