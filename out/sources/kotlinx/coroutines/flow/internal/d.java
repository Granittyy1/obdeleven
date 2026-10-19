package kotlinx.coroutines.flow.internal;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.A;
import kotlinx.coroutines.B;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import p293xa.r;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d<T> implements k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.coroutines.e f43393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferOverflow f43395d;

    public d(kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        this.f43393b = eVar;
        this.f43394c = i10;
        this.f43395d = bufferOverflow;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // kotlinx.coroutines.flow.internal.k
    public final InterfaceC2686c<T> b(kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        kotlin.coroutines.e eVar2 = this.f43393b;
        kotlin.coroutines.e eVarPlus = eVar.plus(eVar2);
        BufferOverflow bufferOverflow2 = BufferOverflow.f43243b;
        BufferOverflow bufferOverflow3 = this.f43395d;
        int i11 = this.f43394c;
        if (bufferOverflow == bufferOverflow2) {
            if (i11 != -3) {
                if (i10 == -3) {
                    i10 = i11;
                } else if (i11 != -2) {
                    if (i10 == -2) {
                        i10 = i11;
                    } else {
                        i10 += i11;
                        if (i10 < 0) {
                            i10 = BrazeLogger.SUPPRESS;
                        }
                    }
                }
            }
            bufferOverflow = bufferOverflow3;
        }
        return (kotlin.jvm.internal.i.a(eVarPlus, eVar2) && i10 == i11 && bufferOverflow == bufferOverflow3) ? this : i(eVarPlus, i10, bufferOverflow);
    }

    public String c() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public Object collect(InterfaceC2687d<? super T> interfaceC2687d, kotlin.coroutines.c<? super r> cVar) {
        Object objD = B.d(new ChannelFlow$collect$2(interfaceC2687d, this, null), cVar);
        return objD == CoroutineSingletons.f43038b ? objD : r.f47939a;
    }

    public abstract Object g(kotlinx.coroutines.channels.n<? super T> nVar, kotlin.coroutines.c<? super r> cVar);

    public abstract d<T> i(kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow);

    public InterfaceC2686c<T> j() {
        return null;
    }

    public kotlinx.coroutines.channels.p<T> k(A a10) {
        int i10 = this.f43394c;
        if (i10 == -3) {
            i10 = -2;
        }
        CoroutineStart coroutineStart = CoroutineStart.f43168d;
        Ia.p channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        kotlinx.coroutines.channels.m mVar = new kotlinx.coroutines.channels.m(CoroutineContextKt.c(a10, this.f43393b), kotlinx.coroutines.channels.g.a(i10, 4, this.f43395d), true, true);
        mVar.v0(coroutineStart, mVar, channelFlow$collectToFun$1);
        return mVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f43032b;
        kotlin.coroutines.e eVar = this.f43393b;
        if (eVar != emptyCoroutineContext) {
            arrayList.add("context=" + eVar);
        }
        int i10 = this.f43394c;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        BufferOverflow bufferOverflow = BufferOverflow.f43243b;
        BufferOverflow bufferOverflow2 = this.f43395d;
        if (bufferOverflow2 != bufferOverflow) {
            arrayList.add("onBufferOverflow=" + bufferOverflow2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return B7.b.g(sb2, kotlin.collections.q.U(arrayList, ", ", null, null, null, 62), ']');
    }
}
