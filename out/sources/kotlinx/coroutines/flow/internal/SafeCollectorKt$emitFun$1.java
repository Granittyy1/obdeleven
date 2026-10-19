package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.InterfaceC2687d;
import p293xa.r;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements Ia.q<InterfaceC2687d<? super Object>, Object, kotlin.coroutines.c<? super r>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SafeCollectorKt$emitFun$1 f43384b = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, InterfaceC2687d.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // Ia.q
    public final Object invoke(InterfaceC2687d<? super Object> interfaceC2687d, Object obj, kotlin.coroutines.c<? super r> cVar) {
        return interfaceC2687d.emit(obj, cVar);
    }
}
