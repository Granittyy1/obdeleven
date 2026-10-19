package coil.util;

import androidx.lifecycle.InterfaceC1375s;
import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C2693i;

/* JADX INFO: compiled from: Lifecycles.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, androidx.lifecycle.s, coil.util.h] */
    public static final Object a(Lifecycle lifecycle, ContinuationImpl continuationImpl) throws Throwable {
        Lifecycles$awaitStarted$1 lifecycles$awaitStarted$1;
        Lifecycle lifecycle2;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        Lifecycle lifecycle3;
        InterfaceC1375s interfaceC1375s;
        InterfaceC1375s interfaceC1375s2;
        if (continuationImpl instanceof Lifecycles$awaitStarted$1) {
            lifecycles$awaitStarted$1 = (Lifecycles$awaitStarted$1) continuationImpl;
            int i10 = lifecycles$awaitStarted$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lifecycles$awaitStarted$1.label = i10 - Integer.MIN_VALUE;
            } else {
                lifecycles$awaitStarted$1 = new Lifecycles$awaitStarted$1(continuationImpl);
            }
        } else {
            lifecycles$awaitStarted$1 = new Lifecycles$awaitStarted$1(continuationImpl);
        }
        Object obj = lifecycles$awaitStarted$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = lifecycles$awaitStarted$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) lifecycles$awaitStarted$1.L$1;
            lifecycle2 = (Lifecycle) lifecycles$awaitStarted$1.L$0;
            try {
                kotlin.b.b(obj);
                lifecycle3 = lifecycle2;
                interfaceC1375s2 = (InterfaceC1375s) ref$ObjectRef.element;
                if (interfaceC1375s2 != null) {
                    lifecycle3.c(interfaceC1375s2);
                }
                return p293xa.r.f47939a;
            } catch (Throwable th2) {
                th = th2;
                interfaceC1375s = (InterfaceC1375s) ref$ObjectRef.element;
                if (interfaceC1375s != null) {
                    lifecycle2.c(interfaceC1375s);
                }
                throw th;
            }
        }
        kotlin.b.b(obj);
        if (lifecycle.b().compareTo(Lifecycle.State.f17752e) >= 0) {
            return p293xa.r.f47939a;
        }
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        try {
            lifecycles$awaitStarted$1.L$0 = lifecycle;
            lifecycles$awaitStarted$1.L$1 = ref$ObjectRef2;
            lifecycles$awaitStarted$1.label = 1;
            C2693i c2693i = new C2693i(1, A8.p.y(lifecycles$awaitStarted$1));
            c2693i.s();
            ?? hVar = new h(c2693i);
            ref$ObjectRef2.element = hVar;
            lifecycle.a(hVar);
            if (c2693i.p() == coroutineSingletons) {
                return coroutineSingletons;
            }
            lifecycle3 = lifecycle;
            ref$ObjectRef = ref$ObjectRef2;
            interfaceC1375s2 = (InterfaceC1375s) ref$ObjectRef.element;
            if (interfaceC1375s2 != null) {
                lifecycle3.c(interfaceC1375s2);
            }
            return p293xa.r.f47939a;
        } catch (Throwable th3) {
            lifecycle2 = lifecycle;
            ref$ObjectRef = ref$ObjectRef2;
            th = th3;
            interfaceC1375s = (InterfaceC1375s) ref$ObjectRef.element;
            if (interfaceC1375s != null) {
                lifecycle2.c(interfaceC1375s);
            }
            throw th;
        }
    }
}
